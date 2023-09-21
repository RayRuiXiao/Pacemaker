<#macro simulation_imports position>
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.*;
</#macro>

<#macro simulation_in position>
receiveVariables();
</#macro>

<#macro simulation_out position>
sendVariables();
</#macro>

<#macro simulation_body position>
    public static BufferedReader stdInReader = new BufferedReader(new InputStreamReader(System.in));
            
    private static void receiveVariables() {
        try {
            String line = stdInReader.readLine();
            JSONObject json = new JSONObject(line);
            
            // Receive AS
            if (json.has("AS")) {
                ${tickdata_name}.AS = json.getBoolean("AS");
            }
            // Receive VS
            if (json.has("VS")) {
                ${tickdata_name}.VS = json.getBoolean("VS");
            }
            // Receive deltaT
            if (json.has("deltaT")) {
                ${tickdata_name}.deltaT = json.getDouble("deltaT");
            }
            // Receive AP
            if (json.has("AP")) {
                ${tickdata_name}.AP = json.getBoolean("AP");
            }
            // Receive VP
            if (json.has("VP")) {
                ${tickdata_name}.VP = json.getBoolean("VP");
            }
            // Receive sleepT
            if (json.has("sleepT")) {
                ${tickdata_name}.sleepT = json.getDouble("sleepT");
            }
            // Receive #ticktime
            if (json.has("#ticktime")) {
                _ticktime = json.getInt("#ticktime");
            }
            // Receive AEI
            if (json.has("AEI")) {
                ${tickdata_name}.AEI = json.getBoolean("AEI");
            }
            // Receive AVI
            if (json.has("AVI")) {
                ${tickdata_name}.AVI = json.getBoolean("AVI");
            }
            // Receive LRI
            if (json.has("LRI")) {
                ${tickdata_name}.LRI = json.getBoolean("LRI");
            }
            // Receive PVARP
            if (json.has("PVARP")) {
                ${tickdata_name}.PVARP = json.getBoolean("PVARP");
            }
            // Receive URI
            if (json.has("URI")) {
                ${tickdata_name}.URI = json.getBoolean("URI");
            }
            // Receive VRP
            if (json.has("VRP")) {
                ${tickdata_name}.VRP = json.getBoolean("VRP");
            }
            // Receive _Pacemaker_local__Atrig
            if (json.has("_Pacemaker_local__Atrig")) {
                ${tickdata_name}._Pacemaker_local__Atrig = json.getBoolean("_Pacemaker_local__Atrig");
            }
            // Receive _Pacemaker_local__Atrig1
            if (json.has("_Pacemaker_local__Atrig1")) {
                ${tickdata_name}._Pacemaker_local__Atrig1 = json.getBoolean("_Pacemaker_local__Atrig1");
            }
            // Receive _Pacemaker_local__Atrig2
            if (json.has("_Pacemaker_local__Atrig2")) {
                ${tickdata_name}._Pacemaker_local__Atrig2 = json.getBoolean("_Pacemaker_local__Atrig2");
            }
            // Receive _Pacemaker_local__Atrig3
            if (json.has("_Pacemaker_local__Atrig3")) {
                ${tickdata_name}._Pacemaker_local__Atrig3 = json.getBoolean("_Pacemaker_local__Atrig3");
            }
            // Receive _Pacemaker_local__Atrig4
            if (json.has("_Pacemaker_local__Atrig4")) {
                ${tickdata_name}._Pacemaker_local__Atrig4 = json.getBoolean("_Pacemaker_local__Atrig4");
            }
            // Receive _Pacemaker_local__Atrig5
            if (json.has("_Pacemaker_local__Atrig5")) {
                ${tickdata_name}._Pacemaker_local__Atrig5 = json.getBoolean("_Pacemaker_local__Atrig5");
            }
            // Receive _Pacemaker_local__Atrig6
            if (json.has("_Pacemaker_local__Atrig6")) {
                ${tickdata_name}._Pacemaker_local__Atrig6 = json.getBoolean("_Pacemaker_local__Atrig6");
            }
            // Receive _Pacemaker_local__Atrig7
            if (json.has("_Pacemaker_local__Atrig7")) {
                ${tickdata_name}._Pacemaker_local__Atrig7 = json.getBoolean("_Pacemaker_local__Atrig7");
            }
            // Receive _Pacemaker_local__Atrig8
            if (json.has("_Pacemaker_local__Atrig8")) {
                ${tickdata_name}._Pacemaker_local__Atrig8 = json.getBoolean("_Pacemaker_local__Atrig8");
            }
            // Receive _Pacemaker_local__Atrig9
            if (json.has("_Pacemaker_local__Atrig9")) {
                ${tickdata_name}._Pacemaker_local__Atrig9 = json.getBoolean("_Pacemaker_local__Atrig9");
            }
            // Receive _taken_transitions
            if (json.has("_taken_transitions")) {
                JSONArray _array = json.getJSONArray("_taken_transitions");
                for (int i = 0; i < _array.length(); i++) {
                    ${tickdata_name}._taken_transitions[i] = _array.getInt(i);
                }
            }
            // Receive cAEI
            if (json.has("cAEI")) {
                ${tickdata_name}.cAEI = json.getDouble("cAEI");
            }
            // Receive cAVI
            if (json.has("cAVI")) {
                ${tickdata_name}.cAVI = json.getDouble("cAVI");
            }
            // Receive cLRI
            if (json.has("cLRI")) {
                ${tickdata_name}.cLRI = json.getDouble("cLRI");
            }
            // Receive cPVARP
            if (json.has("cPVARP")) {
                ${tickdata_name}.cPVARP = json.getDouble("cPVARP");
            }
            // Receive cURI
            if (json.has("cURI")) {
                ${tickdata_name}.cURI = json.getDouble("cURI");
            }
            // Receive cVRP
            if (json.has("cVRP")) {
                ${tickdata_name}.cVRP = json.getDouble("cVRP");
            }
            // Receive eAEI
            if (json.has("eAEI")) {
                ${tickdata_name}.eAEI = json.getBoolean("eAEI");
            }
            // Receive eAVI
            if (json.has("eAVI")) {
                ${tickdata_name}.eAVI = json.getBoolean("eAVI");
            }
            // Receive eLRI
            if (json.has("eLRI")) {
                ${tickdata_name}.eLRI = json.getBoolean("eLRI");
            }
            // Receive ePVARP
            if (json.has("ePVARP")) {
                ${tickdata_name}.ePVARP = json.getBoolean("ePVARP");
            }
            // Receive eURI
            if (json.has("eURI")) {
                ${tickdata_name}.eURI = json.getBoolean("eURI");
            }
            // Receive eVRP
            if (json.has("eVRP")) {
                ${tickdata_name}.eVRP = json.getBoolean("eVRP");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
           // Ignore other input
        }
    }
    
    private static void sendVariables() {
        JSONObject json = new JSONObject();
        
        // Send AS
        json.put("AS", JSONObject.wrap(${tickdata_name}.AS));
        // Send VS
        json.put("VS", JSONObject.wrap(${tickdata_name}.VS));
        // Send deltaT
        json.put("deltaT", JSONObject.wrap(${tickdata_name}.deltaT));
        // Send AP
        json.put("AP", JSONObject.wrap(${tickdata_name}.AP));
        // Send VP
        json.put("VP", JSONObject.wrap(${tickdata_name}.VP));
        // Send sleepT
        json.put("sleepT", JSONObject.wrap(${tickdata_name}.sleepT));
        // Send #ticktime
        json.put("#ticktime", _ticktime);
        // Send AEI
        json.put("AEI", JSONObject.wrap(${tickdata_name}.AEI));
        // Send AVI
        json.put("AVI", JSONObject.wrap(${tickdata_name}.AVI));
        // Send LRI
        json.put("LRI", JSONObject.wrap(${tickdata_name}.LRI));
        // Send PVARP
        json.put("PVARP", JSONObject.wrap(${tickdata_name}.PVARP));
        // Send URI
        json.put("URI", JSONObject.wrap(${tickdata_name}.URI));
        // Send VRP
        json.put("VRP", JSONObject.wrap(${tickdata_name}.VRP));
        // Send _Pacemaker_local__Atrig
        json.put("_Pacemaker_local__Atrig", JSONObject.wrap(${tickdata_name}._Pacemaker_local__Atrig));
        // Send _Pacemaker_local__Atrig1
        json.put("_Pacemaker_local__Atrig1", JSONObject.wrap(${tickdata_name}._Pacemaker_local__Atrig1));
        // Send _Pacemaker_local__Atrig2
        json.put("_Pacemaker_local__Atrig2", JSONObject.wrap(${tickdata_name}._Pacemaker_local__Atrig2));
        // Send _Pacemaker_local__Atrig3
        json.put("_Pacemaker_local__Atrig3", JSONObject.wrap(${tickdata_name}._Pacemaker_local__Atrig3));
        // Send _Pacemaker_local__Atrig4
        json.put("_Pacemaker_local__Atrig4", JSONObject.wrap(${tickdata_name}._Pacemaker_local__Atrig4));
        // Send _Pacemaker_local__Atrig5
        json.put("_Pacemaker_local__Atrig5", JSONObject.wrap(${tickdata_name}._Pacemaker_local__Atrig5));
        // Send _Pacemaker_local__Atrig6
        json.put("_Pacemaker_local__Atrig6", JSONObject.wrap(${tickdata_name}._Pacemaker_local__Atrig6));
        // Send _Pacemaker_local__Atrig7
        json.put("_Pacemaker_local__Atrig7", JSONObject.wrap(${tickdata_name}._Pacemaker_local__Atrig7));
        // Send _Pacemaker_local__Atrig8
        json.put("_Pacemaker_local__Atrig8", JSONObject.wrap(${tickdata_name}._Pacemaker_local__Atrig8));
        // Send _Pacemaker_local__Atrig9
        json.put("_Pacemaker_local__Atrig9", JSONObject.wrap(${tickdata_name}._Pacemaker_local__Atrig9));
        // Send _taken_transitions
        json.put("_taken_transitions", JSONObject.wrap(${tickdata_name}._taken_transitions));
        // Send cAEI
        json.put("cAEI", JSONObject.wrap(${tickdata_name}.cAEI));
        // Send cAVI
        json.put("cAVI", JSONObject.wrap(${tickdata_name}.cAVI));
        // Send cLRI
        json.put("cLRI", JSONObject.wrap(${tickdata_name}.cLRI));
        // Send cPVARP
        json.put("cPVARP", JSONObject.wrap(${tickdata_name}.cPVARP));
        // Send cURI
        json.put("cURI", JSONObject.wrap(${tickdata_name}.cURI));
        // Send cVRP
        json.put("cVRP", JSONObject.wrap(${tickdata_name}.cVRP));
        // Send eAEI
        json.put("eAEI", JSONObject.wrap(${tickdata_name}.eAEI));
        // Send eAVI
        json.put("eAVI", JSONObject.wrap(${tickdata_name}.eAVI));
        // Send eLRI
        json.put("eLRI", JSONObject.wrap(${tickdata_name}.eLRI));
        // Send ePVARP
        json.put("ePVARP", JSONObject.wrap(${tickdata_name}.ePVARP));
        // Send eURI
        json.put("eURI", JSONObject.wrap(${tickdata_name}.eURI));
        // Send eVRP
        json.put("eVRP", JSONObject.wrap(${tickdata_name}.eVRP));
        
        System.out.println(json.toString());
    }
</#macro>
