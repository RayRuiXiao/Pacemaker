/*
 * Automatically generated Java code by
 * KIELER SCCharts - The Key to Efficient Modeling
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 */

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class Pacemaker {

  public Iface iface;
  private TickData rootContext;
  
  public static final String ORIGINAL_SCCHART = "/Users/joshua/Documents/GitHub/COMPSYS-303-Pacemaker/SCChart/pacemaker-chart.sctx";
  

  /**
 * Enumeration for the possible thread states.
 * The chosen scheduling regime (IUR) uses four states to maintain the statuses of threads.
 */
  public enum ThreadStatus {
    TERMINATED("TERMINATED"), RUNNING("RUNNING"), READY("READY"), PAUSING("PAUSING");
    
    private String name;
    
    private ThreadStatus(String name) {
        this.name = name;
    }
  }

/**
 * The interface containing all model variables (inputs, outputs)
 */
public static class Iface {
  boolean AS; // Input
  boolean VS; // Input
  boolean AVI;
  boolean PVARP;
  boolean VRP;
  boolean AEI;
  boolean LRI;
  boolean URI;
  double cAVI;
  double cPVARP;
  double cVRP;
  double cAEI;
  double cLRI;
  double cURI;
  int _taken_transitions[] = new int[12];
  double deltaT; // Input
  double sleepT; // Output
  boolean AP; // Output
  boolean VP; // Output
  boolean eAVI;
  boolean ePVARP;
  boolean eVRP;
  boolean eAEI;
  boolean eLRI;
  boolean eURI;
  boolean _Pacemaker_local__Atrig;
  boolean _Pacemaker_local__Atrig1;
  boolean _Pacemaker_local__Atrig2;
  boolean _Pacemaker_local__Atrig3;
  boolean _Pacemaker_local__Atrig4;
  boolean _Pacemaker_local__Atrig5;
  boolean _Pacemaker_local__Atrig6;
  boolean _Pacemaker_local__Atrig7;
  boolean _Pacemaker_local__Atrig8;
  boolean _Pacemaker_local__Atrig9;
}
			
  /**
 * Runtime data for the root level program
 */
  public static class TickData {
    ThreadStatus threadStatus;

Pacemaker_region__EA_EntryContext Pacemaker_region__EA_Entry = new Pacemaker_region__EA_EntryContext();
    
    public Stream<String> getCurrentState() {
  return Stream.of(
      Pacemaker_region__EA_Entry.getCurrentState()
    ).flatMap(i -> i);
    }
  }

	  /**
	   * Enumeration for all states of the __EA_Entry region
	   */
	  public enum Pacemaker_region__EA_EntryStates {
	  __EA_MAIN("State Pacemaker (-1786282077)"), __EA_MAINRUNNING("State Pacemaker (-1786282077)"), __EA_INIT48("State Pacemaker (-1786282077)"), __EA_DONE49("State Pacemaker (-1786282077)"), __EA_C(""), __EA_C1(""), __EA_C2(""), __EA_C3(""), __EA_C4(""), __EA_C5(""), __EA_C6(""), __EA_C7(""), __EA_C8(""), __EA_C9(""), __EA_C10(""), __EA_C11(""), __EA_C12(""), __EA_C13(""), __EA_C14(""), __EA_C15(""), __EA_C16(""), __EA_C17(""), __EA_C18(""), __EA_C19(""), __EA_C20("");

	private String origin;

	Pacemaker_region__EA_EntryStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region __EA_Entry
	 */
	public static class Pacemaker_region__EA_EntryContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_EntryStates activeState;
	  boolean delayedEnabled;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_DuringContext Pacemaker_region__EA_Entry_state__EA_Main_region_During = new Pacemaker_region__EA_Entry_state__EA_Main_region_DuringContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_mainContext Pacemaker_region__EA_Entry_state__EA_Main_region_main = new Pacemaker_region__EA_Entry_state__EA_Main_region_mainContext();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case __EA_MAIN:
	    case __EA_MAINRUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_During.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_DuringStates {
	  _I(""), _S("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_DuringStates activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _main region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_mainStates {
	  _MAIN(""), _MAINRUNNING("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_mainStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _main
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_mainContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_mainStates activeState;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case _MAIN:
	    case _MAINRUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the __EA_Entry1 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1States {
	  __EA_MAIN1(""), __EA_MAIN1RUNNING(""), __EA_INIT46(""), __EA_DONE47("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region __EA_Entry1
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1States activeState;
	  boolean delayedEnabled;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringContext();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case __EA_MAIN1:
	    case __EA_MAIN1RUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the AVI region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIStates {
	  IAVI("State iAVI (261324961)"), IAVIRUNNING("State iAVI (261324961)"), DAVI("State dAVI (261176006)"), DAVIRUNNING("State dAVI (261176006)"), _AC1("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region AVI
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIStates activeState;
	  boolean delayedEnabled;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case IAVI:
	    case IAVIRUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry.getCurrentState()
	        ).flatMap(i -> i);
	    case DAVI:
	    case DAVIRUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _Entry region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryStates {
	  _MAIN2("State iAVI (261324961)"), _MAIN2RUNNING("State iAVI (261324961)"), _DONE("State iAVI (261324961)"), __EA_INIT("State iAVI (261324961)"), __EA_C21("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _Entry
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryStates activeState;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrlContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrlContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_DuringContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_DuringContext();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case _MAIN2:
	    case _MAIN2RUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _ACtrl region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrlStates {
	  _ARUN(""), _ADONE("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrlStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _ACtrl
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrlContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrlStates activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_DuringStates {
	  _I3(""), _AABORTED("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_DuringStates activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the __EA_Entry2 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2States {
	  __EA_MAIN4("State dAVI (261176006)"), __EA_MAIN4RUNNING("State dAVI (261176006)"), __EA_INIT8("State dAVI (261176006)"), __EA_DONE("State dAVI (261176006)"), __EA_C22(""), __EA_C23("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region __EA_Entry2
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2States activeState;
	  boolean delayedEnabled;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_DuringContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_DuringContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0Context();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case __EA_MAIN4:
	    case __EA_MAIN4RUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_DuringStates {
	  _I5(""), _AABORTED1("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_DuringStates activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0States {
	  _I6(""), _S7(""), _AABORTED2("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0States activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _ACtrl1 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1States {
	  _ARUN1(""), _ADONE1("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _ACtrl1
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1States activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the PVARP region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPStates {
	  WPVARP("State wPVARP (-759267811)"), WPVARPRUNNING("State wPVARP (-759267811)"), DPVARP("State dPVARP (-1303221680)"), DPVARPRUNNING("State dPVARP (-1303221680)");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region PVARP
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPStates activeState;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1Context();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case WPVARP:
	    case WPVARPRUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1.getCurrentState()
	        ).flatMap(i -> i);
	    case DPVARP:
	    case DPVARPRUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _Entry1 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1States {
	  _MAIN9("State wPVARP (-759267811)"), _MAIN9RUNNING("State wPVARP (-759267811)"), _DONE11("State wPVARP (-759267811)"), __EA_INIT1("State wPVARP (-759267811)"), __EA_C24("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _Entry1
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1States activeState;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2Context();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_DuringContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_DuringContext();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case _MAIN9:
	    case _MAIN9RUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _ACtrl2 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2States {
	  _ARUN2(""), _ADONE2("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _ACtrl2
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2States activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_DuringStates {
	  _I10(""), _AABORTED3("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_DuringStates activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the __EA_Entry3 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3States {
	  __EA_MAIN12("State dPVARP (-1303221680)"), __EA_MAIN12RUNNING("State dPVARP (-1303221680)"), __EA_INIT16("State dPVARP (-1303221680)"), __EA_DONE17("State dPVARP (-1303221680)"), __EA_C25("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region __EA_Entry3
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3States activeState;
	  boolean delayedEnabled;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_DuringContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_DuringContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1Context();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case __EA_MAIN12:
	    case __EA_MAIN12RUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_DuringStates {
	  _I13(""), _AABORTED4("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_DuringStates activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1States {
	  _I14(""), _S15(""), _AABORTED5("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1States activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _ACtrl3 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3States {
	  _ARUN3(""), _ADONE3("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _ACtrl3
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3States activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the VRP region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPStates {
	  WVRP("State wVRP (-1814822253)"), WVRPRUNNING("State wVRP (-1814822253)"), DVRP("State dVRP (-1815388282)"), DVRPRUNNING("State dVRP (-1815388282)");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region VRP
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPStates activeState;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2Context();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case WVRP:
	    case WVRPRUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2.getCurrentState()
	        ).flatMap(i -> i);
	    case DVRP:
	    case DVRPRUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _Entry2 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2States {
	  _MAIN18("State wVRP (-1814822253)"), _MAIN18RUNNING("State wVRP (-1814822253)"), _DONE20("State wVRP (-1814822253)"), __EA_INIT2("State wVRP (-1814822253)"), __EA_C26("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _Entry2
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2States activeState;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4Context();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_DuringContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_DuringContext();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case _MAIN18:
	    case _MAIN18RUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _ACtrl4 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4States {
	  _ARUN4(""), _ADONE4("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _ACtrl4
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4States activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_DuringStates {
	  _I19(""), _AABORTED6("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_DuringStates activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the __EA_Entry4 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4States {
	  __EA_MAIN21("State dVRP (-1815388282)"), __EA_MAIN21RUNNING("State dVRP (-1815388282)"), __EA_INIT25("State dVRP (-1815388282)"), __EA_DONE26("State dVRP (-1815388282)"), __EA_C27("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region __EA_Entry4
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4States activeState;
	  boolean delayedEnabled;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_DuringContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_DuringContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2Context();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case __EA_MAIN21:
	    case __EA_MAIN21RUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_DuringStates {
	  _I22(""), _AABORTED7("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_DuringStates activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2States {
	  _I23(""), _S24(""), _AABORTED8("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2States activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _ACtrl5 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5States {
	  _ARUN5(""), _ADONE5("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _ACtrl5
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5States activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the AEI region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIStates {
	  WAEI("State wAEI (-1932664715)"), WAEIRUNNING("State wAEI (-1932664715)"), DAEI("State dAEI (-1933230744)"), DAEIRUNNING("State dAEI (-1933230744)"), _AC7("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region AEI
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIStates activeState;
	  boolean delayedEnabled;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3Context();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case WAEI:
	    case WAEIRUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3.getCurrentState()
	        ).flatMap(i -> i);
	    case DAEI:
	    case DAEIRUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _Entry3 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3States {
	  _MAIN27("State wAEI (-1932664715)"), _MAIN27RUNNING("State wAEI (-1932664715)"), _DONE29("State wAEI (-1932664715)"), __EA_INIT3("State wAEI (-1932664715)"), __EA_C28("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _Entry3
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3States activeState;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6Context();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_DuringContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_DuringContext();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case _MAIN27:
	    case _MAIN27RUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _ACtrl6 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6States {
	  _ARUN6(""), _ADONE6("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _ACtrl6
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6States activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_DuringStates {
	  _I28(""), _AABORTED9("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_DuringStates activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the __EA_Entry5 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5States {
	  __EA_MAIN30("State dAEI (-1933230744)"), __EA_MAIN30RUNNING("State dAEI (-1933230744)"), __EA_INIT34("State dAEI (-1933230744)"), __EA_DONE35("State dAEI (-1933230744)"), __EA_C29(""), __EA_C30("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region __EA_Entry5
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5States activeState;
	  boolean delayedEnabled;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_DuringContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_DuringContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3Context();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7Context Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7 = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case __EA_MAIN30:
	    case __EA_MAIN30RUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3.getCurrentState(),
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_DuringStates {
	  _I31(""), _AABORTED10("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_DuringStates activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3States {
	  _I32(""), _S33(""), _AABORTED11("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3States activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _ACtrl7 region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7States {
	  _ARUN7(""), _ADONE7("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _ACtrl7
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7Context {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7States activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the LRI region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIStates {
	  WLRI("State wLRI (812955825)"), WLRIRUNNING("State wLRI (812955825)"), DLRI("State dLRI (812389796)"), DLRIRUNNING("State dLRI (812389796)"), _EXITOPTION("State wLRI (812955825)");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region LRI
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIStates activeState;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_EntryContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_Entry = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_EntryContext();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case WLRI:
	    case WLRIRUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit.getCurrentState()
	        ).flatMap(i -> i);
	    case DLRI:
	    case DLRIRUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_Entry.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _Exit region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitStates {
	  _INIT("State wLRI (812955825)"), _DONE36("State wLRI (812955825)"), _MEMORIZE("State wLRI (812955825)"), __EA_INIT4("State wLRI (812955825)");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _Exit
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitStates activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the __EA_Entry region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_EntryStates {
	  __EA_INIT37("State dLRI (812389796)"), __EA_DONE38("State dLRI (812389796)");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_EntryStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region __EA_Entry
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_EntryContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_EntryStates activeState;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the URI region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIStates {
	  WURI("State wURI (-1827662589)"), WURIRUNNING("State wURI (-1827662589)"), DURI("State dURI (-1828228618)"), DURIRUNNING("State dURI (-1828228618)"), _EXITOPTION1("State wURI (-1827662589)");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region URI
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIStates activeState;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitContext();
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_EntryContext Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_Entry = new Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_EntryContext();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case WURI:
	    case WURIRUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit.getCurrentState()
	        ).flatMap(i -> i);
	    case DURI:
	    case DURIRUNNING:
	      return Stream.of(
	          Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_Entry.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _Exit region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitStates {
	  _INIT39("State wURI (-1827662589)"), _DONE40("State wURI (-1827662589)"), _MEMORIZE41("State wURI (-1827662589)"), __EA_INIT5("State wURI (-1827662589)");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _Exit
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitStates activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the __EA_Entry region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_EntryStates {
	  __EA_INIT42("State dURI (-1828228618)"), __EA_DONE43("State dURI (-1828228618)");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_EntryStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region __EA_Entry
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_EntryContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_EntryStates activeState;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringStates {
	  _I44(""), _S45("");

	private String origin;

	Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringStates activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

/**
 * State Pacemaker (-1786282077)
 */
private void Pacemaker_root(TickData context) {
if (context.Pacemaker_region__EA_Entry.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry(context.Pacemaker_region__EA_Entry);
  context.Pacemaker_region__EA_Entry.delayedEnabled = true;
  context.threadStatus = ThreadStatus.READY;
}
			
private void Pacemaker_region__EA_Entry(Pacemaker_region__EA_EntryContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case __EA_MAIN:
			      	  Pacemaker_region__EA_Entry_state__EA_Main(context);
      		// Superstate: intended fall-through 

		case __EA_MAINRUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_running(context);
break;
			
			      	case __EA_INIT48:
			      	  Pacemaker_region__EA_Entry_state__EA_Init(context);
break;
			
			      	case __EA_DONE49:
			      	  Pacemaker_region__EA_Entry_state__EA_Done(context);
break;
			
			      	case __EA_C:
			      	  Pacemaker_region__EA_Entry_state__EA_C(context);
break;
			
			      	case __EA_C1:
			      	  Pacemaker_region__EA_Entry_state__EA_C1(context);
break;
			
			      	case __EA_C2:
			      	  Pacemaker_region__EA_Entry_state__EA_C2(context);
break;
			
			      	case __EA_C3:
			      	  Pacemaker_region__EA_Entry_state__EA_C3(context);
break;
			
			      	case __EA_C4:
			      	  Pacemaker_region__EA_Entry_state__EA_C4(context);
break;
			
			      	case __EA_C5:
			      	  Pacemaker_region__EA_Entry_state__EA_C5(context);
break;
			
			      	case __EA_C6:
			      	  Pacemaker_region__EA_Entry_state__EA_C6(context);
break;
			
			      	case __EA_C7:
			      	  Pacemaker_region__EA_Entry_state__EA_C7(context);
break;
			
			      	case __EA_C8:
			      	  Pacemaker_region__EA_Entry_state__EA_C8(context);
break;
			
			      	case __EA_C9:
			      	  Pacemaker_region__EA_Entry_state__EA_C9(context);
break;
			
			      	case __EA_C10:
			      	  Pacemaker_region__EA_Entry_state__EA_C10(context);
break;
			
			      	case __EA_C11:
			      	  Pacemaker_region__EA_Entry_state__EA_C11(context);
break;
			
			      	case __EA_C12:
			      	  Pacemaker_region__EA_Entry_state__EA_C12(context);
break;
			
			      	case __EA_C13:
			      	  Pacemaker_region__EA_Entry_state__EA_C13(context);
break;
			
			      	case __EA_C14:
			      	  Pacemaker_region__EA_Entry_state__EA_C14(context);
break;
			
			      	case __EA_C15:
			      	  Pacemaker_region__EA_Entry_state__EA_C15(context);
break;
			
			      	case __EA_C16:
			      	  Pacemaker_region__EA_Entry_state__EA_C16(context);
break;
			
			      	case __EA_C17:
			      	  Pacemaker_region__EA_Entry_state__EA_C17(context);
break;
			
			      	case __EA_C18:
			      	  Pacemaker_region__EA_Entry_state__EA_C18(context);
break;
			
			      	case __EA_C19:
			      	  Pacemaker_region__EA_Entry_state__EA_C19(context);
break;
			
			      	case __EA_C20:
			      	  Pacemaker_region__EA_Entry_state__EA_C20(context);
break;
			
    }
  }
}
			
/**
 * State Pacemaker (-1786282077)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main(Pacemaker_region__EA_EntryContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_During.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_DuringStates._I;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_During.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_During.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_mainStates._MAIN;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_EntryStates.__EA_MAINRUNNING;
}

/**
 * State Pacemaker (-1786282077)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_running(Pacemaker_region__EA_EntryContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_During(context.Pacemaker_region__EA_Entry_state__EA_Main_region_During);
Pacemaker_region__EA_Entry_state__EA_Main_region_main(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_During.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main.threadStatus == ThreadStatus.TERMINATED) { 
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_EntryStates.__EA_DONE49;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_During.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_During(Pacemaker_region__EA_Entry_state__EA_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_During_state_I(context);
break;
			
			      	case _S:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_During_state_S(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_During_state_I(Pacemaker_region__EA_Entry_state__EA_Main_region_DuringContext context) {
  iface.AP = false;
  iface.VP = false;
  iface.eAVI = false;
  iface.ePVARP = false;
  iface.eVRP = false;
  iface.eAEI = false;
  iface.eLRI = false;
  iface.eURI = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_DuringStates._S;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_During_state_S(Pacemaker_region__EA_Entry_state__EA_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_DuringStates._I;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main(Pacemaker_region__EA_Entry_state__EA_Main_region_mainContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _MAIN:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main(context);
      		// Superstate: intended fall-through 

		case _MAINRUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_running(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main(Pacemaker_region__EA_Entry_state__EA_Main_region_mainContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1States.__EA_INIT46;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_mainStates._MAINRUNNING;
}

private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_running(Pacemaker_region__EA_Entry_state__EA_Main_region_mainContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1);
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1.delayedEnabled = true;
  context.threadStatus = ThreadStatus.READY;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case __EA_MAIN1:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main(context);
      		// Superstate: intended fall-through 

		case __EA_MAIN1RUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_running(context);
break;
			
			      	case __EA_INIT46:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Init(context);
break;
			
			      	case __EA_DONE47:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Done(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIStates.IAVI;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPStates.WPVARP;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPStates.WVRP;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIStates.WAEI;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIStates.WLRI;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIStates.WURI;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringStates._I44;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1States.__EA_MAIN1RUNNING;
}

private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.threadStatus == ThreadStatus.TERMINATED) { 
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1States.__EA_DONE47;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI.delayedEnabled = true;
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI.delayedEnabled = true;
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case IAVI:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI(context);
      		// Superstate: intended fall-through 

		case IAVIRUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_running(context);
break;
			
			      	case DAVI:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI(context);
      		// Superstate: intended fall-through 

		case DAVIRUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_running(context);
break;
			
			      	case _AC1:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_state_AC1(context);
break;
			
    }
  }
}
			
/**
 * State iAVI (261324961)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryStates.__EA_INIT;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIStates.IAVIRUNNING;
}

/**
 * State iAVI (261324961)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry.threadStatus == ThreadStatus.TERMINATED) {  // Transition iAVI (Priority 1) -> dAVI (1596910974)
    iface._taken_transitions[0] += 1;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIStates.DAVI;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _MAIN2:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main(context);
      		// Superstate: intended fall-through 

		case _MAIN2RUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_running(context);
break;
			
			      	case _DONE:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Done(context);
break;
			
			      	case __EA_INIT:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state__EA_Init(context);
break;
			
			      	case __EA_C21:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state__EA_C21(context);
break;
			
    }
  }
}
			
/**
 * State iAVI (261324961)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrlStates._ARUN;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_DuringStates._I3;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryStates._MAIN2RUNNING;
}

/**
 * State iAVI (261324961)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During.threadStatus == ThreadStatus.TERMINATED) { 
    iface.AVI = true;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryStates._DONE;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl.delayedEnabled = true;
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrlContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _ARUN:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl_state_ARun(context);
break;
			
			      	case _ADONE:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl_state_ADone(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl_state_ARun(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrlContext context) {
  if (context.delayedEnabled && (iface.AS && !iface.PVARP)) {  // Transition iAVI (Priority 1) -> dAVI (1596910974)
    iface._Pacemaker_local__Atrig = true;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrlStates._ADONE;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrl_state_ADone(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_ACtrlContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I3:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During_state_I(context);
break;
			
			      	case _AABORTED:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During_state_Aaborted(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During_state_I(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    iface.cAVI += iface.deltaT;
    context.delayedEnabled = false;
  }
  else if (iface._Pacemaker_local__Atrig) { // Transition iAVI (Priority 1) -> dAVI (1596910974)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_DuringStates._AABORTED;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_During_state_Aaborted(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Main_region_DuringContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State iAVI (261324961)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state_Done(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State iAVI (261324961)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state__EA_Init(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryContext context) {
  iface.AVI = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryStates.__EA_C21;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_Entry_state__EA_C21(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryContext context) {
  iface._Pacemaker_local__Atrig = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_stateiAVI_region_EntryStates._MAIN2;
    // Transition iAVI (Priority 1) -> dAVI (1596910974)
}
			
/**
 * State dAVI (261176006)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2States.__EA_INIT8;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIStates.DAVIRUNNING;
}

/**
 * State dAVI (261176006)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2.threadStatus == ThreadStatus.TERMINATED) {  // Transition dAVI (Priority 2) -> iAVI (-127756139)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIStates._AC1;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case __EA_MAIN4:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main(context);
      		// Superstate: intended fall-through 

		case __EA_MAIN4RUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_running(context);
break;
			
			      	case __EA_INIT8:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Init(context);
break;
			
			      	case __EA_DONE:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Done(context);
break;
			
			      	case __EA_C22:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_C22(context);
break;
			
			      	case __EA_C23:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_C23(context);
break;
			
    }
  }
}
			
/**
 * State dAVI (261176006)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2Context context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_DuringStates._I5;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0States._I6;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1States._ARUN1;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2States.__EA_MAIN4RUNNING;
}

/**
 * State dAVI (261176006)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2Context context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1.threadStatus == ThreadStatus.TERMINATED) { 
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2States.__EA_DONE;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During.delayedEnabled = true;
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0.delayedEnabled = true;
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I5:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During_state_I(context);
break;
			
			      	case _AABORTED1:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During_state_Aaborted1(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During_state_I(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    iface.cAVI += iface.deltaT;
    context.delayedEnabled = false;
  }
  else if (iface._Pacemaker_local__Atrig1 || iface._Pacemaker_local__Atrig2) { // Transition dAVI (Priority 2) -> iAVI (-127756139)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_DuringStates._AABORTED1;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During_state_Aaborted1(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_DuringContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I6:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0_state_I(context);
break;
			
			      	case _S7:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0_state_S(context);
break;
			
			      	case _AABORTED2:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0_state_Aaborted2(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0_state_I(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0Context context) {
  if (iface.cAVI < 150.0) { 
    iface.sleepT = (iface.sleepT < 150.0 - iface.cAVI) ? iface.sleepT : 150.0 - iface.cAVI;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0States._S7;
  }
  else if (iface._Pacemaker_local__Atrig1 || iface._Pacemaker_local__Atrig2) { // Transition dAVI (Priority 2) -> iAVI (-127756139)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0States._AABORTED2;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0_state_S(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0Context context) {
  if (context.delayedEnabled) { 
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0States._I6;
  }
  else if (iface._Pacemaker_local__Atrig1 || iface._Pacemaker_local__Atrig2) { // Transition dAVI (Priority 2) -> iAVI (-127756139)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0States._AABORTED2;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0_state_Aaborted2(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_During0Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _ARUN1:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1_state_ARun1(context);
break;
			
			      	case _ADONE1:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1_state_ADone1(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1_state_ARun1(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1Context context) {
  if (context.delayedEnabled && (iface.cAVI >= 150 && !iface.URI)) {  // Transition dAVI (Priority 1) -> iAVI (-127756140)
    iface._Pacemaker_local__Atrig1 = true;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1States._ADONE1;
  }
  else if (context.delayedEnabled && (iface.VS)) { // Transition dAVI (Priority 2) -> iAVI (-127756139)
    iface._Pacemaker_local__Atrig2 = true;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1States._ADONE1;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1_state_ADone1(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Main_region_ACtrl1Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State dAVI (261176006)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Init(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2Context context) {
  iface.cAVI = 0;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2States.__EA_C22;
}
			
/**
 * State dAVI (261176006)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_Done(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_C22(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2Context context) {
  iface._Pacemaker_local__Atrig1 = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2States.__EA_C23;
    // Transition dAVI (Priority 1) -> iAVI (-127756140)
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2_state__EA_C23(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2Context context) {
  iface._Pacemaker_local__Atrig2 = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_statedAVI_region__EA_Entry2States.__EA_MAIN4;
    // Transition dAVI (Priority 2) -> iAVI (-127756139)
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVI_state_AC1(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIContext context) {
  if (iface._Pacemaker_local__Atrig1) {  // Transition dAVI (Priority 1) -> iAVI (-127756140)
    iface.VP |= true;
    iface.eAVI |= true;
    iface._taken_transitions[1] += 1;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIStates.IAVI;
  }
  else { // Transition dAVI (Priority 2) -> iAVI (-127756139)
    iface.eAVI |= true;
    iface._taken_transitions[2] += 1;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAVIStates.IAVI;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case WPVARP:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP(context);
      		// Superstate: intended fall-through 

		case WPVARPRUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_running(context);
break;
			
			      	case DPVARP:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP(context);
      		// Superstate: intended fall-through 

		case DPVARPRUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_running(context);
break;
			
    }
  }
}
			
/**
 * State wPVARP (-759267811)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1States.__EA_INIT1;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPStates.WPVARPRUNNING;
}

/**
 * State wPVARP (-759267811)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1.threadStatus == ThreadStatus.TERMINATED) {  // Transition wPVARP (Priority 1) -> dPVARP (228274700)
    iface._taken_transitions[3] += 1;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPStates.DPVARP;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _MAIN9:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main(context);
      		// Superstate: intended fall-through 

		case _MAIN9RUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_running(context);
break;
			
			      	case _DONE11:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Done(context);
break;
			
			      	case __EA_INIT1:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state__EA_Init1(context);
break;
			
			      	case __EA_C24:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state__EA_C24(context);
break;
			
    }
  }
}
			
/**
 * State wPVARP (-759267811)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1Context context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2States._ARUN2;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_DuringStates._I10;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1States._MAIN9RUNNING;
}

/**
 * State wPVARP (-759267811)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1Context context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During.threadStatus == ThreadStatus.TERMINATED) { 
    iface.PVARP = true;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1States._DONE11;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2.delayedEnabled = true;
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _ARUN2:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2_state_ARun2(context);
break;
			
			      	case _ADONE2:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2_state_ADone2(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2_state_ARun2(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2Context context) {
  if (context.delayedEnabled && (iface.eAVI)) {  // Transition wPVARP (Priority 1) -> dPVARP (228274700)
    iface._Pacemaker_local__Atrig3 = true;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2States._ADONE2;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2_state_ADone2(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_ACtrl2Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I10:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During_state_I(context);
break;
			
			      	case _AABORTED3:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During_state_Aaborted3(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During_state_I(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    iface.cPVARP += iface.deltaT;
    context.delayedEnabled = false;
  }
  else if (iface._Pacemaker_local__Atrig3) { // Transition wPVARP (Priority 1) -> dPVARP (228274700)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_DuringStates._AABORTED3;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_During_state_Aaborted3(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Main_region_DuringContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State wPVARP (-759267811)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state_Done(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State wPVARP (-759267811)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state__EA_Init1(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1Context context) {
  iface.PVARP = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1States.__EA_C24;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1_state__EA_C24(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1Context context) {
  iface._Pacemaker_local__Atrig3 = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statewPVARP_region_Entry1States._MAIN9;
    // Transition wPVARP (Priority 1) -> dPVARP (228274700)
}
			
/**
 * State dPVARP (-1303221680)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3States.__EA_INIT16;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPStates.DPVARPRUNNING;
}

/**
 * State dPVARP (-1303221680)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3.threadStatus == ThreadStatus.TERMINATED) {  // Transition dPVARP (Priority 1) -> wPVARP (-843837242)
    iface._taken_transitions[4] += 1;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARPStates.WPVARP;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case __EA_MAIN12:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main(context);
      		// Superstate: intended fall-through 

		case __EA_MAIN12RUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_running(context);
break;
			
			      	case __EA_INIT16:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Init(context);
break;
			
			      	case __EA_DONE17:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Done(context);
break;
			
			      	case __EA_C25:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_C25(context);
break;
			
    }
  }
}
			
/**
 * State dPVARP (-1303221680)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3Context context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_DuringStates._I13;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1States._I14;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3States._ARUN3;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3States.__EA_MAIN12RUNNING;
}

/**
 * State dPVARP (-1303221680)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3Context context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3.threadStatus == ThreadStatus.TERMINATED) { 
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3States.__EA_DONE17;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During.delayedEnabled = true;
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1.delayedEnabled = true;
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I13:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During_state_I(context);
break;
			
			      	case _AABORTED4:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During_state_Aaborted4(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During_state_I(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    iface.cPVARP += iface.deltaT;
    context.delayedEnabled = false;
  }
  else if (iface._Pacemaker_local__Atrig4) { // Transition dPVARP (Priority 1) -> wPVARP (-843837242)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_DuringStates._AABORTED4;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During_state_Aaborted4(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_DuringContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I14:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1_state_I(context);
break;
			
			      	case _S15:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1_state_S(context);
break;
			
			      	case _AABORTED5:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1_state_Aaborted5(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1_state_I(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1Context context) {
  if (iface.cPVARP < 250.0) { 
    iface.sleepT = (iface.sleepT < 250.0 - iface.cPVARP) ? iface.sleepT : 250.0 - iface.cPVARP;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1States._S15;
  }
  else if (iface._Pacemaker_local__Atrig4) { // Transition dPVARP (Priority 1) -> wPVARP (-843837242)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1States._AABORTED5;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1_state_S(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1Context context) {
  if (context.delayedEnabled) { 
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1States._I14;
  }
  else if (iface._Pacemaker_local__Atrig4) { // Transition dPVARP (Priority 1) -> wPVARP (-843837242)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1States._AABORTED5;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1_state_Aaborted5(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_During1Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _ARUN3:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3_state_ARun3(context);
break;
			
			      	case _ADONE3:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3_state_ADone3(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3_state_ARun3(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3Context context) {
  if (context.delayedEnabled && (iface.cPVARP >= 250)) {  // Transition dPVARP (Priority 1) -> wPVARP (-843837242)
    iface._Pacemaker_local__Atrig4 = true;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3States._ADONE3;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3_state_ADone3(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Main_region_ACtrl3Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State dPVARP (-1303221680)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Init(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3Context context) {
  iface.cPVARP = 0;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3States.__EA_C25;
}
			
/**
 * State dPVARP (-1303221680)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_Done(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3_state__EA_C25(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3Context context) {
  iface._Pacemaker_local__Atrig4 = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionPVARP_statedPVARP_region__EA_Entry3States.__EA_MAIN12;
    // Transition dPVARP (Priority 1) -> wPVARP (-843837242)
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case WVRP:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP(context);
      		// Superstate: intended fall-through 

		case WVRPRUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_running(context);
break;
			
			      	case DVRP:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP(context);
      		// Superstate: intended fall-through 

		case DVRPRUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_running(context);
break;
			
    }
  }
}
			
/**
 * State wVRP (-1814822253)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2States.__EA_INIT2;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPStates.WVRPRUNNING;
}

/**
 * State wVRP (-1814822253)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2.threadStatus == ThreadStatus.TERMINATED) {  // Transition wVRP (Priority 1) -> dVRP (-1142702324)
    iface._taken_transitions[5] += 1;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPStates.DVRP;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _MAIN18:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main(context);
      		// Superstate: intended fall-through 

		case _MAIN18RUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_running(context);
break;
			
			      	case _DONE20:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Done(context);
break;
			
			      	case __EA_INIT2:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state__EA_Init2(context);
break;
			
			      	case __EA_C26:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state__EA_C26(context);
break;
			
    }
  }
}
			
/**
 * State wVRP (-1814822253)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2Context context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4States._ARUN4;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_DuringStates._I19;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2States._MAIN18RUNNING;
}

/**
 * State wVRP (-1814822253)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2Context context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During.threadStatus == ThreadStatus.TERMINATED) { 
    iface.VRP = true;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2States._DONE20;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4.delayedEnabled = true;
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _ARUN4:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4_state_ARun4(context);
break;
			
			      	case _ADONE4:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4_state_ADone4(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4_state_ARun4(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4Context context) {
  if (context.delayedEnabled && (iface.eAVI)) {  // Transition wVRP (Priority 1) -> dVRP (-1142702324)
    iface._Pacemaker_local__Atrig5 = true;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4States._ADONE4;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4_state_ADone4(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_ACtrl4Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I19:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During_state_I(context);
break;
			
			      	case _AABORTED6:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During_state_Aaborted6(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During_state_I(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    iface.cVRP += iface.deltaT;
    context.delayedEnabled = false;
  }
  else if (iface._Pacemaker_local__Atrig5) { // Transition wVRP (Priority 1) -> dVRP (-1142702324)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_DuringStates._AABORTED6;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_During_state_Aaborted6(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Main_region_DuringContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State wVRP (-1814822253)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state_Done(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State wVRP (-1814822253)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state__EA_Init2(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2Context context) {
  iface.VRP = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2States.__EA_C26;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2_state__EA_C26(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2Context context) {
  iface._Pacemaker_local__Atrig5 = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statewVRP_region_Entry2States._MAIN18;
    // Transition wVRP (Priority 1) -> dVRP (-1142702324)
}
			
/**
 * State dVRP (-1815388282)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4States.__EA_INIT25;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPStates.DVRPRUNNING;
}

/**
 * State dVRP (-1815388282)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4.threadStatus == ThreadStatus.TERMINATED) {  // Transition dVRP (Priority 1) -> wVRP (1752490694)
    iface._taken_transitions[6] += 1;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRPStates.WVRP;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case __EA_MAIN21:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main(context);
      		// Superstate: intended fall-through 

		case __EA_MAIN21RUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_running(context);
break;
			
			      	case __EA_INIT25:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Init(context);
break;
			
			      	case __EA_DONE26:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Done(context);
break;
			
			      	case __EA_C27:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_C27(context);
break;
			
    }
  }
}
			
/**
 * State dVRP (-1815388282)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4Context context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_DuringStates._I22;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2States._I23;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5States._ARUN5;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4States.__EA_MAIN21RUNNING;
}

/**
 * State dVRP (-1815388282)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4Context context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5.threadStatus == ThreadStatus.TERMINATED) { 
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4States.__EA_DONE26;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During.delayedEnabled = true;
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2.delayedEnabled = true;
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I22:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During_state_I(context);
break;
			
			      	case _AABORTED7:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During_state_Aaborted7(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During_state_I(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    iface.cVRP += iface.deltaT;
    context.delayedEnabled = false;
  }
  else if (iface._Pacemaker_local__Atrig6) { // Transition dVRP (Priority 1) -> wVRP (1752490694)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_DuringStates._AABORTED7;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During_state_Aaborted7(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_DuringContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I23:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2_state_I(context);
break;
			
			      	case _S24:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2_state_S(context);
break;
			
			      	case _AABORTED8:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2_state_Aaborted8(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2_state_I(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2Context context) {
  if (iface.cVRP < 320.0) { 
    iface.sleepT = (iface.sleepT < 320.0 - iface.cVRP) ? iface.sleepT : 320.0 - iface.cVRP;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2States._S24;
  }
  else if (iface._Pacemaker_local__Atrig6) { // Transition dVRP (Priority 1) -> wVRP (1752490694)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2States._AABORTED8;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2_state_S(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2Context context) {
  if (context.delayedEnabled) { 
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2States._I23;
  }
  else if (iface._Pacemaker_local__Atrig6) { // Transition dVRP (Priority 1) -> wVRP (1752490694)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2States._AABORTED8;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2_state_Aaborted8(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_During2Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _ARUN5:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5_state_ARun5(context);
break;
			
			      	case _ADONE5:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5_state_ADone5(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5_state_ARun5(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5Context context) {
  if (context.delayedEnabled && (iface.cVRP >= 320)) {  // Transition dVRP (Priority 1) -> wVRP (1752490694)
    iface._Pacemaker_local__Atrig6 = true;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5States._ADONE5;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5_state_ADone5(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Main_region_ACtrl5Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State dVRP (-1815388282)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Init(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4Context context) {
  iface.cVRP = 0;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4States.__EA_C27;
}
			
/**
 * State dVRP (-1815388282)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_Done(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4_state__EA_C27(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4Context context) {
  iface._Pacemaker_local__Atrig6 = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionVRP_statedVRP_region__EA_Entry4States.__EA_MAIN21;
    // Transition dVRP (Priority 1) -> wVRP (1752490694)
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case WAEI:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI(context);
      		// Superstate: intended fall-through 

		case WAEIRUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_running(context);
break;
			
			      	case DAEI:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI(context);
      		// Superstate: intended fall-through 

		case DAEIRUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_running(context);
break;
			
			      	case _AC7:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_state_AC7(context);
break;
			
    }
  }
}
			
/**
 * State wAEI (-1932664715)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3States.__EA_INIT3;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIStates.WAEIRUNNING;
}

/**
 * State wAEI (-1932664715)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3.threadStatus == ThreadStatus.TERMINATED) {  // Transition wAEI (Priority 1) -> dAEI (1485382860)
    iface._taken_transitions[7] += 1;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIStates.DAEI;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _MAIN27:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main(context);
      		// Superstate: intended fall-through 

		case _MAIN27RUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_running(context);
break;
			
			      	case _DONE29:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Done(context);
break;
			
			      	case __EA_INIT3:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state__EA_Init3(context);
break;
			
			      	case __EA_C28:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state__EA_C28(context);
break;
			
    }
  }
}
			
/**
 * State wAEI (-1932664715)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3Context context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6States._ARUN6;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_DuringStates._I28;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3States._MAIN27RUNNING;
}

/**
 * State wAEI (-1932664715)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3Context context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During.threadStatus == ThreadStatus.TERMINATED) { 
    iface.AEI = true;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3States._DONE29;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6.delayedEnabled = true;
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _ARUN6:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6_state_ARun6(context);
break;
			
			      	case _ADONE6:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6_state_ADone6(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6_state_ARun6(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6Context context) {
  if (context.delayedEnabled && (iface.eAVI)) {  // Transition wAEI (Priority 1) -> dAEI (1485382860)
    iface._Pacemaker_local__Atrig7 = true;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6States._ADONE6;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6_state_ADone6(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_ACtrl6Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I28:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During_state_I(context);
break;
			
			      	case _AABORTED9:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During_state_Aaborted9(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During_state_I(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    iface.cAEI += iface.deltaT;
    context.delayedEnabled = false;
  }
  else if (iface._Pacemaker_local__Atrig7) { // Transition wAEI (Priority 1) -> dAEI (1485382860)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_DuringStates._AABORTED9;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_During_state_Aaborted9(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Main_region_DuringContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State wAEI (-1932664715)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state_Done(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State wAEI (-1932664715)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state__EA_Init3(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3Context context) {
  iface.AEI = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3States.__EA_C28;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3_state__EA_C28(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3Context context) {
  iface._Pacemaker_local__Atrig7 = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statewAEI_region_Entry3States._MAIN27;
    // Transition wAEI (Priority 1) -> dAEI (1485382860)
}
			
/**
 * State dAEI (-1933230744)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5States.__EA_INIT34;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIStates.DAEIRUNNING;
}

/**
 * State dAEI (-1933230744)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5.threadStatus == ThreadStatus.TERMINATED) {  // Transition dAEI (Priority 1) -> wAEI (85608582)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIStates._AC7;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case __EA_MAIN30:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main(context);
      		// Superstate: intended fall-through 

		case __EA_MAIN30RUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_running(context);
break;
			
			      	case __EA_INIT34:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Init(context);
break;
			
			      	case __EA_DONE35:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Done(context);
break;
			
			      	case __EA_C29:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_C29(context);
break;
			
			      	case __EA_C30:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_C30(context);
break;
			
    }
  }
}
			
/**
 * State dAEI (-1933230744)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5Context context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_DuringStates._I31;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3States._I32;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3.threadStatus = ThreadStatus.READY;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7States._ARUN7;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5States.__EA_MAIN30RUNNING;
}

/**
 * State dAEI (-1933230744)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5Context context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3.threadStatus = ThreadStatus.RUNNING;
}
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3);
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3.threadStatus == ThreadStatus.TERMINATED && 
      context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7.threadStatus == ThreadStatus.TERMINATED) { 
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5States.__EA_DONE35;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During.delayedEnabled = true;
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3.delayedEnabled = true;
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I31:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During_state_I(context);
break;
			
			      	case _AABORTED10:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During_state_Aaborted10(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During_state_I(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    iface.cAEI += iface.deltaT;
    context.delayedEnabled = false;
  }
  else if (iface._Pacemaker_local__Atrig8 || iface._Pacemaker_local__Atrig9) { // Transition dAEI (Priority 1) -> wAEI (85608582)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_DuringStates._AABORTED10;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During_state_Aaborted10(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_DuringContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I32:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3_state_I(context);
break;
			
			      	case _S33:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3_state_S(context);
break;
			
			      	case _AABORTED11:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3_state_Aaborted11(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3_state_I(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3Context context) {
  if (iface.cAEI < 150.0) { 
    iface.sleepT = (iface.sleepT < 150.0 - iface.cAEI) ? iface.sleepT : 150.0 - iface.cAEI;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3States._S33;
  }
  else if (iface._Pacemaker_local__Atrig8 || iface._Pacemaker_local__Atrig9) { // Transition dAEI (Priority 1) -> wAEI (85608582)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3States._AABORTED11;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3_state_S(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3Context context) {
  if (context.delayedEnabled) { 
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3States._I32;
  }
  else if (iface._Pacemaker_local__Atrig8 || iface._Pacemaker_local__Atrig9) { // Transition dAEI (Priority 1) -> wAEI (85608582)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3States._AABORTED11;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3_state_Aaborted11(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_During3Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _ARUN7:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7_state_ARun7(context);
break;
			
			      	case _ADONE7:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7_state_ADone7(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7_state_ARun7(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7Context context) {
  if (context.delayedEnabled && (iface.cAEI >= 150)) {  // Transition dAEI (Priority 1) -> wAEI (85608582)
    iface._Pacemaker_local__Atrig8 = true;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7States._ADONE7;
  }
  else if (context.delayedEnabled && (iface.AS)) { // Transition dAEI (Priority 2) -> wAEI (85608583)
    iface._Pacemaker_local__Atrig9 = true;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7States._ADONE7;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7_state_ADone7(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Main_region_ACtrl7Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State dAEI (-1933230744)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Init(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5Context context) {
  iface.cAEI = 0;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5States.__EA_C29;
}
			
/**
 * State dAEI (-1933230744)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_Done(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_C29(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5Context context) {
  iface._Pacemaker_local__Atrig8 = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5States.__EA_C30;
    // Transition dAEI (Priority 1) -> wAEI (85608582)
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5_state__EA_C30(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5Context context) {
  iface._Pacemaker_local__Atrig9 = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_statedAEI_region__EA_Entry5States.__EA_MAIN30;
    // Transition dAEI (Priority 2) -> wAEI (85608583)
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEI_state_AC7(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIContext context) {
  if (iface._Pacemaker_local__Atrig8) {  // Transition dAEI (Priority 1) -> wAEI (85608582)
    iface.AP |= true;
    iface._taken_transitions[8] += 1;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIStates.WAEI;
  }
  else { // Transition dAEI (Priority 2) -> wAEI (85608583)
    iface.eAEI |= true;
    iface._taken_transitions[9] += 1;
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionAEIStates.WAEI;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case WLRI:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI(context);
      		// Superstate: intended fall-through 

		case WLRIRUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_running(context);
break;
			
			      	case DLRI:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI(context);
      		// Superstate: intended fall-through 

		case DLRIRUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_running(context);
break;
			
			      	case _EXITOPTION:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_state_ExitOption(context);
break;
			
    }
  }
}
			
/**
 * State wLRI (812955825)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitStates.__EA_INIT4;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIStates.WLRIRUNNING;
}

/**
 * State wLRI (812955825)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit.threadStatus == ThreadStatus.TERMINATED) { 
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIStates._EXITOPTION;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _INIT:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit_state_Init(context);
break;
			
			      	case _DONE36:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit_state_Done(context);
break;
			
			      	case _MEMORIZE:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit_state_Memorize(context);
break;
			
			      	case __EA_INIT4:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit_state__EA_Init4(context);
break;
			
    }
  }
}
			
/**
 * State wLRI (812955825)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit_state_Init(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitContext context) {
  if (context.delayedEnabled && (iface.eAVI)) {  // Transition wLRI (Priority 1) -> dLRI (1056954700)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitStates._MEMORIZE;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
/**
 * State wLRI (812955825)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit_state_Done(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State wLRI (812955825)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit_state_Memorize(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitContext context) {
  iface.LRI = true;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitStates._DONE36;
}
			
/**
 * State wLRI (812955825)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_Exit_state__EA_Init4(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitContext context) {
  iface.LRI = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statewLRI_region_ExitStates._INIT;
}
			
/**
 * State dLRI (812389796)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_Entry.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_EntryStates.__EA_INIT37;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_Entry.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIStates.DLRIRUNNING;
}

/**
 * State dLRI (812389796)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_Entry.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_Entry.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_Entry(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_Entry);
  context.threadStatus = ThreadStatus.READY;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_Entry(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_EntryContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case __EA_INIT37:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_Entry_state__EA_Init(context);
break;
			
			      	case __EA_DONE38:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_Entry_state__EA_Done(context);
break;
			
    }
  }
}
			
/**
 * State dLRI (812389796)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_Entry_state__EA_Init(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_EntryContext context) {
  iface.cLRI = 0;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_EntryStates.__EA_DONE38;
}
			
/**
 * State dLRI (812389796)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_Entry_state__EA_Done(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_statedLRI_region__EA_EntryContext context) {
  context.threadStatus = ThreadStatus.READY;
}
			
/**
 * State wLRI (812955825)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRI_state_ExitOption(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIContext context) {
  iface._taken_transitions[10] += 1;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionLRIStates.DLRI;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case WURI:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI(context);
      		// Superstate: intended fall-through 

		case WURIRUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_running(context);
break;
			
			      	case DURI:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI(context);
      		// Superstate: intended fall-through 

		case DURIRUNNING:
		  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_running(context);
break;
			
			      	case _EXITOPTION1:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_state_ExitOption1(context);
break;
			
    }
  }
}
			
/**
 * State wURI (-1827662589)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitStates.__EA_INIT5;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit.delayedEnabled = false;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIStates.WURIRUNNING;
}

/**
 * State wURI (-1827662589)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit);
  if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit.threadStatus == ThreadStatus.TERMINATED) { 
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIStates._EXITOPTION1;
  } else {
    context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _INIT39:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit_state_Init(context);
break;
			
			      	case _DONE40:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit_state_Done(context);
break;
			
			      	case _MEMORIZE41:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit_state_Memorize(context);
break;
			
			      	case __EA_INIT5:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit_state__EA_Init5(context);
break;
			
    }
  }
}
			
/**
 * State wURI (-1827662589)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit_state_Init(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitContext context) {
  if (context.delayedEnabled && (iface.eAVI)) {  // Transition wURI (Priority 1) -> dURI (1774838028)
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitStates._MEMORIZE41;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
/**
 * State wURI (-1827662589)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit_state_Done(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State wURI (-1827662589)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit_state_Memorize(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitContext context) {
  iface.URI = true;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitStates._DONE40;
}
			
/**
 * State wURI (-1827662589)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_Exit_state__EA_Init5(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitContext context) {
  iface.URI = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statewURI_region_ExitStates._INIT39;
}
			
/**
 * State dURI (-1828228618)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIContext context) {
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_Entry.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_EntryStates.__EA_INIT42;
context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_Entry.threadStatus = ThreadStatus.READY;

  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIStates.DURIRUNNING;
}

/**
 * State dURI (-1828228618)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_running(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIContext context) {
if (context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_Entry.threadStatus != ThreadStatus.TERMINATED) {
  context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_Entry.threadStatus = ThreadStatus.RUNNING;
}
Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_Entry(context.Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_Entry);
  context.threadStatus = ThreadStatus.READY;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_Entry(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_EntryContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case __EA_INIT42:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_Entry_state__EA_Init(context);
break;
			
			      	case __EA_DONE43:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_Entry_state__EA_Done(context);
break;
			
    }
  }
}
			
/**
 * State dURI (-1828228618)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_Entry_state__EA_Init(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_EntryContext context) {
  iface.cURI = 0;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_EntryStates.__EA_DONE43;
}
			
/**
 * State dURI (-1828228618)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_Entry_state__EA_Done(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_statedURI_region__EA_EntryContext context) {
  context.threadStatus = ThreadStatus.READY;
}
			
/**
 * State wURI (-1827662589)
 */
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURI_state_ExitOption1(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIContext context) {
  iface._taken_transitions[11] += 1;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionURIStates.DURI;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I44:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During_state_I(context);
break;
			
			      	case _S45:
			      	  Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During_state_S(context);
break;
			
    }
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During_state_I(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringContext context) {
  iface.sleepT = 1000.0;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringStates._S45;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During_state_S(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    context.delayedEnabled = false;
    context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringStates._I44;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Init(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context context) {
  iface._taken_transitions[0] = 0;
  iface._taken_transitions[1] = 0;
  iface._taken_transitions[2] = 0;
  iface._taken_transitions[3] = 0;
  iface._taken_transitions[4] = 0;
  iface._taken_transitions[5] = 0;
  iface._taken_transitions[6] = 0;
  iface._taken_transitions[7] = 0;
  iface._taken_transitions[8] = 0;
  iface._taken_transitions[9] = 0;
  iface._taken_transitions[10] = 0;
  iface._taken_transitions[11] = 0;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1States.__EA_MAIN1;
}
			
private void Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Done(Pacemaker_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State Pacemaker (-1786282077)
 */
private void Pacemaker_region__EA_Entry_state__EA_Init(Pacemaker_region__EA_EntryContext context) {
  iface.AVI = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C;
}
			
/**
 * State Pacemaker (-1786282077)
 */
private void Pacemaker_region__EA_Entry_state__EA_Done(Pacemaker_region__EA_EntryContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C(Pacemaker_region__EA_EntryContext context) {
  iface.PVARP = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C1;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C1(Pacemaker_region__EA_EntryContext context) {
  iface.VRP = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C2;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C2(Pacemaker_region__EA_EntryContext context) {
  iface.AEI = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C3;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C3(Pacemaker_region__EA_EntryContext context) {
  iface.LRI = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C4;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C4(Pacemaker_region__EA_EntryContext context) {
  iface.URI = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C5;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C5(Pacemaker_region__EA_EntryContext context) {
  iface.cAVI = 0.0;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C6;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C6(Pacemaker_region__EA_EntryContext context) {
  iface.cPVARP = 0.0;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C7;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C7(Pacemaker_region__EA_EntryContext context) {
  iface.cVRP = 0.0;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C8;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C8(Pacemaker_region__EA_EntryContext context) {
  iface.cAEI = 0.0;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C9;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C9(Pacemaker_region__EA_EntryContext context) {
  iface.cLRI = 0.0;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C10;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C10(Pacemaker_region__EA_EntryContext context) {
  iface.cURI = 0.0;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C11;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C11(Pacemaker_region__EA_EntryContext context) {
  iface.deltaT = 0.0;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C12;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C12(Pacemaker_region__EA_EntryContext context) {
  iface.sleepT = 0.0;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C13;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C13(Pacemaker_region__EA_EntryContext context) {
  iface.AP = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C14;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C14(Pacemaker_region__EA_EntryContext context) {
  iface.VP = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C15;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C15(Pacemaker_region__EA_EntryContext context) {
  iface.eAVI = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C16;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C16(Pacemaker_region__EA_EntryContext context) {
  iface.ePVARP = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C17;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C17(Pacemaker_region__EA_EntryContext context) {
  iface.eVRP = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C18;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C18(Pacemaker_region__EA_EntryContext context) {
  iface.eAEI = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C19;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C19(Pacemaker_region__EA_EntryContext context) {
  iface.eLRI = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_C20;
}
			
private void Pacemaker_region__EA_Entry_state__EA_C20(Pacemaker_region__EA_EntryContext context) {
  iface.eURI = false;
  context.delayedEnabled = false;
  context.activeState = Pacemaker_region__EA_EntryStates.__EA_MAIN;
}
			

  public void init() {
  reset();
  tick();
  }

  public void reset() {
  rootContext.Pacemaker_region__EA_Entry.activeState = Pacemaker_region__EA_EntryStates.__EA_INIT48;
  rootContext.Pacemaker_region__EA_Entry.threadStatus = ThreadStatus.READY;

    rootContext.threadStatus = ThreadStatus.READY;
  }

  public void tick() {
  if (rootContext.threadStatus == ThreadStatus.TERMINATED) return;

    Pacemaker_root(rootContext);
  }
  
  public String getCurrentState() {
  return rootContext.getCurrentState().distinct().collect(Collectors.joining(","));
  }

  public Pacemaker() {
  this.iface = new Iface();
  this.rootContext = new TickData();
  }

}
