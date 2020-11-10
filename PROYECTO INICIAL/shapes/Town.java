import java.awt.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 * Write a description of class Town here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/**
 * en esta clase se crea una ciudad
 */
public class Town 
{
    // instance variables - replace the example below with your own

    private ArrayList<Location> localidades;
    private ArrayList<Street> caminos;
    private ArrayList<Sign> señales;
    private Stack undo;
    private Stack redo;
    private Stack undoObj;
    private Stack redoObj;
    private String[] colores = {"red","black","blue","yellow","green","magenta","cyan","darkGray","gray","darkGray","darkGray","orange","pink"};
    /**
     * Factory method to get the canvas singleton object.
     */
    public static Canvas getCanvas(){
        return Canvas.getCanvas();
    }

    /**
     * Constructor for objects of class Town
     */
    public Town(int width, int height)
    {
        new Canvas("Ciudad",width,height,Color.white);
        localidades = new ArrayList<Location>();
        caminos = new ArrayList<Street>();
        señales = new ArrayList<Sign>();
        undo= new Stack();
        redo= new Stack();
        undoObj= new Stack();
        redoObj= new Stack();
    }

    public Town(int width, int height, int locations, int streets, int Nsigns)
    {
        Random r = new Random();
        int cont = 0;
        new Canvas("Ciudad",width,height,Color.white);
        localidades = new ArrayList<Location>();
        caminos = new ArrayList<Street>();
        señales = new ArrayList<Sign>();
        undo= new Stack();
        redo= new Stack();
        undoObj= new Stack();
        redoObj= new Stack();
        for (int i =0 ; i < locations;i++){
            addLocation(colores[cont%13], r.nextInt(width-50), r.nextInt(height-50));
            cont+=1;
        }
        for (int i =0 ; i < streets;i++){
            int a = r.nextInt(localidades.size());
            int b = r.nextInt(localidades.size());
            while (a==b){
                a = r.nextInt(localidades.size());
            }
            Location l1 = localidades.get(a);
            Location l2 =localidades.get(b);
            addStreet(l1.getColor(), l2.getColor());   
        }
        for (int i =0 ; i < signs;i++){
            int a = r.nextInt(localidades.size());
            int b = r.nextInt(localidades.size());
            while (a==b){
                a = r.nextInt(localidades.size());
            }
            Location l1 = localidades.get(a);
            Location l2 =localidades.get(b);
            addSign(l1.getColor(), l2.getColor());   
        }
    }

    public Town(int nLocalidades, String[] calles)
    {
        Random r = new Random();
        int cont = 0;
        new Canvas("Ciudad",800,800,Color.white);
        localidades = new ArrayList<Location>();
        caminos = new ArrayList<Street>();
        señales = new ArrayList<Sign>();
        undo= new Stack();
        redo= new Stack();
        undoObj= new Stack();
        redoObj= new Stack();
        for (int i =0 ; i < nLocalidades;i++){
            addLocation(colores[cont%13], r.nextInt(800-50), r.nextInt(800-50));
            cont+=1; 
        }
        for (int i =0 ; i < calles.length;i++){
            String cadena = calles[i];
            String[] datos = cadena.split(" ");
            int a = Integer.parseInt(datos[0])-1;
            int b = Integer.parseInt(datos[1])-1;
            addStreet(localidades.get(a).getColor(), localidades.get(b).getColor());
        }
    }
    /**
     * en este metodo se agrega una localidad
     * @parameter color String es el color de la localidad que se quiere agregar
     * @parameter x es la posicion en x en la que se quiere ubicar la localidad
     * @parameter y es la posicion en x en la que se quiere ubicar la localidad
     */
    public void addLocation(String color,int x, int y) 
    {
        boolean igual=false;
        for (int i=0;i<localidades.size();i++){
            if (color.equals(localidades.get(i).getColor())){
                igual=true;
            }
        }
        if (igual){
            JOptionPane.showMessageDialog(null, "ya existe una localidad con ese color");
        }
        else if(!igual){ 
            Location local=new Location(color,x,y);
            localidades.add(local);
            undo.push("addLocation");
            undoObj.push(local);
        }
    }

    public void delLocation(String color)
    {
        boolean encontrado = false;
        int i=0;
        while( i<localidades.size() && !encontrado) {
            if (localidades.get(i).getColor().equals(color)){
                Canvas.getCanvas().erase(localidades.get(i).getCircle());
                encontrado = true;
                undoObj.push(localidades.get(i));
                localidades.remove(localidades.get(i));
                undo.push("delLocation");
            }
        }

    }

    public void addStreet(String locationA, String locationB){
        Location la = null;
        Location lb = null;
        for (int i = 0; i < localidades.size(); i++ ){
            if (localidades.get(i).getColor().equals(locationA)){
                la = localidades.get(i);
            }
            if (localidades.get(i).getColor().equals(locationB)){
                lb = localidades.get(i);
            }
        }
        if (la != null && lb!= null){
            Street calle = new Street(la,lb);
            caminos.add(calle);
            undo.push("addStreet");
            undoObj.push(calle);
        }

    }

    public void delStreet(String locationA, String locationB)
    {
        boolean encontrado = false;
        int i=0;
        while( i<caminos.size() && !encontrado) {
            if (((caminos.get(i).getlo1().getColor()==locationA)||(caminos.get(i).getlo1().getColor()==locationB))&&((caminos.get(i).getlo2().getColor()==locationB)||(caminos.get(i).getlo2().getColor()==locationA))){
                Canvas.getCanvas().erase(caminos.get(i));
                encontrado = true;
                undo.push("delStreet");
                undoObj.push(caminos.get(i));
                caminos.remove(caminos.get(i));
            }
        }

    }

    public void addSign(String locationA, String locationB){
        Location la = null;
        Location lb = null;
        for (int i = 0; i < localidades.size(); i++ ){
            if (localidades.get(i).getColor().equals(locationA)){
                la = localidades.get(i);
            }
            if (localidades.get(i).getColor().equals(locationB)){
                lb = localidades.get(i);
            }
        }
        if (la != null && lb!= null){
            Sign señal = new Sign();
            señales.add(señal);
            undo.push("addSign");
            undoObj.push(señal);
        }

     }

    public void delSign(String locationA, String locationB)
    {
        boolean encontrado = false;
        int i=0;
        while( i<señales.size() && !encontrado) {
            if (((señales.get(i).getlo1().getColor()==locationA)||(señales.get(i).getlo1().getColor()==locationB))&&((señales.get(i).getlo2().getColor()==locationB)||(señales.get(i).getlo2().getColor()==locationA))){
                Canvas.getCanvas().erase(señales.get(i).getTriangle());
                encontrado = true;
                undo.push("delSign");
                undoObj.push(señales.get(i));
                señales.remove(señales.get(i));
            }
        }

    }

    public ArrayList roadMap(){
        ArrayList res = new ArrayList();
        res.add(caminos);
        res.add(localidades);
        return res;
    }

    public void redo(){
        String comando = (String)redo.pop();
        if (comando.equals("addLocation"))
        {   
            Location l = (Location)redoObj.pop();
            addLocation(l.getColor(),l.getX(),l.getY());
        }
        else if (comando.equals("delLocation"))
        {   
            Location l = (Location)redoObj.pop();
            delLocation(l.getColor());
        }
        else if (comando.equals("addStreet"))
        {   
            Street s = (Street)redoObj.pop();
            addStreet(s.getlo1().getColor(),s.getlo2().getColor());
        }
        else if (comando.equals("delStreet"))
        {   
            Street s = (Street)redoObj.pop();
            delStreet(s.getlo1().getColor(),s.getlo2().getColor());
        }
        else if (comando.equals("addSign"))
        {   
            Sign s = (Sign)redoObj.pop();
            addSign(s.getlo1().getColor(),s.getlo2().getColor());
        }
        else if (comando.equals("delSign"))
        {   
            Sign s = (Sign)redoObj.pop();
            delSign(s.getlo1().getColor(),s.getlo2().getColor());
        }
    }

    public void undo(){
        String comando = (String)undo.pop();
        redo.push(comando);
        if (comando.equals("addLocation"))
        {   
            Location l = (Location)undoObj.pop();
            delLocation(l.getColor());
            redoObj.push(l);
        }
        else if (comando.equals("delLocation"))
        {   
            Location l = (Location)undoObj.pop();
            addLocation(l.getColor(),l.getX(),l.getY());
            redoObj.push(l);
        }
        else if (comando.equals("addStreet"))
        {   
            Street s = (Street)undoObj.pop();
            delStreet(s.getlo1().getColor(),s.getlo2().getColor());
            redoObj.push(s);
        }
        else if (comando.equals("delStreet"))
        {   
            Street s = (Street)undoObj.pop();
            addStreet(s.getlo1().getColor(),s.getlo2().getColor());
            redoObj.push(s);
        }
        else if (comando.equals("addSign"))
        {   
            Sign s = (Sign)undoObj.pop();
            delSign(s.getlo1().getColor(),s.getlo2().getColor());
            redoObj.push(s);
        }
        else if (comando.equals("delSign"))
        {   
            Sign s = (Sign)undoObj.pop();
            addSign(s.getlo1().getColor(),s.getlo2().getColor());
            redoObj.push(s);
        }
        undo.pop();
        undoObj.pop();
        
    }

    public void makeVisible()
    {
        Canvas.getCanvas().setVisible(true);
    }

    public void makeInvisible()
    {
        Canvas.getCanvas().setVisible(false);
    }

    public void finish(){
        System.exit(0);
    }

}
