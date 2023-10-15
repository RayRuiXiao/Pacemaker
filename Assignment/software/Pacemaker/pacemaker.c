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


int AS, VS;

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
        if ((AS || C_AP) && PVARPState != dPVARP) {
            AVIState = dAVI;
            cAVI = 0;
        }
        break;
    case dAVI:
        if ((cAVI >= AVI_Constraint && URIState != dURI) || LRIState != dLRI) {
            C_VP = 1;
            AVIState = wAVI;
        } else if (VS == 1){
        	AVIState = wAVI;
        }
        cAVI += 1;
        break;
    }
    // ------------- End AVIState -------------

    // -------------- PVARPState ---------------
    switch (PVARPState) {
    case wPVARP:
        if (VS || C_VP) {
            PVARPState = dPVARP;
            cPVARP = 0;
            VS = 0;
        }
        break;
    case dPVARP:
        if (cPVARP >= AVI_Constraint) {
            PVARPState = wPVARP;
        }
        cPVARP += 1;
        break;
    }
    // ------------- End PVARPState -------------


    // -------------- VRPState ---------------
    switch (VRPState) {
    case wVRP:
        if (VS || C_VP) {
            VRPState = dVRP;
            cVRP = 0;
        }
        break;
    case dVRP:
        if (cVRP >= VRP_Constraint) {
            VRPState = wVRP;
        }
        cVRP += 1;
        break;
    }
    // ------------- End VRPState -------------


    // -------------- AEIState ---------------
    switch (AEIState) {
    case wAEI:
        if ((VS || C_VP) && VRPState != dVRP) {
            AEIState = dAEI;
            cAEI = 0;
        }
        break;
    case dAEI:
        if (cAEI >= AEI_Constraint) {
            C_AP = 1;
            AEIState = wAEI;
        } else if (AS == 1 && PVARPState != dPVARP){
			AEIState = wAEI;
        }
        cAEI += 1;
        break;
    }
    // ------------- End AEIState -------------


    // -------------- LRIState ---------------
    switch (LRIState) {
    case wLRI:
        if ((VS || C_VP) && VRPState != dVRP) {
            LRIState = dLRI;
            cLRI = 0;
        }
        break;
    case dLRI:
        if (cLRI >= LRI_Constraint) {
            C_VP = 1;
            LRIState = dLRI;
        } else if ((VS || C_VP) && VRPState != dVRP){
        	LRIState = dLRI;
        } else if (cLRI >= LRI_VALUE){
        	cLRI = 0;
        }
        cLRI += 1;
        break;
    }
    // ------------- End LRIState -------------


    // -------------- URIState ---------------
    switch (URIState) {
    case wURI:
        if ((VS || C_VP) && VRPState != dVRP) {
            URIState = dURI;
            cURI = 0;
        }
        break;
    case dURI:
        if (cURI >= URI_Constraint) {
            URIState = wURI;
        }
        cURI += 1;
        break;
    }
    // ------------- End URIState -------------


}
