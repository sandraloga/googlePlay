
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    private int duracion;
    private boolean ficcion;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String titulo, int anio, int duracion, boolean ficcion)
    {
        super(titulo,anio);
        this.duracion = duracion;
        this.ficcion = ficcion;
    }

    /**
     * 
     */
    public int getDuracion()
    {
        return this.duracion;
    }

    public boolean getFiccion(){
        return ficcion;
    }

}
