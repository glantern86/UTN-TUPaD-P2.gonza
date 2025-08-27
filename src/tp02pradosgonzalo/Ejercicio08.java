/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02pradosgonzalo;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el precio base de producto: ");
        double precioBase = input.nextDouble();

        System.out.print("Ingrese el porcentaje del impuesto: ");
        double impuesto = input.nextDouble();

        System.out.print("Ingrese el porcentaje del descuento: ");
        double descuento = input.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio original de tu producto era " + precioBase +
                " si le aplicamos un impuesto del " + impuesto + "% y un descuento del " +
                descuento + "% entonces el precio final del producto es " + precioFinal);
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioConImpuesto = precioBase + (precioBase * (impuesto / 100));
        double precioFinal = precioConImpuesto - (precioBase * (descuento / 100));
        return precioFinal;
    }
}