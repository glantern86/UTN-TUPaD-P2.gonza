/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06pradosgonzalo.Ejercicio02;

/**
 *
 * @author gonza
 */
public class Libro {
        private String isbn;
        private String titulo;
        private int anioPublicacion;
        private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    } 
 
    public void mostrarInfo() {
        System.out.println("ISBN: "+isbn+ 
                "\nTítulo: "+ titulo+
                "\nAño de publicación: " +anioPublicacion+
                "\nAutor: "+ autor
        );
    }
    
    
}
