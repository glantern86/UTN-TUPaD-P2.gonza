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
public class Ejercicio02 {
     
    public static void ejercicio2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingrese texto para convertir a int: ");
            String texto = scanner.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);
            }catch(NumberFormatException e){
            System.out.println("El texto no se puede convertir a int");
            };
    }
    
}
