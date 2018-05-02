/**
 * Playing with some very simple Objects in Java
 * Starting with one of my favorite Objects (Aircraft) building
 * a number of Objects using inheritance
 *
 * @author  Glenn Antoine
 * @version 1.0
 * @since   2018-05-02
 */
import java.util.*;


public abstract class Aircraft {

    String manufacturer;
    String model;
    int year;
    String engineType;
    Integer numberEngines;
    private ArrayList runningEngine;

    /**
     * Aircraft Constructor
     * @param manufacturer
     * @param model
     * @param year
     * @param engineType
     * @param numberEngines
     */
    public Aircraft(    String manufacturer, String model, int year, String engineType, Integer numberEngines){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.engineType = engineType;
        this.numberEngines = numberEngines;

        this.runningEngine = new ArrayList<Integer>();
    }

    /**
     * Start Engine Method
     * @param engineNumber
     */
    public void startEngine(int engineNumber){

        if(engineNumber > numberEngines){
            System.err.println("Invalid Engine Selection");
            return;
        }
        this.runningEngine.add(engineNumber);
        System.out.println("Starting Engine: " + engineNumber);
    }

    /**
     * Stop Engine Method
     * @param engineNumber
     */
    public void stopEngine(int engineNumber){
        if(engineNumber > numberEngines && !this.runningEngine.contains(engineNumber)){
            System.err.println("Invalid Engine Selection");
            return;
        }

        this.runningEngine.remove(Integer.valueOf(engineNumber));
        System.out.println("Stopping Engine: " + engineNumber);
    }

    /**
     * Fly the Aircraft
     * @param origin
     * @param destination
     */
    public void flyAircraft(String origin, String destination){
        if(runningEngine.isEmpty()){
            System.out.println("Start Your Engines");
        }
        System.out.println("Flying a " + this.manufacturer + " " +
                            this.model + " from " + origin + " to " + destination);
    }

}
