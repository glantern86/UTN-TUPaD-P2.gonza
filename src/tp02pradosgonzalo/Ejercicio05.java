/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02pradosgonzalo;
import java.util.Scanner;
/**
 *
 * @author gonza
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int numeroIngresado = 1;
        
        System.out.print("Vamos a realizar la suma de numeros pares ");
        String prompt = "Ingrese un número (0 para terminar):";
        
        while (numeroIngresado != 0 ) {
        System.out.println(prompt);
        numeroIngresado = input.nextInt();
        
        if ( numeroIngresado % 2 == 0 ){
            total += numeroIngresado;
        }
        }
        System.out.println("La suma total de los números pares es " + total);
    }
    
}
