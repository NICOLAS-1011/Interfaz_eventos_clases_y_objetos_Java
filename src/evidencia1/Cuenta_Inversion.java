package evidencia1;

//HEREDA DE LA CLASE PADRE "CUENTA"
public class Cuenta_Inversion extends Cuenta {
    //ATRIBUTOS
    private int numero_tarjeta_credito;
    
    //CONSTRUCTOR
    public Cuenta_Inversion(String poseedor, float saldo, float monto_inicial, float saldo_base, int numero_tarjeta_credito) {
        super(poseedor, saldo, monto_inicial, saldo_base);
        this.numero_tarjeta_credito = numero_tarjeta_credito;
    }
    
    //METODOS
    
    @Override
    public void crear_cuenta(){
        System.out.print("Ingrese su nombre: ");
        this.poseedor = scanner.nextLine();
        this.saldo = 0;
        System.out.print("Deposite mínimo 25000 para crear su cuenta. ¿Cuánto desea depositar?: ");
        this.monto_inicial = scanner.nextFloat();
        
        if (monto_inicial < 25000) {
            System.out.println("Monto no aceptable, ingrese minimo $25000");
            return;
        }
        
        saldo += monto_inicial;
        this.saldo_base = 10000;
        System.out.println("El saldo base de esta cuenta es de: " + saldo_base);
        this.numero_tarjeta_credito = 123456;
        
        System.out.println("\nCuenta creada exitosamente: ");
        System.out.println("Poseedor: " + poseedor);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Saldo base: $" + saldo_base);
        System.out.println("Numero de tarjeta de credito: " + numero_tarjeta_credito);
    }
    
    @Override
    public void dar_dinero(){
        //verifica que exista una cuenta primero
        if (saldo == 0.0f || saldo_base == 0.0f) {
            System.out.println("\nDebe crear una cuenta primero");
            return;
        }
        
        System.out.println("\nRETIRA TU DINERO------------------------------------------");
        System.out.println("Su saldo es de: " + saldo);
        System.out.print("¿Cuanto dinero desea retirar?: ");
        saldo -= scanner.nextFloat();
        
        //si el retiro excede el saldo_base (10000) no lo realiza
        if (saldo < saldo_base) {
            System.out.println("Error debe tener un saldo base de " + saldo_base);
            return;
        }
        
        System.out.println("Retirando...");
        System.out.println("Ahora su saldo es de: " + saldo);
    }
    
    public void solicitud_de_credito(){
        System.out.println("Solicitnado credito...");
    }
    
    //GETS Y SETS

    public int getNumero_tarjeta_credito() {
        return numero_tarjeta_credito;
    }

    public void setNumero_tarjeta_credito(int numero_tarjeta_credito) {
        this.numero_tarjeta_credito = numero_tarjeta_credito;
    }
    
    public static void main(String[] args) {
        Cuenta_Inversion cuentaInversion = new Cuenta_Inversion("", 0.0f, 0.0f, 0.0f, 0);
        cuentaInversion.crear_cuenta();
        cuentaInversion.dar_dinero();
        cuentaInversion.recibir_deposito();
        cuentaInversion.cancelar_cuenta();
    }
    
}
