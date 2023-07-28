
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.LinkedList;


public class Utilidades {
    public static boolean guardarArchivo(LinkedList<Cliente> listaC){
        boolean t=false;
        try{
            String nombreArchivo = "clientes.txt";
            FileWriter fileWriter = new FileWriter(nombreArchivo);
            BufferedWriter writer= new BufferedWriter(fileWriter);
            for (Cliente cliente : listaC) {
                writer.write(cliente.toString()+"\n");
            }
           writer.close();
           fileWriter.close();
           t=true;
        }catch (IOException e){
            e.printStackTrace();
        }
        
        
        return t;
    }
    // desventaja, no puedo crear objetos
    
}
