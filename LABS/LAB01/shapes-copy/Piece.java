
/**
 * Las piezas seran especiales, se daran las esquinas superior derecha de 
 * los rectangulos que la conforman de izquierda a derecha.
 * 
 * @author (Juan Esteban Aaron-Natalia Orjuela) 
 * @version (19 de agosto 2020)
 */
public class Piece
{
    // instance variables - replace the example below with your own
    private Rectangle rectangulo1;
    private Rectangle rectangulo2;

    /**
     * Construye la pieza utilizando la clase Rectangulo,el color y las 7
     * coordenadas las ingresa el usuario, y estas son enviadas a la clase.
     */
    public Piece(String color,int[][] points)
    {
        // initialise instance variables
        rectangulo1=new Rectangle(color,points[0][0],points[0][1]);
        rectangulo2=new Rectangle(color,points[1][0],points[1][1]);
        rectangulo1.makeVisible();
        rectangulo2.makeVisible();
    }

    /**
     * Quita la ficha del tablero.
     */
    public void take()
    {
        
        rectangulo1.makeInvisible();
        rectangulo2.makeInvisible();
    }
    /**
     * Pone la ficha en el tablero.
     */
    public void put()
    {
        
        rectangulo1.makeVisible();
        rectangulo2.makeVisible();
    }
    /**
     * La pieza se refleja sobre sus cuatro lados: N,S,E,W,(Norte,Sur,Este,
     * Oeste).
     */
    public void reflect(char d){
        if (d=='N'){
            if (rectangulo1.getWidth()>rectangulo2.getWidth()){
                int nuevoy=rectangulo2.getY()-rectangulo2.getHeight();
                rectangulo1.setY(nuevoy);
                rectangulo2.setY(nuevoy);
                rectangulo1.makeVisible();
                rectangulo2.makeVisible();
            }else{
                int nuevoy=rectangulo1.getY()-rectangulo1.getHeight();
                rectangulo1.setY(nuevoy);
                rectangulo2.setY(nuevoy);
                rectangulo1.makeVisible();
                rectangulo2.makeVisible();
            }
        }else if (d=='S'){
            if (rectangulo1.getWidth()>rectangulo2.getWidth()){
                int nuevoy=rectangulo2.getY()+rectangulo2.getHeight();
                rectangulo1.setY(300-rectangulo1.getHeight());
                rectangulo2.setY(nuevoy);
                rectangulo1.makeVisible();
                rectangulo2.makeVisible();
            }else{
                int nuevoy=rectangulo1.getY()+rectangulo1.getHeight();
                System.out.println(rectangulo1.getHeight());
                rectangulo1.setY(nuevoy);
                rectangulo2.setY(300-rectangulo2.getHeight());
                rectangulo1.makeVisible();
                rectangulo2.makeVisible();
            }
        }
        else if (d=='E'){
            if (rectangulo1.getHeight()>rectangulo2.getHeight()){
                int nuevox=rectangulo2.getX()+rectangulo2.getWidth();
                rectangulo1.setX(nuevox+rectangulo1.getWidth()-rectangulo2.getWidth());
                rectangulo2.setX(nuevox);
                rectangulo1.makeVisible();
                rectangulo2.makeVisible();
            }else{
                int nuevox=rectangulo1.getX()+rectangulo1.getWidth();
                rectangulo1.setX(nuevox);
                rectangulo2.setX(nuevox+rectangulo1.getWidth()-rectangulo2.getWidth());
                rectangulo1.makeVisible();
                rectangulo2.makeVisible();
            }
        }else if (d=='O'){
            if (rectangulo1.getHeight()>rectangulo2.getHeight()){
                int nuevox=rectangulo2.getX()+rectangulo2.getWidth();
                rectangulo1.setX(0);
                rectangulo2.setX(0);
                rectangulo1.makeVisible();
                rectangulo2.makeVisible();
            }else{
                int nuevox=rectangulo1.getX()+rectangulo1.getWidth();
                rectangulo1.setX(0);
                rectangulo2.setX(0);
                rectangulo1.makeVisible();
                rectangulo2.makeVisible();
            }
        }    
    }
    /**
     * Cambia el tamaño de la pieza.
     */
    public void resize(int percentage){
        rectangulo1.resize(percentage);
        rectangulo2.resize(percentage);
        rectangulo1.makeVisible();
        rectangulo2.makeVisible();
    }
}
