/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08pradosgonzalo.parte2.Ejercicios;

/**
 *
 * @author gonza
 */
public class Ejercicio04 {
    public static void ejercicio4(String[] args) {
        int[] edades = {25, -5, 150, 30, 200};
        
        for (int edad : edades) {
            try {
                validarEdad(edad);
                System.out.println("Edad " + edad + " es válida");
            } catch (EdadInvalidaException e) {
                System.out.println("Error para edad " + edad + ": " + e.getMessage());
            }
        }
    }
    
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa");
        } else if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120 años");
        }
    }
}