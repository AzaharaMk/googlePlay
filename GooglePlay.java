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

    /**
    Método que pasando el correo y el indentificador nos muestra si una compra
    es válida o no. En caso de que no sea válida devuelve -1 y en caso
    contrario devuelve el importe de la compra y la compra se realiza correctamente
     */
    public double comprar(String correo, String identificador)
    {
        double precioCompra = -1;
        boolean usuarioEncontrado = false;
        boolean productoEncontrado = false;
		int contadorUsuario = 0;
		int contadorProducto = 0;

        //Recorremos el arrayList de los usurios para comprobar si existe o no.
       while(contadorUsuario < productos.size() && !usuarioEncontrado)
        {
            //comprobamos si el correo existe
            if(usuarios.get(contadorUsuario).getNombreCuenta().equals(correo))
            {
                //En caso de encontrarlo cambia la variable a true.
                usuarioEncontrado = true;
            }
			contadorUsuario++;
        }

        //Recorremos el arrayList de los productos para comprobar si existe o no.

		while(contadorProducto < productos.size() && !productoEncontrado)
        {
            //comprobamos si el correo existe
            if(productos.get(contadorProducto).getProducto().equals(identificador))
            {
                //En caso de encontrarlo cambia la variable a true.
                productoEncontrado = true;
            }
			contadorProducto++;
        }
		
		//Mostramos el precio de la compra y que se ha realizado correctamente en caso de que existan.
		if(usuarioEncontrado == true && productoEncontrado == true)
		{
			precioCompra =0;
			System.out.println("Compra realizada con éxito");
			
		}


        return precioCompra;

    }
}
