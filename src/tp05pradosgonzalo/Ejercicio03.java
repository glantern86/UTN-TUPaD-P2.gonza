/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio03 {
    public class Libro {
        private String titulo;
        private String isbn;
        private Editorial editorial;
        private Autor autor;

        public Libro(String titulo, String isbn, Editorial editorial) {
            this.titulo = titulo;
            this.isbn = isbn;
            this.editorial = editorial;
        }
        
        public void setAutor(Autor autor) {
            this.autor=autor;
        }
    }
    public class Autor{
        private String nombre;
        private String nacionalidad;

        public Autor(String nombre, String nacionalidad) {
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
        }
    }
    public class Editorial{
        private String nombre;
        private String direccion;

        public Editorial(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
        }
    }
}
