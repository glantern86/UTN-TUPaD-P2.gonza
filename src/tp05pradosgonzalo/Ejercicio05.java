/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio05 {
    public class Computadora{
        private String marca;
        private String numeroSerie;
        private PlacaMadre placaMadre;
        private Propietario propietario;

        public Computadora(String marca, String numeroSerie) {
            this.marca = marca;
            this.numeroSerie = numeroSerie;
            this.placaMadre = new PlacaMadre();
        }
        
        public void setPropietario(Propietario propietario){
            this.propietario=propietario;
            if(propietario !=null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
            }
        }
        
        public Propietario getPropietario() {
            return propietario;
        }
    }
    
    public class PlacaMadre{
        private String modelo;
        private String chipset;
    }
    
    public class Propietario{
        private String nombre;
        private String dni;
        private Computadora computadora;

        public Propietario(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }
        
        public void setComputadora(Computadora computadora){
            this.computadora=computadora;
            if(computadora !=null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
            }
        }
        
        public Computadora getComputadora() {
            return computadora;
        }
    }
    
}
