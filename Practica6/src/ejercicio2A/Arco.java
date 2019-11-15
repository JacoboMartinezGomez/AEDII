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
public class Arco<E, T> {
    private Vertice<E> origen, destino;
    private T etiqueta;
    public Arco(Vertice<E> o, Vertice<E> d, T c){
        this.origen=o;
        this.destino=d;
        this.etiqueta=c;
    }
    public Vertice<E> getOrigen(){
        return origen;
    }
    public Vertice<E> getDestino(){
        return destino;
    }
    public T getEtiqueta(){
        return etiqueta;
    }

    @Override
    public String toString() {
        return "Arco{" + "origen=" + origen + ", destino=" + destino + ", etiqueta=" + etiqueta + '}';
    }
    
}
