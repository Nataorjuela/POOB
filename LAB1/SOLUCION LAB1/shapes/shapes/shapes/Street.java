
import java.lang.Math;
/**
 * Write a description of class Street here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Street
{
    // instance variables - replace the example below with your own
    private Rectangle segmento1;
    private Rectangle segmento2;
    /**
     * Constructor for objects of class Street
     */
    public Street(int localidadx1, int localidady1, int localidadx2, int localidady2)
    {
        if (localidadx1==localidadx2){
            int alto = Math.abs(localidady1-localidady2)-35;
            int ancho = 10;
            int x = localidadx1+15;
            int y = Math.min(localidady1,localidady2)+35;
            segmento1 = new Rectangle(x,y,alto,ancho);
        }
        else if (localidady1==localidady2){
            int alto = 10;
            int ancho = Math.abs(localidadx1-localidadx2)-35;;
            int x = Math.min(localidadx1,localidadx2)+35;
            int y = localidady1+15;
            segmento1 = new Rectangle(x,y,alto,ancho);
        }
        else{
            int altox = 10;
            int anchox = Math.abs(localidadx1-localidadx2);
            int x1 = Math.min(localidadx1,localidadx2)+35;
            int y1 = Math.min(localidady1,localidady2)+15;
            segmento1 = new Rectangle(x1,y1,altox,anchox);
            int alto = Math.abs(localidady1-localidady2);
            int ancho = 10;
            int x = Math.max(localidadx1,localidadx2)+15;
            int y = Math.min(localidady1,localidady2);
            segmento2 = new Rectangle(x,y,alto,ancho);
        }
    }


}
