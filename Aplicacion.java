
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    private String nombre;
    private double tamanio;
    private Enum categoria;
    private static int CONTADOR=0;
    private static final double PRECIO_INICIAL = 0.99;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombre,double tamanio, Enum categoria)
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

    public double getTamanoEnMB(){
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

    public double precio(){
        double precio= PRECIO_INICIAL;
        if(getCuantasVendidas() > 2){
            if(getCategoria()==Categoria.JUEGOS){
                precio=5;
            }else if(getCategoria()==Categoria.PRODUCTIVIDAD){
                precio=10;
            }else{
                precio=2;
            }
           
        }
          return precio;
    }
}
