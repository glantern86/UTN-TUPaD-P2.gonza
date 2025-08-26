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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroIngresado = 0;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
                
        System.out.println("Ingresa 10 números para que contemos cuantos son positivos, negativos o ceros");
        
        for ( int contador = 1; contador < 5; contador++ ){
        System.out.print("Ingresa un número: ");
        numeroIngresado = input.nextInt();
        
        if ( numeroIngresado > 0 ){
            positivos++; 
        }  else if (numeroIngresado < 0){
            negativos++;
        } else {
            ceros++;
        }
        
        }
        System.out.println("\nNumeros positivos " + positivos + "\nNumeros negativo " + negativos + "\nCeros " + ceros);
        }
        

    }
