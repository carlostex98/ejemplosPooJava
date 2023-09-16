/*
 * ejemplos con java :)
 */

package com.mycompany.ejemplos_opp;
import java.util.LinkedList;

/**
 *
 * @author Carlos Tenes --- Guatemala
 */


public class Ejemplos_opp {

    public static void main(String[] args) {
        // ---------------------  ejemplo 1
        System.out.println("Ejemplo 1 ---------------------------");
        Usuario x = new Usuario("c");
        System.out.println(x.obtener_datos()[0]);
        System.out.println("\n");
        // ----------------------  ejemplo 2
        System.out.println("Ejemplo 2 ----------------------------");
        LinkedList<Libro> libros = new LinkedList<Libro>();
        for (int z = 0; z<100; z++){
            Libro nuevoLibro = new Libro(
                    "libro "+String.valueOf(z),
              "Detalle del libro "+String.valueOf(z));
            libros.add(nuevoLibro);
        }
        
        Libro c = libros.get(0);
        c.imprimirDatos();
        System.out.println("\n");
        
    }
}
