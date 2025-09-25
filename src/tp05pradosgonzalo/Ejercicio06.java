/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio06 {

    public class Reserva{
        private String fecha;
        private String hora;
        private Mesa mesa;
        private Cliente cliente;

        public Reserva(String fecha, String hora, Mesa mesa) {
            this.fecha = fecha;
            this.hora = hora;
            this.mesa = mesa;
        }
        
        public void setCliente(Cliente cliente){
            this.cliente = cliente;
        }
    }
    
    public class Cliente{
        private String nombre;
        private String telefono;

        public Cliente(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }
    }
    
    public class Mesa{
        private String numero;
        private String capacidad;

        public Mesa(String numero, String capacidad) {
            this.numero = numero;
            this.capacidad = capacidad;
        }
    }
    
}
