/**
 * Playing with some very simple Objects in Java
 * Starting with one of my favorite Objects (Aircraft) building
 * a number of Objects using inheritance
 *
 * @author  Glenn Antoine
 * @version 1.0
 * @since   2018-05-02
 */

public class SingleEngine extends Aircraft {

    /**
     * Single Engine Constructor
     * @param manufacturer
     * @param model
     * @param year
     * @param engineType
     * @param numberEngines
     */
    public SingleEngine(String manufacturer, String model, int year, String engineType, Integer numberEngines) {
        super(manufacturer, model, year, engineType, numberEngines);
    }

}
