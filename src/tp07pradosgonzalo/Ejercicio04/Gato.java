/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp07pradosgonzalo.Ejercicio04;

/**
 *
 * @author gonza
 */
public class Gato extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("MIAU!");
    };
    
    @Override
    public void describirAnimal(){
        System.out.println("Félido");
    };
}
