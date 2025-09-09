/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp03pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio02 {

    
    public class Mascota {
        private String nombre;
        private String especie;
        private int edad;
        
        
        public Mascota(String nombre, String especie, int edad) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
    }
        
        public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\nEspecie: "+ especie + "\nEdad: "+ edad );
        System.out.println("\n");
        }
        
        public int cumplirAnios(int anio) {
            edad += anio;
            return edad;
                }
    }
    
        public void main(String[] args) {
        Mascota e1 = new Mascota("Chispita", "Schnauser", 3);
        e1.mostrarInfo();
        e1.cumplirAnios(2);
        e1.mostrarInfo();
    }
    
}
