/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciografo;



/**
 *
 * @author Alejandro Gómez González
 */
public class VerticeConMap<E, T> {

    private Vertice<E> origen; // vértice del grafo
    private HashMap<Vertice<E>, T> mapAdy; // mapa de adyacentes del vértice origen

    VerticeConMap(Vertice<E> v) {
        origen = v;
        mapAdy = new HashMap<>(50); // Le paso un valro alto como capacidad
    }

    Vertice<E> getVertice() {
        return origen;
    }

    HashMap<Vertice<E>, T> getAdy() {
        return mapAdy;
    }
}
