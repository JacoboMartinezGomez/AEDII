/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciografo;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jacobo
 */
public class GrafoTest {
    
    public GrafoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of esVacio method, of class Grafo.
     */
    @org.junit.Test
    public void testEsVacio() {
        System.out.println("esVacio");
        Grafo instance = new GrafoImpl();
        boolean expResult = false;
        boolean result = instance.esVacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVertice method, of class Grafo.
     */
    @org.junit.Test
    public void testEstaVertice() {
        System.out.println("estaVertice");
        Grafo instance = new GrafoImpl();
        boolean expResult = false;
        boolean result = instance.estaVertice(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaArco method, of class Grafo.
     */
    @org.junit.Test
    public void testEstaArco() {
        System.out.println("estaArco");
        Grafo instance = new GrafoImpl();
        boolean expResult = false;
        boolean result = instance.estaArco(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vertices method, of class Grafo.
     */
    @org.junit.Test
    public void testVertices() {
        System.out.println("vertices");
        Grafo instance = new GrafoImpl();
        Iterator<Vertice<E>> expResult = null;
        Iterator<Vertice<E>> result = instance.vertices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arcos method, of class Grafo.
     */
    @org.junit.Test
    public void testArcos() {
        System.out.println("arcos");
        Grafo instance = new GrafoImpl();
        Iterator<Arco<E, T>> expResult = null;
        Iterator<Arco<E, T>> result = instance.arcos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adyacentes method, of class Grafo.
     */
    @org.junit.Test
    public void testAdyacentes() {
        System.out.println("adyacentes");
        Grafo instance = new GrafoImpl();
        Iterator<Vertice<E>> expResult = null;
        Iterator<Vertice<E>> result = instance.adyacentes(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarVertice method, of class Grafo.
     */
    @org.junit.Test
    public void testInsertarVertice() {
        System.out.println("insertarVertice");
        Grafo instance = new GrafoImpl();
        instance.insertarVertice(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarArco method, of class Grafo.
     */
    @org.junit.Test
    public void testInsertarArco() {
        System.out.println("insertarArco");
        Grafo instance = new GrafoImpl();
        instance.insertarArco(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarVertice method, of class Grafo.
     */
    @org.junit.Test
    public void testEliminarVertice() {
        System.out.println("eliminarVertice");
        Grafo instance = new GrafoImpl();
        instance.eliminarVertice(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarArco method, of class Grafo.
     */
    @org.junit.Test
    public void testEliminarArco() {
        System.out.println("eliminarArco");
        Grafo instance = new GrafoImpl();
        instance.eliminarArco(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GrafoImpl implements Grafo {

        public boolean esVacio() {
            return false;
        }

        public boolean estaVertice(Vertice<E> v) {
            return false;
        }

        public boolean estaArco(Arco<E, T> a) {
            return false;
        }

        public Iterator<Vertice<E>> vertices() {
            return null;
        }

        public Iterator<Arco<E, T>> arcos() {
            return null;
        }

        public Iterator<Vertice<E>> adyacentes(Vertice<E> v) {
            return null;
        }

        public void insertarVertice(Vertice<E> v) {
        }

        public void insertarArco(Arco<E, T> a) {
        }

        public void eliminarVertice(Vertice<E> v) {
        }

        public void eliminarArco(Arco<E, T> a) {
        }
    }
    
}
