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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos a ingresar una serie de números para determinar cual es el mayor");
        System.out.print("Ingresa el primer número: ");
        int numero1 = input.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int numero2 = input.nextInt();
        
        System.out.print("Ingresa el tercer número: ");
        int numero3 = input.nextInt();
        
        if (numero1 > numero2 && numero1 > numero3 ) {
                System.out.println("Entre los números " + numero1 + ", " + numero2 + " y " + numero3 + " el mayor es el " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3 ) {
                System.out.println("Entre los números " + numero1 + ", " + numero2 + " y " + numero3 + " el mayor es el " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2 ) {
                System.out.println("Entre los números " + numero1 + ", " + numero2 + " y " + numero3 + " el mayor es el " + numero3);
                   }
    }
    
}
