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
public class Ordenacion {
    public static void heapSort(int[] elementos) { //Usar un heap para ordenar un array 
        Heap<Integer> heap = new Heap(Integer.MAX_VALUE);
        for (int i = 0; i < elementos.length; i++) {
            heap.introducir(elementos[i]);
        }
        heap.arreglarHeap();
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] =heap.suprimir();   
        }
    }
}
