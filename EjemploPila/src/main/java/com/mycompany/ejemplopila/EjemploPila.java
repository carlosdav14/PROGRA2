/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplopila;

/**
 *
 * @author carlos
 */
public class EjemploPila {
    
    public static void main(String [] args){
        Pila miPila = new Pila();
        miPila.push(5);
        miPila.push(4);
        miPila.push(3);
        miPila.push(2);
        miPila.push(1);
        
        System.out.println(miPila.pop().valor);
        System.out.println(miPila.pop().valor);
        System.out.println(miPila.pop().valor);
        System.out.println(miPila.pop().valor);
        System.out.println(miPila.pop().valor);
    }
    
}
