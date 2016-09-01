
/**
 * Write a description of class Pelicula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
   private int duracion;
   private int calidad;

    /**
     * Constructor for objects of class Pelicula
     */
    public Pelicula(String titulo, int anio, int duracion , int calidad)
    {
       super(titulo,anio);
       this.duracion = duracion;
       this.calidad = calidad;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getDuracion()
    {
       
        return this.duracion;
    }
    
    public String getCalidad(){
        String calidad = "";
        if(this.calidad>=1080){
            calidad="FullHD";
        }else{
            calidad="HD";
        }
        
        return calidad;
    }
    public float precio(){
        float precio =0;
        if(getCalidad().equalsIgnoreCase("FullHD")){
            precio=10;
        
        
        }else{
            precio=5;
        }
        if(super.getAno()<2000){
            precio/=2;
        }
        return precio;
    }
}
