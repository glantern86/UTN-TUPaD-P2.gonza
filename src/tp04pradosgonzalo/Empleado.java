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
    
    @Override
    public String toString() {
       return "ID "+ id + "\nNombre: " + nombre
               + "\nPuesto: " + puesto + "\nSalario: "+ salario +"\nTotal empleados: " +
               totalEmpleados+"\n---------------------";
    }
    
    public double setActualizarSalario(int porcentaje){
        if (porcentaje < 0 ){
        System.out.println("El aumento no puede ser nagativo. "
                + "El aumento ingresado era de "+porcentaje+"%");
        return salario;
        } else {
        this.salario = salario + (salario * porcentaje / 100.0);
        return salario;
        }
    }
    
    //estoy partiendo de la base de que como mínimo toda actualizacion salarial es del 10%
    public double setActualizarSalario(){
        this.salario = salario + (salario * 0.1);
        return salario;
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
}
