
/**
 * controls a heater.
 *
 * @Joe Diaz
 * @version 1.0 (08/22/2017)
 */
public class Heater
{
    // instance variables
    private int temperature;

    /**
     * Constructor for objects of class Heater
     */
    public Heater()
    {
        // initialise instance variables
        temperature = 15;
    }

    /**
     * This method raises the temperature
     */
    public int raiseTemp()
    {
        temperature = temperature + 5;
        return temperature;
    }
    
    /**
     * This method lowers the temperature
     */
    public int lowerTemp()
    {
        temperature = temperature - 5;
        return temperature;
    }
    
    /**
     * This accesses the temperature directly
     */
    int checkTemp()
    {
        return temperature;
    }
}
