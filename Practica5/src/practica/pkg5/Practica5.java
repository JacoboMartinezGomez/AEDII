/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg5;

import arbolGeneral.*;
import cola.*;
import lista.*;

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
                while (!hijo.esVacio() && seleccion(hijo)) {//buscar menro de los hijos
                    if (hijo.raiz().compareTo(hijomenor) < 0) {
                        hijomenor = hijo.raiz();//mirar compareto
                    }
                    hijo = hijo.hermanoDer();

                }
                return (hijo.esVacio() && hijomenor.equals(arbol.raiz()));//por ultimo comprobar con la raiz del arbol
            }

        }

    }

//5. Escribe un método que determine el nivel de un elemento concreto en el árbol general.
    public static <E> int nivel(ArbolGeneral<E> arbol, E elemento) {
        if (arbol.esVacio()) {
            return -1;//No se encontro el elemento
        } else {
            if (arbol.raiz().equals(elemento)) {
                return 0;
            } else {
                ArbolGeneral<E> hijo = arbol.hijoMasIzq();
                while (!hijo.esVacio()) {
                    int nivel = nivel(hijo, elemento);
                    if (nivel == -1) {
                        hijo = hijo.hermanoDer();
                    } else {
                        return 1 + nivel;
                    }
                }
                return -1;// No se encontro el elemento
            }
        }
    }
//6. Escribe un método que devuelve el grado de un árbol general. 
//El grado de un árbol es el máximo de los grados de sus nodos.    

    public static <E> int grado(ArbolGeneral<E> arbol) {
        if (arbol.esVacio()) {
            return 0;
        } else {
            int nGrado = 0;
            ArbolGeneral<E> hijo = arbol.hijoMasIzq();
            while (!hijo.esVacio()) {
                nGrado++;
                hijo = hijo.hermanoDer();
            }
            int maxGrado = nGrado;
            hijo = arbol.hijoMasIzq();
            while (!hijo.esVacio()) {
                int gradoActual = grado(hijo);
                if (gradoActual > maxGrado) {
                    maxGrado = gradoActual;

                }
                hijo = hijo.hermanoDer();
            }
            return maxGrado;
        }

    }

//7. Escribe un método que devuelva la altura de un árbol general.    
    public static <E> int altura(ArbolGeneral<E> arbol) {
        if (arbol.esVacio()) {
            return 0;
        } else {
            if (arbol.hijoMasIzq().esVacio()) {
                return 0;

            } else {
                int maxAltura = 0;
                int alturaAct = 0;
                ArbolGeneral<E> hijo = arbol.hijoMasIzq();
                while (!hijo.esVacio()) {
                    alturaAct = altura(hijo);
                    if (alturaAct > maxAltura) {
                        maxAltura = alturaAct;//comprueba que sea mayor la altura de cada nodo. si es igual no se suma
                    }
                    hijo = hijo.hermanoDer();
                }
                return maxAltura + 1;
            }
        }

    }
//8. Haciendo uso de una cola, escribe un método que muestre el recorrido en anchura de un árbol general.

    public static <E> void anchura(ArbolGeneral<E> arbol) {
        Cola<ArbolGeneral<E>> c = new EnlazadaCola<>();
        c.insertar(arbol);
        do {
            arbol = c.suprimir();
            if (!arbol.esVacio()) {
                System.out.println(arbol.raiz() + " ");
                ArbolGeneral<E> hijo = arbol.hijoMasIzq();
                while (!hijo.esVacio()) {
                    c.insertar(hijo);
                    hijo = hijo.hermanoDer();
                }

            }
        } while (!c.esVacio());
    }

//9. Escribe un método que cuente el número de nodos pares en un árbol de enteros que se pasa como parámetro: el siguiente método:
    public static int numPares(ArbolGeneral<Integer> arbol) {
        if (arbol.esVacio()) {
            return 0;
        } else {
            int contador = 0;
            if (arbol.raiz() % 2 == 0) {
                contador++;
            }
            ArbolGeneral<Integer> hijo = arbol.hijoMasIzq();
            while (!hijo.esVacio()) {
                contador += numPares(hijo);
                hijo = hijo.hermanoDer();
            }

            return contador;
        }

    }
//10. Escribe un método que dado un árbol general y una lista que se pasa como parámetro, guarde en la lista las hojas del árbol general.

    public static <E> void hojas(ArbolGeneral<E> arbol, Lista<E> lista) {
        if(!arbol.esVacio()){
            if(arbol.hijoMasIzq().esVacio()){
                lista.insertarFinal(arbol.raiz());
            }
            else{
                 ArbolGeneral<E> hijo = arbol.hijoMasIzq();
                 while(!hijo.esVacio()){
                     hojas(hijo, lista);
                     hijo = hijo.hermanoDer();
                 }
            }
        }
    }

}
