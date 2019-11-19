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
public class HashMapTest {
    
    public HashMapTest() {
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
     * Test of getValor method, of class HashMap.
     */
    @org.junit.Test
    public void testGetValor() {
        System.out.println("getValor");
        Object clave = null;
        HashMap instance = null;
        Object expResult = null;
        Object result = instance.getValor(clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class HashMap.
     */
    @org.junit.Test
    public void testInsertar() {
        System.out.println("insertar");
        Object clave = null;
        Object valor = null;
        HashMap instance = null;
        instance.insertar(clave, valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class HashMap.
     */
    @org.junit.Test
    public void testEliminar() {
        System.out.println("eliminar");
        Object clave = null;
        HashMap instance = null;
        instance.eliminar(clave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarValor method, of class HashMap.
     */
    @org.junit.Test
    public void testModificarValor() {
        System.out.println("modificarValor");
        Object clave = null;
        Object valor = null;
        HashMap instance = null;
        instance.modificarValor(clave, valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClaves method, of class HashMap.
     */
    @org.junit.Test
    public void testGetClaves() {
        System.out.println("getClaves");
        HashMap instance = null;
        Iterator expResult = null;
        Iterator result = instance.getClaves();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValores method, of class HashMap.
     */
    @org.junit.Test
    public void testGetValores() {
        System.out.println("getValores");
        HashMap instance = null;
        Iterator expResult = null;
        Iterator result = instance.getValores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contieneClave method, of class HashMap.
     */
    @org.junit.Test
    public void testContieneClave() {
        System.out.println("contieneClave");
        Object clave = null;
        HashMap instance = null;
        boolean expResult = false;
        boolean result = instance.contieneClave(clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contieneValor method, of class HashMap.
     */
    @org.junit.Test
    public void testContieneValor() {
        System.out.println("contieneValor");
        Object valor = null;
        HashMap instance = null;
        boolean expResult = false;
        boolean result = instance.contieneValor(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamaño method, of class HashMap.
     */
    @org.junit.Test
    public void testTamaño() {
        System.out.println("tama\u00f1o");
        HashMap instance = null;
        int expResult = 0;
        int result = instance.tamaño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esVacio method, of class HashMap.
     */
    @org.junit.Test
    public void testEsVacio() {
        System.out.println("esVacio");
        HashMap instance = null;
        boolean expResult = false;
        boolean result = instance.esVacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiar method, of class HashMap.
     */
    @org.junit.Test
    public void testLimpiar() {
        System.out.println("limpiar");
        HashMap instance = null;
        instance.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
