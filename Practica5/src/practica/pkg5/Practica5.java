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

    public static int sumaValores(ArbolGeneral<Integer> arbol) {
        if (arbol.esVacio()) {
            return 0;
        } else {
            int contador = arbol.raiz();
            ArbolGeneral<Integer> hijo = arbol.hijoMasIzq();//variable de control para coger el primer hijo
            while (!hijo.esVacio()) {//mientras tenga hijos vamos recorriendo
                contador += sumaValores(hijo);
                hijo = hijo.hermanoDer();//cogemos el hijo del hermano derecha si es vacio 
            }
            return contador;
        }
    }

//2.Escribe un método booleano que dados dos árboles generales determine si tienen la misma
//estructura. Por ejemplo, los árboles generales que siguen tienen la misma estructura, aunque, como 
//puede observarse, no coincidan los valores que se almacenan en los nodos.
    public static <E> boolean mismaEstructura(ArbolGeneral<E> arbol1, ArbolGeneral<E> arbol2) {
        if (arbol1.esVacio() && arbol2.esVacio()) {
            return true;
        }
        if (arbol1.esVacio() || arbol2.esVacio()) {
            return false;
        } else {
            //Recorrer la lista de hijos de a y b
            boolean toret = false;
            ArbolGeneral<E> h1 = arbol1.hijoMasIzq();
            ArbolGeneral<E> h2 = arbol2.hijoMasIzq();
            while (!h1.esVacio() && !h2.esVacio() && mismaEstructura(h1, h2)) {
                h1 = h1.hermanoDer();
                h2 = h2.hermanoDer();
            }
            return h1.esVacio() && h2.esVacio();//como no comprobamos el numero de hijos comprobamos que se vacien a la vez para asegurarnos de la estructura.
        }
    }
//3.Escribe un método que dado un árbol general, devuelva cierto si se trata de un árbol 2-3.
//Un árbol 2-3 es aquel en el que cada nodo tiene exactamente 2 o 3 hijos, excepto las hojas.   

    public static <E> boolean arbolDosTres(ArbolGeneral<E> arbol) {
        if (arbol.esVacio()) {//si es vacio es true
            return true;
        }
        ArbolGeneral<E> hijo = arbol.hijoMasIzq();
        if (hijo.esVacio()) {//si el hijo es vacio es true
            return true;
        } else {
            int nHijos = 0;
            while (!hijo.esVacio() && arbolDosTres(hijo) && nHijos < 4) {//tiene hijos y no son hojas
                nHijos++;
                hijo = hijo.hermanoDer();
            }
            return hijo.esVacio() && nHijos > 1;
        }
    }

//4.Un arbol seleccion es un arbol donde cada nodo representa al menor de sus hijos excepto las hojas
//Construir un metodo que dado un arbol general indique si es o no un arbol de seleccion
    public static <E extends Comparable<E>> boolean seleccion(ArbolGeneral<E> arbol) {
        if (arbol.esVacio()) {
            return true;
        } else {
            ArbolGeneral<E> hijo = arbol.hijoMasIzq();
            if (hijo.esVacio()) {
                return true;
            } else {
                E hijomenor = hijo.raiz();//variable para menor
                while(!hijo.esVacio() && seleccion(hijo)){//buscar menro de los hijos
                    if(hijo.raiz().compareTo(hijomenor)<0) hijomenor = hijo.raiz();//mirar compareto
                    hijo = hijo.hermanoDer();
                
                }
                return (hijo.esVacio() && hijomenor.equals(arbol.raiz()));//por ultimo comprobar con la raiz del arbol
            }

        }

    }

}
