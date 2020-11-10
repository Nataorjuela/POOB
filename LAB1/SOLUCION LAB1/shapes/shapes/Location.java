import java.awt.*;
import java.awt.geom.*;
/**
 * Write a description of class Location here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Location extends Circle
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private String color;
    private int diameter=35;
    private boolean isVisible=true;
   
    /**
     * Constructor for objects of class Location
     */
    public Location(String newColor,int x,int y)
    {
        super();
        super.changeSize(diameter);
        super.changeColor(newColor);
        moveHorizontal(x);
        moveVertical(y);
        color=newColor;
        isVisible=true;
        
    }
    /**
     * Move the circle horizontally.
     * @param distance the desired distance in pixels
     */
    
    public void moveHorizontal(int x){
        erase();
        this.x=x;
        draw();
    }

    /**
     * Move the circle vertically.
     * @param distance the desired distance in pixels
     */
    
    public void moveVertical(int y){
        erase();
        this.y=y;
        draw();
    }
     
    /**
     * Make this circle visible. If it was already visible, do nothing.
     */
    
    public void makeVisible(){
        isVisible = true;
        draw();
    }
    
    /**
     * Make this circle invisible. If it was already invisible, do nothing.
     */
   
    public void makeInvisible(){
        erase();
        isVisible = false;
    }
    
    /*
     * Draw the circle with current specifications on screen.
     */
    private void draw(){
        if(isVisible=true) {
            Canvas town = Town.getCanvas();
            town.draw(this, color, 
                new Ellipse2D.Double(x,y,diameter,diameter));
            town.wait(10);
        }
    }

    /*
     * Erase the circle on screen.
     */
    private void erase(){
        if(isVisible) {
            Canvas town = Town.getCanvas();
            town.erase(this);
        }
    }
    
}
    

