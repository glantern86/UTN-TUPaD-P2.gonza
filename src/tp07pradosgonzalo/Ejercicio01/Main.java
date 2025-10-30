/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp07pradosgonzalo.Ejercicio01;

/**
 *
 * @author gonza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto twingo = new Auto("Twingo", "001", "3");
        twingo.mostrarInfo();
        
        Vehiculo autoneta = new Vehiculo("PELS: Parfax Experimental Locomotive System", "002");
        autoneta.mostrarInfo();
    }
    
}
