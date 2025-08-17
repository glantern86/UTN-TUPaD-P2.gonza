/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1pradosgonzalo;

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
        
        System.out.println("Ingresa un nombre:");
        String nombre = input.nextLine();
        
        System.out.println("Ingresa tu edad:");
        int edad = input.nextInt();
        input.nextLine();
        
        System.out.println("Tu nombre es " + nombre + " y tienes " + String.valueOf(edad) + " años");

    }
    
}
