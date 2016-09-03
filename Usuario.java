import java.util.ArrayList;
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{

    private String correo;
    public ArrayList<Producto> productos;

    public Usuario(String correo)
    {
        this.correo = correo;
        productos=new ArrayList<>();
    }

    /**
     * nos dice el correo del usuario
     */
    public String getNombreCuenta(){
        {

            return this.correo;
        }
    }

    public void addProducto(Producto producto){
        productos.add(producto); 
    }

    /**
     * devuelve true si encuentra el producto en la lista de productos del usuario
     */
    public boolean buscarProducto(Producto producto){
        boolean encontrado = false; //partimos que el producto no esta repetido
        for(int i=0; i< productos.size() ; i++){
            if(productos.get(i)==producto){
                encontrado = true;
            }
        }
        return encontrado;
    }
}
