/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06pradosgonzalo.Ejercicio02;

/**
 *
 * @author gonza
 */
public class Autor {
        private String id;
        private String nombre;
        private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
          
    public void mostrarInfo() {
        System.out.println("Id: "+id+ 
                "\nNombre: "+ nombre+
                "\nNacionalidad: " +nacionalidad);
    }
    
}
