/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp03pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio04 {

    
    public class Gallina {
        private int idGallina;
        private int edad;
        private int huevosPuestos;

        public Gallina(int idGallina, int edad, int huevosPuestos) {
            this.idGallina = idGallina;
            this.edad = edad;
            this.huevosPuestos = huevosPuestos;
        }
        
        public int ponerHuevo(int huevos){
        huevosPuestos += huevos;
        return huevosPuestos;
                }
        
        public int envejecer(int anio){
        edad += anio;
        return edad;
                }
        
        public void mostrarEstado(Gallina gallina){
        System.out.println("La gallina ID"+idGallina+ " tiene "+edad+" años y ha puesto "+huevosPuestos+ " huevos." );
                }
       
    }
    
        public void main(String[] args) {
        Gallina G1 = new Gallina(1234, 1, 3);
        G1.mostrarEstado(G1);
        Gallina G2 = new Gallina(5678, 4, 500);
        G2.mostrarEstado(G2);
        System.out.println("------------------------------------------------------" );
        
        G1.ponerHuevo(10);
        G1.envejecer(2);
        G1.mostrarEstado(G1);
  
        G2.ponerHuevo(50);
        G2.envejecer(2);
        G2.mostrarEstado(G2);
    }
    
}
