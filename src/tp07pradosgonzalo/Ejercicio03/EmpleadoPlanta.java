/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp07pradosgonzalo.Ejercicio03;

/**
 *
 * @author gonza
 */
public class EmpleadoPlanta extends Empleado{

    public EmpleadoPlanta(String nombre, String tipoContrato) {
        super(nombre, tipoContrato);
    }
    
    @Override
    public int calcularSueldo(){
        return 1000000;
    };
}
