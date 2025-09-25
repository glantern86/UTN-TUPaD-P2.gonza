/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio12 {
    public class Impuesto{ 
        private String monto;
        private Contribuyente contribuyente;

        public Impuesto(String monto) {
            this.monto = monto;
        }
        
        public void setContribuyente(Contribuyente contribuyente){
            this.contribuyente = contribuyente;
        }
    }
    
    public class Contribuyente{ 
        private String nombre;
        private String cuil;

        public Contribuyente(String nombre, String cuil) {
            this.nombre = nombre;
            this.cuil = cuil;
        }
    }
    
    public class Calculadora{
        public void calcular(Impuesto Impuesto){
        }
    }   
}
