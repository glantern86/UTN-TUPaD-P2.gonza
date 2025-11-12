/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08pradosgonzalo.parte1.clases;
import tp08pradosgonzalo.parte1.interfaces.Pago;

/**
 *
 * @author gonza
 */
public class PayPal implements Pago {
    private double monto;

    public PayPal(double monto) {
        this.monto = monto;
    }
    
    public double procesarPago(double monto){
        return 1;
    }
}
