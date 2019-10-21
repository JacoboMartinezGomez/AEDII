/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import arbolBinario.*;

/**
 *
 * @author Armind
 */
public class Practica2 {

//1. Escribe un método que dado un árbol binario devuelva verdadero si el árbol es completo y falso en otro caso. 
//Un árbol binario es completo si todos sus nodos tienen dos descendientes, excepto las hojas.
    public static <E> boolean esCompleto(ArbolBinario<E> arbol) {
        if (arbol.esVacio()) {
            return true;
        } else if (arbol.hijoIzq().esVacio() && arbol.hijoDer().esVacio()) {
            return true;
        } else if (!arbol.hijoIzq().esVacio() || !arbol.hijoDer().esVacio()) {
            return false;
        } else {
            return esCompleto(arbol.hijoIzq()) && esCompleto(arbol.hijoDer());
        }
    }
//2. Escribe un método que dados dos árboles binarios A y B, determine si son idénticos o no.    

    public static <E> boolean sonIdenticos(ArbolBinario<E> arbolA, ArbolBinario<E> arbolB) {
        if (!arbolA.esVacio() && !arbolB.esVacio()) {
            return arbolA.raiz().equals(arbolB.raiz())
                    && sonIdenticos(arbolA.hijoIzq(), arbolB.hijoIzq())
                    && sonIdenticos(arbolA.hijoDer(), arbolB.hijoDer());
        } else {
            return arbolA.esVacio() && arbolB.esVacio();
        }
    }
//3. Escribe un método que determine si un elemento está en un árbol binario.

    public static <E> boolean estaEnArbol(ArbolBinario<E> arbol, E elemento) {
        if (arbol.esVacio()) {
            return false;
        } else if (arbol.raiz().equals(elemento)) {
            return true;
        } else {
            return estaEnArbol(arbol.hijoIzq(), elemento)
                    || estaEnArbol(arbol.hijoIzq(), elemento);
        }
    }

//4. Escribe un método que cuente el número de nodos que están en el nivel n de un árbol binario.
    public static <E> int contarNodos(ArbolBinario<E> arbol, int nivel) {
        if (arbol.esVacio()) {
            return 0;
        } else if (nivel == 0) {
            return 1;
        } else {
            return contarNodos(arbol.hijoIzq(), nivel - 1) + contarNodos(arbol.hijoDer(), nivel - 1);
        }
    }

//5. Escribe un método que dado un árbol binario A, cree un árbol binario B igual que A pero sin las hojas.
    public static <E> ArbolBinario<E> arbolSinHojas(ArbolBinario<E> arbol) {
        if (arbol.esVacio()) {
            return new EnlazadoArbolBinario<>();
        } else if (arbol.hijoIzq().esVacio() && arbol.hijoDer().esVacio()) {
            return new EnlazadoArbolBinario<>();
        } else {
            return new EnlazadoArbolBinario<>(arbol.raiz(), arbolSinHojas(arbol.hijoIzq()), arbolSinHojas(arbol.hijoDer()));
        }
    }

//6. Escribe un método que calcule la altura de un árbol binario.
    private static int maximo(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static <E> int calcularAltura(ArbolBinario<E> arbol) {
        if (arbol.esVacio()) {
            return -1;
        } else if (arbol.hijoIzq().esVacio() && arbol.hijoDer().esVacio()) {
            return 0;
        } else {
            return 1 + maximo(calcularAltura(arbol.hijoIzq()), calcularAltura(arbol.hijoDer()));
        }
    }
//7. Escribe un método que dados dos árboles binarios A y B, determine si tiene la misma forma o no.

    public static <E> boolean mismaForma(ArbolBinario<E> a, ArbolBinario<E> b) {
        if (!a.esVacio() && !b.esVacio()) {
            return mismaForma(a.hijoIzq(), b.hijoIzq()) && mismaForma(a.hijoDer(), b.hijoDer());
        } else {
            return a.esVacio() && b.esVacio();
        }
    }

//8. Un árbol de selección es un árbol binario donde cada nodo representa al menor de sus dos hijos,
//excepto las hojas. Construir un método que, dado un árbol binario, indique si es o no un árbol de selección.
    public static <E extends Comparable<E>> boolean arbolSeleccion(ArbolBinario<E> arbol) {
        if (arbol.esVacio()) {
            return true;
        } else if (arbol.hijoIzq().esVacio() && arbol.hijoDer().esVacio()) {
            return true;
        } else if (arbol.hijoIzq().esVacio() && !arbol.hijoDer().esVacio()) {
            return arbol.raiz().equals(arbol.hijoDer().raiz()) && arbolSeleccion(arbol.hijoDer());
        } else if (!arbol.hijoIzq().esVacio() && arbol.hijoDer().esVacio()) {
            return arbol.raiz().equals(arbol.hijoIzq().raiz()) && arbolSeleccion(arbol.hijoIzq());
        } else {
            E menor = arbol.hijoIzq().raiz().compareTo(arbol.hijoDer().raiz()) < 0 ? arbol.hijoIzq().raiz() : arbol.hijoDer().raiz();
            return arbol.raiz().equals(menor) && arbolSeleccion(arbol.hijoIzq()) && arbolSeleccion(arbol.hijoDer());
        }
    }

//9.Escribe un método booleano que dados un árbol binario y un camino expresado en forma de String
//determine si existe dicho camino en el árbol, teniendo en cuenta que el camino debe comenzar necesariamente en la raíz.
    public static <E> boolean esCamino(ArbolBinario<E> arbol, String camino) {
        if (camino.length() == 0) {
            return true;
        } else if (arbol.esVacio()) {
            return false;
        } else if (arbol.raiz().equals(camino.charAt(0))) {
            return esCamino(arbol.hijoIzq(), camino.substring(1)) || esCamino(arbol.hijoDer(), camino.substring(1));
        } else {
            return false;
        }
    }

//10. Escribe un método que dado un árbol binario y un nivel n del árbol, realice una copia del árbol hasta dicho nivel.
    public static <E> ArbolBinario<E> copiaHastaNivel(ArbolBinario<E> a, int nivel) {
        if (a.esVacio()) {
            return new EnlazadoArbolBinario<>();
        } else if (nivel == 0) {
            return new EnlazadoArbolBinario<>(a.raiz(), new EnlazadoArbolBinario<>(), new EnlazadoArbolBinario<>());
        } else {
            return new EnlazadoArbolBinario<>(a.raiz(), copiaHastaNivel(a.hijoIzq(), nivel - 1), copiaHastaNivel(a.hijoDer(), nivel - 1));
        }

    }

//11. Cada nodo de un árbol binario A representa una letra alfabética. La concatenación de las mismas, en
//cada camino que va desde la raíz a una hoja representa una palabra. Realizar un procedimiento que
//visualice todas las palabras almacenadas en un árbol binario A.
    public static <E> void visualizarPalabras(ArbolBinario<E> a) {
        String palabra = "";
        visualizarPalabras(a, palabra);
    }

    private static <E> void visualizarPalabras(ArbolBinario<E> a, String palabra) {

    }
//12. Escribe un método que dado un árbol binario y un elemento devuelva el padre de dicho elemento,
//suponiendo que no hay elementos repetidos.

    public static <E> E padre(ArbolBinario<E> a, E elemento) {
        if (a.esVacio()) {
            return null;
        } else if (a.raiz().equals(elemento)) {
            return null;
        } else if ((!a.hijoIzq().esVacio() && a.hijoIzq().raiz().equals(elemento))
                || (!a.hijoDer().esVacio() && a.hijoDer().raiz().equals(elemento))) {
            return a.raiz();
        } else {
            E pivote = padre(a.hijoIzq(), elemento);
            if (pivote == null) {
                return padre(a.hijoDer(), elemento);
            } else {
                return pivote;
            }

        }

    }

//13. Un elemento de un árbol se dirá de nivel k si aparece en el árbol a distancia k de la raíz. Escribe un
//método que determine si un elemento está a distancia k.
    public static <E> boolean distanciaK(ArbolBinario<E> a, E elem, int k) {
        if (a.esVacio()) {
            return false;
        } else if (a.raiz().equals(elem) && k == 0) {
            return true;
        } else if (k == 0) {
            return false;
        } else {
            return distanciaK(a.hijoIzq(), elem, k - 1) || distanciaK(a.hijoDer(), elem, k - 1);
        }

    }

//Examen 2016
//Arbol Rojo-Negro
//    public static <E> boolean camino(ArbolBinario<E> arbol) {
//        if (arbol.esVacio()) {
//            return true;
//        }
//        else{
//            int nodosIzq = numNodosRojo(arbol.hijoIzq());
//            int nodosDer = numNodosRojo(arbol.hijoDer());
//            if(mathabs(nodosIzq-nodosDer)>1) return false;
//            else{return camino(arbol.hijoIzq()) && camino(arbol.hijoDer());
//            }
//        }
//
//    }
//    
//    private static <E> int numNodosRojo(ArbolBinario<E> arbol) {
//        if (arbol.esVacio()) {
//            return 0;
//        } else {
//            if (arbol.raiz() == 'R') {
//                return 1 + numNodosRojo(arbol.hijoIzq()) + numNodosRojo(arbol.hijoDer());
//            }
//            else return numNodosRojo(arbol.hijoIzq())+ numNodosRojo(arbol.hijoDer());
//        }
//    }
//    
//    public static <E> boolean rojo-negro(ArbolBinario<E> arbol){
//        if(arbol.esVacio()) return true;
//        else{
//            if(arbol.hijoIzq().esVacio() && arbol.hijoDer().esVacio()) return false;
//        }
//  }
    
    
    
    


}
