
/**
 * Write a description of class ProductoMultimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  abstract class  ProductoMultimedia extends Producto
{
    private String titulo;
    private int anioCreacion;

    /**
     * Constructor for objects of class ProductoMultimedia
     */
    public ProductoMultimedia(String titulo, int anio)
    {
       this.titulo = titulo;
       anioCreacion = anio;
    }

    /**
     * 
     */
    public int getAno()
    {
        
        return this.anioCreacion;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
     @Override
     public String getNombreProducto(){
        return getTitulo();
        }
}
