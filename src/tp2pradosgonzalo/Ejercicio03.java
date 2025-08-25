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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa tu edad para clasificar en que estapa etaria te encuentras: ");
        int edad = input.nextInt();
        
        if (edad < 12 ) {
                System.out.println("Eres un niño");
        } else if (edad >= 12 && edad <= 17 ) {
                System.out.println("Eres un adolescente");
        } else if (edad >= 18 && edad <= 59 ) {
                System.out.println("Eres un Adulto");
        } else if (edad >= 59) {
                System.out.println("Eres un Adulto");
        }
    }
    
}
