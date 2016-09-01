
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    private int numPaginas;
    private boolean ficcion;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String titulo, int anio, int numPaginas, boolean ficcion)
    {
        super(titulo,anio);
        this.numPaginas = numPaginas;
        this.ficcion = ficcion;
    }

    /**
     * 
     */
    public int getNumeroPaginas()
    {
        return this.numPaginas;
    }

    public boolean getFiccion(){
        return ficcion;
    }
    
    public float precio(){
        float precio=(getNumeroPaginas()/100)*(2010-super.getAno());
        return precio;
        
    }

}
