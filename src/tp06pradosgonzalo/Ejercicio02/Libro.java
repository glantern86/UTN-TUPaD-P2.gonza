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

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    
    public void mostrarInfo() {
        System.out.println("ISBN: "+getIsbn()+ 
                "\nTítulo: "+ getTitulo()+
                "\nAño de publicación: " +getAnioPublicacion()+
                "\nAutor: "+ getAutor());
    }
    
    
}
