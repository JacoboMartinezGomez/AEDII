/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8_3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import mapa.*;

/**
 *
 * @author Jacobo
 */
public class Practica8 {

    /**
     * @param capacidadMaxima
     * @param espacioProgramas
     * @param args the command line arguments
     * @return 
     */
   public static List<String> llenarCDVoraz(int capacidadMaxima, Map<String,Integer> espacioProgramas) {
   List<String> cd = new LinkedList<>();
   int espacioOcupado = 0;
   boolean llenarMas = true;
   int k =0;
   // Mientras no se haya cumplido el objetivo con los objetos disponibles
   while ( espacioOcupado < capacidadMaxima && llenarMas){
        // buscar un programa que “quepa”
        String programa = mayor(capacidadMaxima-espacioOcupado,espacioProgramas,cd);
        if ( programa != null){
           k = espacioProgramas.get(programa);
           espacioProgramas.eliminar(programa);
           cd.add(programa);
           espacioOcupado += k;
        }
        else llenarMas=false; //No se puede llenar más, devolvemos el CD
    }

   return cd;
}

private static String mayor (int parcial, Map<String,Integer> programas, List<String> sol){
     String maxProg=null;
     int maxEsp = 0;
     Iterator<String> it_prog = programas.getClaves();
     while (it_prog.hasNext()){
      String prog = it_prog.next();
      int esp = programas.get(prog);
      if (!sol.contains(prog) && esp > maxEsp && esp <= parcial){
                maxEsp = esp;
                maxProg = prog;
         }
     }

    return maxProg;
}
    
    
    
    
    
    public static void main(String[] args) {
        
        
        
        
        
        
        
        
        
        

    }

}
