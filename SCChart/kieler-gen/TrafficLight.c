/*
 * Automatically generated C code by
 * KIELER SCCharts - The Key to Efficient Modeling
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 */

#include "TrafficLight.h"

#define _SC_NOTRACE
#define _SC_NO_SIGNALS2VARS
#define _SC_ID_MAX 20

#include "scl.h"
#include "sc.h"
#include "sc-generic.h"

int tick(TickData* d) {
  tickstart(14);
  d->x = 0.0;
  d->deltaT = 0.0;
  d->sleepT = 0.0;
  d->sigG = 0;
  d->sigY = 0;
  d->sigR = 0;
  fork1(_region_0,_region_1, 9) {
    _region_0:
    d->_taken_transitions[0] = 0;
    d->_taken_transitions[1] = 0;
    d->_taken_transitions[2] = 0;
    d->_taken_transitions[3] = 0;
    d->_taken_transitions[4] = 0;
    fork1(_region_2,_region_3, 8) {
      _region_2:
      label_0:
      d->sleepT = 1000.0;
      pause;
      goto label_0;
    } par {
      _region_3:
      label_1:
      d->_TrafficLight_local__Atrig = 0;
      fork2(_region_5,_region_4, 7, _region_6, 6) {
        _region_4:
        label_2:
        if(d->_TrafficLight_local__Atrig){
          
        } else {
          prio(19);
          pause;
          d->x += d->deltaT;
          prio(7);
          goto label_2;
        }
      } par {
        _region_5:
        label_3:
        prio(13);
        pause;
        if(d->x >= 60){
          d->_TrafficLight_local__Atrig = 1;
          
        } else {
          prio(8);
          goto label_3;
        }
      } par {
        _region_6:
        label_4:
        if(d->x < 60.0){
          d->sleepT = (d->sleepT < (60.0 - d->x)) ? d->sleepT : (60.0 - d->x);
          if(d->_TrafficLight_local__Atrig){
            
          } else {
            pause;
            goto label_4;
          }
        } else {
          if(d->_TrafficLight_local__Atrig){
            
          } else {
            pause;
            goto label_4;
          }
        }

      } join3(7, 8, 13);
      d->x = 0;
      d->sigG |= 1;
      d->_taken_transitions[0] += 1;
      d->_TrafficLight_local__Atrig1 = 0;
      d->_TrafficLight_local__Atrig2 = 0;
      fork1(_region_7,_region_8, 5) {
        _region_7:
        label_5:
        prio(12);
        pause;
        if(d->pedestrian && d->x < 60){
          d->_TrafficLight_local__Atrig1 = 1;
          
        } else {
          if(d->pedestrian && d->x >= 60){
            d->_TrafficLight_local__Atrig2 = 1;
            
          } else {
            prio(6);
            goto label_5;
          }
        }
      } par {
        _region_8:
        label_6:
        if(d->_TrafficLight_local__Atrig1 || d->_TrafficLight_local__Atrig2){
          
        } else {
          prio(18);
          pause;
          d->x += d->deltaT;
          prio(5);
          goto label_6;
        }

      } join2(6, 12);
      if(d->_TrafficLight_local__Atrig1){
        d->_taken_transitions[1] += 1;
        d->_TrafficLight_local__Atrig4 = 0;
        fork2(_region_10,_region_9, 4, _region_11, 3) {
          _region_9:
          label_7:
          if(d->_TrafficLight_local__Atrig4){
            
          } else {
            prio(17);
            pause;
            d->x += d->deltaT;
            prio(4);
            goto label_7;
          }
        } par {
          _region_10:
          label_8:
          prio(11);
          pause;
          if(d->x >= 60){
            d->_TrafficLight_local__Atrig4 = 1;
            
          } else {
            prio(5);
            goto label_8;
          }
        } par {
          _region_11:
          label_9:
          if(d->x < 60.0){
            d->sleepT = (d->sleepT < (60.0 - d->x)) ? d->sleepT : (60.0 - d->x);
            if(d->_TrafficLight_local__Atrig4){
              
            } else {
              pause;
              goto label_9;
            }
          } else {
            if(d->_TrafficLight_local__Atrig4){
              
            } else {
              pause;
              goto label_9;
            }
          }

        } join3(4, 5, 11);
        d->x = 0;
        d->sigY |= 1;
        d->_taken_transitions[4] += 1;
        label_10:
        d->_TrafficLight_local__Atrig3 = 0;
        fork2(_region_13,_region_12, 2, _region_14, 1) {
          _region_12:
          label_11:
          if(d->_TrafficLight_local__Atrig3){
            
          } else {
            prio(16);
            pause;
            d->x += d->deltaT;
            prio(2);
            goto label_11;
          }
        } par {
          _region_13:
          label_12:
          prio(10);
          pause;
          if(d->x >= 5){
            d->_TrafficLight_local__Atrig3 = 1;
            
          } else {
            prio(3);
            goto label_12;
          }
        } par {
          _region_14:
          label_13:
          if(d->x < 5.0){
            d->sleepT = (d->sleepT < (5.0 - d->x)) ? d->sleepT : (5.0 - d->x);
            if(d->_TrafficLight_local__Atrig3){
              
            } else {
              pause;
              goto label_13;
            }
          } else {
            if(d->_TrafficLight_local__Atrig3){
              
            } else {
              pause;
              goto label_13;
            }
          }

        } join3(2, 3, 10);
        d->x = 0;
        d->sigR |= 1;
        d->_taken_transitions[3] += 1;
        prio(8);
        goto label_1;
      } else {
        d->x = 0;
        d->_taken_transitions[2] += 1;
        prio(3);
        goto label_10;
      }

    } join1(14);
    label_14:
    pause;
    goto label_14;
  } par {
    _region_1:
    label_15:
    d->sigG = 0;
    d->sigY = 0;
    d->sigR = 0;
    pause;
    goto label_15;

  } join1(15);
  
  tickreturn();
}

void reset(TickData* d) {
}
