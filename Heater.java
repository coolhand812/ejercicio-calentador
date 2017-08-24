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
    private int max;
    private int min;
    private int increase;

    /**
     * Constructor for objects of class Heater
     */
    public Heater()
    {
        // initialise instance variables
        temperature = 15;
        max = 30;
        min = -10;
    }

    /**
     * This method raises the temperature
     */
    public int raiseTemp()
    {
        if(temperature < max)
        {
            temperature = temperature + 5;
        }
            else
            System.out.println("You have reached the maximum temperature");
        return temperature;
    }
    
    /**
     * This method lowers the temperature
     */
    public int lowerTemp()
    {
        if(temperature > min)
        {
            temperature = temperature - 5;
        }
            else
            System.out.println("You have reached the minimum temperature");
        return temperature;
    }
    
    /**
     * This method accesses the temperature directly
     */
    int checkTemp()
    {
        return temperature;
    }
    
    /**
     * This method modifies increase or decrease in temperature directly
     */
    int modifyIncrease(int increase)
    {
        if(increase > 0)
        {
            temperature+=increase;
            if(temperature > max)
            {
                temperature = max;
                System.out.println("You may not exceed max temp!");
            }
        }
         else
            System.out.println("no negative numbers allowed");
        return temperature;
    }
}
