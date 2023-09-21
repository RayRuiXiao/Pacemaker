/*
 * Automatically generated Java code by
 * KIELER SCCharts - The Key to Efficient Modeling
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 */

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class TrafficLight {

  public Iface iface;
  private TickData rootContext;
  
  public static final String ORIGINAL_SCCHART = "/Users/joshua/Documents/GitHub/COMPSYS-303-Pacemaker/SCChart/rgb.sctx";
  

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
  double x;
  int _taken_transitions[] = new int[5];
  double deltaT; // Input
  double sleepT; // Output
  boolean pedestrian; // Input
  boolean sigG; // Output
  boolean sigY; // Output
  boolean sigR; // Output
  boolean _TrafficLight_local__Atrig;
  boolean _TrafficLight_local__Atrig1;
  boolean _TrafficLight_local__Atrig2;
  boolean _TrafficLight_local__Atrig3;
  boolean _TrafficLight_local__Atrig4;
}
			
  /**
 * Runtime data for the root level program
 */
  public static class TickData {
    ThreadStatus threadStatus;

TrafficLight_region__EA_EntryContext TrafficLight_region__EA_Entry = new TrafficLight_region__EA_EntryContext();
    
    public Stream<String> getCurrentState() {
  return Stream.of(
      TrafficLight_region__EA_Entry.getCurrentState()
    ).flatMap(i -> i);
    }
  }

	  /**
	   * Enumeration for all states of the __EA_Entry region
	   */
	  public enum TrafficLight_region__EA_EntryStates {
	  __EA_MAIN("State TrafficLight (1371947591)"), __EA_MAINRUNNING("State TrafficLight (1371947591)"), __EA_INIT26("State TrafficLight (1371947591)"), __EA_DONE27("State TrafficLight (1371947591)"), __EA_C(""), __EA_C1(""), __EA_C2(""), __EA_C3(""), __EA_C4("");

	private String origin;

	TrafficLight_region__EA_EntryStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region __EA_Entry
	 */
	public static class TrafficLight_region__EA_EntryContext {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_EntryStates activeState;
	  boolean delayedEnabled;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_DuringContext TrafficLight_region__EA_Entry_state__EA_Main_region_During = new TrafficLight_region__EA_Entry_state__EA_Main_region_DuringContext();
	  TrafficLight_region__EA_Entry_state__EA_Main_region_mainContext TrafficLight_region__EA_Entry_state__EA_Main_region_main = new TrafficLight_region__EA_Entry_state__EA_Main_region_mainContext();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case __EA_MAIN:
	    case __EA_MAINRUNNING:
	      return Stream.of(
	          TrafficLight_region__EA_Entry_state__EA_Main_region_During.getCurrentState(),
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_DuringStates {
	  _I(""), _S("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_DuringStates activeState;
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
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_mainStates {
	  _MAIN(""), _MAINRUNNING("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_mainStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _main
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_mainContext {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_mainStates activeState;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1 = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case _MAIN:
	    case _MAINRUNNING:
	      return Stream.of(
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the __EA_Entry1 region
	   */
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1States {
	  __EA_MAIN1(""), __EA_MAIN1RUNNING(""), __EA_INIT24(""), __EA_DONE25("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region __EA_Entry1
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1States activeState;
	  boolean delayedEnabled;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringContext TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringContext();
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0Context TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0 = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case __EA_MAIN1:
	    case __EA_MAIN1RUNNING:
	      return Stream.of(
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.getCurrentState(),
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringStates {
	  _I2(""), _S3("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringStates activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the  region
	   */
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0States {
	  RED("State red (940566956)"), REDRUNNING("State red (940566956)"), GREEN("State green (1931945310)"), GREENRUNNING("State green (1931945310)"), YELLOW("State yellow (264296825)"), YELLOWRUNNING("State yellow (264296825)"), PENDING("State pending (207271218)"), PENDINGRUNNING("State pending (207271218)"), _AC1("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region 
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0Context {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0States activeState;
	  boolean delayedEnabled;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2Context TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2 = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2Context();
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3Context TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3 = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3Context();
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4Context TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4 = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4Context();
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5Context TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5 = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case RED:
	    case REDRUNNING:
	      return Stream.of(
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2.getCurrentState()
	        ).flatMap(i -> i);
	    case GREEN:
	    case GREENRUNNING:
	      return Stream.of(
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3.getCurrentState()
	        ).flatMap(i -> i);
	    case YELLOW:
	    case YELLOWRUNNING:
	      return Stream.of(
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4.getCurrentState()
	        ).flatMap(i -> i);
	    case PENDING:
	    case PENDINGRUNNING:
	      return Stream.of(
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the __EA_Entry2 region
	   */
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2States {
	  __EA_MAIN4("State red (940566956)"), __EA_MAIN4RUNNING("State red (940566956)"), __EA_INIT("State red (940566956)"), __EA_DONE("State red (940566956)");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region __EA_Entry2
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2Context {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2States activeState;
	  boolean delayedEnabled;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_DuringContext TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_DuringContext();
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1Context TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1 = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1Context();
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrlContext TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrlContext();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case __EA_MAIN4:
	    case __EA_MAIN4RUNNING:
	      return Stream.of(
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During.getCurrentState(),
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1.getCurrentState(),
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_DuringStates {
	  _I5(""), _AABORTED("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_DuringStates activeState;
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
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1States {
	  _I6(""), _S7(""), _AABORTED1("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1Context {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1States activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _ACtrl region
	   */
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrlStates {
	  _ARUN(""), _ADONE("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrlStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _ACtrl
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrlContext {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrlStates activeState;
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
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3States {
	  __EA_MAIN8("State green (1931945310)"), __EA_MAIN8RUNNING("State green (1931945310)"), __EA_INIT10("State green (1931945310)"), __EA_DONE11("State green (1931945310)"), __EA_C5("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region __EA_Entry3
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3Context {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3States activeState;
	  boolean delayedEnabled;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_DuringContext TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_DuringContext();
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1Context TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1 = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case __EA_MAIN8:
	    case __EA_MAIN8RUNNING:
	      return Stream.of(
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During.getCurrentState(),
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_DuringStates {
	  _I9(""), _AABORTED2("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_DuringStates activeState;
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
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1States {
	  _ARUN1(""), _ADONE1("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _ACtrl1
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1Context {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1States activeState;
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
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4States {
	  __EA_MAIN12("State yellow (264296825)"), __EA_MAIN12RUNNING("State yellow (264296825)"), __EA_INIT16("State yellow (264296825)"), __EA_DONE17("State yellow (264296825)");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region __EA_Entry4
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4Context {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4States activeState;
	  boolean delayedEnabled;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_DuringContext TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_DuringContext();
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2Context TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2 = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2Context();
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2Context TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2 = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case __EA_MAIN12:
	    case __EA_MAIN12RUNNING:
	      return Stream.of(
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During.getCurrentState(),
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2.getCurrentState(),
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_DuringStates {
	  _I13(""), _AABORTED3("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_DuringStates activeState;
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
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2States {
	  _I14(""), _S15(""), _AABORTED4("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2Context {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2States activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _ACtrl2 region
	   */
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2States {
	  _ARUN2(""), _ADONE2("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _ACtrl2
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2Context {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2States activeState;
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
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5States {
	  __EA_MAIN18("State pending (207271218)"), __EA_MAIN18RUNNING("State pending (207271218)"), __EA_INIT22("State pending (207271218)"), __EA_DONE23("State pending (207271218)");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region __EA_Entry5
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5Context {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5States activeState;
	  boolean delayedEnabled;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_DuringContext TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_DuringContext();
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3Context TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3 = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3Context();
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3Context TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3 = new TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3Context();
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    case __EA_MAIN18:
	    case __EA_MAIN18RUNNING:
	      return Stream.of(
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During.getCurrentState(),
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3.getCurrentState(),
	          TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3.getCurrentState()
	        ).flatMap(i -> i);
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

	  /**
	   * Enumeration for all states of the _During region
	   */
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_DuringStates {
	  _I19(""), _AABORTED5("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_DuringStates(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_DuringContext {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_DuringStates activeState;
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
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3States {
	  _I20(""), _S21(""), _AABORTED6("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _During
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3Context {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3States activeState;
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
	  public enum TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3States {
	  _ARUN3(""), _ADONE3("");

	private String origin;

	TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3States(String origin) {
	  this.origin = origin;
	}
	
	public String getOrigin() {
	  return origin;
	}
	}

	/**
	 * The runtime thread data of region _ACtrl3
	 */
	public static class TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3Context {
	  ThreadStatus threadStatus;
	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3States activeState;
	  boolean delayedEnabled;
	  
	  public Stream<String> getCurrentState() {
	    switch (activeState) {
	    default:
	      return Stream.of(activeState.getOrigin());
	    }
	  }
	}

/**
 * State TrafficLight (1371947591)
 */
private void TrafficLight_root(TickData context) {
if (context.TrafficLight_region__EA_Entry.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry.threadStatus = ThreadStatus.RUNNING;
}
TrafficLight_region__EA_Entry(context.TrafficLight_region__EA_Entry);
  context.TrafficLight_region__EA_Entry.delayedEnabled = true;
  context.threadStatus = ThreadStatus.READY;
}
			
private void TrafficLight_region__EA_Entry(TrafficLight_region__EA_EntryContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case __EA_MAIN:
			      	  TrafficLight_region__EA_Entry_state__EA_Main(context);
      		// Superstate: intended fall-through 

		case __EA_MAINRUNNING:
		  TrafficLight_region__EA_Entry_state__EA_Main_running(context);
break;
			
			      	case __EA_INIT26:
			      	  TrafficLight_region__EA_Entry_state__EA_Init(context);
break;
			
			      	case __EA_DONE27:
			      	  TrafficLight_region__EA_Entry_state__EA_Done(context);
break;
			
			      	case __EA_C:
			      	  TrafficLight_region__EA_Entry_state__EA_C(context);
break;
			
			      	case __EA_C1:
			      	  TrafficLight_region__EA_Entry_state__EA_C1(context);
break;
			
			      	case __EA_C2:
			      	  TrafficLight_region__EA_Entry_state__EA_C2(context);
break;
			
			      	case __EA_C3:
			      	  TrafficLight_region__EA_Entry_state__EA_C3(context);
break;
			
			      	case __EA_C4:
			      	  TrafficLight_region__EA_Entry_state__EA_C4(context);
break;
			
    }
  }
}
			
/**
 * State TrafficLight (1371947591)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main(TrafficLight_region__EA_EntryContext context) {
context.TrafficLight_region__EA_Entry_state__EA_Main_region_During.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_DuringStates._I;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_During.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_During.threadStatus = ThreadStatus.READY;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_mainStates._MAIN;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main.threadStatus = ThreadStatus.READY;

  context.activeState = TrafficLight_region__EA_EntryStates.__EA_MAINRUNNING;
}

/**
 * State TrafficLight (1371947591)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_running(TrafficLight_region__EA_EntryContext context) {
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main.threadStatus = ThreadStatus.RUNNING;
}
TrafficLight_region__EA_Entry_state__EA_Main_region_During(context.TrafficLight_region__EA_Entry_state__EA_Main_region_During);
TrafficLight_region__EA_Entry_state__EA_Main_region_main(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main);
  if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_During.threadStatus == ThreadStatus.TERMINATED && 
      context.TrafficLight_region__EA_Entry_state__EA_Main_region_main.threadStatus == ThreadStatus.TERMINATED) { 
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_EntryStates.__EA_DONE27;
  } else {
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_During.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_During(TrafficLight_region__EA_Entry_state__EA_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_During_state_I(context);
break;
			
			      	case _S:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_During_state_S(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_During_state_I(TrafficLight_region__EA_Entry_state__EA_Main_region_DuringContext context) {
  iface.sigG = false;
  iface.sigY = false;
  iface.sigR = false;
  context.delayedEnabled = false;
  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_DuringStates._S;
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_During_state_S(TrafficLight_region__EA_Entry_state__EA_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_DuringStates._I;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main(TrafficLight_region__EA_Entry_state__EA_Main_region_mainContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _MAIN:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main(context);
      		// Superstate: intended fall-through 

		case _MAINRUNNING:
		  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_running(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main(TrafficLight_region__EA_Entry_state__EA_Main_region_mainContext context) {
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1States.__EA_INIT24;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1.threadStatus = ThreadStatus.READY;

  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_mainStates._MAINRUNNING;
}

private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_running(TrafficLight_region__EA_Entry_state__EA_Main_region_mainContext context) {
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1.threadStatus = ThreadStatus.RUNNING;
}
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1);
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1.delayedEnabled = true;
  context.threadStatus = ThreadStatus.READY;
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case __EA_MAIN1:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main(context);
      		// Superstate: intended fall-through 

		case __EA_MAIN1RUNNING:
		  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_running(context);
break;
			
			      	case __EA_INIT24:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Init(context);
break;
			
			      	case __EA_DONE25:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Done(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context context) {
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringStates._I2;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.threadStatus = ThreadStatus.READY;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0States.RED;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0.threadStatus = ThreadStatus.READY;

  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1States.__EA_MAIN1RUNNING;
}

private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_running(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context context) {
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0.threadStatus = ThreadStatus.RUNNING;
}
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During);
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0);
  if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.threadStatus == ThreadStatus.TERMINATED && 
      context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0.threadStatus == ThreadStatus.TERMINATED) { 
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1States.__EA_DONE25;
  } else {
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During.delayedEnabled = true;
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I2:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During_state_I(context);
break;
			
			      	case _S3:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During_state_S(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During_state_I(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringContext context) {
  iface.sleepT = 1000.0;
  context.delayedEnabled = false;
  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringStates._S3;
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_During_state_S(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_region_DuringStates._I2;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case RED:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered(context);
      		// Superstate: intended fall-through 

		case REDRUNNING:
		  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_running(context);
break;
			
			      	case GREEN:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen(context);
      		// Superstate: intended fall-through 

		case GREENRUNNING:
		  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_running(context);
break;
			
			      	case YELLOW:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow(context);
      		// Superstate: intended fall-through 

		case YELLOWRUNNING:
		  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_running(context);
break;
			
			      	case PENDING:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending(context);
      		// Superstate: intended fall-through 

		case PENDINGRUNNING:
		  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_running(context);
break;
			
			      	case _AC1:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_state_AC1(context);
break;
			
    }
  }
}
			
/**
 * State red (940566956)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0Context context) {
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2States.__EA_INIT;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2.threadStatus = ThreadStatus.READY;

  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0States.REDRUNNING;
}

/**
 * State red (940566956)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_running(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0Context context) {
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2.threadStatus = ThreadStatus.RUNNING;
}
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2);
  if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2.threadStatus == ThreadStatus.TERMINATED) {  // Transition red (Priority 1) -> green (277846081)
    iface.x = 0;
    iface.sigG |= true;
    iface._taken_transitions[0] += 1;
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0States.GREEN;
  } else {
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case __EA_MAIN4:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main(context);
      		// Superstate: intended fall-through 

		case __EA_MAIN4RUNNING:
		  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_running(context);
break;
			
			      	case __EA_INIT:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Init(context);
break;
			
			      	case __EA_DONE:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Done(context);
break;
			
    }
  }
}
			
/**
 * State red (940566956)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2Context context) {
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_DuringStates._I5;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During.threadStatus = ThreadStatus.READY;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1States._I6;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1.threadStatus = ThreadStatus.READY;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrlStates._ARUN;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl.threadStatus = ThreadStatus.READY;

  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2States.__EA_MAIN4RUNNING;
}

/**
 * State red (940566956)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_running(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2Context context) {
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1.threadStatus = ThreadStatus.RUNNING;
}
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl.threadStatus = ThreadStatus.RUNNING;
}
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During);
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1);
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl);
  if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During.threadStatus == ThreadStatus.TERMINATED && 
      context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1.threadStatus == ThreadStatus.TERMINATED && 
      context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl.threadStatus == ThreadStatus.TERMINATED) { 
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2States.__EA_DONE;
  } else {
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During.delayedEnabled = true;
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1.delayedEnabled = true;
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I5:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During_state_I(context);
break;
			
			      	case _AABORTED:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During_state_Aaborted(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During_state_I(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    iface.x += iface.deltaT;
    context.delayedEnabled = false;
  }
  else if (iface._TrafficLight_local__Atrig) { // Transition red (Priority 1) -> green (277846081)
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_DuringStates._AABORTED;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During_state_Aaborted(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_DuringContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I6:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1_state_I(context);
break;
			
			      	case _S7:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1_state_S(context);
break;
			
			      	case _AABORTED1:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1_state_Aaborted1(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1_state_I(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1Context context) {
  if (iface.x < 60.0) { 
    iface.sleepT = (iface.sleepT < 60.0 - iface.x) ? iface.sleepT : 60.0 - iface.x;
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1States._S7;
  }
  else if (iface._TrafficLight_local__Atrig) { // Transition red (Priority 1) -> green (277846081)
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1States._AABORTED1;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1_state_S(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1Context context) {
  if (context.delayedEnabled) { 
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1States._I6;
  }
  else if (iface._TrafficLight_local__Atrig) { // Transition red (Priority 1) -> green (277846081)
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1States._AABORTED1;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1_state_Aaborted1(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_During1Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrlContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _ARUN:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl_state_ARun(context);
break;
			
			      	case _ADONE:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl_state_ADone(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl_state_ARun(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrlContext context) {
  if (context.delayedEnabled && (iface.x >= 60)) {  // Transition red (Priority 1) -> green (277846081)
    iface._TrafficLight_local__Atrig = true;
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrlStates._ADONE;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrl_state_ADone(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Main_region_ACtrlContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State red (940566956)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Init(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2Context context) {
  iface._TrafficLight_local__Atrig = false;
  context.delayedEnabled = false;
  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2States.__EA_MAIN4;
    // Transition red (Priority 1) -> green (277846081)
}
			
/**
 * State red (940566956)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2_state__EA_Done(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statered_region__EA_Entry2Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State green (1931945310)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0Context context) {
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3States.__EA_INIT10;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3.threadStatus = ThreadStatus.READY;

  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0States.GREENRUNNING;
}

/**
 * State green (1931945310)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_running(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0Context context) {
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3.threadStatus = ThreadStatus.RUNNING;
}
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3);
  if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3.threadStatus == ThreadStatus.TERMINATED) {  // Transition green (Priority 2) -> yellow (-1861155169)
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0States._AC1;
  } else {
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case __EA_MAIN8:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main(context);
      		// Superstate: intended fall-through 

		case __EA_MAIN8RUNNING:
		  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_running(context);
break;
			
			      	case __EA_INIT10:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Init(context);
break;
			
			      	case __EA_DONE11:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Done(context);
break;
			
			      	case __EA_C5:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_C5(context);
break;
			
    }
  }
}
			
/**
 * State green (1931945310)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3Context context) {
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_DuringStates._I9;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During.threadStatus = ThreadStatus.READY;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1States._ARUN1;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1.threadStatus = ThreadStatus.READY;

  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3States.__EA_MAIN8RUNNING;
}

/**
 * State green (1931945310)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_running(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3Context context) {
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1.threadStatus = ThreadStatus.RUNNING;
}
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During);
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1);
  if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During.threadStatus == ThreadStatus.TERMINATED && 
      context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1.threadStatus == ThreadStatus.TERMINATED) { 
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3States.__EA_DONE11;
  } else {
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During.delayedEnabled = true;
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I9:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During_state_I(context);
break;
			
			      	case _AABORTED2:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During_state_Aaborted2(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During_state_I(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    iface.x += iface.deltaT;
    context.delayedEnabled = false;
  }
  else if (iface._TrafficLight_local__Atrig1 || iface._TrafficLight_local__Atrig2) { // Transition green (Priority 2) -> yellow (-1861155169)
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_DuringStates._AABORTED2;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_During_state_Aaborted2(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_DuringContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _ARUN1:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1_state_ARun1(context);
break;
			
			      	case _ADONE1:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1_state_ADone1(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1_state_ARun1(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1Context context) {
  if (context.delayedEnabled && (iface.pedestrian && iface.x < 60)) {  // Transition green (Priority 1) -> pending (1376594695)
    iface._TrafficLight_local__Atrig1 = true;
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1States._ADONE1;
  }
  else if (context.delayedEnabled && (iface.pedestrian && iface.x >= 60)) { // Transition green (Priority 2) -> yellow (-1861155169)
    iface._TrafficLight_local__Atrig2 = true;
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1States._ADONE1;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1_state_ADone1(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Main_region_ACtrl1Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State green (1931945310)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Init(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3Context context) {
  iface._TrafficLight_local__Atrig1 = false;
  context.delayedEnabled = false;
  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3States.__EA_C5;
    // Transition green (Priority 1) -> pending (1376594695)
}
			
/**
 * State green (1931945310)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_Done(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3_state__EA_C5(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3Context context) {
  iface._TrafficLight_local__Atrig2 = false;
  context.delayedEnabled = false;
  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stategreen_region__EA_Entry3States.__EA_MAIN8;
    // Transition green (Priority 2) -> yellow (-1861155169)
}
			
/**
 * State yellow (264296825)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0Context context) {
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4States.__EA_INIT16;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4.threadStatus = ThreadStatus.READY;

  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0States.YELLOWRUNNING;
}

/**
 * State yellow (264296825)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_running(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0Context context) {
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4.threadStatus = ThreadStatus.RUNNING;
}
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4);
  if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4.threadStatus == ThreadStatus.TERMINATED) {  // Transition yellow (Priority 1) -> red (317769638)
    iface.x = 0;
    iface.sigR |= true;
    iface._taken_transitions[3] += 1;
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0States.RED;
  } else {
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case __EA_MAIN12:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main(context);
      		// Superstate: intended fall-through 

		case __EA_MAIN12RUNNING:
		  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_running(context);
break;
			
			      	case __EA_INIT16:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Init(context);
break;
			
			      	case __EA_DONE17:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Done(context);
break;
			
    }
  }
}
			
/**
 * State yellow (264296825)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4Context context) {
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_DuringStates._I13;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During.threadStatus = ThreadStatus.READY;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2States._I14;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2.threadStatus = ThreadStatus.READY;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2States._ARUN2;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2.threadStatus = ThreadStatus.READY;

  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4States.__EA_MAIN12RUNNING;
}

/**
 * State yellow (264296825)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_running(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4Context context) {
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2.threadStatus = ThreadStatus.RUNNING;
}
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2.threadStatus = ThreadStatus.RUNNING;
}
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During);
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2);
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2);
  if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During.threadStatus == ThreadStatus.TERMINATED && 
      context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2.threadStatus == ThreadStatus.TERMINATED && 
      context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2.threadStatus == ThreadStatus.TERMINATED) { 
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4States.__EA_DONE17;
  } else {
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During.delayedEnabled = true;
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2.delayedEnabled = true;
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I13:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During_state_I(context);
break;
			
			      	case _AABORTED3:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During_state_Aaborted3(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During_state_I(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    iface.x += iface.deltaT;
    context.delayedEnabled = false;
  }
  else if (iface._TrafficLight_local__Atrig3) { // Transition yellow (Priority 1) -> red (317769638)
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_DuringStates._AABORTED3;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During_state_Aaborted3(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_DuringContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I14:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2_state_I(context);
break;
			
			      	case _S15:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2_state_S(context);
break;
			
			      	case _AABORTED4:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2_state_Aaborted4(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2_state_I(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2Context context) {
  if (iface.x < 5.0) { 
    iface.sleepT = (iface.sleepT < 5.0 - iface.x) ? iface.sleepT : 5.0 - iface.x;
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2States._S15;
  }
  else if (iface._TrafficLight_local__Atrig3) { // Transition yellow (Priority 1) -> red (317769638)
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2States._AABORTED4;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2_state_S(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2Context context) {
  if (context.delayedEnabled) { 
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2States._I14;
  }
  else if (iface._TrafficLight_local__Atrig3) { // Transition yellow (Priority 1) -> red (317769638)
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2States._AABORTED4;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2_state_Aaborted4(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_During2Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _ARUN2:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2_state_ARun2(context);
break;
			
			      	case _ADONE2:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2_state_ADone2(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2_state_ARun2(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2Context context) {
  if (context.delayedEnabled && (iface.x >= 5)) {  // Transition yellow (Priority 1) -> red (317769638)
    iface._TrafficLight_local__Atrig3 = true;
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2States._ADONE2;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2_state_ADone2(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Main_region_ACtrl2Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State yellow (264296825)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Init(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4Context context) {
  iface._TrafficLight_local__Atrig3 = false;
  context.delayedEnabled = false;
  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4States.__EA_MAIN12;
    // Transition yellow (Priority 1) -> red (317769638)
}
			
/**
 * State yellow (264296825)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4_state__EA_Done(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_stateyellow_region__EA_Entry4Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State pending (207271218)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0Context context) {
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5States.__EA_INIT22;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5.threadStatus = ThreadStatus.READY;

  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0States.PENDINGRUNNING;
}

/**
 * State pending (207271218)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_running(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0Context context) {
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5.threadStatus = ThreadStatus.RUNNING;
}
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5);
  if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5.threadStatus == ThreadStatus.TERMINATED) {  // Transition pending (Priority 1) -> yellow (-912405494)
    iface.x = 0;
    iface.sigY |= true;
    iface._taken_transitions[4] += 1;
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0States.YELLOW;
  } else {
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case __EA_MAIN18:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main(context);
      		// Superstate: intended fall-through 

		case __EA_MAIN18RUNNING:
		  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_running(context);
break;
			
			      	case __EA_INIT22:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Init(context);
break;
			
			      	case __EA_DONE23:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Done(context);
break;
			
    }
  }
}
			
/**
 * State pending (207271218)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5Context context) {
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_DuringStates._I19;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During.threadStatus = ThreadStatus.READY;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3States._I20;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3.threadStatus = ThreadStatus.READY;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3States._ARUN3;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3.delayedEnabled = false;
context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3.threadStatus = ThreadStatus.READY;

  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5States.__EA_MAIN18RUNNING;
}

/**
 * State pending (207271218)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_running(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5Context context) {
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During.threadStatus = ThreadStatus.RUNNING;
}
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3.threadStatus = ThreadStatus.RUNNING;
}
if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3.threadStatus != ThreadStatus.TERMINATED) {
  context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3.threadStatus = ThreadStatus.RUNNING;
}
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During);
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3);
TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3(context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3);
  if (context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During.threadStatus == ThreadStatus.TERMINATED && 
      context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3.threadStatus == ThreadStatus.TERMINATED && 
      context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3.threadStatus == ThreadStatus.TERMINATED) { 
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5States.__EA_DONE23;
  } else {
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During.delayedEnabled = true;
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3.delayedEnabled = true;
    context.TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3.delayedEnabled = true;
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_DuringContext context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I19:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During_state_I(context);
break;
			
			      	case _AABORTED5:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During_state_Aaborted5(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During_state_I(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_DuringContext context) {
  if (context.delayedEnabled) { 
    iface.x += iface.deltaT;
    context.delayedEnabled = false;
  }
  else if (iface._TrafficLight_local__Atrig4) { // Transition pending (Priority 1) -> yellow (-912405494)
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_DuringStates._AABORTED5;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During_state_Aaborted5(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_DuringContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _I20:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3_state_I(context);
break;
			
			      	case _S21:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3_state_S(context);
break;
			
			      	case _AABORTED6:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3_state_Aaborted6(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3_state_I(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3Context context) {
  if (iface.x < 60.0) { 
    iface.sleepT = (iface.sleepT < 60.0 - iface.x) ? iface.sleepT : 60.0 - iface.x;
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3States._S21;
  }
  else if (iface._TrafficLight_local__Atrig4) { // Transition pending (Priority 1) -> yellow (-912405494)
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3States._AABORTED6;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3_state_S(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3Context context) {
  if (context.delayedEnabled) { 
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3States._I20;
  }
  else if (iface._TrafficLight_local__Atrig4) { // Transition pending (Priority 1) -> yellow (-912405494)
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3States._AABORTED6;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3_state_Aaborted6(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_During3Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3Context context) {
  while (context.threadStatus == ThreadStatus.RUNNING) {
    switch (context.activeState) {
			      	case _ARUN3:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3_state_ARun3(context);
break;
			
			      	case _ADONE3:
			      	  TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3_state_ADone3(context);
break;
			
    }
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3_state_ARun3(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3Context context) {
  if (context.delayedEnabled && (iface.x >= 60)) {  // Transition pending (Priority 1) -> yellow (-912405494)
    iface._TrafficLight_local__Atrig4 = true;
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3States._ADONE3;
  } else {
    context.threadStatus = ThreadStatus.READY;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3_state_ADone3(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Main_region_ACtrl3Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State pending (207271218)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Init(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5Context context) {
  iface._TrafficLight_local__Atrig4 = false;
  context.delayedEnabled = false;
  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5States.__EA_MAIN18;
    // Transition pending (Priority 1) -> yellow (-912405494)
}
			
/**
 * State pending (207271218)
 */
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5_state__EA_Done(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_statepending_region__EA_Entry5Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0_state_AC1(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0Context context) {
  if (iface._TrafficLight_local__Atrig1) {  // Transition green (Priority 1) -> pending (1376594695)
    iface._taken_transitions[1] += 1;
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0States.PENDING;
  }
  else { // Transition green (Priority 2) -> yellow (-1861155169)
    iface.x = 0;
    iface._taken_transitions[2] += 1;
    context.delayedEnabled = false;
    context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Main_regionR0States.YELLOW;
  }
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Init(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context context) {
  iface._taken_transitions[0] = 0;
  iface._taken_transitions[1] = 0;
  iface._taken_transitions[2] = 0;
  iface._taken_transitions[3] = 0;
  iface._taken_transitions[4] = 0;
  context.delayedEnabled = false;
  context.activeState = TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1States.__EA_MAIN1;
}
			
private void TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1_state__EA_Done(TrafficLight_region__EA_Entry_state__EA_Main_region_main_state_main_region__EA_Entry1Context context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
/**
 * State TrafficLight (1371947591)
 */
private void TrafficLight_region__EA_Entry_state__EA_Init(TrafficLight_region__EA_EntryContext context) {
  iface.x = 0.0;
  context.delayedEnabled = false;
  context.activeState = TrafficLight_region__EA_EntryStates.__EA_C;
}
			
/**
 * State TrafficLight (1371947591)
 */
private void TrafficLight_region__EA_Entry_state__EA_Done(TrafficLight_region__EA_EntryContext context) {
  context.threadStatus = ThreadStatus.TERMINATED;
}
			
private void TrafficLight_region__EA_Entry_state__EA_C(TrafficLight_region__EA_EntryContext context) {
  iface.deltaT = 0.0;
  context.delayedEnabled = false;
  context.activeState = TrafficLight_region__EA_EntryStates.__EA_C1;
}
			
private void TrafficLight_region__EA_Entry_state__EA_C1(TrafficLight_region__EA_EntryContext context) {
  iface.sleepT = 0.0;
  context.delayedEnabled = false;
  context.activeState = TrafficLight_region__EA_EntryStates.__EA_C2;
}
			
private void TrafficLight_region__EA_Entry_state__EA_C2(TrafficLight_region__EA_EntryContext context) {
  iface.sigG = false;
  context.delayedEnabled = false;
  context.activeState = TrafficLight_region__EA_EntryStates.__EA_C3;
}
			
private void TrafficLight_region__EA_Entry_state__EA_C3(TrafficLight_region__EA_EntryContext context) {
  iface.sigY = false;
  context.delayedEnabled = false;
  context.activeState = TrafficLight_region__EA_EntryStates.__EA_C4;
}
			
private void TrafficLight_region__EA_Entry_state__EA_C4(TrafficLight_region__EA_EntryContext context) {
  iface.sigR = false;
  context.delayedEnabled = false;
  context.activeState = TrafficLight_region__EA_EntryStates.__EA_MAIN;
}
			

  public void init() {
  reset();
  tick();
  }

  public void reset() {
  rootContext.TrafficLight_region__EA_Entry.activeState = TrafficLight_region__EA_EntryStates.__EA_INIT26;
  rootContext.TrafficLight_region__EA_Entry.threadStatus = ThreadStatus.READY;

    rootContext.threadStatus = ThreadStatus.READY;
  }

  public void tick() {
  if (rootContext.threadStatus == ThreadStatus.TERMINATED) return;

    TrafficLight_root(rootContext);
  }
  
  public String getCurrentState() {
  return rootContext.getCurrentState().distinct().collect(Collectors.joining(","));
  }

  public TrafficLight() {
  this.iface = new Iface();
  this.rootContext = new TickData();
  }

}
