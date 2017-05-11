
/**
 * Write a description of class ProductoMultimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  class ProductoMultimedia extends Producto
{
    private int anioCreacion;

    /**
     * Constructor for objects of class ProductoMultimedia
     */
    public ProductoMultimedia(String nombreProducto,int anioCreacion)
    {
        //Invocamos al constructor de la clase Producto.
        super(nombreProducto);
        this.anioCreacion = anioCreacion;
    }
    
    /**
     * Devuelve el título del producto
     */
    public String getTitulo()
    {
        return getPorducto();
    }
    
    /**
     * Devulve el año de la creación en la que se hizo el producto
     */
    public int getAno()
    {
        return anioCreacion;
    }
}
