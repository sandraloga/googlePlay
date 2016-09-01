
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    private String nombre;
    private float espacio;
    private String categoria;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombre,float espacio, Enum categoria)
    {
       this.nombre = nombre;
       this.espacio = espacio;
       this.categiria = categoria;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
