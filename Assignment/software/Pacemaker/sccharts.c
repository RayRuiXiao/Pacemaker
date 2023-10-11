/*
 * Automatically generated C code by
 * KIELER SCCharts - The Key to Efficient Modeling
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 */

#include "timing.h"

#include "sccharts.h"

void logic(TickData* d) {
  d->AP = 0;
  d->VP = 0;
  d->AVI = 0;
  d->PVARP = 0;
  d->VRP = 0;
  d->AEI = 0;
  d->LRI = 0;
  d->URI = 0;
  d->_g8 = d->_pg93;
  d->_g9_e1 = !d->_g8;
  if (d->_g8) {
    d->AVI |= 1;
  }
  d->_g145 = d->_pg126;
  if (d->_g145) {
    d->URI |= 1;
  }
  d->_g167 = d->_pg143;
  if (d->_g167) {
    d->_region0_AVI_cAVI += d->deltaT;
  }
  d->_g23 = d->_pg8;
  d->_cg23 = d->_region0_AVI_cAVI >= d->AVI_Constraint && !d->URI;
  d->_g24 = d->_g23 && d->_cg23;
  if (d->_g24) {
    d->_Pacemaker_local__Atrig = 1;
  }
  d->_g26 = d->_g23 && !d->_cg23;
  d->_g27 = d->_g26 && d->VS;
  if (d->_g27) {
    d->_Pacemaker_local__Atrig1 = 1;
  }
  d->_cg8 = d->_Pacemaker_local__Atrig || d->_Pacemaker_local__Atrig1;
  d->_g9 = d->_g8 && d->_cg8;
  d->_g19 = d->_pg4;
  d->_g13 = d->_pg28;
  d->_g16_e2 = !(d->_g19 || d->_g13);
  d->sleepT = 1000.0;
  d->_g19 = d->_g13 || d->_g19;
  d->_cg14 = d->_region0_AVI_cAVI < d->AVI_Constraint;
  d->_g13 = d->_g19 && d->_cg14;
  if (d->_g13) {
    d->sleepT = (d->sleepT < (d->AVI_Constraint - d->_region0_AVI_cAVI)) ? d->sleepT : (d->AVI_Constraint - d->_region0_AVI_cAVI);
  }
  d->_cg15 = d->_Pacemaker_local__Atrig || d->_Pacemaker_local__Atrig1;
  d->_g14 = d->_g19 && !d->_cg14;
  d->_cg17 = d->_Pacemaker_local__Atrig || d->_Pacemaker_local__Atrig1;
  d->_g16 = d->_g13 && d->_cg15 || d->_g14 && d->_cg17;
  d->_g23 = !d->_g23;
  d->_g27 = d->_g24 || d->_g27;
  d->_g24 = (d->_g9_e1 || d->_g9) && (d->_g16_e2 || d->_g16) && (d->_g23 || d->_g27) && (d->_g9 || d->_g16 || d->_g27);
  d->_cg28 = d->_Pacemaker_local__Atrig;
  d->_g16_e2 = d->_g24 && d->_cg28;
  if (d->_g16_e2) {
    d->VP |= 1;
  }
  d->_g9 = d->_pg131;
  if (d->_g9) {
    d->PVARP |= 1;
  }
  d->_g16 = d->_pg67;
  d->_g9_e1 = !d->_g16;
  if (d->_g16) {
    d->AEI |= 1;
  }
  d->_g25 = d->_pg158;
  if (d->_g25) {
    d->_region3_AEI_cAEI += d->deltaT;
  }
  d->_g25_e3 = d->_pg106;
  d->_cg100 = d->_region3_AEI_cAEI >= d->AEI_Constraint;
  d->_g101 = d->_g25_e3 && d->_cg100;
  if (d->_g101) {
    d->_Pacemaker_local__Atrig4 = 1;
  }
  d->_g103 = d->_g25_e3 && !d->_cg100;
  d->_cg103 = d->AS && !d->PVARP;
  d->_g104 = d->_g103 && d->_cg103;
  if (d->_g104) {
    d->_Pacemaker_local__Atrig5 = 1;
  }
  d->_cg85 = d->_Pacemaker_local__Atrig4 || d->_Pacemaker_local__Atrig5;
  d->_g86 = d->_g16 && d->_cg85;
  d->_g96 = d->_pg105;
  d->_g90 = d->_pg77;
  d->_g93_e2 = !(d->_g96 || d->_g90);
  d->_g96 = d->_g90 || d->_g96;
  d->_cg91 = d->_region3_AEI_cAEI < d->AEI_Constraint;
  d->_g90 = d->_g96 && d->_cg91;
  if (d->_g90) {
    d->sleepT = (d->sleepT < (d->AEI_Constraint - d->_region3_AEI_cAEI)) ? d->sleepT : (d->AEI_Constraint - d->_region3_AEI_cAEI);
  }
  d->_cg92 = d->_Pacemaker_local__Atrig4 || d->_Pacemaker_local__Atrig5;
  d->_g91 = d->_g96 && !d->_cg91;
  d->_cg94 = d->_Pacemaker_local__Atrig4 || d->_Pacemaker_local__Atrig5;
  d->_g93 = d->_g90 && d->_cg92 || d->_g91 && d->_cg94;
  d->_g100 = !d->_g25_e3;
  d->_g101 = d->_g101 || d->_g104;
  d->_g104 = (d->_g9_e1 || d->_g86) && (d->_g93_e2 || d->_g93) && (d->_g100 || d->_g101) && (d->_g86 || d->_g93 || d->_g101);
  d->_cg105 = d->_Pacemaker_local__Atrig4;
  d->_g102 = d->_g104 && d->_cg105;
  if (d->_g102) {
    d->AP |= 1;
  }
  d->_g102_e3 = d->_pg86;
  d->_cg4 = (d->AS || d->AP) && !d->PVARP;
  d->_g86 = d->_GO || d->_g16_e2 || d->_g24 && !d->_cg28 || d->_g102_e3 && !d->_cg4;
  d->_g93_e2 = d->_g102_e3 && d->_cg4;
  if (d->_g93_e2) {
    d->_region0_AVI_cAVI = 0;
    d->_Pacemaker_local__Atrig = 0;
    d->_Pacemaker_local__Atrig1 = 0;
  }
  d->_cg6 = d->_Pacemaker_local__Atrig || d->_Pacemaker_local__Atrig1;
  d->_g93 = d->_g93_e2 && !d->_cg6 || d->_g8 && !d->_cg8;
  d->_cg10 = d->_region0_AVI_cAVI < d->AVI_Constraint;
  d->_g86_e1 = d->_g93_e2 && d->_cg10;
  if (d->_g86_e1) {
    d->sleepT = (d->sleepT < (d->AVI_Constraint - d->_region0_AVI_cAVI)) ? d->sleepT : (d->AVI_Constraint - d->_region0_AVI_cAVI);
  }
  d->_cg11 = d->_Pacemaker_local__Atrig || d->_Pacemaker_local__Atrig1;
  d->_g28 = d->_g86_e1 && !d->_cg11 || d->_g13 && !d->_cg15;
  d->_g29 = d->_g93_e2 && !d->_cg10;
  d->_cg20 = d->_Pacemaker_local__Atrig || d->_Pacemaker_local__Atrig1;
  d->_g4 = d->_g14 && !d->_cg17 || d->_g29 && !d->_cg20;
  d->_g8 = d->_g93_e2 || d->_g26 && !d->VS;
  d->_g15 = d->_pg149;
  if (d->_g15) {
    d->_region1_PVARP_cPVARP += d->deltaT;
  }
  d->_g11 = d->_pg42;
  d->_cg51 = d->_region1_PVARP_cPVARP >= d->PVARP_Constraint;
  d->_g20 = d->_g11 && d->_cg51;
  if (d->_g20) {
    d->_Pacemaker_local__Atrig2 = 1;
  }
  d->_g17 = d->_pg92;
  d->_g26 = !d->_g17;
  if (d->_g17) {
    d->LRI |= 1;
  }
  d->_g5 = d->_pg53;
  if (d->_g5) {
    d->VRP |= 1;
  }
  d->_g129 = d->_pg134;
  d->_cg129 = (d->VS || d->VP) && !d->VRP;
  d->_g130 = d->_g129 && d->_cg129;
  if (d->_g130) {
    d->_Pacemaker_local__Atrig6 = 1;
  }
  d->_g183 = d->_pg143_e1;
  if (d->_g183) {
    d->_region4_LRI_cLRI += d->deltaT;
  }
  d->_g132 = d->_g129 && !d->_cg129;
  d->_cg132 = d->_region4_LRI_cLRI >= d->LRI_Constraint;
  d->_g133 = d->_g132 && d->_cg132;
  if (d->_g133) {
    d->_Pacemaker_local__Atrig7 = 1;
  }
  d->_cg114 = d->_Pacemaker_local__Atrig6 || d->_Pacemaker_local__Atrig7;
  d->_g115 = d->_g17 && d->_cg114;
  d->_g125 = d->_pg82;
  d->_g119 = d->_pg94;
  d->_g122_e2 = !(d->_g125 || d->_g119);
  d->_g125 = d->_g119 || d->_g125;
  d->_cg120 = d->_region4_LRI_cLRI < d->LRI_Constraint;
  d->_g119 = d->_g125 && d->_cg120;
  if (d->_g119) {
    d->sleepT = (d->sleepT < (d->LRI_Constraint - d->_region4_LRI_cLRI)) ? d->sleepT : (d->LRI_Constraint - d->_region4_LRI_cLRI);
  }
  d->_cg121 = d->_Pacemaker_local__Atrig6 || d->_Pacemaker_local__Atrig7;
  d->_g120 = d->_g125 && !d->_cg120;
  d->_cg123 = d->_Pacemaker_local__Atrig6 || d->_Pacemaker_local__Atrig7;
  d->_g122 = d->_g119 && d->_cg121 || d->_g120 && d->_cg123;
  d->_g129 = !d->_g129;
  d->_g130 = d->_g130 || d->_g133;
  d->_g133 = (d->_g26 || d->_g115) && (d->_g122_e2 || d->_g122) && (d->_g129 || d->_g130) && (d->_g115 || d->_g122 || d->_g130);
  d->_cg134 = d->_Pacemaker_local__Atrig6;
  d->_g122 = d->_g133 && !d->_cg134;
  if (d->_g122) {
    d->VP |= 1;
  }
  d->_g131_e3 = d->_pg37;
  d->_cg33 = d->VS || d->VP;
  d->_g115_e1 = d->_g131_e3 && d->_cg33;
  if (d->_g115_e1) {
    d->_region1_PVARP_cPVARP = 0;
    d->_Pacemaker_local__Atrig2 = 0;
  }
  d->_g122_e2 = d->_g115_e1 || d->_g9;
  d->_cg36 = d->_Pacemaker_local__Atrig2;
  d->_g131 = d->_g122_e2 && !d->_cg36;
  d->_g115 = !d->_g131;
  d->_g39 = d->_g122_e2 && d->_cg36;
  d->_g36 = d->_pg44;
  d->_g48 = d->_pg47;
  d->_g48 = d->_g115_e1 || d->_g36 || d->_g48;
  d->_cg41 = d->_region1_PVARP_cPVARP < d->PVARP_Constraint;
  d->_g45 = d->_g48 && !d->_cg41;
  d->_cg46 = d->_Pacemaker_local__Atrig2;
  d->_g47 = d->_g45 && !d->_cg46;
  d->_g41 = d->_g48 && d->_cg41;
  if (d->_g41) {
    d->sleepT = (d->sleepT < (d->PVARP_Constraint - d->_region1_PVARP_cPVARP)) ? d->sleepT : (d->PVARP_Constraint - d->_region1_PVARP_cPVARP);
  }
  d->_cg42 = d->_Pacemaker_local__Atrig2;
  d->_g44 = d->_g41 && !d->_cg42;
  d->_g43_e2 = !(d->_g47 || d->_g44);
  d->_g46 = d->_g41 && d->_cg42 || d->_g45 && d->_cg46;
  d->_g42 = d->_g115_e1 || d->_g11 && !d->_cg51;
  d->_g51 = !d->_g42;
  d->_g34 = (d->_g115 || d->_g39) && (d->_g43_e2 || d->_g46) && (d->_g51 || d->_g20) && (d->_g39 || d->_g46 || d->_g20);
  d->_g37 = d->_GO || d->_g34 || d->_g131_e3 && !d->_cg33;
  d->_g52 = d->_pg158_e3;
  if (d->_g52) {
    d->_region2_VRP_cVRP += d->deltaT;
  }
  d->_g37_e1 = d->_pg70;
  d->_cg75 = d->_region2_VRP_cVRP >= d->VRP_Constraint;
  d->_g43 = d->_g37_e1 && d->_cg75;
  if (d->_g43) {
    d->_Pacemaker_local__Atrig3 = 1;
  }
  d->_g43_e2 = d->_pg76_e3;
  d->_cg57 = d->VS || d->VP;
  d->_g52_e3 = d->_g43_e2 && d->_cg57;
  if (d->_g52_e3) {
    d->_region2_VRP_cVRP = 0;
    d->_Pacemaker_local__Atrig3 = 0;
  }
  d->_g33 = d->_g52_e3 || d->_g5;
  d->_cg60 = d->_Pacemaker_local__Atrig3;
  d->_g53 = d->_g33 && !d->_cg60;
  d->_g63 = !d->_g53;
  d->_g60 = d->_g33 && d->_cg60;
  d->_g69 = d->_pg68;
  d->_g72 = d->_pg71;
  d->_g69 = d->_g52_e3 || d->_g69 || d->_g72;
  d->_cg65 = d->_region2_VRP_cVRP < d->VRP_Constraint;
  d->_g72 = d->_g69 && !d->_cg65;
  d->_cg70 = d->_Pacemaker_local__Atrig3;
  d->_g71 = d->_g72 && !d->_cg70;
  d->_g65 = d->_g69 && d->_cg65;
  if (d->_g65) {
    d->sleepT = (d->sleepT < (d->VRP_Constraint - d->_region2_VRP_cVRP)) ? d->sleepT : (d->VRP_Constraint - d->_region2_VRP_cVRP);
  }
  d->_cg66 = d->_Pacemaker_local__Atrig3;
  d->_g68 = d->_g65 && !d->_cg66;
  d->_g67_e2 = !(d->_g71 || d->_g68);
  d->_g66 = d->_g65 && d->_cg66 || d->_g72 && d->_cg70;
  d->_g70 = d->_g52_e3 || d->_g37_e1 && !d->_cg75;
  d->_g75 = !d->_g70;
  d->_g58 = (d->_g63 || d->_g60) && (d->_g67_e2 || d->_g66) && (d->_g75 || d->_g43) && (d->_g60 || d->_g66 || d->_g43);
  d->_g76_e3 = d->_GO || d->_g58 || d->_g43_e2 && !d->_cg57;
  d->_g61_e1 = d->_pg76;
  d->_cg81 = (d->VS || d->VP) && !d->VRP;
  d->_g76 = d->_GO || d->_g102 || d->_g104 && !d->_cg105 || d->_g61_e1 && !d->_cg81;
  d->_g67_e2 = d->_g61_e1 && d->_cg81;
  if (d->_g67_e2) {
    d->_region3_AEI_cAEI = 0;
    d->_Pacemaker_local__Atrig4 = 0;
    d->_Pacemaker_local__Atrig5 = 0;
  }
  d->_cg83 = d->_Pacemaker_local__Atrig4 || d->_Pacemaker_local__Atrig5;
  d->_g67 = d->_g67_e2 && !d->_cg83 || d->_g16 && !d->_cg85;
  d->_cg87 = d->_region3_AEI_cAEI < d->AEI_Constraint;
  d->_g61 = d->_g67_e2 && d->_cg87;
  if (d->_g61) {
    d->sleepT = (d->sleepT < (d->AEI_Constraint - d->_region3_AEI_cAEI)) ? d->sleepT : (d->AEI_Constraint - d->_region3_AEI_cAEI);
  }
  d->_cg88 = d->_Pacemaker_local__Atrig4 || d->_Pacemaker_local__Atrig5;
  d->_g77 = d->_g61 && !d->_cg88 || d->_g90 && !d->_cg92;
  d->_g57 = d->_g67_e2 && !d->_cg87;
  d->_cg97 = d->_Pacemaker_local__Atrig4 || d->_Pacemaker_local__Atrig5;
  d->_g105 = d->_g91 && !d->_cg94 || d->_g57 && !d->_cg97;
  d->_g106 = d->_g67_e2 || d->_g103 && !d->_cg103;
  d->_g81 = d->_pg85;
  d->_cg110 = (d->VP || d->VS) && !d->VRP;
  d->_g85 = d->_GO || d->_g81 && !d->_cg110;
  d->_g88 = d->_g81 && d->_cg110 || d->_g133 && d->_cg134 || d->_g122;
  if (d->_g88) {
    d->_region4_LRI_cLRI = 0;
    d->_Pacemaker_local__Atrig6 = 0;
    d->_Pacemaker_local__Atrig7 = 0;
  }
  d->_cg112 = d->_Pacemaker_local__Atrig6 || d->_Pacemaker_local__Atrig7;
  d->_g92 = d->_g88 && !d->_cg112 || d->_g17 && !d->_cg114;
  d->_cg116 = d->_region4_LRI_cLRI < d->LRI_Constraint;
  d->_g97 = d->_g88 && d->_cg116;
  if (d->_g97) {
    d->sleepT = (d->sleepT < (d->LRI_Constraint - d->_region4_LRI_cLRI)) ? d->sleepT : (d->LRI_Constraint - d->_region4_LRI_cLRI);
  }
  d->_cg117 = d->_Pacemaker_local__Atrig6 || d->_Pacemaker_local__Atrig7;
  d->_g94 = d->_g97 && !d->_cg117 || d->_g119 && !d->_cg121;
  d->_g103 = d->_g88 && !d->_cg116;
  d->_cg126 = d->_Pacemaker_local__Atrig6 || d->_Pacemaker_local__Atrig7;
  d->_g82 = d->_g120 && !d->_cg123 || d->_g103 && !d->_cg126;
  d->_g134 = d->_g88 || d->_g132 && !d->_cg132;
  d->_g135 = d->_pg139;
  if (d->_g135) {
    d->_region5_URI_cURI += d->deltaT;
  }
  d->_g110 = d->_pg148;
  d->_cg157 = d->_region5_URI_cURI >= d->URI_Constraint;
  d->_g114 = d->_g110 && d->_cg157;
  if (d->_g114) {
    d->_Pacemaker_local__Atrig8 = 1;
  }
  d->_g117 = d->_pg149_e2;
  d->_cg139 = (d->VS || d->VP) && !d->VRP;
  d->_g121 = d->_g117 && d->_cg139;
  if (d->_g121) {
    d->_region5_URI_cURI = 0;
    d->_Pacemaker_local__Atrig8 = 0;
  }
  d->_g123 = d->_g121 || d->_g145;
  d->_cg142 = d->_Pacemaker_local__Atrig8;
  d->_g126 = d->_g123 && !d->_cg142;
  d->_g132 = !d->_g126;
  d->_g111 = d->_g123 && d->_cg142;
  d->_g145 = d->_pg150;
  d->_g142 = d->_pg153;
  d->_g154 = d->_g121 || d->_g145 || d->_g142;
  d->_cg147 = d->_region5_URI_cURI < d->URI_Constraint;
  d->_g151 = d->_g154 && !d->_cg147;
  d->_cg152 = d->_Pacemaker_local__Atrig8;
  d->_g153 = d->_g151 && !d->_cg152;
  d->_g147 = d->_g154 && d->_cg147;
  if (d->_g147) {
    d->sleepT = (d->sleepT < (d->URI_Constraint - d->_region5_URI_cURI)) ? d->sleepT : (d->URI_Constraint - d->_region5_URI_cURI);
  }
  d->_cg148 = d->_Pacemaker_local__Atrig8;
  d->_g150 = d->_g147 && !d->_cg148;
  d->_g149_e2 = !(d->_g153 || d->_g150);
  d->_g152 = d->_g147 && d->_cg148 || d->_g151 && d->_cg152;
  d->_g148 = d->_g121 || d->_g110 && !d->_cg157;
  d->_g157 = !d->_g148;
  d->_g140 = (d->_g132 || d->_g111) && (d->_g149_e2 || d->_g152) && (d->_g157 || d->_g114) && (d->_g111 || d->_g152 || d->_g114);
  d->_g149_e2 = d->_GO || d->_g140 || d->_g117 && !d->_cg139;
  d->_g143 = d->_GO || d->_g167;
  d->_g149 = d->_GO || d->_g15;
  d->_g158_e3 = d->_GO || d->_g52;
  d->_g158 = d->_GO || d->_g25;
  d->_g143_e1 = d->_GO || d->_g183;
  d->_g139 = d->_GO || d->_g135;
}

void reset(TickData* d) {
  d->_GO = 1;
  d->_TERM = 0;
  d->AVI_Constraint = AVI_VALUE;
  d->PVARP_Constraint = PVARP_VALUE;
  d->VRP_Constraint = VRP_VALUE;
  d->AEI_Constraint = AEI_VALUE;
  d->LRI_Constraint = LRI_VALUE;
  d->URI_Constraint = URI_VALUE;
  d->_region0_AVI_cAVI = 0;
  d->_region1_PVARP_cPVARP = 0;
  d->_region2_VRP_cVRP = 0;
  d->_region3_AEI_cAEI = 0;
  d->_region4_LRI_cLRI = 0;
  d->_region5_URI_cURI = 0;
  d->deltaT = 0.0;
  d->sleepT = 0.0;
  d->_pg93 = 0;
  d->_pg126 = 0;
  d->_pg143 = 0;
  d->_pg8 = 0;
  d->_pg4 = 0;
  d->_pg28 = 0;
  d->_pg131 = 0;
  d->_pg67 = 0;
  d->_pg158 = 0;
  d->_pg106 = 0;
  d->_pg105 = 0;
  d->_pg77 = 0;
  d->_pg86 = 0;
  d->_pg149 = 0;
  d->_pg42 = 0;
  d->_pg92 = 0;
  d->_pg53 = 0;
  d->_pg134 = 0;
  d->_pg143_e1 = 0;
  d->_pg82 = 0;
  d->_pg94 = 0;
  d->_pg37 = 0;
  d->_pg44 = 0;
  d->_pg47 = 0;
  d->_pg158_e3 = 0;
  d->_pg70 = 0;
  d->_pg76_e3 = 0;
  d->_pg68 = 0;
  d->_pg71 = 0;
  d->_pg76 = 0;
  d->_pg85 = 0;
  d->_pg139 = 0;
  d->_pg148 = 0;
  d->_pg149_e2 = 0;
  d->_pg150 = 0;
  d->_pg153 = 0;
}

void tick(TickData* d) {
  logic(d);

  d->_pg93 = d->_g93;
  d->_pg126 = d->_g126;
  d->_pg143 = d->_g143;
  d->_pg8 = d->_g8;
  d->_pg4 = d->_g4;
  d->_pg28 = d->_g28;
  d->_pg131 = d->_g131;
  d->_pg67 = d->_g67;
  d->_pg158 = d->_g158;
  d->_pg106 = d->_g106;
  d->_pg105 = d->_g105;
  d->_pg77 = d->_g77;
  d->_pg86 = d->_g86;
  d->_pg149 = d->_g149;
  d->_pg42 = d->_g42;
  d->_pg92 = d->_g92;
  d->_pg53 = d->_g53;
  d->_pg134 = d->_g134;
  d->_pg143_e1 = d->_g143_e1;
  d->_pg82 = d->_g82;
  d->_pg94 = d->_g94;
  d->_pg37 = d->_g37;
  d->_pg44 = d->_g44;
  d->_pg47 = d->_g47;
  d->_pg158_e3 = d->_g158_e3;
  d->_pg70 = d->_g70;
  d->_pg76_e3 = d->_g76_e3;
  d->_pg68 = d->_g68;
  d->_pg71 = d->_g71;
  d->_pg76 = d->_g76;
  d->_pg85 = d->_g85;
  d->_pg139 = d->_g139;
  d->_pg148 = d->_g148;
  d->_pg149_e2 = d->_g149_e2;
  d->_pg150 = d->_g150;
  d->_pg153 = d->_g153;
  d->_GO = 0;
}
