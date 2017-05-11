import java.util.*;
public class GooglePlay
{
    private ArrayList <Usuario> usuarios;
    private ArrayList <Producto> productos;

    /**
     * Constructor for objects of class GooglePlay
     */
    public GooglePlay()
    {
        //ArrayList que almacena usuarios;
        usuarios = new ArrayList<>();
        //ArrayList que almacena productos;
        productos = new ArrayList<>();
    }
    
   /**
    * Método que devuelve el número de usuarios.
    */
    public int getNumeroUsuarios()
    {
        //comprobamos ell tamaño del arrayList
        return usuarios.size();
    }

    /**
     * Método que devuelve el número de usuarios.
     */
    public void addUsuario(Usuario usuario)
    {
        usuarios.add(usuario);
    }

    /**
     * Método que devuelve el número de productos.
     */
    public int getNumeroProductos()
    {
        return productos.size();
    }

    /**
     * Método que añade productos.
     */
    public void addProducto(Producto producto)
    {
        productos.add(producto);
    }
}
