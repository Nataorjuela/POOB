
/**
 * Esta clase representa la señalizacion entre las localidades.
 * 
 * @author (Natlia Orjuela) 
 * @version (13/02/2020)
 */
public class Sign
{
    private Triangle sign;
    private Street calle;
    /**
     *Constructor de la clase. 
     */
    public Sign(Street calle){
        //En este caso se evalua que las coordenadas en x o en y sean iguales, la señalizacion queda en el medio.
        int x = Math.min(calle.getlo1().getX(), calle.getlo2().getX())+(Math.abs(calle.getlo1().getX()-calle.getlo2().getX())/2);
        int y = Math.min(calle.getlo1().getY(),calle.getlo2().getY())+(Math.abs(calle.getlo1().getY()-calle.getlo2().getY())/2);
        sign = new Triangle(x,y);
        sign.makeVisible();
    }
    public Triangle getTriangle(){
        return sign;
    }
}
 
