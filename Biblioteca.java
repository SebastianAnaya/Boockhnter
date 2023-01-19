
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner; 
import java.time.LocalDate;
public class Biblioteca
{
    public static void main(String[]args){
        LocalDate fechaNacimiento;
        String autor, nombre, apellidos, direccion, usuario, correo, contraseña, categoria;
        int id, caso=1, añoPublicaion;
        long telefono;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Que desea hacer? \""  + "1: Registrar usuario   2: Registar libro \""
            + " 3: registrar ejemplar   4: Solicitar prestamo   0: salir");
        caso = entrada.nextInt();
        while(caso!=0){
            if(caso==1){
                System.out.println("Nombre de usuario");
                usuario = entrada.nextLine();
                System.out.println("Contraseña");
                contraseña = entrada.nextLine();
                System.out.println("correo");
                correo = entrada.nextLine();
                System.out.println("id");
                id = entrada.nextInt();
                fechaNacimiento = LocalDate.now();
                System.out.println("Nombre");
                nombre = entrada.nextLine();
                System.out.println("Apellidos");
                apellidos = entrada.nextLine();
                System.out.println("Direccion");
                direccion = entrada.nextLine();
                System.out.println("Telefono");
                telefono = entrada.nextLong();
                Lector lector1 = new Lector(usuario, contraseña, correo, id, fechaNacimiento, nombre, apellidos, direccion, telefono);
                
            }
            else if(caso==2){
                System.out.print("Nombre del libro");
                nombre = entrada.nextLine();
                System.out.print("Nombre del autor");
                autor = entrada.nextLine();
                System.out.print("Categoria");
                categoria = entrada.nextLine();
                System.out.print("Año de publicacion");
                añoPublicaion = entrada.nextInt();
                Libro libro1= new Libro(nombre, autor, categoria, añoPublicaion);
            }
            else if(caso==3){
                System.out.print("Estado del libro");
                boolean estado = entrada.nextBoolean();
                System.out.print("id");
                id= entrada.nextInt();
                //Ejemplar ejemplar1 = new Ejemplar(estado, id, libro1);
                
            }
            else if(caso==4){
                System.out.print("caso cuatro");
                
            }
            else{
            System.out.print("Entrada invalida");
            }
            System.out.println("Que desea hacer? \""  + "1: Registrar usuario   2: Registar libro \""
            + " 3: registrar ejemplar   4: Solicitar prestamo    0: salir");
            caso = entrada.nextInt();
        }
        
        
        }
}
