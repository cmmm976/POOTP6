
/**
 * This class allows you to create Ring objects (a circle in another circle)
 * 
 * @author Charles-Meldhine Madi Mnemoi 
 * @version 0.1
 */
public class Ring extends Circle
{
    Circle internCircle;

    /**
     * Constructor for objects of class Ring, which takes the radius of the intern circle and the actual circle as arguments
     */
    public Ring(double internRadius, double radius)
    {
        super(radius);
        internCircle = new Circle(internRadius);
    }
    
    public double calculateSurface()
    {
        return Math.PI*radius*radius - internCircle.calculateSurface();
    }
}
