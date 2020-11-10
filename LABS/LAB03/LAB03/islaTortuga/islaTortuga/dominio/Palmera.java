package dominio;
import java.awt.Color;
public class Palmera implements EnIsla {
    private Isla isla; 
    private int posicionx,posiciony;
    protected Color color;
    public Palmera(Isla isl,int posx, int posy){  
        isla = isl;
        posicionx = posx;
        posiciony =posy;
        color=Color.GREEN;
    }
    public int getPosicionX(){
        return posicionx;
    }
    public int getPosicionY(){
        return posiciony;
    }
    public Color getColor(){
        return color;
    }
    public void actue(){
        color=Color.CYAN;
    }
    public String forma(){
        return "Circulo";
    }
    public String mensaje(){
        return "Soy palmera";
    }
}
