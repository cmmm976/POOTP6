
/**
 * This abstract class allows you to NOT create Figure objects :) But you can extend it to create more specific figures...
 *
 * @author  Charles-Meldhine Madi Mnemoi
 * @version 0.1
 */
public abstract class Figure
{
    

    /**
     * This method allows your figures to have a calculateSurface() method, which will be useful.
     * @param  none
     * @return  a beatiful double S which will be defined in concrete classes
     */
    abstract public double calculateSurface();
    
    /**
     * This method prints the surface of your figure on the terminal.
     * 
     * @param none
     * @return a beautiful String
     */
    public String toString()
    {
        return this.getClass().getName() + " de surface " + calculateSurface();
    }
}


