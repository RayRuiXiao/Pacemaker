#include <stdio.h>
#include <system.h> // to use the symbolic names
#include <alt_types.h> // alt_u32 is a kind of alt_types
#include <altera_avalon_pio_regs.h> // to use PIO functions
#include <stdint.h>

#include "uart.h"
#include "lcd.h"
#include "timers.h"
#include "sccharts.h"

void setup_keys();
void key_interrupt(void* context, alt_u32 id);
void reset_leds();
alt_u32 timerISR(void* context);

TickData tickData;


int main()
{
	reset_leds();
	printf("Hello from Nios II!\n");
	// start a non blocking UART with read and write
	setup_keys();
	setup_uart();
	setup_lcd();

	write_to_lcd("hello \n%s %s", "joshua", "morley");

	reset(&tickData);
	tick(&tickData); // init tick

	// Timer Init
	alt_alarm ticker;
	uint64_t systemTime = 0;
	void* timerContext = (void*) &systemTime;
	alt_alarm_start(&ticker, 1, timerISR, timerContext);
	tickData.deltaT = 1;

	while(1) {
		check_uart();

	}

	// close the non blocking UART with read and write
	close_uart();
	close_lcd();
	return 0;
}

alt_u32 timerISR(void* context){

	tickData.VS = VSBuffer;
	tickData.AS = ASBuffer;

	VSBuffer = 0;
	ASBuffer = 0;

	tick(&tickData);


	if (tickData.AP){
		ap_light_timer();
	}

	if (tickData.VP){
		vp_light_timer();
	}

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

