/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06pradosgonzalo.Ejercicio02;
import java.util.ArrayList;


/**
 *
 * @author gonza
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;
 
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
    }
    
    //listarLibros()
    //buscarLibroPorIsbn(String isbn)
    //eliminarLibro(String isbn)
    //obtenerCantidadLibros()
    //filtrarLibrosPorAnio(int anio)
    //mostrarAutoresDisponibles()
    

}
