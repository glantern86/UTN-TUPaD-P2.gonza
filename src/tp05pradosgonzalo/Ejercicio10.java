/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio10 {
    private class CuentaBancaria{
        private String cbu;
        private String saldo;
        private ClaveSeguridad claveSeguridad;
        private Titular titular;

        public CuentaBancaria(String cbu, String saldo, String codigo, String ultimaModificacion) {
            this.cbu = cbu;
            this.saldo = saldo;
            this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
        }
        
        public void setTitular(Titular titular){
            this.titular=titular;
            if(titular != null && titular.getCuentaBancaria() != this)
                titular.setCuentaBancaria(this);
        }
        
        public Titular getTitular() {
            return titular;
        }
    }
    
    private class ClaveSeguridad{
        private String codigo;
        private String ultimaModificacion;

        public ClaveSeguridad(String codigo, String ultimaModificacion) {
            this.codigo = codigo;
            this.ultimaModificacion = ultimaModificacion;
        }
    }
    
    private class Titular{
        private String nombre;
        private String dni;
        private CuentaBancaria cuentaBancaria;
        
        public void setCuentaBancaria(CuentaBancaria cuentaBancaria){
            this.cuentaBancaria=cuentaBancaria;
            if(cuentaBancaria != null && cuentaBancaria.getTitular() != this)
                cuentaBancaria.setTitular(this);
        }
        
        public CuentaBancaria getCuentaBancaria() {
            return cuentaBancaria;
        }
    }
    
}
