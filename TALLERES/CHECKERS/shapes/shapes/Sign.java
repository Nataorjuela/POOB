
/**
 * Esta clase representa la señalizacion entre las localidades.
 * 
 * @author (Aaron juan esteban y Natlia Orjuela) 
 * @version (13/02/2020)
 */
public class Sign extends Triangle
{
    /**
     *Constructor de la clase. 
     */
    public Sign(Location l1, Location l2){
        int distancia;
        int x;
        int y;
        //En este caso se evalua que las coordenadas en x o en y sean iguales, la señalizacion queda en el medio.
        if (l1.getX()==l2.getX()){
            distancia = Math.abs(l1.getY()-l2.getY());
            x = l2.getX();
            y = Math.min(l1.getY(),l2.getY())+35+(distancia/2);
        }
        else if (l1.getY()==l2.getY()){
            distancia = Math.abs(l1.getX()-l2.getX());
            x = Math.min(l1.getX(),l2.getX())+35+(distancia/2);
            y = l1.getY()+15;

        }
        //En este caso se evaluan que ambas coordenadas de las localidades son menores,la señalizacion queda en la esquina
        else if((l1.getX()<l2.getX()&&l1.getY()<l2.getY())||(l2.getX()<l1.getX()&&l2.getY()<l1.getY())){

            if(l1.getY()<l2.getY()){
                x = l2.getX()+15;
                y = l1.getY();
            }else{
                x = l1.getX()+15;
                y = l2.getY();
            }
        }
        //En este caso se evalua que una de las coordenadass sea menor(x o y ) no pueden ser menor ambas en la misma localidad..
        else{
            distancia = Math.abs(l1.getX()-l2.getX());
            if(l1.getY()<l2.getY()){
                x = l1.getX()+15;
                y = l2.getY()+35;
            }else{
                x = l2.getX()+15;
                y = l1.getY()+35;
            }
        }
        xPosition = x;
        yPosition = y;
        color = "yellow";
        width = 40;
        height = 30;
        makeVisible();
    }

}
