
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
    private static int CONTADOR=0;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombre,float tamanio, Enum categoria)
    {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.categoria = categoria;
        CONTADOR++;

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

    @Override
    public String  getNombreProducto(){
        return getNombre();
    }

    private int getContador(){
        return CONTADOR;
    }  

    public float precio(){
        float precio = 0.99f;
        if(CONTADOR>2){
            if(getCategoria()==Categoria.JUEGOS){
                precio=5;
            }
        }else if(getCategoria()==Categoria.PRODUCTIVIDAD){
            precio=10;
        }else{
            precio=2;
        }
        return precio;
    }

}
