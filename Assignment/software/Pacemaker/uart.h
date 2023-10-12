/*
 * uart.h
 *
 *  Created on: Oct 11, 2023
 *      Author: joshu
 */

#ifndef UART_H_
#define UART_H_

#include <stdio.h>
#include <system.h> // to use the symbolic names
#include <fcntl.h>
#include <stdint.h>
#include <stdarg.h>


uint8_t ASBuffer;
uint8_t VSBuffer;

void setup_uart();
void check_uart();
void print_uart(const char *format, ...);
void close_uart();

#endif /* UART_H_ */
