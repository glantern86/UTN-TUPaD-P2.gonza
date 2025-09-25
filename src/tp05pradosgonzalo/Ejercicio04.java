/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio04 {

    public class TarjetaDeCredito {
        private String numero;
        private String fechaVencimiento;
        private Cliente cliente;
        private Banco banco;

        public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
            this.numero = numero;
            this.fechaVencimiento = fechaVencimiento;
            this.banco=banco;
        }
        
        public void setCliente(Cliente cliente){
            this.cliente=cliente;
            if (cliente != null && cliente.getTarjetaDeCredito() != this) {
                cliente.setTarjetaDeCredito(this);
            }
        }

    }
    public class Cliente {
        private String nombre;
        private String dni;
        private TarjetaDeCredito tarjetaDeCredito;

        public Cliente(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }
        
        public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito){
            this.tarjetaDeCredito=tarjetaDeCredito;
            if (tarjetaDeCredito != null && tarjetaDeCredito.cliente != this) {
                tarjetaDeCredito.setCliente(this);
            }
        }
        
        public TarjetaDeCredito getTarjetaDeCredito(){
            return tarjetaDeCredito;
        }
        
    }
    public class Banco {
        private String nombre;
        private String cuit;

        public Banco(String nombre, String cuit) {
            this.nombre = nombre;
            this.cuit = cuit;
        }
    }
}
