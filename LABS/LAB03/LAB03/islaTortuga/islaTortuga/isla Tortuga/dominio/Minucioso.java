package dominio;
import java.awt.Color;

/**
 * Write a description of class Minucioso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minucioso extends Pirata
{
    // instance variables - replace the example below with your own


    public Minucioso(Isla isla,String name,int posicionx, int posiciony)
    {
        // initialise instance variables
       super(isla,name, posicionx, posiciony);
       color=Color.ORANGE;
       palabras="Soy minucioso";
       
    }
    
    public void actue(){
        super.actue();
        palabras="Soy minucioso";
    }
    
    public void pare(){
        super.pare();
        palabras = "alkfshaslhfsjabjcabskbcahkjfsahfjsandkjasbjdashfasjfjkhasdhasdhjkh";
    }
    
    public void decida(){
        super.decida();
    }


}
