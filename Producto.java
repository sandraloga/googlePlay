/**
 * Abstract class Producto - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Producto
{
  
   private int cuantasVendidas; //contador ventas
   public static final double PRECIO_INICIAL= 0.99;
   
   
    public Producto(){
      
       this.cuantasVendidas = 0;
    }
 
    public abstract String getNombreProducto();
    
    
  
    public abstract double precio();
    
    public void incrementarVentas(){
        this.cuantasVendidas++;
    }
    
    public int getCuantasVendidas(){
        return this.cuantasVendidas;
    }
    
}
