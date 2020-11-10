import java.awt.*;
import java.util.ArrayList;
/**
 * Write a description of class Town here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Town extends Canvas
{
    // instance variables - replace the example below with your own
        
    public ArrayList<Location> localidades;
    public ArrayList<Street> caminos;
    public ArrayList<Sign> señales;
    /**
     * Factory method to get the canvas singleton object.
     */
    public static Canvas getCanvas(){
        return Canvas.getCanvas();
    }
    
    private int x;

    /**
     * Constructor for objects of class Town
     */
    public Town(int width, int height)
    {
        super("Ciudad",width,height,Color.white);
        localidades = new ArrayList();
        caminos = new ArrayList();
        señales = new ArrayList();
    }
    
    public void addLocation(String color,int x, int y)
    {
       Location local=new Location(color,x,y);
       localidades.add(local);
    }
    
    public void addStreet(String locationA, String locationB){
        Location la = null;
        Location lb = null;
        for (int i = 0; i < localidades.size(); i++ ){
            if (localidades.get(i).getColor().equals(locationA)){
                la = localidades.get(i);
            }
            if (localidades.get(i).getColor().equals(locationB)){
                lb = localidades.get(i);
            }
        }
        if (la != null && lb!= null){
            Street calle = new Street(la,lb);
            caminos.add(calle);
        }
        
    }
    
    public void addSign(String locationA, String locationB){
        Location la = null;
        Location lb = null;
        for (int i = 0; i < localidades.size(); i++ ){
            if (localidades.get(i).getColor().equals(locationA)){
                la = localidades.get(i);
            }
            if (localidades.get(i).getColor().equals(locationB)){
                lb = localidades.get(i);
            }
        }
        if (la != null && lb!= null){
            Sign señal = new Sign(la,lb);
            señales.add(señal);
        }
        
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
