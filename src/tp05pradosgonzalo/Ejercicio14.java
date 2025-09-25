/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05pradosgonzalo;

/**
 *
 * @author gonza
 */
public class Ejercicio14 {
    public class Render { 
        private String formato;
        private Proyecto proyecto;

        public Render(String formato, Proyecto proyecto) {
            this.formato = formato;
            this.proyecto = proyecto;
        }
    }

    public class Proyecto { 
        private String nombre;
        private int duracionMin;

        public Proyecto(String nombre, int duracionMin) {
            this.nombre = nombre;
            this.duracionMin = duracionMin;
        }
    }

    public class EditorVideo { 
        public Render exportar(String formato, Proyecto proyecto) {
            return new Render(formato, proyecto);
        }
    }
}
