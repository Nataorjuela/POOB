import java.util.ArrayList;

public class Combo{
    public final static int COSTO_POR_OMISION=10000;
    
    private String nombre;
    private int descuento;
    private ArrayList<Producto> productos;
    
    public Combo(String nombre, int descuento){
        this.nombre=nombre;
        this.descuento=descuento;
        productos= new ArrayList<Producto>();
    }

    public void adProducto(Producto p){
        productos.add(p);
    }
    
    /**
     * Calcula el precio de un combo
     * @return el precio del combo
     * @throws ComboExcepcion COMBO_VACIO, si no tiene productos; PRODUCTO_DESCONOCIDO, si hay un producto sin nombre; 
     * y PRECIO_DESCONOCIDO si un producto tiene error en el precio 
     */
    public int precio() throws ComboExcepcion{
       return 0;
    };
    
    /**
     * Calcula el precio por omision
     * Para los productos con problemas se asume COSTO_POR_OMISION
     * @return el costo de un combo
     * @throws ComboExcepcion COMBO_VACIO, si no tiene productos
     */
    public int precioOmision() throws ComboExcepcion{
        return 0;
    }   
    
    
    
    /**
     * Calcula el precio asumido
     * Se asume que el precio de los productos desconocidos es el del primer producto conocido
     * Se asume que el precio de los productos sin precio es el del ultimo producto 
     * Si el combo esta vacio el precio asumido es cero
     * @return el precio asumido de un prodcto
     */
    public int precioAsumido(){
        return 0;
    }   
    
    
    
}
