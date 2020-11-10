package dominio;
import java.util.*;

public class Isla{
    public static final int MAXIMO = 500;
    private static Isla isla = null;

    public static Isla demeIsla() {
        if (isla==null){
            isla=new Isla();
        }
        return isla;
    }

    private static void nuevaIsla() {
        isla=new Isla();
    }   

    public static void cambieIsla(Isla d) {
        isla=d;
    }       

    private ArrayList<EnIsla> elementos;
    private int tesoroPosX;
    private int tesoroPosY;
    private boolean encontraronTesoro;

    private Isla() {
        elementos= new ArrayList<EnIsla>();
        tesoroPosX = (int)(Math.random() * MAXIMO);
        tesoroPosY = (int)(Math.random() * MAXIMO);
        encontraronTesoro=false;
    }

    public void algunosEnIsla(){  
        Pirata jack=new Pirata(demeIsla(),"jack",50,60);
        Pirata elizabeth=new Pirata(demeIsla(),"elizabeth",80,65);
        Rebelde reb=new Rebelde(demeIsla(),"henry",150,150);
        Rebelde reb2=new Rebelde(demeIsla(),"corina",200,200);
        Palmera p = new Palmera(demeIsla(),490,490);
        Palmera p1 = new Palmera(demeIsla(),10,10);
        Palmera p2 = new Palmera(demeIsla(),10,500);
        Palmera p3 = new Palmera(demeIsla(),500,10);
        Minucioso min = new Minucioso(demeIsla(),"ada ",350,350);
        Minucioso min2 = new Minucioso(demeIsla(),"turing ",400,400);
        Camaleon cam1 = new Camaleon(demeIsla(),"cam1 ",150,350);
        Camaleon cam2 = new Camaleon(demeIsla(),"cam2 ",150,400);
        Mapa map = new Mapa(demeIsla(),20,450);
        elementos.add(jack);
        elementos.add(elizabeth);
        elementos.add(reb);
        elementos.add(reb2);
        elementos.add(p);
        elementos.add(p1);
        elementos.add(p2);
        elementos.add(p3);
        elementos.add(min);
        elementos.add(min2);
        elementos.add(cam1);
        elementos.add(cam2);
        elementos.add(map);
    }  

    public EnIsla demeEnIsla(int n){
        EnIsla h=null;
        if (1<=n && n<=elementos.size()){
            h=elementos.get(n-1);
        }    
        return h; 
    }

    public void adicione(EnIsla e){
        elementos.add(e);
    }

    public int numeroEnIsla(){
        return elementos.size();
    }

    public boolean enTesoro(EnIsla e){
        boolean tesoro=(tesoroPosX==e.getPosicionX() && tesoroPosY==e.getPosicionY());
        encontraronTesoro = encontraronTesoro || tesoro;
        return tesoro;
    }     
    
    public void actuen(){
        for (int i=0;i<elementos.size();i++){
             elementos.get(i).actue();
         }
    }

    public void paren(){
        for (int i=0;i<elementos.size();i++){
             elementos.get(i).pare();
         }
    }    

    public void decidan(){
         for (int i=0;i<elementos.size();i++){
             elementos.get(i).decida();
         }
    }  
}
