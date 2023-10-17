#include <stdio.h>
#include <system.h> // to use the symbolic names
#include <alt_types.h> // alt_u32 is a kind of alt_types
#include <altera_avalon_pio_regs.h> // to use PIO functions
#include <stdint.h>
#include <stdbool.h>

#include "uart.h"
#include "lcd.h"
#include "timers.h"
#include "sccharts.h"
#include "pacemaker.h"

#define UART_MODE IORD_ALTERA_AVALON_PIO_DATA(SWITCHES_BASE) & (1<<0)
#define SCCHARTS_MODE IORD_ALTERA_AVALON_PIO_DATA(SWITCHES_BASE) & (1<<1)
#define HALF_SCREEN_WIDTH 8
#define PRINT

enum MODE {UART = 0, BUTTON = 1, UNSET = 2, RESET = 3};

enum IMPLEMENTATIONS {SCCHARTS, PURE_C, UNDEFINED};

bool VP = false;
bool AP = false;

bool ticker_started = false;
#ifdef PRINT
bool print_values = false;
#endif
void setup_keys();
void key_interrupt(void* context, alt_u32 id);
void reset_leds();
void start_ticker();
void stop_ticker();
alt_u32 timerISR(void* context);

TickData tickData;
alt_alarm ticker;

enum MODE mode = UNSET;
enum IMPLEMENTATIONS implementation = UNDEFINED;


int main()
{
	reset_leds();
	printf("Hello from Pacemaker!\n");

	setup_keys();
	setup_lcd();

	write_to_lcd("hello \n%s %s", "joshua", "morley");

	while(1) {
		if (UART_MODE) {
			if (mode != UART){
				stop_ticker();
				//close_uart();
				// disable interrupts for all buttons
				IOWR_ALTERA_AVALON_PIO_IRQ_MASK(KEYS_BASE, 0x0);

				printf("UART Enabled\n");

				mode = UART;
				implementation = UNDEFINED;

				usleep(50); // To remove bouncing
				setup_uart();
				start_ticker();
			}
			check_uart();
		} else {
			if (mode != BUTTON){
				//close_uart();
				stop_ticker();
				// clears the edge capture register
				IOWR_ALTERA_AVALON_PIO_EDGE_CAP(KEYS_BASE, 0);
				// enable interrupts for all buttons
				IOWR_ALTERA_AVALON_PIO_IRQ_MASK(KEYS_BASE, 0x7);

				printf("UART Disabled\n");

				mode = BUTTON;
				implementation = UNDEFINED;

				usleep(50); // To remove bouncing
				start_ticker();
			}
		}

		if (AP) {
			print_a();
			AP = false;
		}


		if (VP) {
			print_v();
			VP = false;
		}

#ifdef PRINT
		if (print_values) {
			printf("AVI %d: %4d, PVARP %d: %4d, VRP %d: %4d, AEI %d: %4d, URI %d: %4d, LRI %d: %4d\n",AVIState, cAVI, PVARPState, cPVARP, VRPState, cVRP, AEIState, cAEI,URIState, cURI,LRIState, cLRI);
			print_values = false;
		}
	}
#endif


	// close the non blocking UART with read and write
	close_uart();
	close_lcd();
	return 0;
}

void start_ticker(){
	// Timer Init
	if (!ticker_started){
		uint64_t systemTime = 0;
		void* timerContext = (void*) &systemTime;
		alt_alarm_start(&ticker, 1, timerISR, timerContext);
		ticker_started = true;
		printf("ticker started\n");
	}

}

void stop_ticker(){
	 if (ticker_started) {
		alt_alarm_stop(&ticker);
		ticker_started = false;
		printf("ticker stopped\n");
	 }
}


alt_u32 timerISR(void* context){

	if (SCCHARTS_MODE){
		if (implementation != SCCHARTS){
			reset(&tickData);
			tick(&tickData); // init tick
			tickData.deltaT = 1;

			printf("sccharts version started\n");
			write_to_lcd("PaceMaker\n%-*s%*s", HALF_SCREEN_WIDTH, "SCCHARTS", HALF_SCREEN_WIDTH,  mode == BUTTON ? "BUTTON" : "UART");

			implementation = SCCHARTS;
		} else {
			tickData.VS = VSBuffer;
			tickData.AS = ASBuffer;

			tick(&tickData);

			if (tickData.AP){
				ap_light_timer();
				AP = true;
			}

			if (tickData.VP){
				vp_light_timer();
				VP = true;
			}
		}
	} else {
		if (implementation != PURE_C){
			c_reset();

			printf("pure_c version started\n");
			write_to_lcd("PaceMaker\n%-*s%*s", HALF_SCREEN_WIDTH,  "PURE_C", HALF_SCREEN_WIDTH,  mode == BUTTON ? "BUTTON" : "UART");

			implementation = PURE_C;
		}

		c_tick();

		if (C_AP){
			ap_light_timer();
			AP = true;
			C_AP += 1;
		}

		if (C_VP){
			vp_light_timer();
			VP = true;
			C_VP += 1;
		}
#ifdef PRINT
		print_values = true;
#endif
	}


	VSBuffer = 0;
	ASBuffer = 0;


	return 1; // next tick is a fter 1ms
}

void reset_leds(){
	IOWR_ALTERA_AVALON_PIO_DATA(LEDS_RED_BASE, 0x0);
	IOWR_ALTERA_AVALON_PIO_DATA(LEDS_GREEN_BASE, 0x0);
}


void key_interrupt(void* context, alt_u32 id) {
	int* temp = (int*) context; // need to cast the context first before using it
	(*temp) = IORD_ALTERA_AVALON_PIO_EDGE_CAP(KEYS_BASE);
	// clear the edge capture register
	IOWR_ALTERA_AVALON_PIO_EDGE_CAP(KEYS_BASE, 0);
	if (*temp == 1){
		VSBuffer = 1;
	}
	if (*temp == 2){
		ASBuffer = 1;
	}
}

void setup_keys(){
	int keyValue = 1;
	void* contextKeyInterrupt =(void*) &keyValue; // cast before passing to ISR


	// clears the edge capture register
	IOWR_ALTERA_AVALON_PIO_EDGE_CAP(KEYS_BASE, 0);

	// enable interrupts for all buttons
	IOWR_ALTERA_AVALON_PIO_IRQ_MASK(KEYS_BASE, 0x7);

	// register the ISR
	alt_irq_register(KEYS_IRQ, contextKeyInterrupt, key_interrupt);
}

