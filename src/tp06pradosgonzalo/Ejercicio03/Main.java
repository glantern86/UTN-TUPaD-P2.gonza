/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp06pradosgonzalo.Ejercicio03;

/**
 *
 * @author gonza
 */
public class Main {

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ==================== INSTANCIACIÓN DE PROFESORES ====================
        System.out.println("INSTANCIAMOS CUATRO PROFESORES");
        Profesor profesor1 = new Profesor("P001", "María González", "Inteligencia Artificial", null);
        Profesor profesor2 = new Profesor("P002", "Carlos Rodríguez", "Desarrollo Web", null);
        Profesor profesor3 = new Profesor("P003", "Ana López", "Ciberseguridad", null);
        Profesor profesor4 = new Profesor("P004", "David Chen", "Machine Learning", null);
        
        // ==================== INSTANCIACIÓN DE CURSOS ====================
        System.out.println("INSTANCIAMOS SEIS CURSOS");
        Curso iaAvanzada = new Curso("C101", "IA Avanzada", null);
        Curso desarrolloFullStack = new Curso("C102", "Desarrollo FullStack", null);
        Curso seguridadRedes = new Curso("C103", "Seguridad en Redes", null);
        Curso pythonDataScience = new Curso("C104", "Python para Data Science", null);
        Curso blockchain = new Curso("C105", "Blockchain y Cripto", null);
        Curso cloudComputing = new Curso("C106", "Cloud Computing", null);
        
        // ==================== CREACIÓN DE LA UNIVERSIDAD ====================
        System.out.println("CREAMOS LA UNIVERSIDAD");
        Universidad uni = new Universidad("UTN", null, null);
        
        // ==================== AGREGAR PROFESORES ====================
        uni.agregarProfesor(profesor1);
        uni.agregarProfesor(profesor2);
        uni.agregarProfesor(profesor3);
        uni.agregarProfesor(profesor4);
        
        // ==================== AGREGAR CURSOS ====================
        uni.agregarCurso(iaAvanzada);
        uni.agregarCurso(desarrolloFullStack);
        uni.agregarCurso(seguridadRedes);
        uni.agregarCurso(pythonDataScience);
        uni.agregarCurso(blockchain);
        uni.agregarCurso(cloudComputing);
        
        // ==================== ASIGNACIÓN PROFESORES - CURSOS ====================
        uni.asignarProfesorACurso("P001", "C101"); // María -> IA Avanzada
        uni.asignarProfesorACurso("P001", "C104"); // María -> Python Data Science
        uni.asignarProfesorACurso("P002", "C102"); // Carlos -> Desarrollo FullStack
        uni.asignarProfesorACurso("P003", "C103"); // Ana -> Seguridad en Redes
        uni.asignarProfesorACurso("P003", "C105"); // Ana -> Blockchain
        uni.asignarProfesorACurso("P004", "C106"); // David -> Cloud Computing
        uni.asignarProfesorACurso("P004", "C101"); // David -> IA Avanzada (co-docencia)
     
        // ==================== LISTADOS INICIALES ====================
        System.out.println("\n=== LISTADO INICIAL DE PROFESORES ===");
        uni.listarProfesor();
        
        System.out.println("\n=== LISTADO INICIAL DE CURSOS ===");
        uni.listarCursos();
     
        // ==================== REASIGNACIÓN DE PROFESOR ====================
        System.out.println("\n=== REASIGNACIÓN DE CURSO ===");
        System.out.println("REASIGNAMOS EL CURSO BLOCKCHAIN AL PROFESOR DAVID CHEN");
        uni.asignarProfesorACurso("P004", "C105");
        
        System.out.println("\n=== LISTADO ACTUALIZADO DE CURSOS ===");
        uni.listarCursos();
        
        System.out.println("\n=== LISTADO ACTUALIZADO DE PROFESORES ===");
        uni.listarProfesor();
       
        // ==================== ELIMINACIÓN DE CURSO ====================
        System.out.println("\n=== ELIMINACIÓN DE CURSO ===");
        System.out.println("REMOVEMOS EL CURSO PYTHON PARA DATA SCIENCE (C104)");
        uni.eliminarCurso(pythonDataScience);
        
        System.out.println("\n=== LISTADO DE PROFESORES TRAS ELIMINAR CURSO ===");
        uni.listarProfesor();
        
        // ==================== VERIFICACIÓN DE CURSOS ====================
        System.out.println("\n=== LISTADO ACTUAL DE CURSOS ===");
        uni.listarCursos();
      
        // ==================== ELIMINACIÓN DE PROFESOR ====================
        System.out.println("\n=== ELIMINACIÓN DE PROFESOR ===");
        System.out.println("REMOVEMOS AL PROFESOR CARLOS RODRÍGUEZ (P002)");
        uni.agregarProfesor(profesor2);
        
        System.out.println("\n=== LISTADO FINAL DE PROFESORES ===");
        uni.listarProfesor();
        
        // ==================== ASIGNACIÓN FINAL ====================
        System.out.println("\n=== ASIGNACIÓN FINAL ===");
        System.out.println("ASIGNAMOS DESARROLLO FULLSTACK A MARÍA GONZÁLEZ");
        uni.asignarProfesorACurso("P001", "C102");
        
        System.out.println("\n=== LISTADO FINAL COMPLETO ===");
        uni.listarProfesor();
        uni.listarCursos();
    }
    
}
