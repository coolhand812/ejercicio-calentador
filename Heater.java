
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
    private int increase;

    /**
     * Constructor for objects of class Heater
     */
    public Heater()
    {
        // initialise instance variables
        temperature = 15;
        increase = 3;
    }

    /**
     * This method raises the temperature
     */
    public int raiseTemp()
    {
        if(temperature < 30)
        {
            temperature = temperature + increase;
        }
        else
            System.out.println("you have reached the maximum temperature");
        return temperature;
    }
    
    /**
     * This method lowers the temperature
     */
    public int lowerTemp()
    {
        if(temperature > -9)
        {
            temperature = temperature - increase;
        }
        else
            System.out.println("you have reached the minimum temperature");
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
