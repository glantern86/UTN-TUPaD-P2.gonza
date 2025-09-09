/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp03pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio03 {

    
    public class Libro {
        private String titulo;
        private String autor;
        private int anioPublicacion;
        
        
        public Libro(String titulo, String autor, int anioPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            this.anioPublicacion = anioPublicacion;
    }
        
        public String getTitulo(){
        return titulo;
                }
        
        public String getAutor(){
        return autor;
                }
        
        public int getAnioPublicacion(){
        return anioPublicacion;
                }
        
        public void setAnioPublicacion(int anio) {
        //tomo como referencia el año de publicacion de la biblia de gutenberg
        if (anio >= 1454) {
        this.anioPublicacion = anio;
                }
        }
        
    }
    
        public void main(String[] args) {
        Libro e1 = new Libro("El Resplandor", "Stephen King", 1980);
        System.out.println("El nombre del libro es "+e1.getTitulo()+" escrito por "+e1.getAutor()+" en el año " +e1.getAnioPublicacion());
        e1.setAnioPublicacion(1977);
        System.out.println("El nombre del libro es "+e1.getTitulo()+" escrito por "+e1.getAutor()+" en el año " +e1.getAnioPublicacion());
    }
    
}
