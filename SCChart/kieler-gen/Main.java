

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.*;

public class Main {

    public static Pacemaker model = new Pacemaker();
    
    private static long _tickstart;
private static long _ticktime;

    
    public static BufferedReader stdInReader = new BufferedReader(new InputStreamReader(System.in));
            
    private static void receiveVariables() {
        try {
            String line = stdInReader.readLine();
            JSONObject json = new JSONObject(line);
            
            // Receive AS
            if (json.has("AS")) {
                model.iface.AS = json.getBoolean("AS");
            }
            // Receive VS
            if (json.has("VS")) {
                model.iface.VS = json.getBoolean("VS");
            }
            // Receive deltaT
            if (json.has("deltaT")) {
                model.iface.deltaT = json.getDouble("deltaT");
            }
            // Receive AP
            if (json.has("AP")) {
                model.iface.AP = json.getBoolean("AP");
            }
            // Receive VP
            if (json.has("VP")) {
                model.iface.VP = json.getBoolean("VP");
            }
            // Receive sleepT
            if (json.has("sleepT")) {
                model.iface.sleepT = json.getDouble("sleepT");
            }
            // Receive #ticktime
            if (json.has("#ticktime")) {
                _ticktime = json.getInt("#ticktime");
            }
            // Receive AEI
            if (json.has("AEI")) {
                model.iface.AEI = json.getBoolean("AEI");
            }
            // Receive AVI
            if (json.has("AVI")) {
                model.iface.AVI = json.getBoolean("AVI");
            }
            // Receive LRI
            if (json.has("LRI")) {
                model.iface.LRI = json.getBoolean("LRI");
            }
            // Receive PVARP
            if (json.has("PVARP")) {
                model.iface.PVARP = json.getBoolean("PVARP");
            }
            // Receive URI
            if (json.has("URI")) {
                model.iface.URI = json.getBoolean("URI");
            }
            // Receive VRP
            if (json.has("VRP")) {
                model.iface.VRP = json.getBoolean("VRP");
            }
            // Receive _Pacemaker_local__Atrig
            if (json.has("_Pacemaker_local__Atrig")) {
                model.iface._Pacemaker_local__Atrig = json.getBoolean("_Pacemaker_local__Atrig");
            }
            // Receive _Pacemaker_local__Atrig1
            if (json.has("_Pacemaker_local__Atrig1")) {
                model.iface._Pacemaker_local__Atrig1 = json.getBoolean("_Pacemaker_local__Atrig1");
            }
            // Receive _Pacemaker_local__Atrig2
            if (json.has("_Pacemaker_local__Atrig2")) {
                model.iface._Pacemaker_local__Atrig2 = json.getBoolean("_Pacemaker_local__Atrig2");
            }
            // Receive _Pacemaker_local__Atrig3
            if (json.has("_Pacemaker_local__Atrig3")) {
                model.iface._Pacemaker_local__Atrig3 = json.getBoolean("_Pacemaker_local__Atrig3");
            }
            // Receive _Pacemaker_local__Atrig4
            if (json.has("_Pacemaker_local__Atrig4")) {
                model.iface._Pacemaker_local__Atrig4 = json.getBoolean("_Pacemaker_local__Atrig4");
            }
            // Receive _Pacemaker_local__Atrig5
            if (json.has("_Pacemaker_local__Atrig5")) {
                model.iface._Pacemaker_local__Atrig5 = json.getBoolean("_Pacemaker_local__Atrig5");
            }
            // Receive _Pacemaker_local__Atrig6
            if (json.has("_Pacemaker_local__Atrig6")) {
                model.iface._Pacemaker_local__Atrig6 = json.getBoolean("_Pacemaker_local__Atrig6");
            }
            // Receive _Pacemaker_local__Atrig7
            if (json.has("_Pacemaker_local__Atrig7")) {
                model.iface._Pacemaker_local__Atrig7 = json.getBoolean("_Pacemaker_local__Atrig7");
            }
            // Receive _Pacemaker_local__Atrig8
            if (json.has("_Pacemaker_local__Atrig8")) {
                model.iface._Pacemaker_local__Atrig8 = json.getBoolean("_Pacemaker_local__Atrig8");
            }
            // Receive _Pacemaker_local__Atrig9
            if (json.has("_Pacemaker_local__Atrig9")) {
                model.iface._Pacemaker_local__Atrig9 = json.getBoolean("_Pacemaker_local__Atrig9");
            }
            // Receive _taken_transitions
            if (json.has("_taken_transitions")) {
                JSONArray _array = json.getJSONArray("_taken_transitions");
                for (int i = 0; i < _array.length(); i++) {
                    model.iface._taken_transitions[i] = _array.getInt(i);
                }
            }
            // Receive cAEI
            if (json.has("cAEI")) {
                model.iface.cAEI = json.getDouble("cAEI");
            }
            // Receive cAVI
            if (json.has("cAVI")) {
                model.iface.cAVI = json.getDouble("cAVI");
            }
            // Receive cLRI
            if (json.has("cLRI")) {
                model.iface.cLRI = json.getDouble("cLRI");
            }
            // Receive cPVARP
            if (json.has("cPVARP")) {
                model.iface.cPVARP = json.getDouble("cPVARP");
            }
            // Receive cURI
            if (json.has("cURI")) {
                model.iface.cURI = json.getDouble("cURI");
            }
            // Receive cVRP
            if (json.has("cVRP")) {
                model.iface.cVRP = json.getDouble("cVRP");
            }
            // Receive eAEI
            if (json.has("eAEI")) {
                model.iface.eAEI = json.getBoolean("eAEI");
            }
            // Receive eAVI
            if (json.has("eAVI")) {
                model.iface.eAVI = json.getBoolean("eAVI");
            }
            // Receive eLRI
            if (json.has("eLRI")) {
                model.iface.eLRI = json.getBoolean("eLRI");
            }
            // Receive ePVARP
            if (json.has("ePVARP")) {
                model.iface.ePVARP = json.getBoolean("ePVARP");
            }
            // Receive eURI
            if (json.has("eURI")) {
                model.iface.eURI = json.getBoolean("eURI");
            }
            // Receive eVRP
            if (json.has("eVRP")) {
                model.iface.eVRP = json.getBoolean("eVRP");
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
        json.put("AS", JSONObject.wrap(model.iface.AS));
        // Send VS
        json.put("VS", JSONObject.wrap(model.iface.VS));
        // Send deltaT
        json.put("deltaT", JSONObject.wrap(model.iface.deltaT));
        // Send AP
        json.put("AP", JSONObject.wrap(model.iface.AP));
        // Send VP
        json.put("VP", JSONObject.wrap(model.iface.VP));
        // Send sleepT
        json.put("sleepT", JSONObject.wrap(model.iface.sleepT));
        // Send #ticktime
        json.put("#ticktime", _ticktime);
        // Send AEI
        json.put("AEI", JSONObject.wrap(model.iface.AEI));
        // Send AVI
        json.put("AVI", JSONObject.wrap(model.iface.AVI));
        // Send LRI
        json.put("LRI", JSONObject.wrap(model.iface.LRI));
        // Send PVARP
        json.put("PVARP", JSONObject.wrap(model.iface.PVARP));
        // Send URI
        json.put("URI", JSONObject.wrap(model.iface.URI));
        // Send VRP
        json.put("VRP", JSONObject.wrap(model.iface.VRP));
        // Send _Pacemaker_local__Atrig
        json.put("_Pacemaker_local__Atrig", JSONObject.wrap(model.iface._Pacemaker_local__Atrig));
        // Send _Pacemaker_local__Atrig1
        json.put("_Pacemaker_local__Atrig1", JSONObject.wrap(model.iface._Pacemaker_local__Atrig1));
        // Send _Pacemaker_local__Atrig2
        json.put("_Pacemaker_local__Atrig2", JSONObject.wrap(model.iface._Pacemaker_local__Atrig2));
        // Send _Pacemaker_local__Atrig3
        json.put("_Pacemaker_local__Atrig3", JSONObject.wrap(model.iface._Pacemaker_local__Atrig3));
        // Send _Pacemaker_local__Atrig4
        json.put("_Pacemaker_local__Atrig4", JSONObject.wrap(model.iface._Pacemaker_local__Atrig4));
        // Send _Pacemaker_local__Atrig5
        json.put("_Pacemaker_local__Atrig5", JSONObject.wrap(model.iface._Pacemaker_local__Atrig5));
        // Send _Pacemaker_local__Atrig6
        json.put("_Pacemaker_local__Atrig6", JSONObject.wrap(model.iface._Pacemaker_local__Atrig6));
        // Send _Pacemaker_local__Atrig7
        json.put("_Pacemaker_local__Atrig7", JSONObject.wrap(model.iface._Pacemaker_local__Atrig7));
        // Send _Pacemaker_local__Atrig8
        json.put("_Pacemaker_local__Atrig8", JSONObject.wrap(model.iface._Pacemaker_local__Atrig8));
        // Send _Pacemaker_local__Atrig9
        json.put("_Pacemaker_local__Atrig9", JSONObject.wrap(model.iface._Pacemaker_local__Atrig9));
        // Send _taken_transitions
        json.put("_taken_transitions", JSONObject.wrap(model.iface._taken_transitions));
        // Send cAEI
        json.put("cAEI", JSONObject.wrap(model.iface.cAEI));
        // Send cAVI
        json.put("cAVI", JSONObject.wrap(model.iface.cAVI));
        // Send cLRI
        json.put("cLRI", JSONObject.wrap(model.iface.cLRI));
        // Send cPVARP
        json.put("cPVARP", JSONObject.wrap(model.iface.cPVARP));
        // Send cURI
        json.put("cURI", JSONObject.wrap(model.iface.cURI));
        // Send cVRP
        json.put("cVRP", JSONObject.wrap(model.iface.cVRP));
        // Send eAEI
        json.put("eAEI", JSONObject.wrap(model.iface.eAEI));
        // Send eAVI
        json.put("eAVI", JSONObject.wrap(model.iface.eAVI));
        // Send eLRI
        json.put("eLRI", JSONObject.wrap(model.iface.eLRI));
        // Send ePVARP
        json.put("ePVARP", JSONObject.wrap(model.iface.ePVARP));
        // Send eURI
        json.put("eURI", JSONObject.wrap(model.iface.eURI));
        // Send eVRP
        json.put("eVRP", JSONObject.wrap(model.iface.eVRP));
        
        System.out.println(json.toString());
    }
    
    public static void main(String[] args) {
        
        
        // Initialize 
        model.reset();
        
        sendVariables();

        
        while (true) {
            
        
           // Read inputs
           receiveVariables();

           
           _tickstart = System.nanoTime();

        
           // Reaction of model
           model.tick();
           
           _ticktime = System.nanoTime() - _tickstart;

           
           // Send outputs
           sendVariables();

           
           
        }
    }
    
}