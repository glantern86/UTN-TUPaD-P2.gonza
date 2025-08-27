/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2pradosgonzalo;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el peso del paquete: ");
        double peso = input.nextDouble();
        input.nextLine();

        System.out.print("Ingrese si la zona de envio nacional o internacional: ");
        String zona = input.nextLine();
        

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El total de la compra es " + totalCompra);
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;
        if (zona.equalsIgnoreCase("nacional")) {
            costoEnvio = peso*5;
        } else if (zona.equalsIgnoreCase("internacional")) {
            costoEnvio = peso*10;
        }
        return costoEnvio;
    }
    
        public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        double totalCompra = precioProducto + costoEnvio;
        return totalCompra;
    }
}