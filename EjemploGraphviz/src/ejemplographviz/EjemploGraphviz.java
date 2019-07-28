/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplographviz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author cdavila
 */
public class EjemploGraphviz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Lista miLista = new Lista();
        miLista.recorrer();

        miLista.insertar(1);
        miLista.recorrer();

        miLista.insertar(2);
        miLista.recorrer();

        miLista.insertar(3);
        miLista.recorrer();

        miLista.insertar(4);
        miLista.recorrer();

        miLista.insertar(5);
        miLista.recorrer();

        miLista.eliminar(3);
        miLista.recorrer();

        miLista.eliminar(1);
        miLista.recorrer();
        
        miLista.insertar(8);
        
        //TOMAR EN CUENTA QUE LA RUTA DE LOS ARCHIVOS ESTA APUNTANDO A MI ESCRITORIO CAMBIARLA A LA DE USTEDES
        escribir("/home/carlos/Escritorio/diagrama.dot", miLista.obtenerStringParaGraphviz());
        dibujar("/home/carlos/Escritorio/diagrama.dot","/home/carlos/Escritorio/diagrama.png");
        

    }

    public static void dibujar(String rutaArchivoDot, String rutaArchivoPng) {
        try {
            ProcessBuilder pbuilder;

            /*
			 * Realiza la construccion del comando    
			 * en la linea de comandos esto es: 
			 * dot -Tpng -o archivo.png archivo.dot
             */
            
            pbuilder = new ProcessBuilder( "dot", "-Tpng", "-o", rutaArchivoPng, rutaArchivoDot );
            pbuilder.redirectErrorStream(true);
            //Ejecuta el proceso
            pbuilder.start();            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void escribir(String rutaArchivo, String contenido) {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter(rutaArchivo);
            pw = new PrintWriter(fichero);
            pw.write(contenido);
            pw.close();
            fichero.close();
        } catch (Exception e) {
            System.out.println("Error al tratar de escribir el archivo: " + e.getMessage());
        } finally {
            try {

            } catch (Exception e) {
                System.out.println("No se pudo cerrar el archivo: " + e.getMessage());
            }
        }

    }

}
