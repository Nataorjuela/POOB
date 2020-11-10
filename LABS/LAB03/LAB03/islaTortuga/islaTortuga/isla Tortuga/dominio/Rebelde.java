package dominio;
import dominio.*;
import java.awt.Color;
/**
 * Write a description of class Rebelde here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rebelde extends Pirata
{
    private int cont;
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Rebelde
     */
    public Rebelde(Isla isla,String name,int posicionx, int posiciony)
    {
        // initialise instance variables
       super(isla,name, posicionx, posiciony);
       color=Color.RED;
       palabras="Soy rebelde";
       cont = 1;
    }
    
    public void actue(){
        if (cont == 3){
            super.actue();
            cont =1;
        }else{
            cont = cont+1;
        }
    }
    
    public void pare(){
        super.actue();
    }
    
    public void decida(){
        super.pare();
    }
    
}
