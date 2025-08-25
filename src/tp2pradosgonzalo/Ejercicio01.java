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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un año para determinar si es bisiesto:");
        int anio = input.nextInt();
        
        if ( (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto"); 
        } else {
            System.out.println("El año " + anio + " no es bisiesto"); 
        }      
    }  
}
