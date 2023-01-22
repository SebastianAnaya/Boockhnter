
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
    
    /**
     * 
     * Este metodo se usa para aceptar el prestamo de un Ejemplar
     * es invocado desde un objeto Prestamo que contiene a su vez un Ejemplar 
     * 
     * @return Devuelve el valor booleano del estado deprestamo del ejemplar, false significa que no esta prestado y true que si lo esta
     * 
     * 
     */
    public boolean prestarEjemplar(){
        String mensaje;
        if(estadoPrestado== false){
            estadoPrestado = true;
            mensaje = "El ejemplar se presto con exito";
        }
        else{
            mensaje = "Este ejemplar no esta disponible para prestamo";
        }
        return estadoPrestado;
    }
    
    /**
     * 
     * Este metodo se usa para reasignar el estado  disponible de un libro una vez  se haya devuelto a biblioteca
     * 
     * @return Devuelve el valor booleano del estado deprestamo del ejemplar, false significa que no esta prestado y true que si lo esta
     * 
     * 
     */
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
