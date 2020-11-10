import java.util.Stack;

/** Calculadora.java
 * Representa una calculadora de conjuntos
 * @author ESCUELA 2020-2
 * 
 */
    
public class CalConjuntos{

    private Stack<Conjunto> operandos;
    //Consultar en el API Java la clase Stack
    /**
     * constructor de la clase CalConjuntos
     * 
     */
    public CalConjuntos(){
        operandos=new Stack<Conjunto>();
    }
    
    /**
     * Este metodo inserta un conjunto al Stack
     * @param dConjunto 
     */
    public void adicione(String [] dConjunto){ 
        operandos.push(new Conjunto(dConjunto));
    }
    
    public void elimine(){
        operandos.pop();
    }
    
    //Duplica el ultimo elemento el numero de veces indicada
    public void duplique(int times){
        Conjunto ultima=operandos.pop();
        for (int i=0;i<times;i++){
            operandos.push(ultima);
        }
    }
    
    public int cardinal(){
        return operandos.size();
    }
  
    //Retorna la representacion como cadena del conjunto del tope de la pila
    public String consulte(){
        Conjunto ult=operandos.peek(); 
        return (ult.toString());
    }
    
    //Operacion: U (union), I (Interseccion), - (Diferencia), _ (Diferencia simétrica), x (Producto)
    public void opere(char operacion){
    }
   
    public boolean ok(){
        return false;
    }
}
    



