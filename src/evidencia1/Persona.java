package evidencia1;
import java.util.Scanner;

public class Persona {
    //ATRIBUTOS
    int identificacion;
    private int numero;
    private String nombre;
    
    //CONSTRUCTOR
    public Persona(int identificacion, int numero, String nombre){
        this.identificacion = identificacion;
        this.numero = numero;
        this.nombre = nombre;
    }
    
    //METODOS
    
    Scanner scanner = new Scanner(System.in);
    
    public void registrarse(){
         System.out.print("Ingrese su nombre: ");
         this.nombre = scanner.nextLine();
         System.out.print("Ingrese su numero de identificacion: ");
         this.identificacion = scanner.nextInt();
         this.numero = 123456789;
         
         System.out.println("\nRegistrado con exito! ");
         System.out.println("Nombre: " + nombre);
         System.out.println("Identificacion: "+identificacion);
         System.out.println("Numero: " + numero);
   }
    
    //GETS Y SETS

    public int getIdentificacion() {
        return identificacion;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
