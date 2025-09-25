/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio02 {

    public class Bateria {
        private String modelo;
        private String capacidad;

        public Bateria(String modelo, String capacidad) {
            this.modelo = modelo;
            this.capacidad = capacidad;
        }
    }
    
    public class Celular {
        private String imei;
        private String marca;
        private String modelo;
        private Bateria bateria;
        private Usuario usuario;

        public Celular(String imei, String marca, String modelo, Bateria bateria) {
            this.imei = imei;
            this.marca = marca;
            this.modelo = modelo;
            this.bateria = bateria;
        }
        
        public void setUsuario(Usuario usuario) {
            this.usuario=usuario;
            if(usuario != null && usuario.getCelular() != this) {
                usuario.setCelular(this);
            }
        }
        
        public Usuario getUsuario() {
            return usuario;
        }
    }

    public class Usuario {
        private String nombre;
        private String dni;
        private Celular celular;

        public Usuario(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }
        
        public void setCelular(Celular celular) {
            this.celular=celular;
            if(celular != null && celular.getUsuario() != this) {
                celular.setUsuario(this);
            }
        }
        
        public Celular getCelular() {
            return celular;
        }
    }
}
