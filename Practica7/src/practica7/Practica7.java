/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

import grafo.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Armind
 */
public class Practica7 {
//Ejercicio 1
//Produce: devuelve un iterador sobre los predecesores del vértice v en el grafo g. 
//Se dice que w es predecesor del vértice v si existe un arco que tenga por origen w y por destino v,
//es decir, el arco (w,v) pertenece al conjunto de arcos del grafo.

    public static <E, T> Iterator<Vertice<E>> predecesores(Grafo<E, T> g, Vertice<E> v) {
        Collection<Vertice<E>> predecesores = new ArrayList<>();
        Iterator<Arco<E, T>> arcos = g.arcos();
        while (arcos.hasNext()) {//mientras arcos tenga elementos
            Arco<E, T> actual = arcos.next();//cogemos el primer arco 
            if (actual.getDestino().equals(v)) {//comparamos el destino del arco actual con el vertice v, si es igual se introduce en predecesores
                predecesores.add(actual.getOrigen());
            }
        }
        return predecesores.iterator();
    }

    //Ejercicio2
    //Escribe un método que dado un grafo y un vértice, determine si ese vértice es pozo o sumidero. 
    //Un vértice se dice sumidero si su grado de entrada es n-1 y su grado de salida es 0. |V| = n, es decir, n es el número de vértices del grafo.
    public static <E, T> boolean sumidero(Grafo<E, T> g, Vertice<E> v) {
        Iterator<Vertice<E>> adyacentes = g.adyacentes(v);//iterador de adyacentes del grafo
        Iterator<Vertice<E>> predecesores = predecesores(g, v);//iterador de predecesores del grafo con el vertice v
        Iterator<Vertice<E>> vertices = g.vertices();//iterador de vertices del grafo

        if (adyacentes.hasNext()) {
            return false;//si tiene adyacentes no es sumidero
        } else {
            int numVertices = 0;
            int numPredecesores = 0;

            while (predecesores.hasNext()) {
                predecesores.next();
                numPredecesores++;//calculamos numero de predecesores
            }
            while (vertices.hasNext()) {
                vertices.next();
                numVertices++;//calculamos numero de vertices
            }
            return numPredecesores == numVertices - 1;
        }
    }

    //Ejercicio3
    //Escribe un método que devuelva cierto si un grafo es regular. 
    //Un grafo es regular si todos sus vértices tienen el mismo número de vértices adyacentes.
    public static <E, T> boolean esRegular(Grafo<E, T> g) {
        Iterator<Vertice<E>> vertices = g.vertices();//iterador de vertices del grafo
        int numAdyacentes = 0;
        int numVertices = 0;

        while (vertices.hasNext()) {//mientras tenga vertices
            Vertice<E> actual = vertices.next();//cogemos el primero
            Iterator<Vertice<E>> adyacentes = g.adyacentes(actual);//cogemos los adyacentes de los vertices
            int contador = 0;
            while (adyacentes.hasNext()) {//mientras tenga adyacentes
                contador++;
                adyacentes.next();
            }
            if (numVertices == 0) {
                numAdyacentes = contador;
            } else {
                if (contador != numAdyacentes) {
                    return false;
                }
            }
            numVertices++;
        }
        return true;
    }
    
//Ejercicio4
//Escribe un método que dado un grafo dirigido y dos vértices devuelva cierto si existe un camino simple de un vértice a otro. 
    public static <E, T> boolean hayCaminoEntreDos(Grafo<E, T> g, Vertice<E> origen, Vertice<E> destino) {
        Collection<Vertice<E>> visitados = new ArrayList<>();//Inicializar visitados a vacio
        return camino(g, origen, destino, visitados);
    }

    private static <E, T> boolean camino(Grafo<E, T> g, Vertice<E> origen, Vertice<E> destino, Collection<Vertice<E>> visitados) {
        boolean encontrado = false;
        visitados.add(origen);//insertar el vertice origen a visitados
        if (origen.equals(destino)) {//Si el vertice origen es igual al destino, hay camino
            return true;
        } else {
            Iterator<Vertice<E>> adyacentes = g.adyacentes(origen);//cogemos todos los vertices adyacentes al origen
            while (adyacentes.hasNext() && !encontrado) {//mientras tenga vertices adyacentes y no se haya encontrado camino
                Vertice<E> actual = adyacentes.next();//cogemos el vertice actual
                if (!visitados.contains(actual)) {//si no esta en visitados
                    encontrado = camino(g, actual, destino, visitados);//llamamos recursivamente a camino
                }
            }
            return encontrado;
        }
    }
    //Ejercicio5
    //Se dice que un grafo dirigido es una arborescencia si existe un vértice, 
    //llamado raíz, desde el que se puede alcanzar cualquier otro vértice a través de un camino único. 
    //Implementa un método que determine si un grafo dirigido es una arborescencia. Caso de serlo, debe devolver la raíz.
    
    public static <E,T> boolean esArborescencia(Grafo<E,T> g){
        boolean encontrado = true;
        Iterator<Vertice<E>> verticesOrigen = g.vertices();//vertices de origen
        Iterator<Vertice<E>> verticesDestino = g.vertices();//vertices destino
        Iterator<Vertice<E>> vertices = g.vertices();//vertices 
        
        while(verticesOrigen.hasNext() && encontrado){
            Collection<Vertice<E>> visitados = new ArrayList<>();
            Vertice<E> vorigen = verticesOrigen.next();
            while(verticesDestino.hasNext()){
                Vertice<E> vdestino = verticesDestino.next();
                encontrado = camino(g, vorigen, vdestino, visitados);   
            }
            if(encontrado){
                   return true;
               }
        }
        return false;
    }
    
    

    public static void main(String[] args) {

    }

}
