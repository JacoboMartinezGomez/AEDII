/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

import java.util.Iterator;

/**
 *
 * @author Jacobo
 */
public interface TADMap<K, V> {
    public V getValor(K clave); //Produce el valor asociado a la clave K indicada. Si la clave no está devuelve null
    public void insertar(K clave, V valor); //Inserta el par clave-valor si no existe. Si existe la clave sobrescribe el valor en la clave antigua.
    public void eliminar(K clave); //Elimina el par clave-valor que posea la clave indicada. Si la clave no está, no hace nada.
    public void modificarValor(K clave, V valor); //Modifica el valor especificado por la clave K. Si la clave no está, no hace nada.
    public Iterator<K> getClaves(); //Produce un iterador con todas las claves del MAP
    public Iterator<V> getValores(); //Produce un iterador con todos los valores del MAP
    public int tamaño(); //Produce el número de pares clave-valor del mapa.
    public boolean esVacio(); //Produce cierto(true) si el mapa está vacio, no contiene pares, false en caso contrario.
    
    public boolean contieneClave(K clave); //Produce cierto(true) si el mapa posee la clave señalada, false en caso contrario.
    public boolean contieneValor(V valor); //Produce cierto(true) si el mapa posee el valor señalado, false en caso contrario.
    public void limpiar(); //Elimina todos los objetos del mapa.
 
    interface Entry<K,V>{
	K getClave();//Obtiene la clave del elemento actual si no esta la clave devuelve null.
	V getValor();//Obtiene el valor del elemento actual, si no hay valor, o es vacio devuelve null
	void setValor(V valor);//Cambia el valor y devuelve el valor anterior del objeto actual.
    }

}
