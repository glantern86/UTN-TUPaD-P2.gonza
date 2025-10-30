/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp07pradosgonzalo.Ejercicio03;

/**
 *
 * @author gonza
 */
public abstract class Empleado {
    protected String nombre;
    protected String tipoContrato;

    public Empleado(String nombre, String tipoContrato) {
        this.nombre = nombre;
        this.tipoContrato = tipoContrato;
    }
    
    public abstract int calcularSueldo();
    
}
