/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Collection;

/**
 *
 * @author Jacobo
 * @param <K>
 * @param <V>
 */
public class HashMap<K, V> implements TADMap<K, V> {

    private int capacidad;
    private int numElementos;
    private List<TADMap.Entry<K, V>>[] datos;

    public HashMap(int capacidad) throws IllegalArgumentException {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("No se puede crear un HashMap con la capacidad menor que 0");
        } else {
            this.capacidad = capacidad;
            numElementos = 0;
            datos = new List[capacidad];
            for (int i = 0; i < capacidad; i++) {
                datos[i] = new LinkedList<>();
            }
        }
    }

    private int funcionHash(K clave) {
        int indice = Math.abs(clave.hashCode()) % capacidad;
        return indice;
    }

    @Override
    public V getValor(K clave) {
        int indice = funcionHash(clave);
        for (TADMap.Entry<K, V> var : datos[indice]) {
            if (var.getClave().equals(clave)) {
                return var.getValor();
            }
        }
        return null;
    }

    @Override
    public void insertar(K clave, V valor) {
        //Obtener indice
        int indice = funcionHash(clave);
        //Comprobar si esta el valor        
        V val = getValor(clave);

        if (val == null) {
            datos[indice].add(new HashEntry<>(clave, valor));
            numElementos++;
        } else {
            for (TADMap.Entry<K, V> entrada : datos[indice]) {
                if (entrada.getClave().equals(clave))//Cuando coincida la clave al recorrer la lista setear valor
                {
                    entrada.setValor(valor);
                }
            }
        }
    }
    
    @Override
    public void eliminar(K clave) {
        int indice = funcionHash(clave);
        if (datos[indice].contains(new HashEntry<K, V>(clave, getValor(clave)))) {
            datos[indice].remove(new HashEntry<>(clave, getValor(clave)));//Elimina entrada de la lista
            numElementos--;//Actualiza el numero de elementos del mapa
        } else {
            System.out.println("No se ha encontrado el elemento clave-valor");
        }
    }

    @Override
    public void modificarValor(K clave, V valor) {
        //Obtener indice
        int indice = funcionHash(clave);
        for (TADMap.Entry<K, V> entrada : datos[indice]) {
                if (entrada.getClave().equals(clave))//Cuando coincida la clave al recorrer la lista setear valor
                {
                    entrada.setValor(valor);
                }
            }
    }

    @Override
    public Iterator<K> getClaves() {
        Collection<K> clavesVector = new ArrayList<>();
        for (int indice=0; indice<capacidad; indice++){
                for (TADMap.Entry<K,V> entrada: datos[indice]){
                        clavesVector.add(entrada.getClave());
                }
        }
        return clavesVector.iterator();
    }

    @Override
    public Iterator<V> getValores() {
        Collection<V> valoresVector = new ArrayList<>();
        for (int indice=0; indice<capacidad; indice++){
                for (TADMap.Entry<K,V> entrada: datos[indice]){
                        valoresVector.add(entrada.getValor());
                }
        }
        return valoresVector.iterator();
        
    }

    @Override
    public boolean contieneClave(K clave) {
        int indice = funcionHash(clave);
        for (TADMap.Entry<K, V> entrada : datos[indice]) {
                if (entrada.getClave().equals(clave))//Cuando coincida la clave al recorrer la lista setear valor
                {
                    return true;
                }
            }
        return false;
        
    }

    @Override
    public boolean contieneValor(V valor) {
        for (int i = 0; i < capacidad; i++) {
            if(datos[i].get(i).getValor().equals(valor))
            return true;
        }
        return false;
    }

    @Override
    public int tamaño() {
        return numElementos;
    }

    @Override
    public boolean esVacio() {
        return numElementos == 0;
    }

    @Override
    public void limpiar() {
        for (int i = 0; i < capacidad; i++) {
            datos[i].clear();
        }
        numElementos = 0;
        
    }

    static class HashEntry<K, V> implements TADMap.Entry<K, V> {

        K clave;
        V valor;

        HashEntry(K clave, V valor) {
            this.clave = clave;
            this.valor = valor;
        }

        @Override
        public K getClave() {
            return clave;
        }

        @Override
        public V getValor() {
            return valor;
        }

        @Override
        public void setValor(V valorActual) {
            this.valor = valorActual;
        }
    }

}
