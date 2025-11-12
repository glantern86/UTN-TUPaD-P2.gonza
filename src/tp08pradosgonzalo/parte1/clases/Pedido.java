/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08pradosgonzalo.parte1.clases;

import java.util.ArrayList;
import tp08pradosgonzalo.parte1.interfaces.Pagable;
import tp08pradosgonzalo.parte1.interfaces.Notificable;


/**
 *
 * @author gonza
 */
public class Pedido implements Pagable {
    private ArrayList<Producto> productos;
    private Cliente cliente;

    public Pedido(ArrayList<Producto> productos, Cliente cliente) {
        this.productos = productos;
        this.cliente = cliente;
    }
    
    public double calcularTotal(){
        double precioTotal = 0;
        for (Producto precio : productos) {
        precioTotal += precio.calcularTotal();
        }
        return precioTotal;
    }
    
    public void cambiarEstado(String nuevoEstado) {
        cliente.notificar("Estado cambiado a: " + nuevoEstado);
    }
}
