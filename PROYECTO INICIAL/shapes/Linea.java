import java.awt.*;
import java.awt.geom.*;
import java.lang.Math;
/**
 * Write a description of class Linea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Linea
{
    // instance variables - replace the example below with your own
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private boolean isVisible;
    private String color;
    /**
     * Constructor for objects of class Linea
     */
    public Linea(int x1,int y1,int x2, int y2)
    {
        isVisible=true;
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        color="black";
        makeVisible();
    }

    protected void draw(){
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,new Line2D.Double(x1+17,y1+17,x2+17,y2+17));
            canvas.wait(10);
        }
    }
    public void makeVisible(){
        isVisible = true;
        draw();
    }
}
