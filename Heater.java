/**
 * controls a heater.
 *
 * @Joe Diaz
 * @version 1.0 (08/22/2017)
 */
public class Heater
{
    private int temperature;
    private int max;
    private int min;
    private int increase;

    /**
     * Constructor for objects of class Heater
     */
    public Heater()
    {
        temperature = 15;
        max = 30;
        min = -10;
    }

    /**
     * This method raises the temperature by 5 degrees.
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
     * This method lowers the temperature by 5 degrees.
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
     * This method returns the current temperature.
     */
    int checkTemp()
    {
        return temperature;
    }
    
    /**
     * This method modifies increase or decrease in current temperature.
     * @increase Is the amount of increase in temperature requested.
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
