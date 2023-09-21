/*
 * Automatically generated C code by
 * KIELER SCCharts - The Key to Efficient Modeling
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 */

#include "Pacemaker.h"

void logic(TickData* d) {
  d->AP = 0;
  d->VP = 0;
  d->eAVI = 0;
  d->ePVARP = 0;
  d->eVRP = 0;
  d->eAEI = 0;
  d->eLRI = 0;
  d->eURI = 0;
  d->_g15 = d->_pg14;
  if (d->_g15) {
    d->cAVI += d->deltaT;
  }
  if (d->_GO) {
    d->URI = 0;
  }
  d->_g15 = d->_pg25;
  d->_g20 = d->_pg19;
  d->sleepT = 1000.0;
  d->_g26 = d->_g20 || d->_g15;
  d->_cg21 = d->cAVI < 150.0;
  d->_g20 = d->_g26 && d->_cg21;
  if (d->_g20) {
    d->sleepT = (d->sleepT < (150.0 - d->cAVI)) ? d->sleepT : (150.0 - d->cAVI);
  }
  d->_g21 = d->_pg51;
  if (d->_g21) {
    d->cPVARP += d->deltaT;
  }
  d->_g22 = !d->_g21;
  d->_g67 = d->_pg66;
  d->_cg67 = d->cPVARP >= 250;
  d->_g68 = d->_g67 && d->_cg67;
  if (d->_g68) {
    d->_Pacemaker_local__Atrig4 = 1;
  }
  d->_cg52 = d->_Pacemaker_local__Atrig4;
  d->_g52 = d->_g21 && d->_cg52;
  d->_g63 = d->_pg62;
  d->_g57 = d->_pg56;
  d->_g60_e2 = !(d->_g63 || d->_g57);
  d->_g63 = d->_g57 || d->_g63;
  d->_cg58 = d->cPVARP < 250.0;
  d->_g57 = d->_g63 && d->_cg58;
  if (d->_g57) {
    d->sleepT = (d->sleepT < (250.0 - d->cPVARP)) ? d->sleepT : (250.0 - d->cPVARP);
  }
  d->_cg59 = d->_Pacemaker_local__Atrig4;
  d->_g58 = d->_g63 && !d->_cg58;
  d->_cg61 = d->_Pacemaker_local__Atrig4;
  d->_g59 = (d->_g57 && d->_cg59) || (d->_g58 && d->_cg61);
  d->_g61 = !d->_g67;
  d->_g67 = (d->_g22 || d->_g52) && (d->_g60_e2 || d->_g59) && (d->_g61 || d->_g68) && (d->_g52 || d->_g59 || d->_g68);
  if (d->_g67) {
    d->_taken_transitions[4] += 1;
  }
  d->_g60_e2 = d->_GO || d->_g67;
  if (d->_g60_e2) {
    d->PVARP = 0;
    d->_Pacemaker_local__Atrig3 = 0;
  }
  d->_g53 = d->_pg42;
  if (d->_g53) {
    d->cPVARP += d->deltaT;
  }
  d->_g53_e1 = d->_pg5;
  if (d->_g53_e1) {
    d->cAVI += d->deltaT;
  }
  d->_cg41 = d->_Pacemaker_local__Atrig3;
  d->_g68_e3 = d->_pg83;
  if (d->_g68_e3) {
    d->cVRP += d->deltaT;
  }
  d->_g68 = !d->_g68_e3;
  d->_g60 = d->_pg98;
  d->_cg99 = d->cVRP >= 320;
  d->_g69 = d->_g60 && d->_cg99;
  if (d->_g69) {
    d->_Pacemaker_local__Atrig6 = 1;
  }
  d->_cg84 = d->_Pacemaker_local__Atrig6;
  d->_g40 = d->_g68_e3 && d->_cg84;
  d->_g43 = d->_pg94;
  d->_g6 = d->_pg88;
  d->_g84 = !(d->_g43 || d->_g6);
  d->_g95 = d->_g6 || d->_g43;
  d->_cg90 = d->cVRP < 320.0;
  d->_g89 = d->_g95 && d->_cg90;
  if (d->_g89) {
    d->sleepT = (d->sleepT < (320.0 - d->cVRP)) ? d->sleepT : (320.0 - d->cVRP);
  }
  d->_cg91 = d->_Pacemaker_local__Atrig6;
  d->_g90 = d->_g95 && !d->_cg90;
  d->_cg93 = d->_Pacemaker_local__Atrig6;
  d->_g91 = (d->_g89 && d->_cg91) || (d->_g90 && d->_cg93);
  d->_g93 = !d->_g60;
  d->_g99 = (d->_g68 || d->_g40) && (d->_g84 || d->_g91) && (d->_g93 || d->_g69) && (d->_g40 || d->_g91 || d->_g69);
  if (d->_g99) {
    d->_taken_transitions[6] += 1;
  }
  d->_g85 = d->_GO || d->_g99;
  if (d->_g85) {
    d->VRP = 0;
    d->_Pacemaker_local__Atrig5 = 0;
  }
  d->_cg73 = d->_Pacemaker_local__Atrig5;
  d->_g100 = d->_pg74;
  if (d->_g100) {
    d->cVRP += d->deltaT;
  }
  d->_g92_e2 = d->_pg115;
  if (d->_g92_e2) {
    d->cAEI += d->deltaT;
  }
  d->_g92 = !d->_g92_e2;
  d->_g100_e3 = d->_pg130;
  d->_cg131 = d->cAEI >= 150;
  d->_g85_e1 = d->_g100_e3 && d->_cg131;
  if (d->_g85_e1) {
    d->_Pacemaker_local__Atrig8 = 1;
  }
  d->_g101 = d->_g100_e3 && !d->_cg131;
  d->_g72 = d->_g101 && d->AS;
  if (d->_g72) {
    d->_Pacemaker_local__Atrig9 = 1;
  }
  d->_cg116 = d->_Pacemaker_local__Atrig8 || d->_Pacemaker_local__Atrig9;
  d->_g75 = d->_g92_e2 && d->_cg116;
  d->_g134 = d->_pg126;
  d->_g116 = d->_pg120;
  d->_g124_e2 = !(d->_g134 || d->_g116);
  d->_g127 = d->_g116 || d->_g134;
  d->_cg122 = d->cAEI < 150.0;
  d->_g121 = d->_g127 && d->_cg122;
  if (d->_g121) {
    d->sleepT = (d->sleepT < (150.0 - d->cAEI)) ? d->sleepT : (150.0 - d->cAEI);
  }
  d->_cg123 = d->_Pacemaker_local__Atrig8 || d->_Pacemaker_local__Atrig9;
  d->_g122 = d->_g127 && !d->_cg122;
  d->_cg125 = d->_Pacemaker_local__Atrig8 || d->_Pacemaker_local__Atrig9;
  d->_g123 = (d->_g121 && d->_cg123) || (d->_g122 && d->_cg125);
  d->_g125 = !d->_g100_e3;
  d->_g131 = d->_g85_e1 || d->_g72;
  d->_g135 = (d->_g92 || d->_g75) && (d->_g124_e2 || d->_g123) && (d->_g125 || d->_g131) && (d->_g75 || d->_g123 || d->_g131);
  d->_cg136 = d->_Pacemaker_local__Atrig8;
  d->_g132 = d->_g135 && d->_cg136;
  if (d->_g132) {
    d->AP |= 1;
    d->_taken_transitions[8] += 1;
  }
  d->_g124 = d->_g135 && !d->_cg136;
  if (d->_g124) {
    d->eAEI |= 1;
    d->_taken_transitions[9] += 1;
  }
  d->_g124_e2 = d->_GO || d->_g132 || d->_g124;
  if (d->_g124_e2) {
    d->AEI = 0;
    d->_Pacemaker_local__Atrig7 = 0;
  }
  d->_cg105 = d->_Pacemaker_local__Atrig7;
  d->_g133_e3 = d->_pg106;
  if (d->_g133_e3) {
    d->cAEI += d->deltaT;
  }
  if (d->_GO) {
    d->LRI = 0;
  }
}

void reset(TickData* d) {
  d->_GO = 1;
  d->_TERM = 0;
  d->AVI = 0;
  d->PVARP = 0;
  d->VRP = 0;
  d->AEI = 0;
  d->LRI = 0;
  d->URI = 0;
  d->cAVI = 0.0;
  d->cPVARP = 0.0;
  d->cVRP = 0.0;
  d->cAEI = 0.0;
  d->cLRI = 0.0;
  d->cURI = 0.0;
  d->deltaT = 0.0;
  d->sleepT = 0.0;
  d->AP = 0;
  d->VP = 0;
  d->eAVI = 0;
  d->ePVARP = 0;
  d->eVRP = 0;
  d->eAEI = 0;
  d->eLRI = 0;
  d->eURI = 0;
  d->_taken_transitions[0] = 0;
  d->_taken_transitions[1] = 0;
  d->_taken_transitions[2] = 0;
  d->_taken_transitions[3] = 0;
  d->_taken_transitions[4] = 0;
  d->_taken_transitions[5] = 0;
  d->_taken_transitions[6] = 0;
  d->_taken_transitions[7] = 0;
  d->_taken_transitions[8] = 0;
  d->_taken_transitions[9] = 0;
  d->_taken_transitions[10] = 0;
  d->_taken_transitions[11] = 0;
  d->_pg14 = 0;
  d->_pg25 = 0;
  d->_pg19 = 0;
  d->_pg51 = 0;
  d->_pg66 = 0;
  d->_pg62 = 0;
  d->_pg56 = 0;
  d->_pg42 = 0;
  d->_pg5 = 0;
  d->_pg83 = 0;
  d->_pg98 = 0;
  d->_pg94 = 0;
  d->_pg88 = 0;
  d->_pg74 = 0;
  d->_pg115 = 0;
  d->_pg130 = 0;
  d->_pg126 = 0;
  d->_pg120 = 0;
  d->_pg106 = 0;
}

void tick(TickData* d) {
  logic(d);

  d->_pg14 = d->_g14;
  d->_pg25 = d->_g25;
  d->_pg19 = d->_g19;
  d->_pg51 = d->_g51;
  d->_pg66 = d->_g66;
  d->_pg62 = d->_g62;
  d->_pg56 = d->_g56;
  d->_pg42 = d->_g42;
  d->_pg5 = d->_g5;
  d->_pg83 = d->_g83;
  d->_pg98 = d->_g98;
  d->_pg94 = d->_g94;
  d->_pg88 = d->_g88;
  d->_pg74 = d->_g74;
  d->_pg115 = d->_g115;
  d->_pg130 = d->_g130;
  d->_pg126 = d->_g126;
  d->_pg120 = d->_g120;
  d->_pg106 = d->_g106;
  d->_GO = 0;
}
