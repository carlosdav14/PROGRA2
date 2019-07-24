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
public class Principal {
    public static void main(String[] args) {
        Lista miLista = new Lista();
        
        miLista.insertar(0);
        miLista.insertar(1);
        miLista.insertar(2);
        miLista.insertar(3);
        
        miLista.mostrar();
        
        miLista.insertar(4);
        miLista.mostrar();
        
        Nodo buscar = miLista.buscar(2);
        
        if(buscar!=null){
            System.out.println("Existe valor: " + buscar.valor);
        }
        
        buscar = miLista.buscar(10);
        
        if(buscar!=null){
            System.out.println("Existe valor: " + buscar.valor);
        }
        
        miLista.insertar(5);
        
        miLista.mostrar();
        
        miLista.eliminar(0);
        
        miLista.mostrar();
        
        miLista.eliminar(3);
        
        miLista.mostrar();
        
        miLista.eliminar(5);
        
        miLista.mostrar();
        
        
    }
}
