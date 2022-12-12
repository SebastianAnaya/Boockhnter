
/**
 * Asignar un identificador a cada copia de un libro.
 * Contener el estado del libro: prestado, disponible, retrasado
 * 
 * @author(Kevin Anaya, Laura Mendez)
 * @version (1)
 */
public class Ejemplar
{
    private String estado;
    private int id;
    private Libro libro;

    /**
     * Constructor for objects of class Libro
     */
    public Ejemplar(String estado, int id, Libro libro) {
        this.estado = estado;
        this.id = id;
        this.libro = libro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    
}
