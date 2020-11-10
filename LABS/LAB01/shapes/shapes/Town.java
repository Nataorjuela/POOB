import java.awt.*;
/**
 * Write a description of class Town here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Town extends Canvas
{
    // instance variables - replace the example below with your own
    	private static Canvas canvasSingleton;
    
    /**
     * Factory method to get the canvas singleton object.
     */
    public static Canvas getCanvas(){
    	
    	canvasSingleton.setVisible(true);
    	return canvasSingleton;
    }
    
    private int x;

    /**
     * Constructor for objects of class Town
     */
    public Town(String title, int width, int height)
    {
        super(title,width,height,Color.white);
        canvasSingleton=this;
    }
    
    public void addLocation(String color,int x, int y)
    {
       Circle local=new Location(color,x,y);
       
    }
   

    public void makeVisible()
    {
        super.setVisible(true);
    }
    
    public void makeInvisible()
    {
        super.setVisible(false);
    }
    
    
}
