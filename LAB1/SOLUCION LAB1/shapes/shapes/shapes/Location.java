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
        xPosition = x;
        yPosition = y;
        // moveHorizontal(x);
        // moveVertical(y);
        makeVisible();
        
    }
    /**
     * @return la posicion en x
     */
    public int getX(){
        return xPosition;
    }
    /**
     * @return la posicion en y
     */
    public int getY(){
        return yPosition;
    }
    /**
     * @return el diametro
     */
    public int getDiameter(){
        return diameter;
    }
    /**
     * @return el color de la figura
     */
    public String getColor(){
        return color;
    }
    /**
     * Move the circle horizontally.
     * @param distance the desired distance in pixels
     */
    // @Override
    // public void moveHorizontal(int x){
        // erase();
        // this.x=x;
        // draw();
    // }

    // /**
     // * Move the circle vertically.
     // * @param distance the desired distance in pixels
     // */
    // @Override
    // public void moveVertical(int y){
        // erase();
        // this.y=y;
        // draw();
    // }
     
    // /**
     // * Make this circle visible. If it was already visible, do nothing.
     // */
    // @Override
    // public void makeVisible(){
        // isVisible = true;
        // draw();
    // }
    
    // /**
     // * Make this circle invisible. If it was already invisible, do nothing.
     // */
    // @Override
    // public void makeInvisible(){
        // erase();
        // isVisible = false;
    // }
    
    // /*
     // * Draw the circle with current specifications on screen.
     // */
    // private void draw(){
        // if(isVisible=true) {
            // Canvas town = Town.getCanvas();
            // town.draw(this, color, 
                // new Ellipse2D.Double(x,y,diameter,diameter));
            // town.wait(10);
        // }
    // }

    /*
     * Erase the circle on screen.
     */
    // private void erase(){
        // if(isVisible) {
            // Canvas town = Town.getCanvas();
            // town.erase(this);
        // }
    // }
    
}
    

