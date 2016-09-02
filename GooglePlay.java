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
    //private static final float PRECIO_INICIAL = 0.99;
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
    
    public double comprar (String correo , String nombreProducto){
        double precio=-1;
        boolean encontradoCorreo=false;   //partimos que no existe el coreeo
        boolean encontradoProducto=false;  //partimos que no existe el producto
        int indice=0;//indice del producto
        int indiceUsuario=-1; //indice ususario
        //buscamos el correo del usuario
        for(int i=0; i<=usuarios.size();i++){
            if(usuarios.get(i).getNombreCuenta().equalsIgnoreCase(correo)){
                encontradoCorreo=true;
                indiceUsuario=i;
                
            }
        }
        // buscamos el nombre del producto
        for(int i=0; i<=productos.size();i++){
            if(productos.get(i).getNombreProducto().equalsIgnoreCase(nombreProducto)){
                encontradoProducto=true;
                indice = i;
            }
        }
        if (encontradoCorreo && encontradoProducto){
            precio= productos.get(indice).precio(); //invocamos al el metodo abstrac del precio dependiendo de cual sea el producto
            productos.get(indice).incrementarVentas(); //incrementamos el atributo de ventas de ese producto
            usuarios.get(indiceUsuario).addProducto(productos.get(indice)); // añado el producto al array de productos del usuario
        }
        return precio;
        
    }
    
    
   
    
    
    
}
