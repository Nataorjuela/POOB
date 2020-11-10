
import java.lang.Math;
/**
 * Esta clase crea caller entre las localidades.
 * 
 * @author (Aaron Juan Esteban-Orjuela Natalia) 
 * @version (13/09/2020)
 */
public class Street
{
    // instance variables - replace the example below with your own
    private Rectangle segmentoX;
    private Rectangle segmentoY;
    /**
     * Constructos de la clase.
     * @param l1  corresponde a la primera localidad
     * @param l2  corresponde a la segunda localidad
     */
    public Street(Location l1, Location l2)
    {
        //En este caso se evaluan que las coordenadas en x o en y sean iguales en ambas localidades.
        if (l1.getX()==l2.getX()){
            int alto = Math.abs(l1.getY()-l2.getY())-35;
            int ancho = 10;
            int x = l2.getX()+15;
            int y = Math.min(l1.getY(),l2.getY())+35;
            segmentoX = new Rectangle(x,y,alto,ancho);
        }
        else if (l1.getY()==l2.getY()){
            int alto = 10;
            int ancho = Math.abs(l1.getX()-l2.getX())-35;;
            int x = Math.min(l1.getX(),l2.getX())+35;
            int y = l1.getY()+15;
            segmentoX = new Rectangle(x,y,alto,ancho);
        }
        //En este caso se evaluan que ambas coordenadas de las localidades son menores.
        else if((l1.getX()<l2.getX()&&l1.getY()<l2.getY())||(l2.getX()<l1.getX()&&l2.getY()<l1.getY())){
            int altox = 10;
            int anchox = Math.abs(l1.getX()-l2.getX());
            int x1;
            int y1;
            if(l1.getX()<l2.getX()){
                x1 = l1.getX()+35;
                y1 = l1.getY()+15;
            }else{
                x1 = l2.getX()+35;
                y1 = l2.getY()+15;
            }
            segmentoX = new Rectangle(x1,y1,altox,anchox);
            int alto = Math.abs(l1.getY()-l2.getY());
            int ancho = 10;
            int x;
            int y;
            if(l1.getY()<l2.getY()){
                x = l2.getX()+15;
                y = l1.getY();
            }else{
                x = l1.getX()+15;
                y = l2.getY();
            }
            segmentoY = new Rectangle(x,y,alto,ancho);
        }
        //En este caso se evalua que una de las coordenadass sea menor(x o y ) no pueden ser menor ambas en la misma localidad..
        else{
            int altox = 10;
            int anchox = Math.abs(l1.getX()-l2.getX());
            int x1;
            int y1;
            if(l1.getX()<l2.getX()){
                x1 = l1.getX()+35;
                y1 = l1.getY()+15;
            }else{
                x1 = l2.getX()+35;
                y1 = l2.getY()+15;
            }
            segmentoX = new Rectangle(x1,y1,altox,anchox);
            int alto = Math.abs(l1.getY()-l2.getY());
            int ancho = 10;
            int x;
            int y;
            if(l1.getY()<l2.getY()){
                x = l1.getX()+15;
                y = l1.getY()+35;
            }else{
                x = l2.getX()+15;
                y = l2.getY()+35;
            }
            segmentoY = new Rectangle(x,y,alto,ancho);
        }
    }

}
