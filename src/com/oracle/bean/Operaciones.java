/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.bean;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author diCenter
 */
public class Operaciones {
    
    public static void main(String[] args) {
        System.out.println("SUMA: " + Operaciones.sumar(2,5,8,9,6,3,8));
        
        System.out.println("RESTA: " + Operaciones.restar(2,5,8,9,6,3,8));
        
        System.out.println("COMISIONES: " + Operaciones.cobrarComisiones("Carina",2,5,8,9,6,3,8));
    }
    
    
    public static int sumar(int... num) {
        int sum = 0;
        for (int i : num) {
            
            sum += i;
        }
     return sum;   
    }
    
     public static int restar(int... num) {
        int sum = 0;
        for (int i : num) {
            
            sum -= i;
        }
     return sum;   
    }
     
     public static  Map<String, Double> cobrarComisiones (String vendedor , int ... ventas){
         
         Double totalVentas = new Double("0");
         
         for (int venta : ventas) {
             totalVentas += venta;
         }
         Map<String, Double>  venta = new HashMap<>();
         venta.put(vendedor, totalVentas);
         
     return venta;
     }
    
}
