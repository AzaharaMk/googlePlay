
public class Usuario
{
    private String correo;

    
    public Usuario(String correo)
    {
        this.correo = correo;
    }
    
    /**
     * Devuelve el correo del  usuario
     */
    public String getNombreCuenta()
    {
        return correo;
    }

    }
