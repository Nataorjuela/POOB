import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Write a description of class CalConjutoTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalConjutoTest
{
    private CalConjuntos cal;
    private String [] conjunto1;
    private String [] conjunto2;
    /**
     * 
     */
    @Before
    public void setUp(){
        cal=new CalConjuntos();
        String [] conjunto1={"AGUA","LUZ"};
        String [] conjunto2={"FUEGO","AIRE"};
    }
    /**
     * En está prueba se quiere mostrar que se cree el objeto.
     * 
     */
    @Test    
    public void debeCrear(){
        
        assertNotNull(cal);
        
    }
    /**
     * En está prueba se quiere mostrar que se agrega un conjunto.
     */
    @Test
    public void deberiaAdicionar(){
       String [] conjunto1={"AGUA","LUZ"};
       cal.adicione(conjunto1);
       assertEquals(1,cal.cardinal());
    }
    //No se encontro ninguna condicion en la que el conjunto no deba ser agregado
    /**
     * En está prueba se quiere comprobar que el ultimo conjunto del Stack sea 
     * correcto.
     */
    @Test
    public void deberiaConsultarCadena(){
       String [] conjunto1={"AGUA","LUZ"};
       String [] conjunto2={"FUEGO","AIRE"};
       cal.adicione(conjunto1);
       cal.adicione(conjunto2);
       String cadena="{AIRE,FUEGO}";
       
       for(int i=0;i<conjunto2.length;i++){
          cadena=cadena+conjunto2[i];
        }
       assertEquals(cadena,cal.consulte());
    }
    
}
   
