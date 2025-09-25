/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio11 {
    public class Cancion{ 
        private String titulo;
        private Artista artista;

        public Cancion(String titulo) {
            this.titulo = titulo;
        }
        
        public void setArtista(Artista artista){
            this.artista = artista;
        }
    }
    
    public class Artista{ 
        private String nombre;
        private String genero;

        public Artista(String nombre, String genero) {
            this.nombre = nombre;
            this.genero = genero;
        }
    }
    
    public class Reproductor{
        public void reproducir(Cancion cancion){
        }
    }   
}
