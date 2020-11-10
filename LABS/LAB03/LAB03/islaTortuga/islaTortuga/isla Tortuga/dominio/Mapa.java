package dominio;
import java.awt.Color;
public class Mapa implements EnIsla {
    private Isla isla; 
    private int posicionx,posiciony;
    protected Color color;
    public Mapa(Isla isl,int posx, int posy){  
        isla = isl;
        posicionx = posx;
        posiciony =posy;
        color=Color.BLACK;
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
        color=Color.blue;
    }
    public String forma(){
        return "Cuadrado";
    }
    public String mensaje(){
        return "Soy un mapa";
    }
}
