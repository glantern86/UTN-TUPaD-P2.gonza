/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02pradosgonzalo;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.74, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);
        System.out.println();

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        mostrarPreciosRecursivoModificado(precios, 0);
        System.out.println();
    }

    public static void mostrarPreciosRecursivo(double[] precios, int i) {
        if (i < precios.length) {
            System.out.print("$" + precios[i] + ", ");
            mostrarPreciosRecursivo(precios, i + 1);
        }
    }

    public static void mostrarPreciosRecursivoModificado(double[] precios, int i) {
        if (i < precios.length) {
            System.out.print("$" + precios[i] + ", ");
            mostrarPreciosRecursivoModificado(precios, i + 1);
        }
    }
}