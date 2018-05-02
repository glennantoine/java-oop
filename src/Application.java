/**
 * Playing with some very simple Objects in Java
 * Starting with one of my favorite Objects (Aircraft) building
 * a number of Objects using inheritance
 *
 * @author  Glenn Antoine
 * @version 1.0
 * @since   2018-05-02
 */

public class Application {

    /**
     *
     * @param args
     */
    public static void main(String[] args){

        SingleEngine cherokee = new SingleEngine("Piper", "Cherokee", 1963, "piston", 1);

        cherokee.startEngine(1);

        cherokee.startEngine(2);

        flyAircraft(cherokee, "KOKK", "KFRH");

        cherokee.stopEngine(1);
    }

    /**
     * Base method for flying our aircraft
     *
     * @param aircraft
     * @param origin
     * @param destination
     */
    public static void flyAircraft(Aircraft aircraft, String origin, String destination){

        aircraft.flyAircraft(origin, destination);
    }
}
