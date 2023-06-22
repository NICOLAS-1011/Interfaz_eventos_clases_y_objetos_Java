package evidencia1;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Empresa_inver {
    //ATRIBUTOS
    private String clave_de_casa;
    private String nivel_de_riesgo;
    private String confiabilidad;
    private float porcentaje_de_retorno;
    private LocalDate plazo;
    
    //CONSTRUCTOR
    public Empresa_inver(String clave_de_clase, String nivel_de_riesgo, String confiabilidad, float porcentaje_de_retorno, LocalDate plazo ){
        this.clave_de_casa = clave_de_clase;
        this.nivel_de_riesgo = nivel_de_riesgo;
        this.confiabilidad = confiabilidad;
        this.porcentaje_de_retorno = porcentaje_de_retorno;
        this.plazo = plazo;
    }
    
    //METODOS
    Scanner scanner = new Scanner(System.in);
    
    public void recibir_inversion(){
        System.out.print("Ingrese aqui su numero de identificacion: ");
        System.out.println("Bienvenido " + scanner.nextInt());
        System.out.print("Ingrese la cantidad que desea invertir: ");
        System.out.println("Bien, usted ha invertido " + scanner.nextFloat());
    }
    
    public void retorno_de_inversion(){
        System.out.print("¿Cuanto dinero desea retirar?: ");
        System.out.println("Retirando " + scanner.nextFloat() + "...");
        
    }

    //GET 
    public String getClave_de_casa() {
        return clave_de_casa;
    }

    public String getNivel_de_riesgo() {
        return nivel_de_riesgo;
    }
    
    public String getConfiabilidad() {
        return confiabilidad;
    }


    public float getPorcentaje_de_retorno() {
        return porcentaje_de_retorno;
    }
    
    public LocalDate getPlazo() {
        return plazo;
    }
    
    //SET

    public void setClave_de_casa(String clave_de_casa) {
        this.clave_de_casa = clave_de_casa;
    }

    public void setNivel_de_riesgo(String nivel_de_riesgo) {
        this.nivel_de_riesgo = nivel_de_riesgo;
    }

    public void setConfiabilidad(String confiabilidad) {
        this.confiabilidad = confiabilidad;
    }

    public void setPorcentaje_de_retorno(float porcentaje_de_retorno) {
        this.porcentaje_de_retorno = porcentaje_de_retorno;
    }

    public void setPlazo(LocalDate plazo) {
        this.plazo = plazo;
    }   
    
    public static void main(String[] args) {
        Empresa_inver empresa_inver = new Empresa_inver("", "", "", 0.0f, LocalDate.of(2000, 10, 10));
        empresa_inver.recibir_inversion();
        empresa_inver.retorno_de_inversion();
    }
}
