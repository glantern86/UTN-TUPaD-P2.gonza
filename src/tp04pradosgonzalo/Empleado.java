/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp04pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }    
    
        public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        salario=1000;
        id=9999;
        totalEmpleados++;
    }
    
    public String getDatos() {
       return "ID "+ id + "\nNombre: " + nombre
               + "\nPuesto: " + puesto + "\nSalario: "+ salario +"\nTotal empleados: " +
               totalEmpleados+"\n---------------------";
    }
    
    public double setActualizarSalario(int porcentaje){
        this.salario = salario + (salario * porcentaje / 100.0);
        return salario;
    }
}
