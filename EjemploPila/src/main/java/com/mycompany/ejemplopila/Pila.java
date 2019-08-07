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
public class Pila {

    public Nodo inicio;
    public int size = 0;

    public void push(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.valor = valor;

        if (inicio != null) {
            nuevo.siguiete = inicio;
        }
        inicio = nuevo;
        size++;
    }

    public Nodo pop() {
        if (inicio != null) {
            Nodo temporal = inicio;
            inicio = inicio.siguiete;
            size--;
            return temporal;
        }
        return null;
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean empty(){
        return inicio == null;
        //return size == 0;
    }

}
