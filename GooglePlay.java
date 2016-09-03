import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
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

    public double comprar (String correo , String nombreProducto){
        double precio = -1;
        int indiceUsuario;
        int indiceProducto;
        boolean YaComprado;
        Usuario usuario = null;
        Producto producto = null;
        indiceUsuario = indiceUsuario(correo);
        indiceProducto = indiceProducto(nombreProducto);
        if (indiceProducto!=-1 && indiceUsuario!=-1) {
            usuario=usuarios.get(indiceUsuario);
            producto=productos.get(indiceProducto);
            if (!usuario.buscarProducto(producto)) {
                precio = producto.precio();

                usuario.addProducto(producto);
                producto.incrementarVentas();

            }
        }

        return precio;

    }

    /**
     * Implementa un método que devuelva el identificador y el número de ventas de los 3 productos que han tenido más ventas ordenados
     * de mayor a menor ventas. En caso de empate en ventas no se define criterio para la ordenación
     */
    public String topVentas(){
        String mensaje = "";
        ordenarProductos(productos);

        mensaje ="\"" +  productos.get(0).getNombreProducto() + "\"( " + productos.get(0).getCuantasVendidas() + ")  "
        +"-\""+ productos.get(1).getNombreProducto() + "\"( " + productos.get(1).getCuantasVendidas() + ") - "
        + "\"" + productos.get(2).getNombreProducto() + "\"( " + productos.get(2).getCuantasVendidas() + ")";

        return mensaje;
    }

    public void ordenarProductos(ArrayList<Producto> ordenado) {// ordenado de menor a mayor

        Collections.sort(ordenado, new Comparator() {
                @Override
                public int compare(Object objeto1, Object objeto2) {

                    int r = 0;
                    if (((Producto) objeto1).getCuantasVendidas() > (((Producto) objeto2)).getCuantasVendidas()) {
                        r = -1;
                    } else if (((Producto) objeto1).getCuantasVendidas() < (((Producto) objeto2)).getCuantasVendidas()) {
                        r = 1;
                    } else {
                        r = 0;
                    }
                    return r;
                }
            });

    }

    private int indiceUsuario(String idCliente) {
        int existe = -1;
        for(int i=0; i< usuarios.size() ; i++){
            if(usuarios.get(i).getNombreCuenta().compareToIgnoreCase(idCliente) == 0){
                existe =i;
            }
        }
        return existe;
    }

    private int indiceProducto(String nombreProducto){
        int existe = -1;
        for(int i=0; i< productos.size() ; i++){
            if(productos.get(i).getNombreProducto().compareToIgnoreCase(nombreProducto) == 0){
                existe =i;
            }
        }
        return existe;
    }

}
