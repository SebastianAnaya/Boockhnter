
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
    private boolean estadoPrestado;//si es false esta disponible y si es true esta prestado
    private int id;
    private Libro libro;
   // private boolean prestado=false;
    /**
     * Constructor for objects of class Libro
     */
    public Ejemplar(boolean estadoPrestado, int id, Libro libro) {
        this.estadoPrestado = estadoPrestado;
        this.id = id;
        this.libro = libro;
    }
    
    public Libro getLibro() {
        return libro;
    }

    public boolean getEstado() {
        return estadoPrestado;
    }

    public void setEstado(boolean estadoPrestado) {
        this.estadoPrestado = estadoPrestado;
    }

    public int getId() {
        return id;
    }
// para solicitar un prestamo primero hay quecrear un objeto de tipo prestamo
// el cual tienela informacion del lector 
    public boolean prestarEjemplar(Prestamo prestamo){
        String mensaje;
        if(estadoPrestado== false){
            estadoPrestado = true;
            LocalDate inicio = LocalDate.now();
            prestamo.setInicio(inicio);
            prestamo.setFin(inicio.plusDays(30));
            mensaje = "El ejemplar se presto con exito";
        }
        else{
            mensaje = "Este ejemplar no esta disponible para prestamo";
        }
        return estadoPrestado;
    }
    
    public boolean devolverEjemplar(){
        String mensaje;
        if(estadoPrestado== true){
            estadoPrestado = false;
            mensaje = "El ejemplar se devolvio con exito";
        }
        else{
            mensaje = "Este ejemplar ya ha sido entregado o no ha sido prestado";
        }
        return estadoPrestado;
    }
}
