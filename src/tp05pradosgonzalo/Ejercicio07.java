/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio07 {
    
    public class Vehiculo{
        private String patente;
        private String modelo;
        private Motor motor;
        private Conductor conductor;

        public Vehiculo(String patente, String modelo, Motor motor) {
            this.patente = patente;
            this.modelo = modelo;
            this.motor = motor;
        }
        
        public void setConductor(Conductor conductor) {
            this.conductor=conductor;
            if (conductor != null && conductor.getVehiculo() != this) {
                conductor.setVehiculo(this);
            }
        }
    }
    
    public class Motor{
        private String tipo;
        private String numeroSerie;

        public Motor(String tipo, String numeroSerie) {
            this.tipo = tipo;
            this.numeroSerie = numeroSerie;
        }
    }
    
    public class Conductor{
        private String nombre;
        private String licencia;
        private Vehiculo vehiculo;
        
        public Conductor(String nombre, String licencia) {
            this.nombre=nombre;
            this.licencia=licencia;
        }
        public void setVehiculo(Vehiculo vehiculo) {
            this.vehiculo=vehiculo;
            if (vehiculo != null && vehiculo.conductor != this) {
                vehiculo.setConductor(this);
            }
        }
        public Vehiculo getVehiculo() {
            return vehiculo;
        }
    }
    
}
