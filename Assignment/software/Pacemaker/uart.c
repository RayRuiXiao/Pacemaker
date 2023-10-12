/*
 * uart.c
 *
 *  Created on: Oct 11, 2023
 *      Author: joshu
 */


#include "uart.h"
#include "timers.h"

FILE* uart;

uint8_t ASBuffer = 0;
uint8_t VSBuffer = 0;

void setup_uart(){
	uart = open(UART_NAME,(O_NONBLOCK | O_RDWR));

	if(!uart){
		printf("Failed to open UART\n");
	} else {
		printf("setup uart\n");
	}
}

void check_uart(){

	// create a buffer to load the next 5 characters
	char uartBuffer[5];

	// check the length of the uart input
	int length = read(uart, uartBuffer, sizeof(uartBuffer) - 1);

	if (length > 0) {
		for (int i = 0; i < length; i++){
			if (uartBuffer[i] == 'V'){
				VSBuffer = 1;
			} else if(uartBuffer[i] == 'A'){
				ASBuffer = 1;

			}
		}
	}
}

void print_uart(const char *format, ...){
	if(!uart)
		return;

	// Use variadic arguments to print the formatted string
	va_list args;
	va_start(args, format);
	vfprintf(uart, format, args);
	va_end(args);

	// Print a newline character
	fprintf(uart, "\n");
}

void close_uart(){
	close(uart);
}

