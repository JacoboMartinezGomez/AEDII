/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2A;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Alejandro Gómez González
 * @param <E>
 * @param <T>
 */
public class MapaAdyacencia<E, T> implements Grafo<E, T> {

    private LinkedList<VerticeConMap<E, T>> listaVertices; //Lista enlazada que alamacenará los vertices
    //Constructor de la clase

    public MapaAdyacencia() {
        listaVertices = new LinkedList<>(); //Se crea una lista enlzada vacia
    }

    //Devuelve true si la lista es vacia
    public boolean esVacio() {
        return listaVertices.isEmpty();
    }

    //Devuelve true si esta el vertice v en la lista
    public boolean estaVertice(Vertice<E> v) {
        for (VerticeConMap<E, T> actual : listaVertices) { //Recorro todos los vertices de la lista
            if (actual.getVertice().equals(v)) { //Comprueba si el vertice actual es igual al parámetro, si lo es devuelve true
                return true;
            }
        }
        return false;
    }

    //Devuelve true si esta el arco a en la lista
    public boolean estaArco(Arco<E, T> a) {
        for (VerticeConMap<E, T> actual : listaVertices) { //Recorro todos los vertices de la lista
            if (actual.getVertice().equals(a.getOrigen())) { //Comprueba si el vertice actual es igual al origen del arco parámetro
                HashMap<Vertice<E>, T> mapaAdyacentes = actual.getAdy(); //Creo un nuevo HashMap con los adyacentes del vertice actual
                if (mapaAdyacentes.getValor(a.getDestino()) != null) { //Comprueba si el destino del arco parámetro es adyacente al vértice actual (y por tanto arco) 
                    //Si es así devuelve true y termina el método
                    return true;
                }
            }
        }
        return false;
    }

    //Devuelve un iterador que contiene a todos los vertices
    public Iterator<Vertice<E>> vertices() {
        HashSet<Vertice<E>> contenedor = new HashSet<>(); //Creo un objeto vacio de tipo HashSet que servirá de contenedor de vertices
        for (VerticeConMap<E, T> actual : listaVertices) { //Recorro los vertices
            contenedor.add(actual.getVertice()); //Añado el vertice actual al HashSet
        }
        return contenedor.iterator(); //Devuelve el iterador del objeto HashSet
    }

    //Devuelve un iterador que contiene a todos los arcos
    public Iterator<Arco<E, T>> arcos() {
        HashSet<Arco<E, T>> contenedor = new HashSet<>(); //Creo un objeto vacio de tipo HashSet que servirá de contenedor de arcos
        for (VerticeConMap<E, T> actual : listaVertices) { //Recorro los vertices
            Vertice<E> origen = actual.getVertice(); //Creo el vertice orgine del arco, que es el vertice actual que se está recorriendo
            HashMap<Vertice<E>, T> mapaAdyacentes = actual.getAdy(); //Creo un HashMap con los vertices adyacentes al vertice actual
            Iterator it = mapaAdyacentes.getClaves(); //Creo un iterador que contiene las claves de los vertices adyacentes a actual
            while (it.hasNext()) { //Este bucle es iterado sobre las claves de los vertices adyacentes a actual, si no tiene esto se ejecuta
                Object clave = it.next(); //Accedo a la clave
                Vertice<E> destino = new Vertice((E) clave); //Creo el vertice destino que es lo mismo que la clave del primer adyacente
                T etiqueta = mapaAdyacentes.getValor((Vertice<E>) clave); //Creo la etiqueta buscandola en el HashMap de adyacentes por su clave
                Arco ar = new Arco<>(origen, destino, etiqueta); //Creo el arco con su origen, destino e etiqueta
                contenedor.add(ar);//Inserto el arco en el contenedor
            }

        }

        return contenedor.iterator(); //Devuelve el iterador del objeto HashSet
    }

    //Devuelve un iterador que contiene a todos los vertices adyacengtes a uno pasado como parámetro
    public Iterator<Vertice<E>> adyacentes(Vertice<E> v) {
        Iterator it2 = null;//Creo un iterador y lo inicializo a null
        HashMap<Vertice<E>, T> mapaAdyacentes = null; //Creo un HashMap que guardara los vertices adyacentes a null
        for (VerticeConMap<E, T> actual : listaVertices) //Recorro los vertices
        {
            if (actual.getVertice().equals(v)) { //Comprueba si el vertice actual es igual al parámetro
                mapaAdyacentes = actual.getAdy(); //Igualo el HashMap a los vertices adyacentes del vertice actual
                it2 = mapaAdyacentes.getClaves(); // Igualo el iterador a las claves de los vertices adyacentes
                return it2; //Deveulve el iterador
            }
        }
        return it2; //Devuelve el iteador a null en caso de que no tenga adyacentes
    }

    //Inserta un vertice pasado como parámetro en la lista
    public void insertarVertice(Vertice<E> v) {
        if (!estaVertice(v)) { //Compruebo si el vertice esta en la lista, si no esta se inserta
            VerticeConMap<E, T> vertice = new VerticeConMap(v); //Se crea el VerticeConMap a partir del Vertice pasado como parámetro
            listaVertices.add(vertice); //Se inserta el VerticeConMap creado en la lista
        }

    }

    //Inserta un arco
    public void insertarArco(Arco<E, T> a) {
        if (!estaArco(a)) { //Comprueba si no está el arco
            if (!estaVertice(a.getOrigen())) //Comprueba si no está el vertice origen del arco
            {
                insertarVertice(a.getOrigen()); //Si no está, lo inserta
            }
            if (!estaVertice(a.getDestino())) //Comprueba si no está el vertice destino del arco
            {
                insertarVertice(a.getDestino());// Si no está, lo inserta
            }
            for (VerticeConMap<E, T> actual : listaVertices) //Recorro los vertices
            {
                if (actual.getVertice().equals(a.getOrigen())) { //Compruebo si el vertice actual es igual al origen del arco que vamos a insertar
                    HashMap<Vertice<E>, T> mapaAdyacentes = actual.getAdy(); //Si lo es, se crea un HashSet de los adyacentes al vertice actual
                    mapaAdyacentes.insertar(a.getDestino(), a.getEtiqueta());  //En ese HashSet se inserta el par Clave,Valor que en este caso, son el destino del arco
                    // y la etiqueta del arco.
                }
            }
        }
    }

    //Elimina un vertice
    public void eliminarVertice(Vertice<E> v) {
        if (estaVertice(v)) { //Comprueba si está en la lista el vertice a borrar
            VerticeConMap<E, T> vertice = new VerticeConMap(v); //Se crea el VerticeConMap a partir del Vertice parámetro
            listaVertices.remove(vertice); //Se elimina de la lista el VerticeConMap
        }
    }

    //Elimina un arco
    public void eliminarArco(Arco<E, T> a) {
        for (VerticeConMap<E, T> actual : listaVertices) { //Recorro los vertices
            if (actual.getVertice().equals(a.getOrigen())) { //Compruebo si el vertice actual es igual al origen del arco que vamos a insertar
                HashMap<Vertice<E>, T> mapaAdyacentes = actual.getAdy(); //Si lo es, se crea un HashSet de los adyacentes al vertice actual
                mapaAdyacentes.eliminar(a.getDestino()); //Se elimina el arco del mapa de adyacentes pasando como clave el valor del vertice destino
            }
        }
    }

}
