/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08pradosgonzalo.parte2.Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author gonza
 */
public class Ejercicio05 {
    public static void ejercicio5(String[] args) {
        String nombreArchivo = "archivo.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            System.out.println("Contenido del archivo '" + nombreArchivo + "':");
            
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + nombreArchivo + "' no existe.");
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }
    }
}
