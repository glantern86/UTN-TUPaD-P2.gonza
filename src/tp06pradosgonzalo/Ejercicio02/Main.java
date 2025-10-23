/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp06pradosgonzalo.Ejercicio02;

import tp06pradosgonzalo.Ejercicio01.*;

public class Main {

    public static void main(String[] args) {
        //1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        System.out.println("\n=== CREAR 5 PRODUCTOS ===");
        Inventario inventario = new Inventario();
        
        Producto tomate = new Producto("A001","Tomate", 3000.00, 100, CategoriaProducto.ALIMENTOS);
        Producto jeans = new Producto("B001","Jean", 5000.00, 75, CategoriaProducto.ROPA);
        Producto afeitadora = new Producto("C001","Afeitadora Epson multicuchilla", 9000.00, 100, CategoriaProducto.HOGAR);
        Producto mp4 = new Producto("D001","MP4 Hitachi", 15000.00, 8, CategoriaProducto.ELECTRONICA);
        Producto manzanas = new Producto("A002","Manzana deliciosa", 5000.00, 50, CategoriaProducto.ALIMENTOS);
        
        inventario.agregarProducto(tomate);
        inventario.agregarProducto(jeans);
        inventario.agregarProducto(afeitadora);
        inventario.agregarProducto(mp4);
        inventario.agregarProducto(manzanas);
        
        //2. Listar todos los productos mostrando su información y categoría.
        System.out.println("\n=== LISTAR PRODUCTOS ===");
        inventario.listarProductos();
        //3. Buscar un producto por ID y mostrar su información.
        System.out.println("\n=== BUSCAR PRODUCTOS: ID C001 ===");
        inventario.buscarProductoPorId("C001");
        //4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("\n=== FILTRAR PRODUCTOS: ALIMENTOS ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        //5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("\n=== ELIMINAR PRODUCTO A002 Y LISTAR RESTANTES ===");
        inventario.eliminarProducto("A002");
        inventario.listarProductos();
        //6. Actualizar el stock de un producto existente.
        System.out.println("\n=== ACTUALIZAR STOCK ===");
        inventario.actualizarStock("D001", 15);
        //7. Mostrar el total de stock disponible.
        System.out.println("\n=== MOSTRAR STOCK ===");
        inventario.obtenerTotalStock();
        //8. Obtener y mostrar el producto con mayor stock
        System.out.println("\n=== MOSTRAR PRODUCTO CON MAYOR STOCK ===");
        inventario.obtenerProductoConMayorStock();
        //9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("\n=== FILTRAR ENTRE PRECIOS $1000 Y $3000 ===");
        inventario.filtrarProductosPorPrecio(1000.00, 3000.00);
        //10. Mostrar las categorías disponibles con sus descripciones.
        System.out.println("\n=== MOSTRAR CATEGORIAS Y DESCRIPCIONES ===");
        inventario.mostrarCategoriasDisponibles();
    }
}
