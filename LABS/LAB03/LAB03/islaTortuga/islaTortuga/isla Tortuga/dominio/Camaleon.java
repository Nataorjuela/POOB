package dominio;
import java.awt.Color;
/**
 * Write a description of class Camaleon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camaleon extends Pirata
{
    // instance variables - replace the example below with your own
    private int cont;
    private Color[] colores = {Color.RED,Color.BLUE,Color.GRAY,Color.ORANGE,Color.GREEN,Color.CYAN};
    public Camaleon(Isla isla,String name,int posicionx, int posiciony)
    {
        // initialise instance variables
        super(isla,name, posicionx, posiciony);
        color=Color.ORANGE;
        palabras="Soy Camaleon";
        cont = 0;
    }
    
    public void actue(){
        color=colores[cont%5];
        cont = cont+1;
        super.actue();
        palabras="Cambio de color";
        
    }

    public void pare(){
        super.pare();
    }

    public void decida(){
        super.decida();
    }
}

