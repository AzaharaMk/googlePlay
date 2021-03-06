
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    private Categoria tipoCategoria;
    private double tamanioAplicacion;
	private double precioAplicacion;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombreAplicacion, double tamanioAplicacion,Categoria tipoCategoria)
    {
        //Invocamos al constructor de la clase Producto.
        super(nombreAplicacion);
        this.tamanioAplicacion = tamanioAplicacion;
        this.tipoCategoria = tipoCategoria;
		precioAplicacion = 0.99;
    }

    /**
     * Devuelve el nombre de la aplicación
     */
    public String getNombre()
    {
        return getProducto();
    }
    
     /**
     * Devuelve el tamaño de la aplicación
     */
    public double getTamanoEnMB()
    {
       return tamanioAplicacion;
    }
    
    /**
     * Método que devuelve el nombre de la categoría
     */
    public String getCategoria()
    {
        String cadenaADevolver = "";
       
        //comprobamos el contenido de enum y lo cambiamos a minusculas.
        if (tipoCategoria.toString().equals("MULTIMEDIA"))
        {
            cadenaADevolver = "Multimedia";
        }
 
        else if (tipoCategoria.toString().equals("JUEGOS"))
        {
            cadenaADevolver = "Juegos";
        }
        
        else if (tipoCategoria.toString().equals("PRODUCTIVIDAD"))
        {
            cadenaADevolver = "Productividad";
        }        
        
        else if (tipoCategoria.toString().equals("COMUNICACIONES"))
        {
            cadenaADevolver = "Comunicaciones";
        }
        
        return cadenaADevolver;
    }

	public double precioProducto()
	{
		String cadenaADevolver = "";
		switch(tipoCategoria)
		{
			case MULTIMEDIA:
				cadenaADevolver = "Multimedia";
				break;

			case JUEGOS:
				cadenaADevolver = "Juegos";
				break;

			case PRODUCTIVIDAD:
				cadenaADevolver = "Productividad";
				break;

			case COMUNICACIONES:
				cadenaADevolver = "Comunicaciones";
				break;
		}
        
		return 0;
	}
    
}
