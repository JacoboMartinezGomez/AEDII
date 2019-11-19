/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciografo;

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
public class ArcoTest {
    
    public ArcoTest() {
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
     * Test of getOrigen method, of class Arco.
     */
    @org.junit.Test
    public void testGetOrigen() {
        System.out.println("getOrigen");
        Arco instance = null;
        Vertice expResult = null;
        Vertice result = instance.getOrigen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDestino method, of class Arco.
     */
    @org.junit.Test
    public void testGetDestino() {
        System.out.println("getDestino");
        Arco instance = null;
        Vertice expResult = null;
        Vertice result = instance.getDestino();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEtiqueta method, of class Arco.
     */
    @org.junit.Test
    public void testGetEtiqueta() {
        System.out.println("getEtiqueta");
        Arco instance = null;
        Object expResult = null;
        Object result = instance.getEtiqueta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Arco.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Arco instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
