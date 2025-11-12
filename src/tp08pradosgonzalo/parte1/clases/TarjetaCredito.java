/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08pradosgonzalo.parte1.clases;
import tp08pradosgonzalo.parte1.interfaces.Pago;
import tp08pradosgonzalo.parte1.interfaces.PagoConDescuento;

/**
 *
 * @author gonza
 */
public class TarjetaCredito implements Pago, PagoConDescuento {
    private double monto;

    public TarjetaCredito(double monto) {
        this.monto = monto;
    }
    
    public double procesarPago(double monto){
        return 1;
    }
    
    public double aplicarDescuento(double porcentaje){
        monto= monto-(monto*porcentaje/100);
        return monto;
    };
    
}
