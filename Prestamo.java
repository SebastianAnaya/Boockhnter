
/**
 * Dar fecha de inicio y de finalización del periodo de préstamo de un ejemplar 
 * Controlar el retraso en la entrega de un libro. 
 * 
 * @author (Kevin Anaya, Laura Mendez) 
 * @version (1)
 */
import java.time.LocalDate;
public class Prestamo 
{
    private LocalDate inicio;
    private LocalDate fin;
    private Ejemplar ejemplar;
    private Lector lector;

    /**
     * Constructor for objects of class Libro
     */
    public Prestamo(Lector lector, Ejemplar ejemplar){
        this.lector=lector;
    }
    public Prestamo(Lector lector , LocalDate inicio, LocalDate fin) {
        this.inicio = inicio;
        this.fin = fin;
        this.lector = lector;
        this.ejemplar = ejemplar;
    }
    //aceptar un prestamo creado apartir de un ejemplar y lector existentes 
    //usado por bibliotcario
    public void aceptarPrestamo(){
        ejemplar.prestarEjemplar();
        if(ejemplar.getEstado()){
            inicio = LocalDate.now();
            fin = inicio.plusDays(30);
        }
    }
    
    public Ejemplar getEjemplar() {
      return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }
}
