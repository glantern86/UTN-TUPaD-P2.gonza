/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp07pradosgonzalo.Ejercicio03;

/**
 *
 * @author gonza
 */
public class EmpleadoTemporal extends Empleado{

    public EmpleadoTemporal(String nombre, String tipoContrato) {
        super(nombre, tipoContrato);
    }
    
    @Override
    public int calcularSueldo(){
        return 800000;
        //return sueldo;
    };
    
}
