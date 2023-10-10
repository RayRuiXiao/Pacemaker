/*
 * timers.h
 *
 *  Created on: Oct 11, 2023
 *      Author: joshu
 */

#ifndef TIMERS_H_
#define TIMERS_H_

#include <stdio.h>
#include <system.h> // to use the symbolic names
#include "sys/alt_alarm.h"
#include <altera_avalon_pio_regs.h> // to use PIO functions


#define LED_TIMEOUT 200


void vp_light_timer();
void ap_light_timer();


#endif /* TIMERS_H_ */
