/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2A;

/**
 *
 * @author Alejandro Gómez González
 */
public class Vertice<E> {
    private E etiqueta;
    public Vertice(E etiqueta){
        this.etiqueta = etiqueta;
    }
    public E getEtiqueta(){
        return etiqueta;
    }
    public boolean equals(Object param){
        Vertice<E> vertice = (Vertice<E>) param;
        return etiqueta.equals(vertice.getEtiqueta());
    }
    public String toString(){
        return " "+etiqueta;
      }
}
