
/**
 * Asignar un identificador a cada copia de un libro.
 * Contener el estado del libro: prestado, disponible, retrasado
 * 
 * @author(Kevin Anaya, Laura Mendez)
 * @version (1)
 */
import java.time.LocalDate;
public class Ejemplar
{
    private String estado;
    private int id;
    private Libro libro;
    private boolean prestado=false;
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
// para solicitar un prestamo primero hay quecrear un objeto de tipo prestamo
// el cual tienela informacion del lector 
    public boolean prestarEjemplar(Prestamo prestamo){
        if(prestado== false){
            prestado = true;
            LocalDate inicio = LocalDate.now();
            prestamo.setInicio(inicio);
            prestamo.setFin(inicio.plusDays(30));
            
        }
        else{
            System.out.println("Este ejemplar no esta disponible para prestamo");
        }
        return prestado;
    }
    
    public boolean devolverEjemplar(){
        if(prestado== true){
            prestado = false;
        }
        else{
            System.out.println("Este ejemplar ya ha sido entregado o no ha sido prestado");
        }
        return prestado;
    }
}
