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
     * dos dice el correo del usuario
     */
    public String getNombreCuenta(){
        {

            return this.correo;
        }
    }
    public void addProducto(Producto producto){
       productos.add(producto); 
    }
}
