/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplographviz;

/**
 *
 * @author carlos
 */
public class Lista {
    public Nodo primero;
    
    public void insertar(int valor){
        Nodo nuevo = new Nodo();
        nuevo.valor = valor;
        if(primero == null){
            //LISTA VACIA
             primero = nuevo;
        }
        else{
            //LISTA LLENA
            Nodo temporal = primero;
            while(temporal.siguiente!=null){
                temporal = temporal.siguiente;
            }
            temporal.siguiente = nuevo;
        }
        
    }
    
    public Nodo buscar(int valor){
        Nodo temporal = primero;
        while(temporal!=null){
            if(temporal.valor == valor){
                return temporal;
            }
            temporal = temporal.siguiente;
        }
        System.out.println("no existe");
        return null;
        
    }
    
    public void eliminar(int valor){
        if(primero!=null){
        //LISTA NO VACIA
        Nodo anterior = null;
        Nodo temporal = primero;
        
        while(temporal!=null){
            if(temporal.valor == valor){
            //Encontre el que quiero eliminar
                break;
            }
            anterior = temporal;
            temporal = temporal.siguiente;
        }
        
        if(temporal==null){
            //NO LO ENCONTRO
            System.out.println("No existe");
        }
        else{
            if(anterior==null){
                //SE QUIERE ELIMINAR EL PRIMERO
                primero = primero.siguiente;
            }
            else{
             anterior.siguiente = temporal.siguiente;
            }
        }
        
        }
    }
    
    public void recorrer(){
        Nodo temporal = primero;
        while(temporal!=null){
            System.out.print(temporal.valor+"->");
            temporal = temporal.siguiente;
        }
        System.out.println("null");
    }
    
    public String obtenerStringParaGraphviz(){
        Nodo temporal = primero;
        String texto = "digraph G \n" +
"{\n" +
" node [shape=circle];\n" +
" node [style=filled];\n" +
" node [fillcolor=\"#EEEEEE\"];\n" +
" node [color=\"#EEEEEE\"];\n" +
" edge [color=\"#31CEF0\"];\n";
        while(temporal!=null){
            texto += temporal.valor+"->";
            temporal = temporal.siguiente;
        }
        texto += "null;\n" +
"rankdir=LR;\n" +
"}" ;
        
        return texto;
    }
}
