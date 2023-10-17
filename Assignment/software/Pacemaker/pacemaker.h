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

int cAVI ;
int cPVARP ;
int cVRP ;
int cAEI ;
int cURI ;
int cLRI ;

enum AVIStates {
    wAVI,
    dAVI
};

enum PVARPStates {
    wPVARP,
    dPVARP
};

enum VRPStates {
    wVRP,
    dVRP
};

enum AEIStates {
    wAEI,
    dAEI
};

enum URIStates {
    wURI,
    dURI
};

enum LRIStates {
    wLRI,
    dLRI
};


enum AVIStates   AVIState;
enum PVARPStates PVARPState;
enum VRPStates   VRPState;
enum AEIStates   AEIState ;
enum URIStates   URIState;
enum LRIStates   LRIState;

enum AVIStates   AVIBufferState;
enum PVARPStates PVARPBufferState;
enum VRPStates   VRPBufferState;
enum AEIStates   AEIBufferState ;
enum URIStates   URIBufferState;
enum LRIStates   LRIBufferState;



void c_reset();
void c_tick();
int C_AP, C_VP;

#endif /* PACEMAKER_H_ */

