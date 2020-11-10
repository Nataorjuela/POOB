
/**
 * Write a description of class Capsula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Capsula extends Maquina implements Nodriza
{

    private Nodriza nave;

    /**
     * Constructor for objects of class Capsula
     */
    public Capsula()
    {

    }
    @Override
    public boolean esDebil(){
        return false;
    }
    
    public String autoDestruir(){
        if (nave.estaDestruida()){
            return "Nave nodriza destruida";
        }
        this.destruir();
        return "Causas desconocidas";
    }

}
