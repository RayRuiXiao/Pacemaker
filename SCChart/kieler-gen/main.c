

#include "lib/ticktime.h"
#include <string.h>
#include <stdlib.h>
#include <stdio.h>

#include "lib/cJSON.h"

#include "Pacemaker.h"

// The data for the model
TickData model;

double _ticktime;


void receiveVariables() {
    size_t blocksize = 2048;
    char *buffer = realloc(NULL, sizeof(char) * blocksize);
    size_t i = 0;
    
    // read next line
    int c = getchar();
    while (c != EOF && c != '\n') {
        buffer[i++] = (char) c;
        if (i == blocksize) {
            buffer = realloc(buffer, sizeof(char) * (blocksize += 2048));
        }
        c = getchar();
    }
    buffer[i++] = '\0';
    
    if (c == EOF) {
        exit(EOF);
    }
    
    cJSON *root = cJSON_Parse(buffer);
    cJSON *item = NULL;
    if(root != NULL) {
        // Receive AS
        item = cJSON_GetObjectItemCaseSensitive(root, "AS");
        if(item != NULL) {
            model.AS = item->valueint;
        }
        // Receive VS
        item = cJSON_GetObjectItemCaseSensitive(root, "VS");
        if(item != NULL) {
            model.VS = item->valueint;
        }
        // Receive deltaT
        item = cJSON_GetObjectItemCaseSensitive(root, "deltaT");
        if(item != NULL) {
            model.deltaT = item->valuedouble;
        }
        // Receive AP
        item = cJSON_GetObjectItemCaseSensitive(root, "AP");
        if(item != NULL) {
            model.AP = item->valueint;
        }
        // Receive VP
        item = cJSON_GetObjectItemCaseSensitive(root, "VP");
        if(item != NULL) {
            model.VP = item->valueint;
        }
        // Receive sleepT
        item = cJSON_GetObjectItemCaseSensitive(root, "sleepT");
        if(item != NULL) {
            model.sleepT = item->valuedouble;
        }
        // Receive #ticktime
        item = cJSON_GetObjectItemCaseSensitive(root, "#ticktime");
        if(item != NULL) {
            _ticktime = item->valuedouble;
        }
        // Receive AEI
        item = cJSON_GetObjectItemCaseSensitive(root, "AEI");
        if(item != NULL) {
            model.AEI = item->valueint;
        }
        // Receive AVI
        item = cJSON_GetObjectItemCaseSensitive(root, "AVI");
        if(item != NULL) {
            model.AVI = item->valueint;
        }
        // Receive LRI
        item = cJSON_GetObjectItemCaseSensitive(root, "LRI");
        if(item != NULL) {
            model.LRI = item->valueint;
        }
        // Receive PVARP
        item = cJSON_GetObjectItemCaseSensitive(root, "PVARP");
        if(item != NULL) {
            model.PVARP = item->valueint;
        }
        // Receive URI
        item = cJSON_GetObjectItemCaseSensitive(root, "URI");
        if(item != NULL) {
            model.URI = item->valueint;
        }
        // Receive VRP
        item = cJSON_GetObjectItemCaseSensitive(root, "VRP");
        if(item != NULL) {
            model.VRP = item->valueint;
        }
        // Receive _GO
        item = cJSON_GetObjectItemCaseSensitive(root, "_GO");
        if(item != NULL) {
            model._GO = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig");
        if(item != NULL) {
            model._Pacemaker_local__Atrig = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig1
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig1");
        if(item != NULL) {
            model._Pacemaker_local__Atrig1 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig2
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig2");
        if(item != NULL) {
            model._Pacemaker_local__Atrig2 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig3
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig3");
        if(item != NULL) {
            model._Pacemaker_local__Atrig3 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig4
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig4");
        if(item != NULL) {
            model._Pacemaker_local__Atrig4 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig5
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig5");
        if(item != NULL) {
            model._Pacemaker_local__Atrig5 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig6
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig6");
        if(item != NULL) {
            model._Pacemaker_local__Atrig6 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig7
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig7");
        if(item != NULL) {
            model._Pacemaker_local__Atrig7 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig8
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig8");
        if(item != NULL) {
            model._Pacemaker_local__Atrig8 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig9
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig9");
        if(item != NULL) {
            model._Pacemaker_local__Atrig9 = item->valueint;
        }
        // Receive _TERM
        item = cJSON_GetObjectItemCaseSensitive(root, "_TERM");
        if(item != NULL) {
            model._TERM = item->valueint;
        }
        // Receive _cg10
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg10");
        if(item != NULL) {
            model._cg10 = item->valueint;
        }
        // Receive _cg105
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg105");
        if(item != NULL) {
            model._cg105 = item->valueint;
        }
        // Receive _cg107
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg107");
        if(item != NULL) {
            model._cg107 = item->valueint;
        }
        // Receive _cg111
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg111");
        if(item != NULL) {
            model._cg111 = item->valueint;
        }
        // Receive _cg114
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg114");
        if(item != NULL) {
            model._cg114 = item->valueint;
        }
        // Receive _cg116
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg116");
        if(item != NULL) {
            model._cg116 = item->valueint;
        }
        // Receive _cg118
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg118");
        if(item != NULL) {
            model._cg118 = item->valueint;
        }
        // Receive _cg119
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg119");
        if(item != NULL) {
            model._cg119 = item->valueint;
        }
        // Receive _cg122
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg122");
        if(item != NULL) {
            model._cg122 = item->valueint;
        }
        // Receive _cg123
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg123");
        if(item != NULL) {
            model._cg123 = item->valueint;
        }
        // Receive _cg125
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg125");
        if(item != NULL) {
            model._cg125 = item->valueint;
        }
        // Receive _cg128
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg128");
        if(item != NULL) {
            model._cg128 = item->valueint;
        }
        // Receive _cg13
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg13");
        if(item != NULL) {
            model._cg13 = item->valueint;
        }
        // Receive _cg131
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg131");
        if(item != NULL) {
            model._cg131 = item->valueint;
        }
        // Receive _cg134
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg134");
        if(item != NULL) {
            model._cg134 = item->valueint;
        }
        // Receive _cg136
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg136");
        if(item != NULL) {
            model._cg136 = item->valueint;
        }
        // Receive _cg142
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg142");
        if(item != NULL) {
            model._cg142 = item->valueint;
        }
        // Receive _cg149
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg149");
        if(item != NULL) {
            model._cg149 = item->valueint;
        }
        // Receive _cg15
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg15");
        if(item != NULL) {
            model._cg15 = item->valueint;
        }
        // Receive _cg17
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg17");
        if(item != NULL) {
            model._cg17 = item->valueint;
        }
        // Receive _cg18
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg18");
        if(item != NULL) {
            model._cg18 = item->valueint;
        }
        // Receive _cg21
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg21");
        if(item != NULL) {
            model._cg21 = item->valueint;
        }
        // Receive _cg22
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg22");
        if(item != NULL) {
            model._cg22 = item->valueint;
        }
        // Receive _cg24
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg24");
        if(item != NULL) {
            model._cg24 = item->valueint;
        }
        // Receive _cg27
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg27");
        if(item != NULL) {
            model._cg27 = item->valueint;
        }
        // Receive _cg30
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg30");
        if(item != NULL) {
            model._cg30 = item->valueint;
        }
        // Receive _cg33
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg33");
        if(item != NULL) {
            model._cg33 = item->valueint;
        }
        // Receive _cg35
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg35");
        if(item != NULL) {
            model._cg35 = item->valueint;
        }
        // Receive _cg4
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg4");
        if(item != NULL) {
            model._cg4 = item->valueint;
        }
        // Receive _cg41
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg41");
        if(item != NULL) {
            model._cg41 = item->valueint;
        }
        // Receive _cg43
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg43");
        if(item != NULL) {
            model._cg43 = item->valueint;
        }
        // Receive _cg47
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg47");
        if(item != NULL) {
            model._cg47 = item->valueint;
        }
        // Receive _cg50
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg50");
        if(item != NULL) {
            model._cg50 = item->valueint;
        }
        // Receive _cg52
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg52");
        if(item != NULL) {
            model._cg52 = item->valueint;
        }
        // Receive _cg54
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg54");
        if(item != NULL) {
            model._cg54 = item->valueint;
        }
        // Receive _cg55
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg55");
        if(item != NULL) {
            model._cg55 = item->valueint;
        }
        // Receive _cg58
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg58");
        if(item != NULL) {
            model._cg58 = item->valueint;
        }
        // Receive _cg59
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg59");
        if(item != NULL) {
            model._cg59 = item->valueint;
        }
        // Receive _cg6
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg6");
        if(item != NULL) {
            model._cg6 = item->valueint;
        }
        // Receive _cg61
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg61");
        if(item != NULL) {
            model._cg61 = item->valueint;
        }
        // Receive _cg64
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg64");
        if(item != NULL) {
            model._cg64 = item->valueint;
        }
        // Receive _cg67
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg67");
        if(item != NULL) {
            model._cg67 = item->valueint;
        }
        // Receive _cg73
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg73");
        if(item != NULL) {
            model._cg73 = item->valueint;
        }
        // Receive _cg75
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg75");
        if(item != NULL) {
            model._cg75 = item->valueint;
        }
        // Receive _cg79
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg79");
        if(item != NULL) {
            model._cg79 = item->valueint;
        }
        // Receive _cg82
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg82");
        if(item != NULL) {
            model._cg82 = item->valueint;
        }
        // Receive _cg84
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg84");
        if(item != NULL) {
            model._cg84 = item->valueint;
        }
        // Receive _cg86
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg86");
        if(item != NULL) {
            model._cg86 = item->valueint;
        }
        // Receive _cg87
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg87");
        if(item != NULL) {
            model._cg87 = item->valueint;
        }
        // Receive _cg90
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg90");
        if(item != NULL) {
            model._cg90 = item->valueint;
        }
        // Receive _cg91
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg91");
        if(item != NULL) {
            model._cg91 = item->valueint;
        }
        // Receive _cg93
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg93");
        if(item != NULL) {
            model._cg93 = item->valueint;
        }
        // Receive _cg96
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg96");
        if(item != NULL) {
            model._cg96 = item->valueint;
        }
        // Receive _cg99
        item = cJSON_GetObjectItemCaseSensitive(root, "_cg99");
        if(item != NULL) {
            model._cg99 = item->valueint;
        }
        // Receive _g100
        item = cJSON_GetObjectItemCaseSensitive(root, "_g100");
        if(item != NULL) {
            model._g100 = item->valueint;
        }
        // Receive _g100_e3
        item = cJSON_GetObjectItemCaseSensitive(root, "_g100_e3");
        if(item != NULL) {
            model._g100_e3 = item->valueint;
        }
        // Receive _g101
        item = cJSON_GetObjectItemCaseSensitive(root, "_g101");
        if(item != NULL) {
            model._g101 = item->valueint;
        }
        // Receive _g106
        item = cJSON_GetObjectItemCaseSensitive(root, "_g106");
        if(item != NULL) {
            model._g106 = item->valueint;
        }
        // Receive _g115
        item = cJSON_GetObjectItemCaseSensitive(root, "_g115");
        if(item != NULL) {
            model._g115 = item->valueint;
        }
        // Receive _g116
        item = cJSON_GetObjectItemCaseSensitive(root, "_g116");
        if(item != NULL) {
            model._g116 = item->valueint;
        }
        // Receive _g120
        item = cJSON_GetObjectItemCaseSensitive(root, "_g120");
        if(item != NULL) {
            model._g120 = item->valueint;
        }
        // Receive _g121
        item = cJSON_GetObjectItemCaseSensitive(root, "_g121");
        if(item != NULL) {
            model._g121 = item->valueint;
        }
        // Receive _g122
        item = cJSON_GetObjectItemCaseSensitive(root, "_g122");
        if(item != NULL) {
            model._g122 = item->valueint;
        }
        // Receive _g123
        item = cJSON_GetObjectItemCaseSensitive(root, "_g123");
        if(item != NULL) {
            model._g123 = item->valueint;
        }
        // Receive _g124
        item = cJSON_GetObjectItemCaseSensitive(root, "_g124");
        if(item != NULL) {
            model._g124 = item->valueint;
        }
        // Receive _g124_e2
        item = cJSON_GetObjectItemCaseSensitive(root, "_g124_e2");
        if(item != NULL) {
            model._g124_e2 = item->valueint;
        }
        // Receive _g125
        item = cJSON_GetObjectItemCaseSensitive(root, "_g125");
        if(item != NULL) {
            model._g125 = item->valueint;
        }
        // Receive _g126
        item = cJSON_GetObjectItemCaseSensitive(root, "_g126");
        if(item != NULL) {
            model._g126 = item->valueint;
        }
        // Receive _g127
        item = cJSON_GetObjectItemCaseSensitive(root, "_g127");
        if(item != NULL) {
            model._g127 = item->valueint;
        }
        // Receive _g130
        item = cJSON_GetObjectItemCaseSensitive(root, "_g130");
        if(item != NULL) {
            model._g130 = item->valueint;
        }
        // Receive _g131
        item = cJSON_GetObjectItemCaseSensitive(root, "_g131");
        if(item != NULL) {
            model._g131 = item->valueint;
        }
        // Receive _g132
        item = cJSON_GetObjectItemCaseSensitive(root, "_g132");
        if(item != NULL) {
            model._g132 = item->valueint;
        }
        // Receive _g133_e3
        item = cJSON_GetObjectItemCaseSensitive(root, "_g133_e3");
        if(item != NULL) {
            model._g133_e3 = item->valueint;
        }
        // Receive _g134
        item = cJSON_GetObjectItemCaseSensitive(root, "_g134");
        if(item != NULL) {
            model._g134 = item->valueint;
        }
        // Receive _g135
        item = cJSON_GetObjectItemCaseSensitive(root, "_g135");
        if(item != NULL) {
            model._g135 = item->valueint;
        }
        // Receive _g14
        item = cJSON_GetObjectItemCaseSensitive(root, "_g14");
        if(item != NULL) {
            model._g14 = item->valueint;
        }
        // Receive _g15
        item = cJSON_GetObjectItemCaseSensitive(root, "_g15");
        if(item != NULL) {
            model._g15 = item->valueint;
        }
        // Receive _g19
        item = cJSON_GetObjectItemCaseSensitive(root, "_g19");
        if(item != NULL) {
            model._g19 = item->valueint;
        }
        // Receive _g20
        item = cJSON_GetObjectItemCaseSensitive(root, "_g20");
        if(item != NULL) {
            model._g20 = item->valueint;
        }
        // Receive _g21
        item = cJSON_GetObjectItemCaseSensitive(root, "_g21");
        if(item != NULL) {
            model._g21 = item->valueint;
        }
        // Receive _g22
        item = cJSON_GetObjectItemCaseSensitive(root, "_g22");
        if(item != NULL) {
            model._g22 = item->valueint;
        }
        // Receive _g25
        item = cJSON_GetObjectItemCaseSensitive(root, "_g25");
        if(item != NULL) {
            model._g25 = item->valueint;
        }
        // Receive _g26
        item = cJSON_GetObjectItemCaseSensitive(root, "_g26");
        if(item != NULL) {
            model._g26 = item->valueint;
        }
        // Receive _g40
        item = cJSON_GetObjectItemCaseSensitive(root, "_g40");
        if(item != NULL) {
            model._g40 = item->valueint;
        }
        // Receive _g42
        item = cJSON_GetObjectItemCaseSensitive(root, "_g42");
        if(item != NULL) {
            model._g42 = item->valueint;
        }
        // Receive _g43
        item = cJSON_GetObjectItemCaseSensitive(root, "_g43");
        if(item != NULL) {
            model._g43 = item->valueint;
        }
        // Receive _g5
        item = cJSON_GetObjectItemCaseSensitive(root, "_g5");
        if(item != NULL) {
            model._g5 = item->valueint;
        }
        // Receive _g51
        item = cJSON_GetObjectItemCaseSensitive(root, "_g51");
        if(item != NULL) {
            model._g51 = item->valueint;
        }
        // Receive _g52
        item = cJSON_GetObjectItemCaseSensitive(root, "_g52");
        if(item != NULL) {
            model._g52 = item->valueint;
        }
        // Receive _g53
        item = cJSON_GetObjectItemCaseSensitive(root, "_g53");
        if(item != NULL) {
            model._g53 = item->valueint;
        }
        // Receive _g53_e1
        item = cJSON_GetObjectItemCaseSensitive(root, "_g53_e1");
        if(item != NULL) {
            model._g53_e1 = item->valueint;
        }
        // Receive _g56
        item = cJSON_GetObjectItemCaseSensitive(root, "_g56");
        if(item != NULL) {
            model._g56 = item->valueint;
        }
        // Receive _g57
        item = cJSON_GetObjectItemCaseSensitive(root, "_g57");
        if(item != NULL) {
            model._g57 = item->valueint;
        }
        // Receive _g58
        item = cJSON_GetObjectItemCaseSensitive(root, "_g58");
        if(item != NULL) {
            model._g58 = item->valueint;
        }
        // Receive _g59
        item = cJSON_GetObjectItemCaseSensitive(root, "_g59");
        if(item != NULL) {
            model._g59 = item->valueint;
        }
        // Receive _g6
        item = cJSON_GetObjectItemCaseSensitive(root, "_g6");
        if(item != NULL) {
            model._g6 = item->valueint;
        }
        // Receive _g60
        item = cJSON_GetObjectItemCaseSensitive(root, "_g60");
        if(item != NULL) {
            model._g60 = item->valueint;
        }
        // Receive _g60_e2
        item = cJSON_GetObjectItemCaseSensitive(root, "_g60_e2");
        if(item != NULL) {
            model._g60_e2 = item->valueint;
        }
        // Receive _g61
        item = cJSON_GetObjectItemCaseSensitive(root, "_g61");
        if(item != NULL) {
            model._g61 = item->valueint;
        }
        // Receive _g62
        item = cJSON_GetObjectItemCaseSensitive(root, "_g62");
        if(item != NULL) {
            model._g62 = item->valueint;
        }
        // Receive _g63
        item = cJSON_GetObjectItemCaseSensitive(root, "_g63");
        if(item != NULL) {
            model._g63 = item->valueint;
        }
        // Receive _g66
        item = cJSON_GetObjectItemCaseSensitive(root, "_g66");
        if(item != NULL) {
            model._g66 = item->valueint;
        }
        // Receive _g67
        item = cJSON_GetObjectItemCaseSensitive(root, "_g67");
        if(item != NULL) {
            model._g67 = item->valueint;
        }
        // Receive _g68
        item = cJSON_GetObjectItemCaseSensitive(root, "_g68");
        if(item != NULL) {
            model._g68 = item->valueint;
        }
        // Receive _g68_e3
        item = cJSON_GetObjectItemCaseSensitive(root, "_g68_e3");
        if(item != NULL) {
            model._g68_e3 = item->valueint;
        }
        // Receive _g69
        item = cJSON_GetObjectItemCaseSensitive(root, "_g69");
        if(item != NULL) {
            model._g69 = item->valueint;
        }
        // Receive _g72
        item = cJSON_GetObjectItemCaseSensitive(root, "_g72");
        if(item != NULL) {
            model._g72 = item->valueint;
        }
        // Receive _g74
        item = cJSON_GetObjectItemCaseSensitive(root, "_g74");
        if(item != NULL) {
            model._g74 = item->valueint;
        }
        // Receive _g75
        item = cJSON_GetObjectItemCaseSensitive(root, "_g75");
        if(item != NULL) {
            model._g75 = item->valueint;
        }
        // Receive _g83
        item = cJSON_GetObjectItemCaseSensitive(root, "_g83");
        if(item != NULL) {
            model._g83 = item->valueint;
        }
        // Receive _g84
        item = cJSON_GetObjectItemCaseSensitive(root, "_g84");
        if(item != NULL) {
            model._g84 = item->valueint;
        }
        // Receive _g85
        item = cJSON_GetObjectItemCaseSensitive(root, "_g85");
        if(item != NULL) {
            model._g85 = item->valueint;
        }
        // Receive _g85_e1
        item = cJSON_GetObjectItemCaseSensitive(root, "_g85_e1");
        if(item != NULL) {
            model._g85_e1 = item->valueint;
        }
        // Receive _g88
        item = cJSON_GetObjectItemCaseSensitive(root, "_g88");
        if(item != NULL) {
            model._g88 = item->valueint;
        }
        // Receive _g89
        item = cJSON_GetObjectItemCaseSensitive(root, "_g89");
        if(item != NULL) {
            model._g89 = item->valueint;
        }
        // Receive _g90
        item = cJSON_GetObjectItemCaseSensitive(root, "_g90");
        if(item != NULL) {
            model._g90 = item->valueint;
        }
        // Receive _g91
        item = cJSON_GetObjectItemCaseSensitive(root, "_g91");
        if(item != NULL) {
            model._g91 = item->valueint;
        }
        // Receive _g92
        item = cJSON_GetObjectItemCaseSensitive(root, "_g92");
        if(item != NULL) {
            model._g92 = item->valueint;
        }
        // Receive _g92_e2
        item = cJSON_GetObjectItemCaseSensitive(root, "_g92_e2");
        if(item != NULL) {
            model._g92_e2 = item->valueint;
        }
        // Receive _g93
        item = cJSON_GetObjectItemCaseSensitive(root, "_g93");
        if(item != NULL) {
            model._g93 = item->valueint;
        }
        // Receive _g94
        item = cJSON_GetObjectItemCaseSensitive(root, "_g94");
        if(item != NULL) {
            model._g94 = item->valueint;
        }
        // Receive _g95
        item = cJSON_GetObjectItemCaseSensitive(root, "_g95");
        if(item != NULL) {
            model._g95 = item->valueint;
        }
        // Receive _g98
        item = cJSON_GetObjectItemCaseSensitive(root, "_g98");
        if(item != NULL) {
            model._g98 = item->valueint;
        }
        // Receive _g99
        item = cJSON_GetObjectItemCaseSensitive(root, "_g99");
        if(item != NULL) {
            model._g99 = item->valueint;
        }
        // Receive _pg106
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg106");
        if(item != NULL) {
            model._pg106 = item->valueint;
        }
        // Receive _pg115
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg115");
        if(item != NULL) {
            model._pg115 = item->valueint;
        }
        // Receive _pg120
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg120");
        if(item != NULL) {
            model._pg120 = item->valueint;
        }
        // Receive _pg126
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg126");
        if(item != NULL) {
            model._pg126 = item->valueint;
        }
        // Receive _pg130
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg130");
        if(item != NULL) {
            model._pg130 = item->valueint;
        }
        // Receive _pg14
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg14");
        if(item != NULL) {
            model._pg14 = item->valueint;
        }
        // Receive _pg19
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg19");
        if(item != NULL) {
            model._pg19 = item->valueint;
        }
        // Receive _pg25
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg25");
        if(item != NULL) {
            model._pg25 = item->valueint;
        }
        // Receive _pg42
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg42");
        if(item != NULL) {
            model._pg42 = item->valueint;
        }
        // Receive _pg5
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg5");
        if(item != NULL) {
            model._pg5 = item->valueint;
        }
        // Receive _pg51
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg51");
        if(item != NULL) {
            model._pg51 = item->valueint;
        }
        // Receive _pg56
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg56");
        if(item != NULL) {
            model._pg56 = item->valueint;
        }
        // Receive _pg62
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg62");
        if(item != NULL) {
            model._pg62 = item->valueint;
        }
        // Receive _pg66
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg66");
        if(item != NULL) {
            model._pg66 = item->valueint;
        }
        // Receive _pg74
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg74");
        if(item != NULL) {
            model._pg74 = item->valueint;
        }
        // Receive _pg83
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg83");
        if(item != NULL) {
            model._pg83 = item->valueint;
        }
        // Receive _pg88
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg88");
        if(item != NULL) {
            model._pg88 = item->valueint;
        }
        // Receive _pg94
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg94");
        if(item != NULL) {
            model._pg94 = item->valueint;
        }
        // Receive _pg98
        item = cJSON_GetObjectItemCaseSensitive(root, "_pg98");
        if(item != NULL) {
            model._pg98 = item->valueint;
        }
        // Receive _taken_transitions
        item = cJSON_GetObjectItemCaseSensitive(root, "_taken_transitions");
        if(item != NULL) {
            for (int i0 = 0; i0 < cJSON_GetArraySize(item); i0++) {
                cJSON *item0 = cJSON_GetArrayItem(item, i0);
                model._taken_transitions[i0] = item0->valueint;
            }
        }
        // Receive cAEI
        item = cJSON_GetObjectItemCaseSensitive(root, "cAEI");
        if(item != NULL) {
            model.cAEI = item->valuedouble;
        }
        // Receive cAVI
        item = cJSON_GetObjectItemCaseSensitive(root, "cAVI");
        if(item != NULL) {
            model.cAVI = item->valuedouble;
        }
        // Receive cLRI
        item = cJSON_GetObjectItemCaseSensitive(root, "cLRI");
        if(item != NULL) {
            model.cLRI = item->valuedouble;
        }
        // Receive cPVARP
        item = cJSON_GetObjectItemCaseSensitive(root, "cPVARP");
        if(item != NULL) {
            model.cPVARP = item->valuedouble;
        }
        // Receive cURI
        item = cJSON_GetObjectItemCaseSensitive(root, "cURI");
        if(item != NULL) {
            model.cURI = item->valuedouble;
        }
        // Receive cVRP
        item = cJSON_GetObjectItemCaseSensitive(root, "cVRP");
        if(item != NULL) {
            model.cVRP = item->valuedouble;
        }
        // Receive eAEI
        item = cJSON_GetObjectItemCaseSensitive(root, "eAEI");
        if(item != NULL) {
            model.eAEI = item->valueint;
        }
        // Receive eAVI
        item = cJSON_GetObjectItemCaseSensitive(root, "eAVI");
        if(item != NULL) {
            model.eAVI = item->valueint;
        }
        // Receive eLRI
        item = cJSON_GetObjectItemCaseSensitive(root, "eLRI");
        if(item != NULL) {
            model.eLRI = item->valueint;
        }
        // Receive ePVARP
        item = cJSON_GetObjectItemCaseSensitive(root, "ePVARP");
        if(item != NULL) {
            model.ePVARP = item->valueint;
        }
        // Receive eURI
        item = cJSON_GetObjectItemCaseSensitive(root, "eURI");
        if(item != NULL) {
            model.eURI = item->valueint;
        }
        // Receive eVRP
        item = cJSON_GetObjectItemCaseSensitive(root, "eVRP");
        if(item != NULL) {
            model.eVRP = item->valueint;
        }
    }
  
    cJSON_Delete(root);
    free(buffer);
}

void sendVariables(int send_interface) {
    cJSON* root = cJSON_CreateObject();
    cJSON *array;
    
    // Send AS
    cJSON_AddItemToObject(root, "AS", cJSON_CreateBool(model.AS));
    // Send VS
    cJSON_AddItemToObject(root, "VS", cJSON_CreateBool(model.VS));
    // Send deltaT
    cJSON_AddItemToObject(root, "deltaT", cJSON_CreateNumber(model.deltaT));
    // Send AP
    cJSON_AddItemToObject(root, "AP", cJSON_CreateBool(model.AP));
    // Send VP
    cJSON_AddItemToObject(root, "VP", cJSON_CreateBool(model.VP));
    // Send sleepT
    cJSON_AddItemToObject(root, "sleepT", cJSON_CreateNumber(model.sleepT));
    // Send #ticktime
    cJSON_AddItemToObject(root, "#ticktime", cJSON_CreateNumber(_ticktime));
    // Send AEI
    cJSON_AddItemToObject(root, "AEI", cJSON_CreateBool(model.AEI));
    // Send AVI
    cJSON_AddItemToObject(root, "AVI", cJSON_CreateBool(model.AVI));
    // Send LRI
    cJSON_AddItemToObject(root, "LRI", cJSON_CreateBool(model.LRI));
    // Send PVARP
    cJSON_AddItemToObject(root, "PVARP", cJSON_CreateBool(model.PVARP));
    // Send URI
    cJSON_AddItemToObject(root, "URI", cJSON_CreateBool(model.URI));
    // Send VRP
    cJSON_AddItemToObject(root, "VRP", cJSON_CreateBool(model.VRP));
    // Send _GO
    cJSON_AddItemToObject(root, "_GO", cJSON_CreateBool(model._GO));
    // Send _Pacemaker_local__Atrig
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig", cJSON_CreateBool(model._Pacemaker_local__Atrig));
    // Send _Pacemaker_local__Atrig1
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig1", cJSON_CreateBool(model._Pacemaker_local__Atrig1));
    // Send _Pacemaker_local__Atrig2
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig2", cJSON_CreateBool(model._Pacemaker_local__Atrig2));
    // Send _Pacemaker_local__Atrig3
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig3", cJSON_CreateBool(model._Pacemaker_local__Atrig3));
    // Send _Pacemaker_local__Atrig4
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig4", cJSON_CreateBool(model._Pacemaker_local__Atrig4));
    // Send _Pacemaker_local__Atrig5
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig5", cJSON_CreateBool(model._Pacemaker_local__Atrig5));
    // Send _Pacemaker_local__Atrig6
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig6", cJSON_CreateBool(model._Pacemaker_local__Atrig6));
    // Send _Pacemaker_local__Atrig7
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig7", cJSON_CreateBool(model._Pacemaker_local__Atrig7));
    // Send _Pacemaker_local__Atrig8
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig8", cJSON_CreateBool(model._Pacemaker_local__Atrig8));
    // Send _Pacemaker_local__Atrig9
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig9", cJSON_CreateBool(model._Pacemaker_local__Atrig9));
    // Send _TERM
    cJSON_AddItemToObject(root, "_TERM", cJSON_CreateBool(model._TERM));
    // Send _cg10
    cJSON_AddItemToObject(root, "_cg10", cJSON_CreateBool(model._cg10));
    // Send _cg105
    cJSON_AddItemToObject(root, "_cg105", cJSON_CreateBool(model._cg105));
    // Send _cg107
    cJSON_AddItemToObject(root, "_cg107", cJSON_CreateBool(model._cg107));
    // Send _cg111
    cJSON_AddItemToObject(root, "_cg111", cJSON_CreateBool(model._cg111));
    // Send _cg114
    cJSON_AddItemToObject(root, "_cg114", cJSON_CreateBool(model._cg114));
    // Send _cg116
    cJSON_AddItemToObject(root, "_cg116", cJSON_CreateBool(model._cg116));
    // Send _cg118
    cJSON_AddItemToObject(root, "_cg118", cJSON_CreateBool(model._cg118));
    // Send _cg119
    cJSON_AddItemToObject(root, "_cg119", cJSON_CreateBool(model._cg119));
    // Send _cg122
    cJSON_AddItemToObject(root, "_cg122", cJSON_CreateBool(model._cg122));
    // Send _cg123
    cJSON_AddItemToObject(root, "_cg123", cJSON_CreateBool(model._cg123));
    // Send _cg125
    cJSON_AddItemToObject(root, "_cg125", cJSON_CreateBool(model._cg125));
    // Send _cg128
    cJSON_AddItemToObject(root, "_cg128", cJSON_CreateBool(model._cg128));
    // Send _cg13
    cJSON_AddItemToObject(root, "_cg13", cJSON_CreateBool(model._cg13));
    // Send _cg131
    cJSON_AddItemToObject(root, "_cg131", cJSON_CreateBool(model._cg131));
    // Send _cg134
    cJSON_AddItemToObject(root, "_cg134", cJSON_CreateBool(model._cg134));
    // Send _cg136
    cJSON_AddItemToObject(root, "_cg136", cJSON_CreateBool(model._cg136));
    // Send _cg142
    cJSON_AddItemToObject(root, "_cg142", cJSON_CreateBool(model._cg142));
    // Send _cg149
    cJSON_AddItemToObject(root, "_cg149", cJSON_CreateBool(model._cg149));
    // Send _cg15
    cJSON_AddItemToObject(root, "_cg15", cJSON_CreateBool(model._cg15));
    // Send _cg17
    cJSON_AddItemToObject(root, "_cg17", cJSON_CreateBool(model._cg17));
    // Send _cg18
    cJSON_AddItemToObject(root, "_cg18", cJSON_CreateBool(model._cg18));
    // Send _cg21
    cJSON_AddItemToObject(root, "_cg21", cJSON_CreateBool(model._cg21));
    // Send _cg22
    cJSON_AddItemToObject(root, "_cg22", cJSON_CreateBool(model._cg22));
    // Send _cg24
    cJSON_AddItemToObject(root, "_cg24", cJSON_CreateBool(model._cg24));
    // Send _cg27
    cJSON_AddItemToObject(root, "_cg27", cJSON_CreateBool(model._cg27));
    // Send _cg30
    cJSON_AddItemToObject(root, "_cg30", cJSON_CreateBool(model._cg30));
    // Send _cg33
    cJSON_AddItemToObject(root, "_cg33", cJSON_CreateBool(model._cg33));
    // Send _cg35
    cJSON_AddItemToObject(root, "_cg35", cJSON_CreateBool(model._cg35));
    // Send _cg4
    cJSON_AddItemToObject(root, "_cg4", cJSON_CreateBool(model._cg4));
    // Send _cg41
    cJSON_AddItemToObject(root, "_cg41", cJSON_CreateBool(model._cg41));
    // Send _cg43
    cJSON_AddItemToObject(root, "_cg43", cJSON_CreateBool(model._cg43));
    // Send _cg47
    cJSON_AddItemToObject(root, "_cg47", cJSON_CreateBool(model._cg47));
    // Send _cg50
    cJSON_AddItemToObject(root, "_cg50", cJSON_CreateBool(model._cg50));
    // Send _cg52
    cJSON_AddItemToObject(root, "_cg52", cJSON_CreateBool(model._cg52));
    // Send _cg54
    cJSON_AddItemToObject(root, "_cg54", cJSON_CreateBool(model._cg54));
    // Send _cg55
    cJSON_AddItemToObject(root, "_cg55", cJSON_CreateBool(model._cg55));
    // Send _cg58
    cJSON_AddItemToObject(root, "_cg58", cJSON_CreateBool(model._cg58));
    // Send _cg59
    cJSON_AddItemToObject(root, "_cg59", cJSON_CreateBool(model._cg59));
    // Send _cg6
    cJSON_AddItemToObject(root, "_cg6", cJSON_CreateBool(model._cg6));
    // Send _cg61
    cJSON_AddItemToObject(root, "_cg61", cJSON_CreateBool(model._cg61));
    // Send _cg64
    cJSON_AddItemToObject(root, "_cg64", cJSON_CreateBool(model._cg64));
    // Send _cg67
    cJSON_AddItemToObject(root, "_cg67", cJSON_CreateBool(model._cg67));
    // Send _cg73
    cJSON_AddItemToObject(root, "_cg73", cJSON_CreateBool(model._cg73));
    // Send _cg75
    cJSON_AddItemToObject(root, "_cg75", cJSON_CreateBool(model._cg75));
    // Send _cg79
    cJSON_AddItemToObject(root, "_cg79", cJSON_CreateBool(model._cg79));
    // Send _cg82
    cJSON_AddItemToObject(root, "_cg82", cJSON_CreateBool(model._cg82));
    // Send _cg84
    cJSON_AddItemToObject(root, "_cg84", cJSON_CreateBool(model._cg84));
    // Send _cg86
    cJSON_AddItemToObject(root, "_cg86", cJSON_CreateBool(model._cg86));
    // Send _cg87
    cJSON_AddItemToObject(root, "_cg87", cJSON_CreateBool(model._cg87));
    // Send _cg90
    cJSON_AddItemToObject(root, "_cg90", cJSON_CreateBool(model._cg90));
    // Send _cg91
    cJSON_AddItemToObject(root, "_cg91", cJSON_CreateBool(model._cg91));
    // Send _cg93
    cJSON_AddItemToObject(root, "_cg93", cJSON_CreateBool(model._cg93));
    // Send _cg96
    cJSON_AddItemToObject(root, "_cg96", cJSON_CreateBool(model._cg96));
    // Send _cg99
    cJSON_AddItemToObject(root, "_cg99", cJSON_CreateBool(model._cg99));
    // Send _g100
    cJSON_AddItemToObject(root, "_g100", cJSON_CreateBool(model._g100));
    // Send _g100_e3
    cJSON_AddItemToObject(root, "_g100_e3", cJSON_CreateBool(model._g100_e3));
    // Send _g101
    cJSON_AddItemToObject(root, "_g101", cJSON_CreateBool(model._g101));
    // Send _g106
    cJSON_AddItemToObject(root, "_g106", cJSON_CreateBool(model._g106));
    // Send _g115
    cJSON_AddItemToObject(root, "_g115", cJSON_CreateBool(model._g115));
    // Send _g116
    cJSON_AddItemToObject(root, "_g116", cJSON_CreateBool(model._g116));
    // Send _g120
    cJSON_AddItemToObject(root, "_g120", cJSON_CreateBool(model._g120));
    // Send _g121
    cJSON_AddItemToObject(root, "_g121", cJSON_CreateBool(model._g121));
    // Send _g122
    cJSON_AddItemToObject(root, "_g122", cJSON_CreateBool(model._g122));
    // Send _g123
    cJSON_AddItemToObject(root, "_g123", cJSON_CreateBool(model._g123));
    // Send _g124
    cJSON_AddItemToObject(root, "_g124", cJSON_CreateBool(model._g124));
    // Send _g124_e2
    cJSON_AddItemToObject(root, "_g124_e2", cJSON_CreateBool(model._g124_e2));
    // Send _g125
    cJSON_AddItemToObject(root, "_g125", cJSON_CreateBool(model._g125));
    // Send _g126
    cJSON_AddItemToObject(root, "_g126", cJSON_CreateBool(model._g126));
    // Send _g127
    cJSON_AddItemToObject(root, "_g127", cJSON_CreateBool(model._g127));
    // Send _g130
    cJSON_AddItemToObject(root, "_g130", cJSON_CreateBool(model._g130));
    // Send _g131
    cJSON_AddItemToObject(root, "_g131", cJSON_CreateBool(model._g131));
    // Send _g132
    cJSON_AddItemToObject(root, "_g132", cJSON_CreateBool(model._g132));
    // Send _g133_e3
    cJSON_AddItemToObject(root, "_g133_e3", cJSON_CreateBool(model._g133_e3));
    // Send _g134
    cJSON_AddItemToObject(root, "_g134", cJSON_CreateBool(model._g134));
    // Send _g135
    cJSON_AddItemToObject(root, "_g135", cJSON_CreateBool(model._g135));
    // Send _g14
    cJSON_AddItemToObject(root, "_g14", cJSON_CreateBool(model._g14));
    // Send _g15
    cJSON_AddItemToObject(root, "_g15", cJSON_CreateBool(model._g15));
    // Send _g19
    cJSON_AddItemToObject(root, "_g19", cJSON_CreateBool(model._g19));
    // Send _g20
    cJSON_AddItemToObject(root, "_g20", cJSON_CreateBool(model._g20));
    // Send _g21
    cJSON_AddItemToObject(root, "_g21", cJSON_CreateBool(model._g21));
    // Send _g22
    cJSON_AddItemToObject(root, "_g22", cJSON_CreateBool(model._g22));
    // Send _g25
    cJSON_AddItemToObject(root, "_g25", cJSON_CreateBool(model._g25));
    // Send _g26
    cJSON_AddItemToObject(root, "_g26", cJSON_CreateBool(model._g26));
    // Send _g40
    cJSON_AddItemToObject(root, "_g40", cJSON_CreateBool(model._g40));
    // Send _g42
    cJSON_AddItemToObject(root, "_g42", cJSON_CreateBool(model._g42));
    // Send _g43
    cJSON_AddItemToObject(root, "_g43", cJSON_CreateBool(model._g43));
    // Send _g5
    cJSON_AddItemToObject(root, "_g5", cJSON_CreateBool(model._g5));
    // Send _g51
    cJSON_AddItemToObject(root, "_g51", cJSON_CreateBool(model._g51));
    // Send _g52
    cJSON_AddItemToObject(root, "_g52", cJSON_CreateBool(model._g52));
    // Send _g53
    cJSON_AddItemToObject(root, "_g53", cJSON_CreateBool(model._g53));
    // Send _g53_e1
    cJSON_AddItemToObject(root, "_g53_e1", cJSON_CreateBool(model._g53_e1));
    // Send _g56
    cJSON_AddItemToObject(root, "_g56", cJSON_CreateBool(model._g56));
    // Send _g57
    cJSON_AddItemToObject(root, "_g57", cJSON_CreateBool(model._g57));
    // Send _g58
    cJSON_AddItemToObject(root, "_g58", cJSON_CreateBool(model._g58));
    // Send _g59
    cJSON_AddItemToObject(root, "_g59", cJSON_CreateBool(model._g59));
    // Send _g6
    cJSON_AddItemToObject(root, "_g6", cJSON_CreateBool(model._g6));
    // Send _g60
    cJSON_AddItemToObject(root, "_g60", cJSON_CreateBool(model._g60));
    // Send _g60_e2
    cJSON_AddItemToObject(root, "_g60_e2", cJSON_CreateBool(model._g60_e2));
    // Send _g61
    cJSON_AddItemToObject(root, "_g61", cJSON_CreateBool(model._g61));
    // Send _g62
    cJSON_AddItemToObject(root, "_g62", cJSON_CreateBool(model._g62));
    // Send _g63
    cJSON_AddItemToObject(root, "_g63", cJSON_CreateBool(model._g63));
    // Send _g66
    cJSON_AddItemToObject(root, "_g66", cJSON_CreateBool(model._g66));
    // Send _g67
    cJSON_AddItemToObject(root, "_g67", cJSON_CreateBool(model._g67));
    // Send _g68
    cJSON_AddItemToObject(root, "_g68", cJSON_CreateBool(model._g68));
    // Send _g68_e3
    cJSON_AddItemToObject(root, "_g68_e3", cJSON_CreateBool(model._g68_e3));
    // Send _g69
    cJSON_AddItemToObject(root, "_g69", cJSON_CreateBool(model._g69));
    // Send _g72
    cJSON_AddItemToObject(root, "_g72", cJSON_CreateBool(model._g72));
    // Send _g74
    cJSON_AddItemToObject(root, "_g74", cJSON_CreateBool(model._g74));
    // Send _g75
    cJSON_AddItemToObject(root, "_g75", cJSON_CreateBool(model._g75));
    // Send _g83
    cJSON_AddItemToObject(root, "_g83", cJSON_CreateBool(model._g83));
    // Send _g84
    cJSON_AddItemToObject(root, "_g84", cJSON_CreateBool(model._g84));
    // Send _g85
    cJSON_AddItemToObject(root, "_g85", cJSON_CreateBool(model._g85));
    // Send _g85_e1
    cJSON_AddItemToObject(root, "_g85_e1", cJSON_CreateBool(model._g85_e1));
    // Send _g88
    cJSON_AddItemToObject(root, "_g88", cJSON_CreateBool(model._g88));
    // Send _g89
    cJSON_AddItemToObject(root, "_g89", cJSON_CreateBool(model._g89));
    // Send _g90
    cJSON_AddItemToObject(root, "_g90", cJSON_CreateBool(model._g90));
    // Send _g91
    cJSON_AddItemToObject(root, "_g91", cJSON_CreateBool(model._g91));
    // Send _g92
    cJSON_AddItemToObject(root, "_g92", cJSON_CreateBool(model._g92));
    // Send _g92_e2
    cJSON_AddItemToObject(root, "_g92_e2", cJSON_CreateBool(model._g92_e2));
    // Send _g93
    cJSON_AddItemToObject(root, "_g93", cJSON_CreateBool(model._g93));
    // Send _g94
    cJSON_AddItemToObject(root, "_g94", cJSON_CreateBool(model._g94));
    // Send _g95
    cJSON_AddItemToObject(root, "_g95", cJSON_CreateBool(model._g95));
    // Send _g98
    cJSON_AddItemToObject(root, "_g98", cJSON_CreateBool(model._g98));
    // Send _g99
    cJSON_AddItemToObject(root, "_g99", cJSON_CreateBool(model._g99));
    // Send _pg106
    cJSON_AddItemToObject(root, "_pg106", cJSON_CreateBool(model._pg106));
    // Send _pg115
    cJSON_AddItemToObject(root, "_pg115", cJSON_CreateBool(model._pg115));
    // Send _pg120
    cJSON_AddItemToObject(root, "_pg120", cJSON_CreateBool(model._pg120));
    // Send _pg126
    cJSON_AddItemToObject(root, "_pg126", cJSON_CreateBool(model._pg126));
    // Send _pg130
    cJSON_AddItemToObject(root, "_pg130", cJSON_CreateBool(model._pg130));
    // Send _pg14
    cJSON_AddItemToObject(root, "_pg14", cJSON_CreateBool(model._pg14));
    // Send _pg19
    cJSON_AddItemToObject(root, "_pg19", cJSON_CreateBool(model._pg19));
    // Send _pg25
    cJSON_AddItemToObject(root, "_pg25", cJSON_CreateBool(model._pg25));
    // Send _pg42
    cJSON_AddItemToObject(root, "_pg42", cJSON_CreateBool(model._pg42));
    // Send _pg5
    cJSON_AddItemToObject(root, "_pg5", cJSON_CreateBool(model._pg5));
    // Send _pg51
    cJSON_AddItemToObject(root, "_pg51", cJSON_CreateBool(model._pg51));
    // Send _pg56
    cJSON_AddItemToObject(root, "_pg56", cJSON_CreateBool(model._pg56));
    // Send _pg62
    cJSON_AddItemToObject(root, "_pg62", cJSON_CreateBool(model._pg62));
    // Send _pg66
    cJSON_AddItemToObject(root, "_pg66", cJSON_CreateBool(model._pg66));
    // Send _pg74
    cJSON_AddItemToObject(root, "_pg74", cJSON_CreateBool(model._pg74));
    // Send _pg83
    cJSON_AddItemToObject(root, "_pg83", cJSON_CreateBool(model._pg83));
    // Send _pg88
    cJSON_AddItemToObject(root, "_pg88", cJSON_CreateBool(model._pg88));
    // Send _pg94
    cJSON_AddItemToObject(root, "_pg94", cJSON_CreateBool(model._pg94));
    // Send _pg98
    cJSON_AddItemToObject(root, "_pg98", cJSON_CreateBool(model._pg98));
    // Send _taken_transitions
    array = cJSON_CreateArray();
    for (int i0 = 0; i0 < 12; i0++) {
        cJSON *item0 = cJSON_CreateNumber(model._taken_transitions[i0]);
        cJSON_AddItemToArray(array, item0);
    }
    cJSON_AddItemToObject(root, "_taken_transitions", array);
    // Send cAEI
    cJSON_AddItemToObject(root, "cAEI", cJSON_CreateNumber(model.cAEI));
    // Send cAVI
    cJSON_AddItemToObject(root, "cAVI", cJSON_CreateNumber(model.cAVI));
    // Send cLRI
    cJSON_AddItemToObject(root, "cLRI", cJSON_CreateNumber(model.cLRI));
    // Send cPVARP
    cJSON_AddItemToObject(root, "cPVARP", cJSON_CreateNumber(model.cPVARP));
    // Send cURI
    cJSON_AddItemToObject(root, "cURI", cJSON_CreateNumber(model.cURI));
    // Send cVRP
    cJSON_AddItemToObject(root, "cVRP", cJSON_CreateNumber(model.cVRP));
    // Send eAEI
    cJSON_AddItemToObject(root, "eAEI", cJSON_CreateBool(model.eAEI));
    // Send eAVI
    cJSON_AddItemToObject(root, "eAVI", cJSON_CreateBool(model.eAVI));
    // Send eLRI
    cJSON_AddItemToObject(root, "eLRI", cJSON_CreateBool(model.eLRI));
    // Send ePVARP
    cJSON_AddItemToObject(root, "ePVARP", cJSON_CreateBool(model.ePVARP));
    // Send eURI
    cJSON_AddItemToObject(root, "eURI", cJSON_CreateBool(model.eURI));
    // Send eVRP
    cJSON_AddItemToObject(root, "eVRP", cJSON_CreateBool(model.eVRP));
    
    if (send_interface) {
        cJSON *interface = cJSON_CreateObject();
        cJSON *info, *properties;
        
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("input"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "AS", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("input"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "VS", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("input"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("dynamic-ticks"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("float"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "deltaT", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("output"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("signal"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "AP", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("output"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("signal"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "VP", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("output"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("dynamic-ticks"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("float"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "sleepT", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("ticktime"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("float"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "#ticktime", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "AEI", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "AVI", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "LRI", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "PVARP", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "URI", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "VRP", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("goGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_GO", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_Pacemaker_local__Atrig", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_Pacemaker_local__Atrig1", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_Pacemaker_local__Atrig2", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_Pacemaker_local__Atrig3", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_Pacemaker_local__Atrig4", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_Pacemaker_local__Atrig5", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_Pacemaker_local__Atrig6", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_Pacemaker_local__Atrig7", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_Pacemaker_local__Atrig8", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_Pacemaker_local__Atrig9", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("term"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_TERM", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg10", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg105", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg107", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg111", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg114", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg116", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg118", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg119", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg122", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg123", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg125", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg128", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg13", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg131", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg134", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg136", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg142", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg149", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg15", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg17", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg18", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg21", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg22", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg24", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg27", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg30", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg33", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg35", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg4", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg41", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg43", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg47", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg50", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg52", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg54", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg55", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg58", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg59", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg6", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg61", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg64", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg67", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg73", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg75", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg79", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg82", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg84", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg86", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg87", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg90", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg91", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg93", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg96", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("conditionalGuard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_cg99", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g100", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("emptyGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g100_e3", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g101", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g106", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g115", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g116", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g120", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g121", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g122", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g123", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g124", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("emptyGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g124_e2", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g125", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g126", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g127", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g130", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g131", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g132", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("emptyGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g133_e3", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g134", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g135", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g14", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g15", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g19", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g20", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g21", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g22", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g25", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g26", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g40", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g42", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g43", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g5", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g51", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g52", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g53", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("emptyGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g53_e1", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g56", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g57", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g58", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g59", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g6", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g60", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("emptyGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g60_e2", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g61", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g62", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g63", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g66", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g67", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g68", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("emptyGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g68_e3", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g69", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g72", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g74", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g75", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g83", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g84", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g85", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("emptyGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g85_e1", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g88", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g89", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g90", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g91", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g92", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("emptyGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g92_e2", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g93", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g94", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g95", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g98", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_g99", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg106", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg115", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg120", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg126", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg130", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg14", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg19", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg25", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg42", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg5", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg51", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg56", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg62", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg66", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg74", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg83", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg88", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg94", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("preGuard"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("guard"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_pg98", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToArray(properties, cJSON_CreateString("simulation"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("int"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "_taken_transitions", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("float"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "cAEI", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("float"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "cAVI", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("float"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "cLRI", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("float"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "cPVARP", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("float"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "cURI", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("sccharts-generated"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("float"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "cVRP", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("signal"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "eAEI", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("signal"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "eAVI", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("signal"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "eLRI", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("signal"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "ePVARP", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("signal"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "eURI", info);
        info = cJSON_CreateObject();
        properties = cJSON_CreateArray();
        cJSON_AddItemToArray(properties, cJSON_CreateString("signal"));
        cJSON_AddItemToObject(info, "type", cJSON_CreateString("bool"));
        cJSON_AddItemToObject(info, "properties", properties);
        cJSON_AddItemToObject(interface, "eVRP", info);
        
        cJSON_AddItemToObject(root, "#interface", interface);
    }

    // Get JSON object as string
    char* outString = cJSON_Print(root);
    cJSON_Minify(outString);
    // Flush to stdout
    printf("%s\n", outString);
    fflush(stdout);

    cJSON_Delete(root);
    free(outString);
}

int main(int argc, const char* argv[]) {
    

    // Initialize 
    reset(&model);
    
    sendVariables(1);

    
    // Tick loop
    while (1) {
        
    
        // Read inputs
        receiveVariables();

        
        resetticktime();

  
        // Reaction of model
        tick(&model);
        
        _ticktime = getticktime();

         
        // Send outputs
        sendVariables(0);

        
        
    }
    
}
