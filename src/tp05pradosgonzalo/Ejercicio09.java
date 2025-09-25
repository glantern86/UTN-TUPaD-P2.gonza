/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio09 {
    private class CitaMedica{ 
        private String fecha;
        private String hora;
        private Paciente paciente;
        private Profesional profesional;
        
        public void setPaciente(Paciente paciente){
            this.paciente=paciente;
        }
        public void setProfesional(Profesional profesional){
            this.profesional=profesional;
        }
    }
    private class Paciente{ 
        private String nombre; 
        private String obraSocial;

        public Paciente(String nombre, String obraSocial) {
            this.nombre = nombre;
            this.obraSocial = obraSocial;
        }
    }
    
    private class Profesional{ 
        private String nombre; 
        private String especialidad;

        public Profesional(String nombre, String especialidad) {
            this.nombre = nombre;
            this.especialidad = especialidad;
        } 
    }
}
