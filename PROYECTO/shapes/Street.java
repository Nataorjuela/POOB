import java.awt.*;
import java.awt.geom.*;
import java.lang.Math;
/**
 * Esta clase crea caller entre las localidades.
 * 
 * @author (Orjuela Natalia) 
 * @version (13/09/2020)
 */
public class Street
{

    private Location lo1;
    private Location lo2;
    private boolean isVisible;
    private Linea line;
    /**
     * Constructos de la clase.
     * @param l1  corresponde a la primera localidad
     * @param l2  corresponde a la segunda localidad
     */
    public Street(Location l1, Location l2)
    {
        //En este caso se evaluan que las coordenadas en x o en y sean iguales en ambas localidades.
        lo1 =l1;
        lo2=l2;
        line=new Linea(l1.getX(),l1.getY(),l2.getX(),l2.getY());
    }
    /**
     * este metodo da la localidad 1
     */
    public Location getlo1(){
        return lo1;
    }
    /**
     * este metodo da la localidad 2
     */
    public Location getlo2(){
        return lo2;
    }
}
