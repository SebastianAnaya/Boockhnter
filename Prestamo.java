
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
    
    // instance variables - replace the example below with your own
    private LocalDate inicio;
    private LocalDate fin;
    private Ejemplar ejemplar;

    /**
     * Constructor for objects of class Libro
     */
    public Prestamo(Ejemplar ejemplar, LocalDate inicio, LocalDate fin) {
        this.inicio = inicio;
        this.fin = fin;
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
