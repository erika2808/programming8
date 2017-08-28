/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.test;

import com.oracle.bean.Persona;

/**
 *
 * @author diCenter
 */
public class PersonaTest {
    
    public static void main(String... oracle) {
        Persona saul = new Persona("Saul",20,'M');       
        
        Persona maria = new Persona("Veronica",35,'F');
        
        saul.comer("Camarones", "Filete", "Ostiones");
        maria.comer("Chilaquiles", "Tacos", "Quesadillas");
        
//        saul.reproducirse(maria);
        Persona hijo = maria.reproducirse(saul);
        
        System.out.println("**********************************");
        System.out.println("Hijo: "+hijo);
        System.out.println(" Madre : " + hijo.getMadre());
        System.out.println(" Padre" + hijo.getPadre());
    
        
    }
}
