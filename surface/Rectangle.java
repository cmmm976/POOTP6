
/**
 * This class allows you to create Rectangle objects with a width and a height.
 * 
 * @author Charles-Meldhine Madi Mnemoi  
 * @version 0.1
 */
public class Rectangle extends Figure
{
    protected double width;
    protected double height;

    /**
     * Constructor for objects of class Rectangle, which takes its width and height as arguments
     */
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    /**
     * This method allows you to calculate the surface S of your rectangle. S = width * height
     * 
     * @param  none
     * @return this.width * this.height
     */
    public double calculateSurface()
    {
        return width * height;
    }
    
}
