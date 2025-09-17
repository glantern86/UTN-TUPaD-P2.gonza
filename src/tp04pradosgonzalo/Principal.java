/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp04pradosgonzalo;

import static tp04pradosgonzalo.Empleado.mostrarTotalEmpleados;

/**
 *
 * @author gonza
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado(9999, "Juan Pérez", "Operario", 1000.00);
        System.out.println(e1);
        Empleado e2 = new Empleado(1111, "Esteban Campos", "Administrativo", 1500.00);
        System.out.println(e2);
        Empleado e3 = new Empleado("Marcos Pérez", "Monotributo");
        System.out.println(e3);
        e2.setActualizarSalario(15);
        System.out.println(e2);
        e2.setActualizarSalario(-15);
        e3.setActualizarSalario();
        System.out.println(e3);
        System.out.println("El total de empleados es: "+mostrarTotalEmpleados());
        
    }
    
}
