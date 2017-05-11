
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
    public Pelicula(String nombrePelicula,int anioCreacion,int duracion, int calidad)
    {
        //Invocamos al constructor de la clase ProductoMultimedia.
        super(nombrePelicula,anioCreacion);
        this.duracion = duracion;
        this.calidad = calidad;
    }
    
    public int getDuracion()
    {
        return duracion;
    }
    
    /**
     * Devuelve la calidad de la película
     */
    public String getCalidad()
    {
        String nombreCalidad = "";
        /*comprobamos el tipo de calidad que se nos ha metido por parámetro Y poder
         * pasarlo a String.
         */
        if (calidad == 480)
        {
            nombreCalidad = "HD";
        }
        else
        {
            nombreCalidad = "FullHD";
        }
        return nombreCalidad;
    }

}
