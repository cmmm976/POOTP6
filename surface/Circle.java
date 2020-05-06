
/**
 * This class allows you to create a Circle object.
 * 
 * @author Charles-Meldhine Madi Mnemoi 
 * @version (a version number or a date)
 */

import java.lang.Math;

public class Circle extends Figure
{
    protected double radius; //radius of the circle
    
    /**
     * Constructor for objects of class Cercle, which takes its radius as  argument
     */
    public Circle(double radius)
    {
        this.radius = radius;
    }

    /**
     * this method allows you to calculate the surface S of a circle (S = 2pi*radius)
     * @param none
     * @return Pi*radius²
     */
    public double calculateSurface()
    {
        return Math.PI*radius*radius;
    }
    
}
