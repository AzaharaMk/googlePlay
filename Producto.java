
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Producto
{
    private String nombreProducto;
    private int numeroVecesCompradas;

    /**
     * Constructor for objects of class Producto
     */
    public Producto(String nombreProducto)
    {
        this.nombreProducto = nombreProducto;
        numeroVecesCompradas = 0;
    }

    /**
     * Método privado que guarda el nombre del producto.
     */
    public String getProducto()
    {
        return nombreProducto;
    }

    /**
     * Método que incrementa el numero de veces que s eha vendido un producto.
     */
    public void incrementarVecesVendidas()
    {
        numeroVecesCompradas++;
    }

    /**
    Método que devuelve el numero de veces  que se ha vendido el producto.
     */
    public int numeroDeVecesVendidas()
    {
        return numeroVecesCompradas;
    }

    /**
    	Método abstracto que devuelve el precio del producto.
     */
    public abstract double precioProducto();

}
