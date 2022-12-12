
/**
 * Crea la estructua basica de los usuarios de la aplicacion
 * 
 * @author (Kevin Anaya, Laura Mendez) 
 * @version (1)
 */
public class Usuario 
{
    private String nombreUsuario, contraseña, correo;
    private int id;

    /**
     * Constructor for objects of class Libro
     */
    public Usuario(String nombreUsuario, String contraseña, String correo, int id) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId() {
        return id;
    }
}
