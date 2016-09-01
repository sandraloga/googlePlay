
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    private int duracion;
    private boolean calidadFull;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String titulo, int anio, int duracion, boolean calidadFull)
    {
       super(titulo,anio);
       this.duracion = duracion;
       this.calidadFull = calidadFull;
    }

    /**
     * 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
