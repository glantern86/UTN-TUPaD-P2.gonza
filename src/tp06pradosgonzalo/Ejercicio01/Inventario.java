/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06pradosgonzalo.Ejercicio01;
import java.util.ArrayList;

public class Inventario {
    ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    
    public void listarProductos() {
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            System.out.println((i + 1) + ". " + p.nombre + " - $" + p.precio + " - Stock: " + p.cantidad);
        }
    }
    
    public void buscarProductoPorId(String id) {
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);

            if (p.id.equals(id)) { 
                System.out.println((i + 1) + ". " + p.nombre + " - $" + p.precio + " - Stock: " + p.cantidad);
                return;
            }
        }
        System.out.println("Producto con ID '" + id + "' no encontrado");
    }

    public void eliminarProducto(String id) {
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);

            if (productos.get(i).id.equals(id)) { 
                productos.remove(i);
                System.out.println("Producto '" + p.nombre + "' removido exitosamente");
                return;
            }
        }
        System.out.println("Producto con ID '" + id + "' no encontrado");
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);

            if (p.id.equals(id)) { 
                p.cantidad = nuevaCantidad;
                System.out.println("Producto '" + p.nombre + "' cantidad actualizada a " + p.cantidad);
                return;
            }
        }
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        boolean encontrados = false;

        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);

            if (p.categoria.equals(categoria)) { 
                System.out.println((i + 1) + ". " + p.nombre + " - $" + p.precio + " - Stock: " + p.cantidad);
                encontrados = true;
            }
        }    
        if (!encontrados) {
            System.out.println("No hay productos en la categoría: " + categoria.getDescripcion());
        }
    }
    
    public void obtenerTotalStock() {
        int total = 0;

        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            total += p.cantidad;
        }    
        System.out.println("Total de productos: " + total);
    }
    
    public void obtenerProductoConMayorStock() {
        Producto productoMayor = productos.get(0);
        int mayorStock = productoMayor.cantidad;

        for (int i = 1; i < productos.size(); i++) {
            Producto p = productos.get(i);

            if (p.cantidad > mayorStock) { 
                mayorStock = p.cantidad;
                productoMayor = p;
            }
        }    

        System.out.println("Producto con mayor stock: " + productoMayor.nombre + " - Stock: " + mayorStock);
    }
    
    public void filtrarProductosPorPrecio(double min, double max) {
        boolean encontrados = false;

        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);

            if (p.precio > min && p.precio < max) {
                encontrados = true;
                System.out.println("Producto con precio mayor a " + min + " y menor a "+ max +": "+p.nombre);
            }
        }    
        if (!encontrados) {
            System.out.println("No hay productos en ese rango de precios");
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("- " + categoria.getDescripcion());
        }
    }    
}