/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio13 {
    public class CodigoQR { 
        private String valor;
        private Usuario usuario;

        public CodigoQR(String valor, Usuario usuario) {
            this.valor = valor;
            this.usuario = usuario;
        }
    }

    public class Usuario { 
        private String nombre;
        private String email;

        public Usuario(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }
    }

    public class GeneradorQR { 
        public CodigoQR generar(String valor, Usuario usuario) {
            return new CodigoQR(valor, usuario);
        }
    }
}