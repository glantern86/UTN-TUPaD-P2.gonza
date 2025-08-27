/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01pradosgonzalo;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos a realizar la operacion de division");
        
        System.out.println("Ingresa el primer número:");
        int num1 = input.nextInt();
        input.nextLine();
        
        System.out.println("Ingresa el segundo número:");
        int num2 = input.nextInt();
        input.nextLine();

        double divisionDouble=(double)num1/num2;
        int divisionInt=num1/num2;
        
        System.out.println("El resultado de la division es: " + String.valueOf(divisionDouble));
        System.out.println("El resultado de la division es: " + String.valueOf(divisionInt));
    }
    
}
