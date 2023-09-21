<#macro simulation_imports position>
#include <string.h>
#include <stdlib.h>
#include <stdio.h>

#include "lib/cJSON.h"
</#macro>

<#macro simulation_init position>
sendVariables(1);
</#macro>

<#macro simulation_in position>
receiveVariables();
</#macro>

<#macro simulation_out position>
sendVariables(0);
</#macro>

<#macro simulation_body position>
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
            ${tickdata_name}.AS = item->valueint;
        }
        // Receive VS
        item = cJSON_GetObjectItemCaseSensitive(root, "VS");
        if(item != NULL) {
            ${tickdata_name}.VS = item->valueint;
        }
        // Receive deltaT
        item = cJSON_GetObjectItemCaseSensitive(root, "deltaT");
        if(item != NULL) {
            ${tickdata_name}.deltaT = item->valuedouble;
        }
        // Receive AP
        item = cJSON_GetObjectItemCaseSensitive(root, "AP");
        if(item != NULL) {
            ${tickdata_name}.AP = item->valueint;
        }
        // Receive VP
        item = cJSON_GetObjectItemCaseSensitive(root, "VP");
        if(item != NULL) {
            ${tickdata_name}.VP = item->valueint;
        }
        // Receive sleepT
        item = cJSON_GetObjectItemCaseSensitive(root, "sleepT");
        if(item != NULL) {
            ${tickdata_name}.sleepT = item->valuedouble;
        }
        // Receive #ticktime
        item = cJSON_GetObjectItemCaseSensitive(root, "#ticktime");
        if(item != NULL) {
            _ticktime = item->valuedouble;
        }
        // Receive AEI
        item = cJSON_GetObjectItemCaseSensitive(root, "AEI");
        if(item != NULL) {
            ${tickdata_name}.AEI = item->valueint;
        }
        // Receive AVI
        item = cJSON_GetObjectItemCaseSensitive(root, "AVI");
        if(item != NULL) {
            ${tickdata_name}.AVI = item->valueint;
        }
        // Receive LRI
        item = cJSON_GetObjectItemCaseSensitive(root, "LRI");
        if(item != NULL) {
            ${tickdata_name}.LRI = item->valueint;
        }
        // Receive PVARP
        item = cJSON_GetObjectItemCaseSensitive(root, "PVARP");
        if(item != NULL) {
            ${tickdata_name}.PVARP = item->valueint;
        }
        // Receive URI
        item = cJSON_GetObjectItemCaseSensitive(root, "URI");
        if(item != NULL) {
            ${tickdata_name}.URI = item->valueint;
        }
        // Receive VRP
        item = cJSON_GetObjectItemCaseSensitive(root, "VRP");
        if(item != NULL) {
            ${tickdata_name}.VRP = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig");
        if(item != NULL) {
            ${tickdata_name}._Pacemaker_local__Atrig = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig1
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig1");
        if(item != NULL) {
            ${tickdata_name}._Pacemaker_local__Atrig1 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig2
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig2");
        if(item != NULL) {
            ${tickdata_name}._Pacemaker_local__Atrig2 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig3
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig3");
        if(item != NULL) {
            ${tickdata_name}._Pacemaker_local__Atrig3 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig4
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig4");
        if(item != NULL) {
            ${tickdata_name}._Pacemaker_local__Atrig4 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig5
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig5");
        if(item != NULL) {
            ${tickdata_name}._Pacemaker_local__Atrig5 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig6
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig6");
        if(item != NULL) {
            ${tickdata_name}._Pacemaker_local__Atrig6 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig7
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig7");
        if(item != NULL) {
            ${tickdata_name}._Pacemaker_local__Atrig7 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig8
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig8");
        if(item != NULL) {
            ${tickdata_name}._Pacemaker_local__Atrig8 = item->valueint;
        }
        // Receive _Pacemaker_local__Atrig9
        item = cJSON_GetObjectItemCaseSensitive(root, "_Pacemaker_local__Atrig9");
        if(item != NULL) {
            ${tickdata_name}._Pacemaker_local__Atrig9 = item->valueint;
        }
        // Receive _taken_transitions
        item = cJSON_GetObjectItemCaseSensitive(root, "_taken_transitions");
        if(item != NULL) {
            for (int i0 = 0; i0 < cJSON_GetArraySize(item); i0++) {
                cJSON *item0 = cJSON_GetArrayItem(item, i0);
                ${tickdata_name}._taken_transitions[i0] = item0->valueint;
            }
        }
        // Receive cAEI
        item = cJSON_GetObjectItemCaseSensitive(root, "cAEI");
        if(item != NULL) {
            ${tickdata_name}.cAEI = item->valuedouble;
        }
        // Receive cAVI
        item = cJSON_GetObjectItemCaseSensitive(root, "cAVI");
        if(item != NULL) {
            ${tickdata_name}.cAVI = item->valuedouble;
        }
        // Receive cLRI
        item = cJSON_GetObjectItemCaseSensitive(root, "cLRI");
        if(item != NULL) {
            ${tickdata_name}.cLRI = item->valuedouble;
        }
        // Receive cPVARP
        item = cJSON_GetObjectItemCaseSensitive(root, "cPVARP");
        if(item != NULL) {
            ${tickdata_name}.cPVARP = item->valuedouble;
        }
        // Receive cURI
        item = cJSON_GetObjectItemCaseSensitive(root, "cURI");
        if(item != NULL) {
            ${tickdata_name}.cURI = item->valuedouble;
        }
        // Receive cVRP
        item = cJSON_GetObjectItemCaseSensitive(root, "cVRP");
        if(item != NULL) {
            ${tickdata_name}.cVRP = item->valuedouble;
        }
        // Receive eAEI
        item = cJSON_GetObjectItemCaseSensitive(root, "eAEI");
        if(item != NULL) {
            ${tickdata_name}.eAEI = item->valueint;
        }
        // Receive eAVI
        item = cJSON_GetObjectItemCaseSensitive(root, "eAVI");
        if(item != NULL) {
            ${tickdata_name}.eAVI = item->valueint;
        }
        // Receive eLRI
        item = cJSON_GetObjectItemCaseSensitive(root, "eLRI");
        if(item != NULL) {
            ${tickdata_name}.eLRI = item->valueint;
        }
        // Receive ePVARP
        item = cJSON_GetObjectItemCaseSensitive(root, "ePVARP");
        if(item != NULL) {
            ${tickdata_name}.ePVARP = item->valueint;
        }
        // Receive eURI
        item = cJSON_GetObjectItemCaseSensitive(root, "eURI");
        if(item != NULL) {
            ${tickdata_name}.eURI = item->valueint;
        }
        // Receive eVRP
        item = cJSON_GetObjectItemCaseSensitive(root, "eVRP");
        if(item != NULL) {
            ${tickdata_name}.eVRP = item->valueint;
        }
    }
  
    cJSON_Delete(root);
    free(buffer);
}

void sendVariables(int send_interface) {
    cJSON* root = cJSON_CreateObject();
    cJSON *array;
    
    // Send AS
    cJSON_AddItemToObject(root, "AS", cJSON_CreateBool(${tickdata_name}.AS));
    // Send VS
    cJSON_AddItemToObject(root, "VS", cJSON_CreateBool(${tickdata_name}.VS));
    // Send deltaT
    cJSON_AddItemToObject(root, "deltaT", cJSON_CreateNumber(${tickdata_name}.deltaT));
    // Send AP
    cJSON_AddItemToObject(root, "AP", cJSON_CreateBool(${tickdata_name}.AP));
    // Send VP
    cJSON_AddItemToObject(root, "VP", cJSON_CreateBool(${tickdata_name}.VP));
    // Send sleepT
    cJSON_AddItemToObject(root, "sleepT", cJSON_CreateNumber(${tickdata_name}.sleepT));
    // Send #ticktime
    cJSON_AddItemToObject(root, "#ticktime", cJSON_CreateNumber(_ticktime));
    // Send AEI
    cJSON_AddItemToObject(root, "AEI", cJSON_CreateBool(${tickdata_name}.AEI));
    // Send AVI
    cJSON_AddItemToObject(root, "AVI", cJSON_CreateBool(${tickdata_name}.AVI));
    // Send LRI
    cJSON_AddItemToObject(root, "LRI", cJSON_CreateBool(${tickdata_name}.LRI));
    // Send PVARP
    cJSON_AddItemToObject(root, "PVARP", cJSON_CreateBool(${tickdata_name}.PVARP));
    // Send URI
    cJSON_AddItemToObject(root, "URI", cJSON_CreateBool(${tickdata_name}.URI));
    // Send VRP
    cJSON_AddItemToObject(root, "VRP", cJSON_CreateBool(${tickdata_name}.VRP));
    // Send _Pacemaker_local__Atrig
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig", cJSON_CreateBool(${tickdata_name}._Pacemaker_local__Atrig));
    // Send _Pacemaker_local__Atrig1
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig1", cJSON_CreateBool(${tickdata_name}._Pacemaker_local__Atrig1));
    // Send _Pacemaker_local__Atrig2
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig2", cJSON_CreateBool(${tickdata_name}._Pacemaker_local__Atrig2));
    // Send _Pacemaker_local__Atrig3
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig3", cJSON_CreateBool(${tickdata_name}._Pacemaker_local__Atrig3));
    // Send _Pacemaker_local__Atrig4
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig4", cJSON_CreateBool(${tickdata_name}._Pacemaker_local__Atrig4));
    // Send _Pacemaker_local__Atrig5
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig5", cJSON_CreateBool(${tickdata_name}._Pacemaker_local__Atrig5));
    // Send _Pacemaker_local__Atrig6
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig6", cJSON_CreateBool(${tickdata_name}._Pacemaker_local__Atrig6));
    // Send _Pacemaker_local__Atrig7
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig7", cJSON_CreateBool(${tickdata_name}._Pacemaker_local__Atrig7));
    // Send _Pacemaker_local__Atrig8
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig8", cJSON_CreateBool(${tickdata_name}._Pacemaker_local__Atrig8));
    // Send _Pacemaker_local__Atrig9
    cJSON_AddItemToObject(root, "_Pacemaker_local__Atrig9", cJSON_CreateBool(${tickdata_name}._Pacemaker_local__Atrig9));
    // Send _taken_transitions
    array = cJSON_CreateArray();
    for (int i0 = 0; i0 < 12; i0++) {
        cJSON *item0 = cJSON_CreateNumber(${tickdata_name}._taken_transitions[i0]);
        cJSON_AddItemToArray(array, item0);
    }
    cJSON_AddItemToObject(root, "_taken_transitions", array);
    // Send cAEI
    cJSON_AddItemToObject(root, "cAEI", cJSON_CreateNumber(${tickdata_name}.cAEI));
    // Send cAVI
    cJSON_AddItemToObject(root, "cAVI", cJSON_CreateNumber(${tickdata_name}.cAVI));
    // Send cLRI
    cJSON_AddItemToObject(root, "cLRI", cJSON_CreateNumber(${tickdata_name}.cLRI));
    // Send cPVARP
    cJSON_AddItemToObject(root, "cPVARP", cJSON_CreateNumber(${tickdata_name}.cPVARP));
    // Send cURI
    cJSON_AddItemToObject(root, "cURI", cJSON_CreateNumber(${tickdata_name}.cURI));
    // Send cVRP
    cJSON_AddItemToObject(root, "cVRP", cJSON_CreateNumber(${tickdata_name}.cVRP));
    // Send eAEI
    cJSON_AddItemToObject(root, "eAEI", cJSON_CreateBool(${tickdata_name}.eAEI));
    // Send eAVI
    cJSON_AddItemToObject(root, "eAVI", cJSON_CreateBool(${tickdata_name}.eAVI));
    // Send eLRI
    cJSON_AddItemToObject(root, "eLRI", cJSON_CreateBool(${tickdata_name}.eLRI));
    // Send ePVARP
    cJSON_AddItemToObject(root, "ePVARP", cJSON_CreateBool(${tickdata_name}.ePVARP));
    // Send eURI
    cJSON_AddItemToObject(root, "eURI", cJSON_CreateBool(${tickdata_name}.eURI));
    // Send eVRP
    cJSON_AddItemToObject(root, "eVRP", cJSON_CreateBool(${tickdata_name}.eVRP));
    
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
</#macro>
