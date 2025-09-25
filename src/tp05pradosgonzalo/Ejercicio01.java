/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio01 {
   
    public class Foto {
        private String imagen;
        private String formato;
    }
    
    public class Pasaporte {
        private String numero;
        private String fechaEmision;
        private Foto foto;
        private Titular titular;

    public Pasaporte(String numero, String fechaEmision) {
            this.numero = numero;
            this.fechaEmision = fechaEmision;
            this.foto = new Foto();
    }
    
    public void setTitular(Titular titular) {
        this.titular=titular;
        if (titular != null && titular.getPasaporte() != this) {
        titular.setPasaporte(this);
        }
    }
    
    public Titular getTitular() {
            return titular;
        }
    }
    
    public class Titular {
        private String nombre;
        private String dni;
        private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
    }
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte=pasaporte;
        if (pasaporte != null&& pasaporte.getTitular() != this) {
        pasaporte.setTitular(this);
        }       
    }
    
        public Pasaporte getPasaporte() {
            return pasaporte;
        }
    }
    }