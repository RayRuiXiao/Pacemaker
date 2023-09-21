#ifndef TRAFFICLIGHT_H
#define TRAFFICLIGHT_H
/*
 * Automatically generated C code by
 * KIELER SCCharts - The Key to Efficient Modeling
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 */

#define false 0
#define true 1
typedef int bool;


typedef struct {
  double x;
  int _taken_transitions[5];
  double deltaT;
  double sleepT;
  char pedestrian;
  char sigG;
  char sigY;
  char sigR;
  char _TrafficLight_local__Atrig;
  char _TrafficLight_local__Atrig1;
  char _TrafficLight_local__Atrig2;
  char _TrafficLight_local__Atrig3;
  char _TrafficLight_local__Atrig4;
} TickData;

void reset(TickData* d);
int tick(TickData* d);

#endif /* !TRAFFICLIGHT_H */
