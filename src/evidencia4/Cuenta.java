
package evidencia4;

import javax.swing.JTextField;
import evidencia4.AppletMetodos;


public class Cuenta {

            //atributos
        private int numero;
        private String nombre;
        private float saldo;

            //constructor

        public Cuenta(){
            numero = 0;
            nombre = "";
            saldo = 0.0f;
        }

        public Cuenta(int numero, String nombre, float saldo){
            this.numero = numero;
            this.nombre = nombre;
            this.saldo = saldo;
        }

        public int getNumero() {
            return numero;
        }

        public String getNombre() {
            return nombre;
        }

        public float getSaldo() {
            return saldo;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }

            //metodos
        
        public void desplegarCuenta(AppletMetodos interfaz) {
            int numero = getNumero();
            String nombre = getNombre();
            float saldo = getSaldo();
        
            interfaz.lblNumero.setText(String.valueOf(numero));
            interfaz.lblNombre.setText(nombre);
            interfaz.lblSaldo.setText(String.valueOf(saldo));
        
        }

}
