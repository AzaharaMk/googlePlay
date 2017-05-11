import java.util.*;
public class Usuario
{
    private String correo;
    private ArrayList<Producto> productosComprados;

    public Usuario(String correo)
    {
        //Inicializamos el arrayList.
        productosComprados = new ArrayList<>();
        this.correo = correo;
    }

    /**
     * Devuelve el correo del  usuario
     */
    public String getNombreCuenta()
    {
        return correo;
    }

    /**
    Método que añade productos al arrayList.
     */
    public void addProductoComprado(Producto producto){
        productosComprados.add(producto);
    }

}
