/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplos_opp;

/**
 *
 * @author carlo
 */
public class Libro {
    private String nombre;
    private String detalle;
    private int modificaciones;
    public Libro(String nombre, String detalle){
        this.nombre = nombre;
        this.detalle = detalle;
    }
    
    private void modificacion(){
        this.modificaciones++;
    }
    
    public void modificarNombre(String nombre){
        this.nombre = nombre;
        this.modificacion();
    }
    
    public void modificarDetalle(String detalle){
        this.detalle = detalle;
        this.modificacion();
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
    
    public String obtenerDetalle(){
        return this.detalle;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Detalle: "+this.detalle);
    }
    
}
