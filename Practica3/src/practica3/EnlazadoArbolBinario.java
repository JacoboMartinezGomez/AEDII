/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author Jacobo
 */
public class EnlazadoArbolBinario<E> implements ArbolBinario<E> {

    private NodoBinario<E> n;

    public EnlazadoArbolBinario() {
        n = null;
    }

    public EnlazadoArbolBinario(E elemRaiz, EnlazadoArbolBinario<E> hi, EnlazadoArbolBinario<E> hd) {
        n = new NodoBinario<>(elemRaiz, hi.n, hd.n);
    }

    private EnlazadoArbolBinario(NodoBinario<E> raiz) {
        n = raiz;
    }

    @Override
    public boolean esVacio() {
        return n == null;
    }

    @Override
    public E raiz() throws ArbolVacioExcepcion {
        if (esVacio()) {
            throw new ArbolVacioExcepcion("Arbol vacio");
        } else {
            return n.getElemento();
        }
    }

    @Override
    public ArbolBinario<E> hijoIzq() throws ArbolVacioExcepcion {
        if (esVacio()) {
            throw new ArbolVacioExcepcion("Arbol vacio");
        }
        return new EnlazadoArbolBinario<>(n.getIzq());
    }

    @Override
    public ArbolBinario<E> hijoDer() throws ArbolVacioExcepcion {
        if (esVacio()) {
            throw new ArbolVacioExcepcion("Arbol vacio");
        }
        return new EnlazadoArbolBinario<>(n.getDer());
    }

    @Override
    public void setRaiz(E elemRaiz) throws ArbolVacioExcepcion {
        if (esVacio()) {
            throw new ArbolVacioExcepcion("Arbol vacio");
        } else {
            n.setElemento(elemRaiz);
        }
    }

    @Override
    public void setHijoIzq(ArbolBinario<E> hi) throws ArbolVacioExcepcion, NullPointerException {
        if (hi == null) {
            throw new NullPointerException();
        } else if (esVacio()) {
            throw new ArbolVacioExcepcion("Arbol vacio");
        } else {
            n.setIzq(((EnlazadoArbolBinario<E>) hi).n);
        }
    }

    @Override
    public void setHijoDer(ArbolBinario<E> hd) throws ArbolVacioExcepcion, NullPointerException {
        if (hd == null) {
            throw new NullPointerException();
        } else if (esVacio()) {
            throw new ArbolVacioExcepcion("Arbol vacio");
        } else {
            n.setIzq(((EnlazadoArbolBinario<E>) hd).n);
        }
    }

    @Override
    public boolean esta(E elemento) {
        if (n == null) {
            return false;
        } else if (n.getElemento().equals(elemento)) {
            return true;
        }
        boolean toret = hijoIzq().esta(elemento);
        if (!toret) {
            return hijoDer().esta(elemento);
        } else {
            return toret;
        }

    }

    @Override
    public void suprimir() {
        n = null;
    }

}
