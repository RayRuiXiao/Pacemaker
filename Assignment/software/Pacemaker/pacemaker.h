/*
 * pacemaker.h
 *
 *  Created on: 15/10/2023
 *      Author: rxia357
 */

#ifndef PACEMAKER_H_
#define PACEMAKER_H_

#include "timing.h"
#include "uart.h"

void c_reset();
void c_tick();
int C_AP, C_VP;

#endif /* PACEMAKER_H_ */

