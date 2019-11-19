/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2c;

//import java.util.*;
import grafo.*;
import java.util.Iterator;
import mapa.*;

/**
 *
 * @author Adrian Otero Iglesias
 */
public class AlgNumeroCromatico {
    
    public static <E> String cogerColor(String [] colores, Grafo<E,Integer> g, Map<Vertice<E>, String> mapa, Vertice<E> v){
        Iterator <Vertice<E>> it = g.adyacentes(v); //iterador igual a los vertices adyacentes(cercanos/siguientes) al vertice v
        int i=0;
        Vertice<E> vActual;
        while(it.hasNext()){ //mientrs el iterador tenga un vertice siguiente
            vActual = it.next(); //igualamos el vertice actual(en el que estamos) al primer vertice adyacente
            if(mapa.get(vActual).equals(colores[i])){ //comprobamos que el valor(color) del vertice actual del mapa es igual al color seleccionado del array de colores.
                i++; //Si son iguales avanzamos a otro color en el array de colores.
                it = g.adyacentes(v);
            }
            //Si no son iguales pasamos al siguiente vertice cercano al que estamos que no tenga el mismo color.
        }
        return colores[i]; //retornamos el color distinto al color del vertice actual.
    }
    
    public static <E> HashMap<Vertice<E>,String> colorearMapa(Grafo<E, Integer> g, String [] colores){
        HashMap<Vertice<E>, String> h = null; //creamos el mapa a devolver
        Iterator <Vertice<E>> iter = g.vertices(); //iterador igual a los vertices del grafo
        Vertice<E> actual;
        String color;
        while(iter.hasNext()){ //mientras el iterador tenga vertices, insertamos en el mapa SIN COLOREAR los vertices del grafo (una copia del grafo)
            actual = iter.next();
            h.insertar(actual, actual.toString());
        }
        iter = g.vertices(); //reiniciamos el iterador
        while(iter.hasNext()){ //mientras el iterador tenga vertices, escogemos el color del vertice y se lo insertamos como valor (se "colorea" el grafo)
            actual = iter.next();
            color = cogerColor(colores, g, h, actual);
            h.insertar(actual, color);
        }
        
        return h; //devolvemos el mapa coloreado
    }
}
