
/**
 * Quien hace uso de los libros.
 * 
 * @author(Kevin Anaya, Laura Mendez)
 * @version (1)
 */
import java.time.LocalDate;
import java.util.Scanner; 
public class Lector extends Usuario
{
    // instance variables - replace the example below with your own
    private LocalDate fechaNacimiento;
    private String nombre, apellidos, direccion;
    private long telefono;

    /**
     * Constructor for objects of class Lector
     */
    public Lector(String nombreUsuario, String contraseña, String correo, int id, LocalDate fechaNacimiento, String nombre, String apellidos, String direccion, long telefono) {
        super(nombreUsuario, contraseña, correo, id);
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(int teelfono) {
        this.telefono = telefono;
    }

}
