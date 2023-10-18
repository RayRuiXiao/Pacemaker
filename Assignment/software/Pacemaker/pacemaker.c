/*
 * pacemaker.c
 *
 *  Created on: 15/10/2023
 *      Author: rxia357
 */

#include "pacemaker.h"

int AVI_Constraint = AVI_VALUE;
int PVARP_Constraint = PVARP_VALUE;
int VRP_Constraint = VRP_VALUE;
int AEI_Constraint = AEI_VALUE;
int LRI_Constraint = LRI_VALUE;
int URI_Constraint = URI_VALUE;

int AS, VS;

#define PRE_VP C_VP == 2
#define PRE_AP C_AP == 2

// States up counter initialization
int cAVI = 0;
int cPVARP = 0;
int cVRP = 0;
int cAEI = 0;
int cURI = 0;
int cLRI = 0;

// States initialized to be in the waiting states
enum AVIStates   AVIState = wAVI;
enum PVARPStates PVARPState = wPVARP;
enum VRPStates   VRPState = wVRP;
enum AEIStates   AEIState = wAEI;
enum URIStates   URIState = wURI;
enum LRIStates   LRIState = wLRI;

// Reset program function
void c_reset() {
	// initialize waiting states
	AVIState = wAVI;
	PVARPState = wPVARP;
	VRPState = wVRP;
	AEIState = wAEI;
	URIState = wURI;
	LRIState = wLRI;

	AVIBufferState = wAVI;
	PVARPBufferState = wPVARP;
	VRPBufferState = wVRP;
	AEIBufferState = wAEI;
	URIBufferState = wURI;
	LRIBufferState = wLRI;

	// initialize counters
	cAVI = 0;
	cPVARP = 0;
	cVRP = 0;
	cAEI = 0;
	cURI = 0;
	cLRI = 0;
}

void c_tick() {

	AS = ASBuffer;
	VS = VSBuffer;

	//print_v();

    // -------------- AVIState ---------------
    switch (AVIState) {
    case wAVI:
        if ((AS || PRE_AP) && PVARPState != dPVARP) {
            AVIBufferState = dAVI;
            cAVI = 0;
        }
        break;
    case dAVI:
        if (cAVI >= AVI_Constraint && URIState != dURI) {
            C_VP = 1;
            AVIBufferState = wAVI;
        }
        if (VS){
        	AVIBufferState = wAVI;
        }
        cAVI += 1;
        break;
    }
    // ------------- End AVIState -------------

    // -------------- PVARPState ---------------
    switch (PVARPState) {
    case wPVARP:
        if (VS || PRE_VP) {
            PVARPBufferState = dPVARP;
            cPVARP = 0;
        }
        break;
    case dPVARP:
        if (cPVARP >= PVARP_Constraint) {
            PVARPBufferState = wPVARP;
        }
        cPVARP += 1;
        break;
    }
    // ------------- End PVARPState -------------


    // -------------- VRPState ---------------
    switch (VRPState) {
    case wVRP:
        if (VS || PRE_VP) {
            VRPBufferState = dVRP;
            cVRP = 0;
        }
        break;
    case dVRP:
        if (cVRP >= VRP_Constraint) {
            VRPBufferState = wVRP;
        }
        cVRP += 1;
        break;
    }
    // ------------- End VRPState -------------


    // -------------- AEIState ---------------
    switch (AEIState) {
    case wAEI:
        if ((VS || PRE_VP) && VRPState != dVRP) {
            AEIBufferState = dAEI;
            cAEI = 0;
        }
        break;
    case dAEI:
        if (cAEI >= AEI_Constraint) {
            C_AP = 1;
            AEIBufferState = wAEI;
        }
        if (AS && PVARPState != dPVARP){
			AEIBufferState = wAEI;
        }
        cAEI += 1;
        break;
    }
    // ------------- End AEIState -------------


    // -------------- LRIState ---------------
    switch (LRIState) {
    case wLRI:
        if ((VS || PRE_VP) && VRPState != dVRP) {
            LRIBufferState = dLRI;
            cLRI = 0;
        }
        break;
    case dLRI:
        if (cLRI >= LRI_Constraint) {
            C_VP = 1;
            LRIBufferState = dLRI;
            cLRI = 0;
        }
        if ((VS || PRE_VP) && VRPState != dVRP){
        	LRIBufferState = dLRI;
        	cLRI = 0;
        }
        cLRI += 1;
        break;
    }
    // ------------- End LRIState -------------


    // -------------- URIState ---------------
    switch (URIState) {
    case wURI:
        if ((VS || PRE_VP) && VRPState != dVRP) {
            URIBufferState = dURI;
            cURI = 0;
        }
        break;
    case dURI:
        if (cURI >= URI_Constraint) {
            URIBufferState = wURI;
        }
        cURI += 1;
        break;
    }
    // ------------- End URIState -------------

	AVIState = AVIBufferState;
	PVARPState = PVARPBufferState;
	VRPState = VRPBufferState;
	AEIState = AEIBufferState;
	URIState = URIBufferState;
	LRIState = LRIBufferState;


	if (PRE_AP){
		C_AP = 0;
	}

	if (PRE_VP){
		C_VP = 0;
	}

}
