/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp07pradosgonzalo.Ejercicio03;

import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoTemporal("Carlos Gomez", "Empleado Temporal"));
        empleados.add(new EmpleadoTemporal("John Wick", "Empleado Temporal"));
        empleados.add(new EmpleadoTemporal("Jack D. Ripper", "Empleado Temporal"));
        empleados.add(new EmpleadoPlanta("Kakashi", "Empleado Planta"));
        empleados.add(new EmpleadoPlanta("Peter Parker", "Empleado Planta"));
        
        for (Empleado empleado : empleados) {
            int sueldo = empleado.calcularSueldo();
            System.out.printf( empleado.nombre + ": $" + sueldo + " pesos.\n");
        }
        
    }
    
}
