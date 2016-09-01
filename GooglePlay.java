import java.util.ArrayList;
/**
 * Write a description of class GooglePlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos;

    /**
     * Constructor for objects of class GooglePlay
     */
    public GooglePlay()
    {
        this.usuarios = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void  addUsuario(Usuario usuario)
    {
        usuarios.add(usuario);
    }
    public int getNumeroUsuarios(){
        return usuarios.size();
    }
    
    public void addProducto(Producto producto){
        productos.add(producto);
    }
    
    public int getNumeroProductos(){
        return productos.size();
    }
    
}
