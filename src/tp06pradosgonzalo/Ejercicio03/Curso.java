/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06pradosgonzalo.Ejercicio03;

/**
 *
 * @author gonza
 */
public class Curso {
    
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        this.profesor = p;
        if (p != null) {
            p.agregarCurso(this);
    }
}
    
    public void mostrarInfo(){
        System.out.println("\nCódigo: "+getCodigo()+ 
                "\nNombre: "+getNombre()+
                "\nProfesor: "+getProfesor());
    } 
}
