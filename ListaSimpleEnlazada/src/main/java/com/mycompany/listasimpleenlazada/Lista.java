/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listasimpleenlazada;

/**
 *
 * @author Carlos
 */
public class Lista {

    public Nodo primero;
    
    public void insertar(int valor){
        Nodo nuevo = new Nodo();
        nuevo.valor = valor;
        
        if(primero==null){
            primero = nuevo;
        }
        else{
            Nodo temporal =primero;
            while(temporal.siguiente!=null){
                temporal = temporal.siguiente;
            }
            temporal.siguiente = nuevo;
        }
    }
    
    public void mostrar(){
        Nodo temporal = primero;
        while(temporal!=null){
            System.out.print(temporal.valor+"->");
            temporal = temporal.siguiente;
        }
        System.out.print("null");
        System.out.println("");
        
    }
    
    Nodo buscar(int valor){
        Nodo temporal = primero;
        
        while(temporal!=null){
            if(temporal.valor == valor){
                return temporal;
            }
            temporal = temporal.siguiente;
        }
        
        System.out.println("No existe el valor");
        return null;
        
    }
    
    void eliminar(int valor){
        if(primero!=null){
            Nodo temporal = primero;
            Nodo anterior = null;
            
            while(temporal!=null){
                if(temporal.valor == valor){
                    break;
                }
                anterior = temporal;
                temporal = temporal.siguiente;
            }
            
            if(temporal == null){
                System.out.println("Esta eliminando un elemento que no existe.");
            }
            else{
                if(anterior == null){
                    primero = primero.siguiente;
                }
                else{
                    anterior.siguiente = temporal.siguiente;
                }
            }
            
        }
    }

}
