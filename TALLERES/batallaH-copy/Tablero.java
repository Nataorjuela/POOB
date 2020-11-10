import java.util.ArrayList;

public class Tablero {
    private ArrayList<Flota> flotas;
    /**
     *Este metodo muestra el mayor promedio
     * @return int mayorprom
     */
    public int mayorPromedio(){
        int mayor=0;
        for (int i=0;i<flotas.size();i++){
            flotas.get(i).promedio();
            if (flotas.get(i).promedio()>mayor){
                mayor=flotas.get(i).promedio();
            }
        }
        return mayor;
    }
    /**
     * En este metodo se muestralas la suma de las potencias de las flotas.
     * @return potencia es un int que es la suma de las potencias de todas las flotas.
     */
    public int potencia() throws BatallaNavalException{
        int contarExcep=0;
        int potencia=0;
        for (int i=0;i<flotas.size();i++){
            try{
             potencia+=flotas.get(i).potencia();
            }catch(Exception e){
                contarExcep+=1;
            }
        }
        if(contarExcep>flotas.size()/2){
            throw new BatallaNavalException("problemas de potencia en tablero");  
        }
        return potencia;
    }
}
