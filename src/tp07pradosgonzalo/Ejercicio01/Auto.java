/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp07pradosgonzalo.Ejercicio01;

/**
 *
 * @author gonza
 */
public class Auto extends Vehiculo {
    private String cantidadPuertas;

    public Auto(String marca, String modelo, String cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("------------------------");
        System.out.println("Marca: " + super.marca);
        System.out.println("Modelo: " + super.modelo);
        System.out.println("Cantidad de Puertas: " + cantidadPuertas);       
    }
}
