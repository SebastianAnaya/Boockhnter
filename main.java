        
/**
 * Ejecuta el programa por consola.
 * 
 * @author (Kevin Anaya, Laura Mendez) 
 * @version (1)
 */
import java.util.Scanner; 
import java.time.LocalDate;
import java.util.*;
public class main
{
   public static void main(String[]args){
       Lector[] lector = new Lector[]{new Lector("Sebastian1", "contras132", "correo1",1, LocalDate.of(2001, 11, 29),"kevin","anaya","direccion1",3123434),
       new Lector("Fabi0u", "contras321", "correo2",2, LocalDate.of(2001, 01, 01),"Fabiano","Hz","direccion2",2134123532),
       new Lector("Gyss", "contras134", "correo3",3, LocalDate.of(2001, 12, 31),"Gysselis","V","direccion3",3235547)};
       
       Libro[] libro = new Libro[]{new Libro("Romeo Y Julieta", "william SHakespeare", "Romance y ragedia", 1597),
        new Libro("Hamlet", "william SHakespeare", "Drama y ragedia", 1603),
        new Libro("La isla del tesoro", "Robert Louis Stevenson", "Novela, Ficción adulto joven, Ficción de aventuras", 1883)};
      
       Ejemplar[] ejemplar = new Ejemplar[]{new Ejemplar(false,1, libro[0]), new Ejemplar(false,2, libro[0]),
       new Ejemplar(false,3, libro[0]), new Ejemplar(false,4, libro[1]), new Ejemplar(false,5, libro[1]),
       new Ejemplar(false,6, libro[1]),new Ejemplar(false,7, libro[2]),new Ejemplar(false,8, libro[2]),
       new Ejemplar(false,9, libro[2])};
       ArrayList<Prestamo> prestamos = new ArrayList();
       Prestamo prestamo =  new Prestamo(lector[1], ejemplar[2]);
       prestamos.add(prestamo);
       int caso=1, consulta;
       String nombreUser;
       Scanner entrada = new Scanner (System.in);
       System.out.println("Desea ingreesar como Bibliotecario(1) o Lector(2). salir(0)");
       caso = entrada.nextInt();
       while(caso!=0){
           if(caso==1){
                System.out.println("Que desea hacer? "); 
                System.out.println( "1: Ver Usuarios  2: Ver libros ");
                System.out.println("3: Ejemplares de un libro   4: Ver solicitudes de prestamo   0: salir");
                caso = entrada.nextInt();
                while(caso!=0){
                    if(caso==1){
                           for(int i=0; i<lector.length; i++){
                               System.out.println(lector[i].getNombre());
                            }
                    }
                    else if(caso==2){
                           for(int i=0; i<libro.length; i++){
                               System.out.println(libro[i].getNombre());
                            }
                    }
                    else if(caso==3){ 
                        for(int i=0; i<ejemplar.length; i++){
                            System.out.println(ejemplar[i].getId() + "------" + ejemplar[i].getLibro().getNombre());
                        }
                        System.out.println("Que ejemplar quiere consultar si esta disponible?");
                        consulta = entrada.nextInt();
                        if(ejemplar[consulta-1].getId()==consulta && ejemplar[consulta-1].getEstado()==false) {
                                System.out.println("Este ejemplar de " + ejemplar[consulta-1].getLibro().getNombre()+ " esta disponible.");
                            }
                            else{
                                System.out.println("Este ejemplar de " + ejemplar[consulta-1].getLibro().getNombre()+ " NO esta disponible.");
                            } 
                    }
                    else if (caso==4){
                        for(int i=0; i<prestamos.size(); i++){
                             System.out.println(i+1 + "------" +prestamos.get(i).getLector().getNombreUsuario());
                        }
                        System.out.println("Que desea hacer? "); 
                        System.out.println( "1: Aceptar prestamo  otro: Salir ");
                        caso = entrada.nextInt();
                        if(caso == 1){
                            System.out.println("Ingrese el numero que acompaña su nombre de usuario para realizar un prestamo");
                            consulta = entrada.nextInt();
                            prestamos.get(consulta-1).aceptarPrestamo(); 
                        }
                    }
                    else{
                        System.out.println("Ingreso incorrecto");
                    }
                    System.out.println("Que desea hacer? "); 
                    System.out.println( "1: Ver Usuarios  2: Ver libros ");
                    System.out.println("3: Ejemplares de un libro   4: Ver solicitudes de prestamo   0: salir");
                    caso = entrada.nextInt();
                }
            }
            else if(caso==2){
                System.out.println("Que desea hacer? "); 
                    System.out.println( "1: Ver libros   2: Ejemplares de un libro");
                    System.out.println("3: Solicitar prestamo   0: salir");
                    caso = entrada.nextInt();
                while(caso!=0){
                    if(caso==1){
                       for(int i=0; i<libro.length; i++){
                           System.out.println(libro[i].getNombre());
                        }
                    }
                    else if(caso==2){ 
                        for(int i=0; i<ejemplar.length; i++){
                            System.out.println(ejemplar[i].getId() + "------" + ejemplar[i].getLibro().getNombre());
                        }
                        System.out.println("Que ejemplar quiere consultar si esta disponible?");
                        consulta = entrada.nextInt();
                        if(ejemplar[consulta-1].getId()==consulta && ejemplar[consulta-1].getEstado()==false) {
                                System.out.println("Este ejemplar de " + ejemplar[consulta-1].getLibro().getNombre()+ " esta disponible.");
                            }
                            else{
                                System.out.println("Este ejemplar de " + ejemplar[consulta-1].getLibro().getNombre()+ " NO esta disponible.");
                            } 
                    }
                    else if (caso==3){
                        System.out.println("Lista de usuarios");
                        for(int i=0; i<lector.length; i++){
                             System.out.println(i+1 + "------" + lector[i].getNombreUsuario());
                        }
                        System.out.println("Ingrese el numero que acompaña su nombre de usuario para realizar un prestamo");
                        consulta = entrada.nextInt();
                        System.out.println("Ingrese el numero que acompaña el nombre del ejemplar a prestar");
                        int consulta2 = entrada.nextInt();
                        prestamo = new Prestamo(lector[consulta-1], ejemplar[consulta2-1]);
                        prestamos.add(prestamo);
                        System.out.println("La solicitud del usuario "+ lector[consulta-1].getNombreUsuario() + " para el ejemplar de " + ejemplar[consulta2-1].getLibro().getNombre() +" se ha procesado con exito");
                        
                    }
                    System.out.println("Que desea hacer? "); 
                    System.out.println( "1: Ver libros   2: Ejemplares de un libro");
                    System.out.println("3: Solicitar prestamo   0: salir");
                    caso = entrada.nextInt();
            }
                
            }
            else{
                        System.out.println("Ingreso incorrecto");
            }
           System.out.println("Desea ingreesar como Bibliotecario(1) o Lector(2). salir(0)");
           caso = entrada.nextInt();
        }
    }
}
