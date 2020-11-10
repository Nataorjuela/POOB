import java.util.ArrayList;
public class PortaAviones extends Maquina{
    private int capacidad;
    private ArrayList<Avion> aviones;
    public PortaAviones(){
        aviones=new ArrayList();
    }
    public int aviones(){
        return aviones.size();
    }
    public boolean esDebil(){
        return false;
    }
}
