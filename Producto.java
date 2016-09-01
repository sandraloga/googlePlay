/**
 * Abstract class Producto - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Producto
{
   private static  int contadorProductos=0;
   public static final float PRECIO_INICIAL = 0.99f;  
    public Producto(){
        contadorProductos++;
    
    }
 
    public abstract String getNombreProducto();
    
    
    private int getcontadorProductos(){
        return contadorProductos;
    }
    
}
