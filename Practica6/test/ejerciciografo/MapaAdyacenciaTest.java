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
public class MapaAdyacenciaTest {
    
    public MapaAdyacenciaTest() {
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
     * Test of esVacio method, of class MapaAdyacencia.
     */
    @org.junit.Test
    public void testEsVacio() {
        System.out.println("esVacio");
        MapaAdyacencia instance = new MapaAdyacencia();
        boolean expResult = false;
        boolean result = instance.esVacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVertice method, of class MapaAdyacencia.
     */
    @org.junit.Test
    public void testEstaVertice() {
        System.out.println("estaVertice");
        MapaAdyacencia instance = new MapaAdyacencia();
        boolean expResult = false;
        boolean result = instance.estaVertice(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaArco method, of class MapaAdyacencia.
     */
    @org.junit.Test
    public void testEstaArco() {
        System.out.println("estaArco");
        MapaAdyacencia instance = new MapaAdyacencia();
        boolean expResult = false;
        boolean result = instance.estaArco(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vertices method, of class MapaAdyacencia.
     */
    @org.junit.Test
    public void testVertices() {
        System.out.println("vertices");
        MapaAdyacencia instance = new MapaAdyacencia();
        Iterator<Vertice<E>> expResult = null;
        Iterator<Vertice<E>> result = instance.vertices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arcos method, of class MapaAdyacencia.
     */
    @org.junit.Test
    public void testArcos() {
        System.out.println("arcos");
        MapaAdyacencia instance = new MapaAdyacencia();
        Iterator<Arco<E, T>> expResult = null;
        Iterator<Arco<E, T>> result = instance.arcos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adyacentes method, of class MapaAdyacencia.
     */
    @org.junit.Test
    public void testAdyacentes() {
        System.out.println("adyacentes");
        MapaAdyacencia instance = new MapaAdyacencia();
        Iterator<Vertice<E>> expResult = null;
        Iterator<Vertice<E>> result = instance.adyacentes(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarVertice method, of class MapaAdyacencia.
     */
    @org.junit.Test
    public void testInsertarVertice() {
        System.out.println("insertarVertice");
        MapaAdyacencia instance = new MapaAdyacencia();
        instance.insertarVertice(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarArco method, of class MapaAdyacencia.
     */
    @org.junit.Test
    public void testInsertarArco() {
        System.out.println("insertarArco");
        MapaAdyacencia instance = new MapaAdyacencia();
        instance.insertarArco(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarVertice method, of class MapaAdyacencia.
     */
    @org.junit.Test
    public void testEliminarVertice() {
        System.out.println("eliminarVertice");
        MapaAdyacencia instance = new MapaAdyacencia();
        instance.eliminarVertice(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarArco method, of class MapaAdyacencia.
     */
    @org.junit.Test
    public void testEliminarArco() {
        System.out.println("eliminarArco");
        MapaAdyacencia instance = new MapaAdyacencia();
        instance.eliminarArco(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
