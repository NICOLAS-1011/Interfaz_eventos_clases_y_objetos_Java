package evidencia1;

//HEREDA DE LA CLASE PADRE "CUENTA"

public class Cuenta_Ahorros extends Cuenta {
    //ATRIBUTOS 
    private float porcentaje_de_ahorro;
    
    //CONSTRUCTOR
    public Cuenta_Ahorros(String poseedor, float saldo, float monto_inicial, float saldo_base, float porcentaje_de_ahorro) {
        super(poseedor, saldo, monto_inicial, saldo_base);
        this.porcentaje_de_ahorro = porcentaje_de_ahorro;
    }
    
    //METODOS
    
    @Override
    public void crear_cuenta(){
        System.out.print("Ingrese su nombre: ");
        this.poseedor = scanner.nextLine();
        this.saldo = 0;
        System.out.print("Deposite mínimo 1000 para crear su cuenta. ¿Cuánto desea depositar?: ");
        this.monto_inicial = scanner.nextFloat();
        
        //debe cumplir la condicion minima
        if (monto_inicial < 1000) {
            System.out.println("Monto no aceptable, ingrese minimo $1000");
            return;
        }
        
        saldo += monto_inicial;
        this.saldo_base = 500;
        System.out.println("El saldo base de esta cuenta es de: " + saldo_base);
        System.out.print("¿Cuanto desea que sea el porcentaje de ahorro de la cuenta?: ");
        this.porcentaje_de_ahorro = scanner.nextFloat();
        
        //condicional de porcentaje no menro a 0
        if (porcentaje_de_ahorro <= 0) {
            System.out.println("El porcentaje de ahorro debe se mayor a 0");
        }
        
        System.out.println("\nCuenta creada exitosamente: ");
        System.out.println("Poseedor: " + poseedor);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Saldo base: $" + saldo_base);
        System.out.println("Porcentaje de ahorro: " + porcentaje_de_ahorro + "%");
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
        
        //si el retiro excede el saldo_base (500) no lo realiza
        if (saldo < saldo_base) {
            System.out.println("Error debe tener un saldo base de " + saldo_base);
            return;
        }
        
        System.out.println("Retirando...");
        System.out.println("Ahora su saldo es de: " + saldo);
    }
    
    public void calculo_de_intereses(){
        System.out.println("\nCALCULANDO INTERESES----------------------------");
        System.out.println("Sus intereses son del " + porcentaje_de_ahorro + "%");
    }
    
    //GETT Y SET

    public float getPorcentaje_de_ahorro() {
        return porcentaje_de_ahorro;
    }

    public void setPorcentaje_de_ahorro(float porcentaje_de_ahorro) {
        this.porcentaje_de_ahorro = porcentaje_de_ahorro;
    }
    
    public static void main(String[] args) {
        Cuenta_Ahorros cuentaAhorros = new Cuenta_Ahorros("", 0.0f, 0.0f, 0.0f, 5.0f);
        cuentaAhorros.crear_cuenta();
        cuentaAhorros.dar_dinero();
        cuentaAhorros.recibir_deposito();
        cuentaAhorros.cancelar_cuenta();
    }
}
