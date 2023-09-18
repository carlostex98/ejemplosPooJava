/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplos_opp;

public class Lista {
    
    private Auto primero = null;
    private Auto ultimo = null;

    public Lista(){
        
    }
    
    public void iniciarLista(){
        this.primero = null;
        this.ultimo = null;
    }
    
    public void nuevoAuto(String marca, String linea, String anio){
        Auto nuevo = new Auto(marca, linea, anio);
        
        if(this.primero == null){
            this.primero = nuevo;
            this.ultimo = nuevo;
        }else{
            this.ultimo.asignarSiguiente(nuevo);
            this.ultimo = nuevo;
        }
        
    }
    
    public void imprimirLista(){
        Auto aux = this.primero;
        while(aux!= null){
            aux.imprimirDatos();
            aux = aux.retornarSiguiente();
        }
    }
    
}
