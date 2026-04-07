/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Usuario
 */
public class Producto {
    
    protected String id;
    protected String tipo;

    //lista que almacena productos
     

    public Producto(String id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", tipo=" + tipo + '}';
    }
    
    

 
    
    
    
    
    
    
    
    
    //Punto 1. Recepcion de productos
    public  void RecepcionProductos(Producto p, Queue lista){
        
        lista.add(p);
        
        System.out.println("Lista"+lista);
        
        
        
    }
    
    
    
}
