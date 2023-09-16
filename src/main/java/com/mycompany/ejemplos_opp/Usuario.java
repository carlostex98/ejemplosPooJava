/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplos_opp;

/**
 *
 * @author carlo
 */
public class Usuario {
    private String nombre;
    private int edad;
    public Usuario(String nombre){
        this.nombre = nombre;
    }
    
    public void set_edad(int edad){
        this.edad = edad;
    }
    
    public String[] obtener_datos(){
        return new String[]{this.nombre, String.valueOf(this.edad)};
    }
}
