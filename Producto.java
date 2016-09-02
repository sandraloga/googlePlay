/**
 * Abstract class Producto - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Producto
{
   private static  int contadorProductos=0;
   private int cuantasVendidas; //contador ventas
   
   
    public Producto(){
        contadorProductos++;
    
    }
 
    public abstract String getNombreProducto();
    
    
    private int getcontadorProductos(){
        return contadorProductos;
    }
    public abstract double precio();
    
    public void incrementarVentas(){
        this.cuantasVendidas++;
    }
    
    public int getCuantasVendidas(){
        return this.cuantasVendidas;
    }
    
}
