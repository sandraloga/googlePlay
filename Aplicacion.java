
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    private String nombre;
    private float tamanio;
    private Enum categoria;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombre,float tamanio, Enum categoria)
    {
       this.nombre = nombre;
       this.tamanio = tamanio;
       this.categoria = categoria;
    
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombre()
    {
        
        return this.nombre;
    }
    
    public float getTamanoEnMB(){
        return this. tamanio;
    }
    
    public Enum getCategoria(){
        return this.categoria;
    }
}
