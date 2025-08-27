/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02pradosgonzalo;

import java.util.Scanner;

public class Ejercicio11 {
    
    static double descuento = 0.10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el precio base del producto: ");
        double precio = input.nextDouble();
 
        double descuentoAplicado = calcularDescuentoEspecial(precio);
        
        System.out.println("El precio con el descuento aplicado es de " + descuentoAplicado);
    }

    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio - (precio * descuento);
        return descuentoAplicado;
    }
}