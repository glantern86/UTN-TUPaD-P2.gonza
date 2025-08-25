/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2pradosgonzalo;
import java.util.Scanner;
/**
 *
 * @author gonza
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio;
        int descuento = 0;
        double precioFinal = 0;
        
        System.out.print("Ingresa el precio de un producto: ");
        precio = input.nextDouble();
        
        System.out.print("Seleccione por favor la categoría de la siguiente lista \n \n Categoría A: 10% de descuento \n Categoría B: 15% de descuento \n Categoría C: 20% de descuento \n");
        char categoria = input.next().charAt(0);
        
        
        switch (Character.toLowerCase(categoria)) {
            case 'a':
                descuento = 10;
                precioFinal = precio * (0.90);
                break;
            case 'b':
                descuento = 15;
                precioFinal = precio * (0.85);
                break;
            case 'c':
                descuento = 20;
                precioFinal = precio * (0.80);
                break;
        }
        
        System.out.println("El precio original de tu producto era " + precio + " si le aplicamos un descuento del " + descuento + "%, su precio final es de " + precioFinal );
    }
    
}
