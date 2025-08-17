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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos a realizar las operaciones de suma, resta, multiplicacion y division");
        System.out.println("Ingresa el primer número:");
        int num1 = input.nextInt();
        input.nextLine();
        
        System.out.println("Ingresa el segundo número:");
        int num2 = input.nextInt();
        input.nextLine();
        
        int suma=num1+num2;
        int resta=num1-num2;
        int multiplicacion=num1*num2;
        double division=(double)num1/num2;
        
        
        System.out.println("El resultado de la suma es: " + String.valueOf(suma));
        System.out.println("El resultado de la resta es: " + String.valueOf(resta));
        System.out.println("El resultado de la multiplicacion es: " + String.valueOf(multiplicacion));
        System.out.println("El resultado de la division es: " + String.valueOf(division));
    }
    
}
