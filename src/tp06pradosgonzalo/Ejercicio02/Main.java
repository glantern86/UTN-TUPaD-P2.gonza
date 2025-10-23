/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp06pradosgonzalo.Ejercicio02;

import tp06pradosgonzalo.Ejercicio01.*;

public class Main {

    public static void main(String[] args) {

        //1. Creamos una biblioteca.
        System.out.println("\n=== CREAR UNA BIBLIOTECA ===");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional");

        //2. Crear al menos tres autores
        System.out.println("\n=== CREAR AUTORES ===");
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A002", "Jorge Luis Borges", "Argentino");
        Autor autor3 = new Autor("A003", "Julio Cortázar", "Argentino");

        //3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        System.out.println("\n=== AGREGAR LIBROS ===");
        biblioteca.agregarLibro("978-8437604947", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-8420673840", "Ficciones", 1944, autor2);
        biblioteca.agregarLibro("978-8437604948", "El otoño del patriarca", 1975, autor1);
        biblioteca.agregarLibro("978-8472234455", "Rayuela", 1963, autor3);
        biblioteca.agregarLibro("978-8420673857", "El Aleph", 1949, autor2);

        //4. Listar todos los libros con su información y la del autor.
        System.out.println("\n=== LISTAR TODOS LOS LIBROS ===");
        biblioteca.listarLibros();

        //5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\n=== BUSCAR LIBRO POR ISBN ===");
        biblioteca.buscarLibroPorIsbn("978-8437604947");

        //6. Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("\n=== FILTRAR LIBROS POR AÑO 1944 ===");
        biblioteca.filtrarLibrosPorAnio(1944);

        //7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("\n=== ELIMINAR LIBRO ===");
        biblioteca.eliminarLibro("978-8472234455");

        System.out.println("\n=== LIBROS RESTANTES ===");
        biblioteca.listarLibros();

        //8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\n=== CANTIDAD TOTAL DE LIBROS ===");
        biblioteca.obtenerCantidadLibros();

        //9. Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\n=== AUTORES DISPONIBLES ===");
        biblioteca.mostrarAutoresDisponibles();
    }
}