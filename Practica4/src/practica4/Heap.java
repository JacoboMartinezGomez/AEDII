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
public class Heap<E extends Comparable<E>> {

    private static final int CAPACIDAD = 25;
    private E[] vector;	// el vector del montículo
    private int numElem;// número de elementos del montículo.

    public Heap(E superior) {
        numElem = 0;
        vector = (E[]) new Comparable[CAPACIDAD + 1]; //Array de objetos comparables, en concreto E, para que coincida con el tipo de los árboles
        vector[0] = superior;
    }

    public boolean esVacio() {
        return numElem == 0;
    }

    public E recuperarMax() throws HeapVacioExcepcion {
        if (esVacio()) {
            throw new HeapVacioExcepcion("Heap vacío");
        }
        return vector[1];
    }

    public void insertar(E e) {
        int hueco = ++numElem;
        while (vector[hueco / 2].compareTo(e) < 0) {
            vector[hueco] = vector[hueco / 2];
            hueco /= 2;
        }
        vector[hueco] = e;
    }

    public E suprimir() throws HeapVacioExcepcion {
        //primer paso devolver la raiz y eliminarla
        //segundo paso  recolocar hueco con el hundir
        if (esVacio()) {
            throw new HeapVacioExcepcion("Heap vacío");
        } else {
            E e = vector[1];
            vector[1] = vector[numElem];//recolocar la raiz
            vector[numElem] = null; //hijo eliminado a null
            hundir(1);//Recolocar posicion de la raiz
            return e;
        }

    }

    //metodo de recolocar: hundir
    private void hundir(int hueco) {
        //mirar si tiene hijos == no, termina, si es si, comprobar si tiene 1 o 2
        //si tiene 1 hijo--> hijo>hueco = intercambiar
        //hijo<= hueco termina
        //si tiene 2 hijos, hijoizq>hijoderecha; iz>hueco si: intercambia, no: termina
        //hijoder>hijoizq; der>hueco si: intercambia, no: termina
        int hijo = hueco * 2;
        E temporal = vector[hueco];
        boolean fin = false;

        while (hijo <= numElem && !fin) {
            if (hijo + 1 <= numElem) {//Preguntar si hay 2 hijos
                if (vector[hijo].compareTo(vector[hijo + 1]) > 0) {//primer hijo mayor que el segundo
                    if (vector[hijo].compareTo(temporal) > 0) {//primer objeto mayor que el segundo, menor que 0 menor primer objeto que el segundo
                        vector[hueco] = vector[hijo];//intercambiar  
                        hueco = hijo;
                        hijo = hueco * 2;
                    } else {
                        fin = true;
                    }

                } else {
                    if (vector[hijo].compareTo(vector[hijo + 1]) <= 0) {//segundo hijo mayor que el primero
                        if (vector[hijo + 1].compareTo(temporal) > 0) {//primer objeto mayor que el segundo, menor que 0 menor primer objeto que el segundo
                            vector[hueco] = vector[hijo + 1];//intercambiar  
                            hueco = hijo + 1;
                            hijo = hueco * 2;
                        } else {
                            fin = true;
                        }
                    }
                }

            } else {
                if (vector[hijo].compareTo(temporal) > 0) {//primer objeto mayor que el segundo, menor que 0 menor primer objeto que el segundo
                    vector[hueco] = vector[hijo];//intercambiar  
                    hueco = hijo;
                    hijo = hueco * 2;
                } else {
                    fin = true;
                }
            }
        }//Fin del while
    }
    
    
    
    //Heapsort
    //1ºmeto los elementos en el heap, introducir()
    //2ºarreglarheap
    
    //1ºy2ºpaso, se puede implementar solo con el insertar pero es menos eficiente
    
    //3ºsuprimir()elementos heap
    
    //Ejercicio2
    
    public void introducir(E e){
        
    }
    public void arreglarHeap(){
    
    }

}
