/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author Jacobo
 */
public class Heap <E extends Comparable<E>> {

    private static final int CAPACIDAD = 25;
    private E[] vector;	// el vector del montículo
    private int numElem;	// número de elementos del montículo.

    public Heap(E superior) {
        numElem = 0;
        //vector = (E[]) new Object[CAPACIDAD+1]; //esta solución no pasa el test. imposible convertir un Object en genérico
        vector = (E[]) new Comparable[CAPACIDAD + 1]; //Array de objetos comparables, en concreto E, para que coincida con el tipo de los árboles
        vector[0] = superior;
    }

    public boolean esVacio() {
        return numElem == 0;
    }

    public E recuperarMax() throws HeapVacioExcepcion {
        if (esVacio()) {
            throw new HeapVacioExcepcion("recuperarMax: Heap vacío");
        }
        return vector[1];
    }

    public E suprimirMax() throws HeapVacioExcepcion { //En un  árbol siempre se suprime la raíz
        if (esVacio()) {
            throw new HeapVacioExcepcion("suprimirMax: Heap vacío");
        }
        E e = vector[1];
        vector[1] = vector[numElem]; //Lleva el último elemento a la primera posición 
        vector[numElem--] = null; //Sería igual que vector[numElem]=null; numElem--; 
        hundir(1);
        return e;
    }

    public void insertar(E e) throws IllegalArgumentException {
        if (numElem == vector.length - 1) {
            duplicarVector();
        }
        int hueco = ++numElem;
        while (vector[hueco / 2].compareTo(e) < 0) { //Resta el elemento de la posicion hueco/2 con e y no para hasta que la resta sea positiva                                                        
            vector[hueco] = vector[hueco / 2];
            hueco /= 2;
        }
        vector[hueco] = e;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
