/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio08 {

    public class Documento{
        private String titulo;
        private String contenido;
        private FirmaDigital firmaDigital;

        public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
            this.titulo = titulo;
            this.contenido = contenido;
            this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
        }
    }
    
    public class FirmaDigital{
        private String codigoHash;
        private String fecha;
        private Usuario usuario;

        public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
            this.codigoHash = codigoHash;
            this.fecha = fecha;
            this.usuario = usuario;
        }
    }
    
    public class Usuario{
        private String nombre;
        private String email;

        public Usuario(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }
    }
}
