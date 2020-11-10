import java.util.ArrayList;

public class Flota {
    private Tablero tablero;
    private String nombre;
    private ArrayList<Marino> marinos;
    private ArrayList<Maquina> maquinas;

    //Incluya el contenedor de maquinas
    /**
     * Este metodo muestra el promedio de aviones en los portaAviones de una flota
     * @return int prom 
     */
    public int promedio(){
        int prom=0,nPortaAviones=0,nAviones=0;
        for (int i=0;i<maquinas.size();i++){
            if(maquinas.get(i) instanceof PortaAviones){
                nPortaAviones++;
                nAviones=nAviones+(((PortaAviones)maquinas.get(i)).aviones());
            }
        }
        return nAviones/nPortaAviones;
    }

    public void setPromedio(PortaAviones portaAvion) throws BatallaNavalException{
        if(portaAvion.equals(0)){
            throw new BatallaNavalException("el portaAvion no puede ser menor a 0");
        }
    }

    public ArrayList maquinasDebiles(){
        return new ArrayList();
    }

    /**
     * Este metodo devuelve la potencia de las flotas.
     * @return potencia es la suma de las maquinas que no son debiles.
     * @throw BatallaNavalException  si existen menos marinos que máquinas en la flota
     */
    public int potencia() throws BatallaNavalException{
        if(marinos.size()<maquinas.size()){
            throw new BatallaNavalException("problemas de potencia");
        }
        int potencia=maquinas.size()-maquinasDebiles().size();
        return potencia;
    }
}
