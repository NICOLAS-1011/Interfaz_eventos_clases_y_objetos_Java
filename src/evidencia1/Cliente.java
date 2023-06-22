package evidencia1;

//HEREDA DE LA CLASE PADRE "PERSONA"
public class Cliente extends Persona{
    //ATRIBUTOS
    private int numero_de_usuario;
            
    //CONSTRUCTOR
    public Cliente(int identificacion, int numero, String nombre, int numero_de_usuario) {
        super(identificacion, numero, nombre);
        this.numero_de_usuario = numero_de_usuario;
    }
    
    //metodos
    public void depositar(){
        System.out.print("\nPara depositar ingrese su numero de usuario: ");
        
        if (scanner.nextInt() != 123456789) {
            System.out.println("Usuario incorrecto, intentelo de nuevo");
            return;
        }
        
        System.out.print("¿Cuanto desea depositar?: ");
        
        System.out.println("Deposito exitoso hecho por $" + scanner.nextFloat());
    }
    
    public void retirar(){
        System.out.print("\nPara retirar ingrese su numero de usuario: ");

        if (scanner.nextInt() != 123456789) {
            System.out.println("Usuario incorrecto, intentelo de nuevo");
            return;
        }
        
        System.out.print("Ingrese su identificacion: ");
        
        if (scanner.nextInt() != identificacion) {
            System.out.println("\nIdentificacion incorrecta, acceso denegado");
            return;
        } else{
            System.out.print("¿Cuanto desea retirar?");
            System.out.println("Retirando " + scanner.nextFloat() + "...");
        }
    }
    
    public void inversionar(){
        System.out.print("\n¿Con que empresa desea invertir? ");
        System.out.println("El contacto para invertir en " + scanner.nextLine() + " es: 7777777");
    }

    //GET
    public int getNumero_de_usuario() {
        return numero_de_usuario;
    }

    //SET
    public void setNumero_de_usuario(int numero_de_usuario) {
        this.numero_de_usuario = numero_de_usuario;
    }
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente(0, 0, "", 0);
        cliente.registrarse();
        cliente.depositar();
        cliente.retirar();
        cliente.inversionar();
    }
}
