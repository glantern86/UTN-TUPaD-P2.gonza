/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06pradosgonzalo.Ejercicio03;
import java.util.ArrayList;


/**
 *
 * @author gonza
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad, ArrayList<Curso> cursos) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public void agregarCurso(Curso c){
        if (cursos.contains(c)) {
            System.out.println("El curso '" + c.getNombre() + "' ya está asignado a este profesor");
            return;
        }
        cursos.add(c);
        System.out.println("Curso '" + c.getNombre() + "' agregado al profesor " + this.nombre);
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }
    
    public void mostrarInfo(){
        System.out.println("\nID: "+getId()+ 
                "\nNombre: "+getNombre()+
                "\nEspecialidad: " +getEspecialidad()+
                "\nCursos: " + getCursos());
    }
    public void listarCursos(){
        for (Curso curso : cursos) {
            System.out.println("\nCódigo: " + curso.getCodigo() + 
                    "\nNombre: " + curso.getNombre() +
                    "\nProfesor: " + curso.getProfesor().getNombre());
    }
}
    public void eliminarCurso(Curso c) {
        if (!cursos.contains(c)) {
            System.out.println("El curso '" + c.getNombre() + "' no está asignado a este profesor");
            return;
        }
        cursos.remove(c);
        System.out.println("Curso '" + c.getNombre() + "' removido del profesor " + this.nombre);
        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }
}

    
