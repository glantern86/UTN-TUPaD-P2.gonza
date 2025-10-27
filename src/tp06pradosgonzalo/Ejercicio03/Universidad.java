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
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;
    
public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
        }
}
    
public void agregarProfesor(Profesor profesor) {
        if (profesor != null && !profesores.contains(profesor)) {
            profesores.add(profesor);
        }

}

public void eliminarCurso(Curso curso) {
        if (curso != null && cursos.contains(curso)) {
            curso.setProfesor(null);
            cursos.remove(curso);
        }
}

public void listarProfesor() {
    System.out.println("Los profsores de la universidad " + nombre
            + " cuenta con " + profesores.size() + " docentes: ");
    for (Profesor profesor : profesores) {
        profesor.mostrarInfo();
        System.out.println("--------------------");
    }
}

public void listarCursos() {
    System.out.println("La unidversidad " + nombre
            + " cuenta con " + cursos.size() + " cursos y son: ");
    for (Curso curso : cursos) {
        curso.mostrarInfo();
    }
}

public Profesor buscarProfesorPorId(String id) {
    if (id != null) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
    }
     return null;
}


public Curso buscarCursoPorCodigo(String codigo) {
    if (codigo != null) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }

    }
return null;
}

public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Profesor profesor= this.buscarProfesorPorId(idProfesor);
        Curso curso=this.buscarCursoPorCodigo(codigoCurso);
        if(profesor!=null && curso!=null){
        curso.setProfesor(profesor);
        }else{
            System.out.println("O el docente o el curso no existen "
                    + "en la universidad "+nombre);
        }
}
}
