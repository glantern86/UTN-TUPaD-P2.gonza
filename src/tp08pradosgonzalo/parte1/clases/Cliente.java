/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08pradosgonzalo.parte1.clases;
import tp08pradosgonzalo.parte1.interfaces.Notificable;


/**
 *
 * @author gonza
 */
public class Cliente implements Notificable {
    public void notificar(String mensaje) {
        System.out.println("Cliente recibió: " + mensaje);
    }
}
