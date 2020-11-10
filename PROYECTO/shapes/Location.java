import java.awt.*;
import java.awt.geom.*;
/**
 * Write a description of class Location here.
 * 
 * @author (Natalia Orjuela) 
 * @version (a version number or a date)
 */
public class Location 
{
    // instance variables - replace the example below with your own
    private Circle circulo;
    private int diameter=35;
    private int yPosition;
    private int xPosition;
    private String color;
   
    /**
     * Constructor for objects of class Location
     */
    public Location(String newColor,int x,int y)
    {
        circulo = new Circle(x,y);
        circulo.changeSize(diameter);
        circulo.changeColor(newColor);
        color = newColor;
        xPosition = x;
        yPosition = y;
        circulo.makeVisible();
        
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
    public Circle getCircle()
    {
        return circulo;
    }
}
    

