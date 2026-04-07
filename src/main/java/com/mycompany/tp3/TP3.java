/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp3;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Usuario
 */
public class TP3 {

    public static void main(String[] args) {
        
        Producto p=new Producto("A001","Alimento");
        Producto p1=new Producto("A002","Electronica");
        Producto p2=new Producto("A003","Indumentaria");
        
        Queue lista= new LinkedList<>();
        
        
        p.RecepcionProductos(p, lista);
        p.RecepcionProductos(p1, lista);
         p.RecepcionProductos(p2, lista);
        
        
        
        
    
        
        
        
    }
    
    
    
}
