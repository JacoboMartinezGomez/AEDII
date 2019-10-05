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

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
