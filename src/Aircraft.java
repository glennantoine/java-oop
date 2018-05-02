import java.util.*;

public abstract class Aircraft {

    String manufacturer;
    String model;
    int year;
    String engineType;
    Integer numberEngines;
    private ArrayList runningEngine;

    public Aircraft(    String manufacturer, String model, int year, String engineType, Integer numberEngines){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.engineType = engineType;
        this.numberEngines = numberEngines;

        this.runningEngine = new ArrayList<Integer>();
    }

    public void startEngine(int engineNumber){

        if(engineNumber > numberEngines){
            System.err.println("Invalid Engine Selection");
            return;
        }
        this.runningEngine.add(engineNumber);
        System.out.println("Starting Engine: " + engineNumber);
    }

    public void stopEngine(int engineNumber){
        if(engineNumber > numberEngines && !this.runningEngine.contains(engineNumber)){
            System.err.println("Invalid Engine Selection");
            return;
        }

        this.runningEngine.remove(Integer.valueOf(engineNumber));
        System.out.println("Stopping Engine: " + engineNumber);
    }

    public void flyAircraft(String origin, String destination){
        if(runningEngine.isEmpty()){
            System.out.println("Start Your Engines");
        }
        System.out.println("Flying a " + this.manufacturer + " " +
                            this.model + " from " + origin + " to " + destination);
    }

}
