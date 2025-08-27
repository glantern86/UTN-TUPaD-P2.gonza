/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02pradosgonzalo;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.74, 399.0, 89.99};
        for (int i = 0; i < precios.length; i++) {
        System.out.print("$"+precios[i]+", ");}
        System.out.println();
        
        precios[2] = 129.99;
        
        for (int i = 0; i < precios.length; i++) {
        System.out.print("$"+precios[i]+", ");}
    }
}