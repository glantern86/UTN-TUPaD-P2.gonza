/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08pradosgonzalo.parte2.Ejercicios;
import java.util.Scanner;
/**
 *
 * @author gonza
 */
public class Ejercicio01 {
     
    public static void ejercicio1(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un dividendo: ");
        int numero = scanner.nextInt();

        System.out.println("Ingrese un divisor: ");
        int otroNumero = scanner.nextInt();
        
        if (otroNumero == 0)
                {throw new ArithmeticException("No se puede dividir un número por cero");
                        } else { System.out.println("El resultado de la division es: " + numero/otroNumero);
        };
        

   
    }
    
}
