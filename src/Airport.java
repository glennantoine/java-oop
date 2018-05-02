/**
 * Playing with some very simple Objects in Java
 * Starting with one of my favorite Objects (Aircraft) building
 * a number of Objects using inheritance
 */

public class Airport {

    public static void main(String[] args){

        SingleEngine cherokee = new SingleEngine("Piper", "Cherokee", 1963, "piston", 1);

        cherokee.startEngine(1);

        cherokee.startEngine(2);

        flyAircraft(cherokee, "KOKK", "KFRH");

        cherokee.stopEngine(1);
    }

    public static void flyAircraft(Aircraft aircraft, String origin, String destination){

        aircraft.flyAircraft(origin, destination);
    }

}
