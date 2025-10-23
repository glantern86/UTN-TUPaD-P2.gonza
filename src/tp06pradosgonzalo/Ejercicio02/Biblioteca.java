/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06pradosgonzalo.Ejercicio02;
import java.util.ArrayList;
import tp06pradosgonzalo.Ejercicio01.Producto;


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
    
    public void listarLibros() {
        for(int i = 0; i < libros.size(); i++) {
            Libro l = libros.get(i);
            System.out.println("Libro: "+l.getTitulo()+ " Autor: "+l.getAutor().getNombre());
        }
    }
    
    public void buscarLibroPorIsbn(String isbn){
        for(int i = 0; i < libros.size(); i++) {
            Libro l = libros.get(i);
            
            if(l.getIsbn().equals(isbn)){
                System.out.println("Libro: "+l.getTitulo()+ " Autor: "+l.getAutor().getNombre()+ " ISBN: "+l.getIsbn());
                return;
            }
        }System.out.println("Producto con ISBN '" + isbn + "' no encontrado");
    }
    
    public void eliminarLibro(String isbn){
        for(int i = 0; i < libros.size(); i++) {
            Libro l = libros.get(i);
            
            if(l.getIsbn().equals(isbn)){
                libros.remove(i);
                System.out.println("Libro con ISBN: "+l.getIsbn()+ " removido.");
                return;
            }
        }System.out.println("Producto con ISBN '" + isbn + "' no encontrado");
    }
    
    public void obtenerCantidadLibros(){
        System.out.println("Actualmente contamos con: " + libros.size() + " libros.");
    }
    
    public void filtrarLibrosPorAnio(int anio) {
        boolean encontrados = false;

        for (int i = 0; i < libros.size(); i++) {
            Libro l = libros.get(i);

            if (l.getAnioPublicacion() == anio) { 
                System.out.println((i + 1) + ". " + l.getTitulo() + " - " + l.getAnioPublicacion());
                encontrados = true;
            }
        }    
        if (!encontrados) {
            System.out.println("No hay libros publicados en el año: " + anio);
        }
    }
    public void mostrarAutoresDisponibles(){
        for (int i = 0; i < libros.size(); i++) {
            Libro l = libros.get(i);

            l.getAutor().mostrarInfo();
        }
    }
}
