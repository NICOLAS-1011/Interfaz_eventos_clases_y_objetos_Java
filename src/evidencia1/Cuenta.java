package evidencia1;
import java.util.Scanner;

public abstract class Cuenta {
    String poseedor;
    float saldo;
    float monto_inicial;
    float saldo_base;
    
    //constructor
    public Cuenta(String poseedor, float saldo, float monto_inicial, float saldo_base){
        this.poseedor =  poseedor;
        this.saldo = saldo;
        this.monto_inicial = monto_inicial;
        this.saldo_base = saldo_base;
    }
    
    Scanner scanner = new Scanner(System.in);
    
    //Metodos que usan el POLIFORMISMO
    public abstract void crear_cuenta();
    public abstract void dar_dinero();
    
    //METODOS DE HERENCIA 
    public void recibir_deposito(){
        System.out.println("\nRECIBIENDO DEPOSITOS--------------------");
        System.out.print("¿Desea aceptar el deposito de 50.000? (SI o NO): ");
        //scanner.next();
        
        if (scanner.next().equals("SI")) {
            saldo += 50000;
            System.out.println("Su saldo ahora es de: " + saldo);
        } else {
            System.out.println("Deposito rechazado, saldo: " + saldo);
        }
    }
    public void cancelar_cuenta(){
        System.out.println("\nPROCESO DE CANCELAR CUENTA------------------------");
        System.out.print("Ingrese su nombre para cancelar la cuenta, para salir escriba 'NO': ");
        scanner.nextLine();
        
        if (poseedor.equals(scanner.nextLine())) {
            System.out.println("Su cuenta ha sido, cancelada, toma todo tu dinero");
        } else{
            System.out.println("\nPoseedor incorrecto, cuenta NO cancelada");
        }
    }
        
        //GETS Y SETS

        public String getPoseedor() {
            return poseedor;
        }

        public float getSaldo() {
            return saldo;
        }

        public float getMonto_inicial() {
            return monto_inicial;
        }

        public float getSaldo_base() {
            return saldo_base;
        }

        public void setPoseedor(String poseedor) {
            this.poseedor = poseedor;
        }

        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }

        public void setMonto_inicial(float monto_inicial) {
            this.monto_inicial = monto_inicial;
        }

        public void setSaldo_base(float saldo_base) {
            this.saldo_base = saldo_base;
        }
        
}


