/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp07pradosgonzalo.Ejercicio02;
import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class Main {
    public static void main(String[] args) {
        // Crear array de Figuras
        ArrayList<Figura> figuras = new ArrayList<>();
        
        // Llenar el array con diferentes figuras
        figuras.add(new Circulo("Circulo", 5.0));
        figuras.add(new Rectangulo("Rectangulo", 4.0, 6.0));
        figuras.add(new Circulo("Circulo", 3.0));
        figuras.add(new Rectangulo("Rectangulo", 2.5, 8.0));
        
             
        for (Figura figura : figuras) {
            // Polimorfismo: Java llama al método calcularArea() correcto
            // según el tipo real del objeto en tiempo de ejecución
            double area = figura.calcularArea();
            System.out.printf(figura.getNombre() +": " +area+ " unidades cuadradas\n");
        }
    }
}