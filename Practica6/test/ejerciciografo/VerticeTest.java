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
public class VerticeTest {
    
    public VerticeTest() {
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
     * Test of getEtiqueta method, of class Vertice.
     */
    @org.junit.Test
    public void testGetEtiqueta() {
        System.out.println("getEtiqueta");
        Vertice instance = null;
        Object expResult = null;
        Object result = instance.getEtiqueta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Vertice.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object param = null;
        Vertice instance = null;
        boolean expResult = false;
        boolean result = instance.equals(param);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vertice.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Vertice instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
