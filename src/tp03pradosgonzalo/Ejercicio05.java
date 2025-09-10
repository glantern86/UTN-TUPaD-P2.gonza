/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp03pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio05 {

    
    public class NaveEspacial {
        private String nombre;
        private int combustible;

        public NaveEspacial(String nombre, int combustible) {
            this.nombre = nombre;
            this.combustible = combustible;
        }
        
        public void setDespegar(){
        System.out.println("Despegue exitoso!" );
                }
        
        public int setAvanzar(int distancia){
        if (combustible - distancia >=0) {
        combustible -= distancia;
        System.out.println("Avanzamos "+distancia+"kms!" );
        } else {
        System.out.println("Nos faltan "+(distancia -= combustible)+" litros de combustible para emprender ese viaje!");
        }
        return combustible;
                }
        
        public int setRecargarCombustible(int recarga){
        if (combustible + recarga <= 50) {
        combustible += recarga ;
        System.out.println("Nuestra reserva de combustible es de "+combustible+"lts" );
        } else {
        System.out.println("Desperdiciamos "+(combustible + recarga - 50)+" litros de combustible pero pudimos llenar el tanque");
        combustible = 50;
        }
        return combustible;
                }
        
        public void getMostrarEstado(){
        System.out.println("El nombre de la nave es "+nombre+ " y le resta "+combustible+"lts de combustible");
                }
       
    }
    
        public void main(String[] args) {
        NaveEspacial spaceOdyssey = new NaveEspacial("Space Odyssey", 50);
        spaceOdyssey.setDespegar();
        spaceOdyssey.setAvanzar(40);
        spaceOdyssey.getMostrarEstado();
        spaceOdyssey.setAvanzar(40);
        spaceOdyssey.setAvanzar(10);
        spaceOdyssey.setRecargarCombustible(55);
        spaceOdyssey.getMostrarEstado();
        
        }
    
}
