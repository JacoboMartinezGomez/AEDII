/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2c;

import grafo.Vertice;
import mapa.HashMap;
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
public class AlgNumeroCromaticoTest {
    
    public AlgNumeroCromaticoTest() {
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
     * Test of cogerColor method, of class AlgNumeroCromatico.
     */
    @org.junit.Test
    public void testCogerColor() {
        System.out.println("cogerColor");
        String expResult = "";
        String result = AlgNumeroCromatico.cogerColor(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of colorearMapa method, of class AlgNumeroCromatico.
     */
    @org.junit.Test
    public void testColorearMapa() {
        System.out.println("colorearMapa");
        HashMap<Vertice<E>, String> expResult = null;
        HashMap<Vertice<E>, String> result = AlgNumeroCromatico.colorearMapa(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
