/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg5;
import arbolGeneral.*;

/**
 *
 * @author Jacobo
 */
public class Practica5 {
//1.Escribe un método que dada una referencia a un árbol general de enteros, calcule la suma de los
//valores almacenados en sus nodos. 
    public static int sumaValores(ArbolGeneral<Integer> arbol){
        if(arbol.esVacio()){
            return 0;
        }
        else{
            int contador = arbol.raiz();
            ArbolGeneral<Integer> hijo = arbol.hijoMasIzq();
            while(!hijo.esVacio()){
                contador+=sumaValores(hijo);
                hijo = hijo.hermanoDer();
            }
            return contador;
        }
        
       
    
    }
    
    
    
    
//2.Escribe un método booleano que dados dos árboles generales determine si tienen la misma
//estructura. Por ejemplo, los árboles generales que siguen tienen la misma estructura, aunque, como 
//puede observarse, no coincidan los valores que se almacenan en los nodos.
    public static <E> boolean mismaEstructura(ArbolGeneral<E> arbol1, ArbolGeneral<E> arbol2){
        return true;
    }
    
    
   
}
