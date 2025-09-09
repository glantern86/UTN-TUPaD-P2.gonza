/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp03pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio01 {

    
    public class Estudiantes {
        private String nombre;
        private String apellido;
        private int curso;
        private double calificacion;
        
        
        public Estudiantes(String nombre, String apellido, int curso, double calificacion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.curso = curso;
            this.calificacion = calificacion;
    }
        
        public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " "+ apellido + "\nCurso número: "+ curso + "\nCalificación: " + calificacion);
        System.out.println("\n");
        }
        
        public double subirCalificacion(double puntos) {
            calificacion += puntos;
            return calificacion;
                }
        public double bajarCalificacion(double puntos) {
            calificacion -= puntos;
            return calificacion;
                }
    }
    
        public void main(String[] args) {
        Estudiantes e1 = new Estudiantes("Juan", "Pérez", 3, 7.5);
        e1.mostrarInfo();
        e1.subirCalificacion(2.0);
        e1.mostrarInfo();
        e1.bajarCalificacion(1.0);
        e1.mostrarInfo();

    }
    
}
