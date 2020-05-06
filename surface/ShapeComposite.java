
/**
 * This class allows you to create ShapeComposite objects, which will contains Figure objects (yes)
 * 
 * @author Charles-Meldhine Madi Mnemoi
 * @version 0.1
 */

import java.util.ArrayList;

public class ShapeComposite
{
    private ArrayList<Figure> figures;
    
    /**
     * Constructor for objects of class ShapeComposite
     */
    public ShapeComposite()
    {
        figures = new ArrayList<Figure>();
    }
    
    /**
     * Constructor for objects of class ShapeComposite, which takes one figure as argument and add it into the arraylist figures
     */
    public ShapeComposite(Figure figure)
    {
        figures = new ArrayList<Figure>();
        if(figure != null)
        {
            figures.add(figure);
        }
        else
        {
            System.out.println("Why do you want to add a null object ?! You're an awful human being...");
        }
        
    }
    
     /**
     * Constructor for objects of class ShapeComposite, which takes an array list of figures as argument
     */
    public ShapeComposite(ArrayList<Figure> figures)
    {
        this.figures = new ArrayList<Figure>();
        if(figures != null)
        {
            this.figures = figures;
        }
        else
        {
            System.out.println("Why do you want to use a null object ?! You're an awful human being...");
        }
    }
   
    /**
     * This method allows you to add figure Figures to your ShapeComposite
     * 
     * @param  figure, a figure Figure
     * @return     nothing
     */
    public void add(Figure figure)
    {
        figures.add(figure);
    }
    
    /**
     * * This method allows you to print the surface of your ShapeComposite
     * 
     * @param  none
     * @return a beautiful double S = sum for 0 to figure.size()-1 of figures.get(i).calculateSurface()
     */
    public double calculateSurface()
    {
        double s = 0; //surface of your SC !!!
        for(Figure f : figures)
        {
            s += f.calculateSurface();
            
        }
        return s;
    }
    
   /**
     * This method allows you to print the surface of all the figures of your ShapeComposite in your terminal
     * 
     * @param  none
     * @return a beautiful string 
   */
    
   public String toString()
   {
        String s = "";
        for(Figure f : figures)
        {
            s += f.toString() + "\n";
            
        }
        return s;
   }
   /**
     * This method allows you to get all the figures of a given type as argument
     * @param  type, String
     * @return a beatiful ArrayList
   */
   public ArrayList<Figure> findAllFigures(String type)
   {
       ArrayList<Figure> list = new ArrayList<Figure>();
       for(Figure f : figures)
       {
           if(f.getClass().getName() == type)
           {
               list.add(f);
           }
            
       }
       return list;
   }
   
   /**
     * This method allows you to print the number of figures grouped by type, and their total surface in the terminal
     * @param  none
     * @return nothing
   */
  
  public void printInfoPerFigure()
  {
     int ringNumber = 0;
     double ringSurface = 0;
     int circleNumber = 0;
     double circleSurface = 0;
     int squareNumber = 0;
     double squareSurface = 0;
     int rectangleNumber = 0;
     double rectangleSurface = 0;
     
     
      
      for(Figure f : figures)
      {
          switch(f.getClass().getName())
          {
             case "Ring":
                ringNumber++;
                ringSurface += f.calculateSurface();
                break;
             case "Circle":
                circleNumber++;
                circleSurface += f.calculateSurface();
                break;
             case "Square":
                squareNumber++;
                squareSurface += f.calculateSurface();
                break;
             case "Rectangle":
                rectangleNumber++;
                rectangleSurface += f.calculateSurface();
                break;
          }
      }
      
      System.out.println("Il y a " + ringNumber + " anneaux, de surface totale : " + ringSurface);
      System.out.println("Il y a " + circleNumber + " cercle, de surface totale : " + circleSurface);
      System.out.println("Il y a " + squareNumber + " carrés, de surface totale : " + squareSurface);
      System.out.println("Il y a " + rectangleNumber + " rectangle, de surface totale : " + rectangleSurface);
  }
}
