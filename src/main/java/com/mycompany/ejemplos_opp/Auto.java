/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplos_opp;

/**
 *
 * @author carlo
 */
public class Auto {
    
    private String marca;
    private String linea;
    private String anio;
    private Auto siguiente = null;
    
    public Auto(String marca, String linea, String anio){
        this.marca = marca;
        this.linea = linea;
        this.anio = anio;
    }
    
    public void asignarSiguiente (Auto siguiente){
        this.siguiente = siguiente;
    }
    
    public void imprimirDatos(){
        System.out.println("Detalle auto------------\n"
                + "Marca: "+this.marca+"\n"
                + "Linea: "+this.linea+"\n"
                + "Año:"+this.anio);
    }
    
    public Auto retornarSiguiente(){
        return this.siguiente;
    }
    
}
