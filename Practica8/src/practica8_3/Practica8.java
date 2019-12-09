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
   boolean poderLlenar = true;
   int k =0;
   while ( espacioOcupado < capacidadMaxima && poderLlenar){
        String programa = mayor(capacidadMaxima-espacioOcupado,espacioProgramas,cd);
        if ( programa != null){
           k = espacioProgramas.get(programa);
           espacioProgramas.eliminar(programa);
           cd.add(programa);
           espacioOcupado += k;
        }
        else {
            poderLlenar=false; 
        }
    }
   return cd;
}
private static String mayor (int parcial, Map<String,Integer> programas, List<String> cd){
     String programaMayor=null;
     int maximoEspacio = 0;
     Iterator<String> it_prog = programas.getClaves();
     while (it_prog.hasNext()){
      String programa = it_prog.next();
      int espacio = programas.get(programa);
      if (!cd.contains(programa) && espacio > maximoEspacio && espacio <= parcial){
                maximoEspacio = espacio;
                programaMayor = programa;
         }
     }
    return programaMayor;
}
  





 //Ejercicio 8
    public static Map<String,Integer> llenarMochila(int volumenMaximo, Map<String,Integer> cantidades, 
                                                                       Map<String,Integer> volumenes){
        int volActual = 0;
        Map<String,Integer> toRet = new HashMap<>();
        
        String objeto = mayor(volumenMaximo-volActual, cantidades, volumenes);
        if(objeto == null){
            toRet = null;
        }else{
             toRet.insertar(objeto, volumenMaximo);
             volumenMaximo = volumenMaximo - volumenes.get(objeto); 
        }
        
    return toRet;
    }
    
    private static String mayor(int vol, Map<String,Integer> cantidades, Map<String,Integer> volumenes){
        String toRet = null;
        int maxVol = 0;
        Iterator<String> claves = cantidades.getClaves();
        while(claves.hasNext()){
              String objeto = claves.next();
              int volumen =  volumenes.get(objeto);
              int cantidad = cantidades.get(objeto);
              if(cantidad > 0 && vol > maxVol && volumen <= vol){
                maxVol = volumen;
                toRet = objeto;
              }
        }
        return toRet;
    }
    
    
    public static void main(String[] args) {
        
        
        
        
        
        
        
        
        
        

    }

}
