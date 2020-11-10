import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ECI, 2018
 *
 */
public class Conjunto{
    private ArrayList<String> datos;

    /**
     * Constructor del conjunto
     */

    public Conjunto () {
        datos=new ArrayList();
    }

    /**
     * Constructor del conjunto
     * @param elementos son los valores a comparar 
     */
    public Conjunto(String [] elementos){
        datos=new ArrayList();
        for (int i=0;i<elementos.length;i++){
            if (!repetMin(elementos[i])){
                datos.add(elementos[i]);
            }
        }

    }

    /**
     * Compara los elementos de un ArrayList en minuscula que esten repetidos
     * @param elemento es el valor a comparar
     * @return si el elemento se encuentra en el conjunto (como minuscula).
     */    
    private boolean repetMin(String elemento){
        boolean estaRepetidos=false;
        for (int i=0;i<datos.size()&&!estaRepetidos;i++){
            if (elemento.toLowerCase().replace(" ","").equals(datos.get(i).toLowerCase().replace(" ",""))){
                estaRepetidos=true;
            }
        }
        return estaRepetidos;
    }

    /**
     * Calcula el cardinal del conjunto
     * @return devuelve la longitud del conjunto.
     */    
    public int cardinal() {
        int tama_o=datos.size();
        return tama_o;
    }

    /**
     * Verifica si un elemento pertenece al conjunto
     * @param elemento, el elemento a verificar
     * @return
     */      
    public boolean pertenece(String elemento){
        return datos.contains(elemento);
    }

    /**
     * Compara este conjunto con otro
     * @param c el conjunto a comparar
     * @return devuelve si un conjunto es igual a otro.
     */
    private boolean equals (Conjunto c) {
        boolean iguales=false;
        if (c.cardinal()==this.cardinal()){
            iguales=true;
            for (int i=0;i<c.cardinal() && iguales;i++){
                iguales=c.pertenece(datos.get(i));   
            }
        }
        return iguales;
    }

    /** 
     * Compara si este conjunto es igual a otro (el parametro debe ser un conjunto)
     */
    @Override
    public boolean equals (Object o) {
        return this.equals ((Conjunto) o);
    }

    /** 
     * Indica si el conjunto c esta contenido
     */
    public boolean contenido(Conjunto c){
        return false;
    }
    /**
     * Este método devuelve una lista con los elementos del conjunto
     * 
     */
    public ArrayList darElementos(){
        return datos;
    }

    /**
     * Devuelve la union de dos conjuntos que no tienen elementos repetidos
     * @param es el conjunto a unir
     * @return devuelve un nuevo conjunto con la union
     */
    public Conjunto union(Conjunto c){
        String[] elem=(String[])c.darElementos().toArray();
        String[] elem2=(String[])datos.toArray();
        String[] unir= new String[elem.length+elem2.length];
        for(int i=0;i<c.cardinal();i++){
            unir[i]=elem[i];
        }
        for(int i=0;i<elem2.length;i++){
            unir[i+elem.length]=elem2[i];
        }
        Conjunto unido=new Conjunto(unir);
        return unido;
    }
    

    /**
     * Este método nos devuelve un conjunto con la interseccion con 
     * el conjunto c.
     * @param c un conjunto para intersectar
     * @return un conjunto con la interseccion de los dos
     */
    public Conjunto interseccion(Conjunto c){
        ArrayList repetidos=new ArrayList();
        for(int i=0;i<datos.size();i++){
            if(c.pertenece(datos.get(i))){
                repetidos.add(datos.get(i));
            }
        }
        Conjunto repet=new Conjunto((String[])repetidos.toArray());
        return repet;        
    }

    /**
     *  Este método nos devuelve un conjunto con la diferencia con 
     * el conjunto c.
     * @param c un conjunto para restar
     * @return un conjunto con la diferencia de los dos
     */
    public Conjunto diferencia(Conjunto c){
        ArrayList norepetidos=new ArrayList();
        for(int i=0;i<datos.size();i++){
            if(!c.pertenece(datos.get(i))){
                norepetidos.add(datos.get(i));
            }
        }
        Conjunto norepet=new Conjunto((String[])norepetidos.toArray());
        return norepet;   
    }    

    /**
     *  Este método nos devuelve un conjunto con la diferencia simetrica con 
     * el conjunto c.
     * @param c un conjunto para hacer la diferencia
     * @return un conjunto con la diferencia simetrica de los dos
     */
    public Conjunto diferenciaSimetrica(Conjunto c){

        ArrayList norepetidos=new ArrayList();
        for(int i=0;i<datos.size();i++){
            if(!c.pertenece(datos.get(i))){
                norepetidos.add(datos.get(i));
            }
        }
        ArrayList conj=c.darElementos();
        for (int i=0;i<conj.size();i++){
            if(!this.pertenece((String)conj.get(i))){
                norepetidos.add(conj.get(i));
            }
        }

        Conjunto norepet=new Conjunto((String[])norepetidos.toArray());
        return norepet;  

    }    
    /**
     * Este método calcula el producto entre dos conjuntos.
     * @param c es el conjunto para hacer el producto
     * @return devuelve un conjunto con el producto entre los dos conjuntos.
     */
    public Conjunto producto(Conjunto c){
        ArrayList resultado=new ArrayList();
        for(int i=0;i<datos.size();i++){
            for (int j=0;j<c.darElementos().size();j++){
                resultado.add(datos.get(i).concat((String)c.darElementos().get(j)));
            }
        }
        Conjunto producto=new Conjunto((String[])resultado.toArray());
        return producto;      

    }            

    /** 
     * Retorna una cadena que describe este conjunto con los elementos en mayusculas, entre corchetes, ordenados alfabeticamente y 
     * separados por coma
     */
    @Override
    public String toString () {
        ArrayList<String> aux= new ArrayList<String>();
        aux.addAll(datos);
        for (int i=0;i<aux.size();i++){
            aux.set(i, aux.get(i).toUpperCase());
        }
        Collections.sort(aux);
        String s ="{";
        for (int i=0;i<aux.size();i++){
            if (i==aux.size()-1){
                s=s+(aux.get(i).toUpperCase());
            }else{
                s=s+(aux.get(i).toUpperCase())+",";
            }

        }
        s=s+"}";
        return s;
    }

}
