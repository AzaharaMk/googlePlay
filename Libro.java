public class Libro extends ProductoMultimedia
{
    private int numPaginas;
    private boolean ficcion;
    

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String nombreLibro,int anioCreacion,int numPaginas,boolean ficcion)
    {
       //invocamos al constructor de la clase ProductoMultimedia
       super(nombreLibro,anioCreacion);
       this.numPaginas = numPaginas;
       this.ficcion = ficcion; //true en caso de que sea de ficción y false en caso contrario
    }

   /**
    * Devuelve el número de páginas del libro.
    */
   public int getNumeroPaginas()
   {
       return numPaginas;
   }
   
   /**
    * Devuelve un booleano con true si el libro es de ficción y false en caso contrario
    */
   public boolean getFiccion()
   {
       return ficcion;
   }

	public double precioProducto()
	{
		return 0;
	}
}
