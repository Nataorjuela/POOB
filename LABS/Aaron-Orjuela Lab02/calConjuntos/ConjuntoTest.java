import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author   ECI
 * @version 2020-2
 */
public class ConjuntoTest
{
 
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp(){
        
    }
 
    @Test    
    public void deberiaPasar(){
    }
    
    @Test
    public void deberiaFallar(){
    }

    @Test    
    public void deberiaErrar(){
    }

    @Test
    public void deberiaCrearConjuntosVacios(){
        String [] dVacio={};
        Conjunto vacio=new Conjunto();
        assertEquals(0,vacio.cardinal());
        vacio=new Conjunto(dVacio);
        assertEquals(0,vacio.cardinal());
    }
    
    @Test
    public void deberiaCrearLosConjuntosDelTama_oIndicado(){
        String[]  dSiglas= {"POOB","MBDA"};
        Conjunto siglas=new Conjunto(dSiglas);
        assertEquals(2,siglas.cardinal());
    }

    @Test
    public void deberiaCrearLosConjuntoConLosElementosDados(){
        String[]  dSiglas={"POOB","MBDA"};
        Conjunto siglas=new Conjunto(dSiglas);
        assertEquals(2,siglas.cardinal());
        assertTrue(siglas.pertenece("POOB"));
        assertTrue(siglas.pertenece("MBDA"));
        assertFalse(siglas.pertenece("AYED"));
    }
    
    @Test
    public void noDeberiaSerSensibleAMayusculas(){
        String [] dSiglas={"POOB","MBDA","poob","Poob"};
        Conjunto siglas=new Conjunto(dSiglas);
        assertEquals(2,siglas.cardinal());
        assertTrue(siglas.pertenece("POOB"));
        
    }
    
    
    @Test
    public void deberiaCrearConjuntosQuitandoElementosRepetidos(){
        String [] dSiglas={"TPRO","POOB","MBDA","TPRO"};
        Conjunto siglas=new Conjunto(dSiglas);
        assertEquals(3,siglas.cardinal());    
    }    
    
    @Test
    public void deberiaCrearConjuntosEliminandoEspaciosInnecesarios(){
        String [] dMaterias={"Programacion orientada a objetos","Modelos y bases de datos","Modelos y bases de datos       ","Modelos y                  bases de datos"};
        Conjunto materias=new Conjunto(dMaterias);
        assertEquals(2,materias.cardinal());
        assertTrue(materias.pertenece(dMaterias[0]));
        assertTrue(materias.pertenece(dMaterias[1]));
        assertFalse(materias.pertenece(dMaterias[2]));
    }    
   
    
    @Test
    public void deberiaPoderExpresarUnConjuntoComoCadena(){
        String [] dCaso={"uno","dos","Tres","Cuatro"};
        Conjunto caso=new Conjunto(dCaso);
        String resultado="{CUATRO,DOS,TRES,UNO}";
        assertEquals(resultado,caso.toString()); 
    }
   
    /**
     * En está prueba se quiere comprobar la union de dos conjuntos 
     */
    @Test
     public void deberiaUnirConjunto(){
        String [] conjunto1={"AGUA","LUZ"};
        String [] conjunto2={"FUEGO","AIRE"};
        Conjunto conj1=new Conjunto(conjunto1);
        Conjunto conj2=new Conjunto(conjunto2);
        assertEquals(4,conj1.union(conj2).cardinal());
        
        }
    
    /**
     *  está prueba se quiere comprobar la intersección entre dos conjuntos
     */
    @Test
    public void deberiaIntersectarConjunto(){
        String [] conjunto1={"AGUA","LUZ","FUEGO","AIRE"};
        String [] conjunto2={"FUEGO","AIRE"};
        Conjunto conj1=new Conjunto(conjunto1);
        Conjunto conj2=new Conjunto(conjunto2);
        assertEquals(2,conj1.interseccion(conj2).cardinal());
    }
    
    /**
     * En está prueba se quiere comprobar la diferencia entre dos conjuntos
     * 
     */
    @Test
    public void deberiarestarConjunto(){
        String [] conjunto1={"AGUA","LUZ","FUEGO","AIRE"};
        String [] conjunto2={"FUEGO","AIRE","TIERRA"};
        Conjunto conj1=new Conjunto(conjunto1);
        Conjunto conj2=new Conjunto(conjunto2);
        assertEquals(3,conj1.diferencia(conj2).cardinal());
        
    }
    
    
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
}
