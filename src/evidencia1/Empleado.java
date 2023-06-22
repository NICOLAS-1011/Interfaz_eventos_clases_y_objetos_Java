package evidencia1;

//HEREDA DE LA CLASE PADRE "Persona"

public class Empleado extends Persona {
    //ATRIBUTOS
    private int antiguedad;
    private String puesto;
    private int dias_vacaciones;
    
    //CONST
    public Empleado(int identificacion, int numero, String nombre, int antiguedad, String puesto, int dias_vacaciones) {
        super(identificacion, numero, nombre);
        this.antiguedad = antiguedad;
        this.puesto = puesto;
        this.dias_vacaciones = dias_vacaciones;
    }
 
    //MET
    public void cobrar_sueldo(){
        System.out.print("\n¿Cual es tu puesto de trabajo? (CAJERO, SUPERVISOR, RECEPCIONISTA): ");
        puesto = scanner.next();
        
        switch (puesto) {
            case "CAJERO":
                System.out.println("Toma tu sueldo es de 1860000");
                break;
            case "SUPERVISOR":
                System.out.println("Toma tu sueldo es de 2700000");
                break;
            case "RECEPCIONISTA":
                System.out.println("Toma tu sueldo es de 1500000");
                break;
            default:
                break;
        }
    }
    
    public void vacaciones(){
        System.out.print("\n¿Cuantos años llevas trabajando?: ");
        this.antiguedad = scanner.nextInt();
        this.dias_vacaciones = 5;
        
        if (antiguedad == 0) {
            System.out.println("Aun no cuentas con vacaciones");
        } else if(antiguedad == 1){
            System.out.println("Tienes " + dias_vacaciones + " dias  de vacaciones");
        }
        else if (antiguedad > 1) {
            dias_vacaciones += (antiguedad + antiguedad);
            if (dias_vacaciones > 20) {
                System.out.println("Tienes 20 días de vacaciones, haz llegado al limite");
                return;
            }
            System.out.println("Tienes " + (dias_vacaciones) + " dias de vacaciones :D");
            
        }
    }
    
    //GETS

    public int getAntiguedad() {
        return antiguedad;
    }

    public String getPuesto() {
        return puesto;
    }

    public int getDias_vacaciones() {
        return dias_vacaciones;
    }
    
    
    
    //SETS

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setDias_vacaciones(int dias_vacaciones) {
        this.dias_vacaciones = dias_vacaciones;
    }
    
    
    
    public static void main(String[] args) {
        Empleado empleado = new Empleado(0, 0, "", 0, "", 0);
        empleado.registrarse();
        empleado.cobrar_sueldo();
        empleado.vacaciones();
    }
}
