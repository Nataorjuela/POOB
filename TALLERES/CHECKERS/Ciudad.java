import java.util.ArrayList;
import java.util.Arrays;
import java.awt.*;

/**
 * Una ciudad que puede ser manipulada y que se dibuja en
 * uncanvas.
 * 
 * @author Juan Esteban Aaron- Natalia Orjuela Hernandez
 * @version 1.0  (27 Agosto 2020)()
 */


 
public class Ciudad{

    private int ancho;
    private int largo;
    private boolean ok;
    private boolean isVisible;

    /**
     * Create a new town at default position with default color.
     */
    public Ciudad(int ancho,int largo){
        this.ancho=ancho;
        this.largo=largo;
        int matriz[0][0]=new int[largo][ancho];
        Canvas canvas=Canvas.getCanvas(ancho,largo);
        
    }
  
    
    /**
     * Agrega una localidad.
     */
    public void addLocalidad(String color,int x,int y){
        color=color;
        x=x;
        y=y;
        
        
    }
    