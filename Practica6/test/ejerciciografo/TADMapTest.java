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
public class TADMapTest {
    
    public TADMapTest() {
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
     * Test of getValor method, of class TADMap.
     */
    @org.junit.Test
    public void testGetValor() {
        System.out.println("getValor");
        Object clave = null;
        TADMap instance = new TADMapImpl();
        Object expResult = null;
        Object result = instance.getValor(clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class TADMap.
     */
    @org.junit.Test
    public void testInsertar() {
        System.out.println("insertar");
        Object clave = null;
        Object valor = null;
        TADMap instance = new TADMapImpl();
        instance.insertar(clave, valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class TADMap.
     */
    @org.junit.Test
    public void testEliminar() {
        System.out.println("eliminar");
        Object clave = null;
        TADMap instance = new TADMapImpl();
        instance.eliminar(clave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarValor method, of class TADMap.
     */
    @org.junit.Test
    public void testModificarValor() {
        System.out.println("modificarValor");
        Object clave = null;
        Object valor = null;
        TADMap instance = new TADMapImpl();
        instance.modificarValor(clave, valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClaves method, of class TADMap.
     */
    @org.junit.Test
    public void testGetClaves() {
        System.out.println("getClaves");
        TADMap instance = new TADMapImpl();
        Iterator expResult = null;
        Iterator result = instance.getClaves();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValores method, of class TADMap.
     */
    @org.junit.Test
    public void testGetValores() {
        System.out.println("getValores");
        TADMap instance = new TADMapImpl();
        Iterator expResult = null;
        Iterator result = instance.getValores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamaño method, of class TADMap.
     */
    @org.junit.Test
    public void testTamaño() {
        System.out.println("tama\u00f1o");
        TADMap instance = new TADMapImpl();
        int expResult = 0;
        int result = instance.tamaño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esVacio method, of class TADMap.
     */
    @org.junit.Test
    public void testEsVacio() {
        System.out.println("esVacio");
        TADMap instance = new TADMapImpl();
        boolean expResult = false;
        boolean result = instance.esVacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contieneClave method, of class TADMap.
     */
    @org.junit.Test
    public void testContieneClave() {
        System.out.println("contieneClave");
        Object clave = null;
        TADMap instance = new TADMapImpl();
        boolean expResult = false;
        boolean result = instance.contieneClave(clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contieneValor method, of class TADMap.
     */
    @org.junit.Test
    public void testContieneValor() {
        System.out.println("contieneValor");
        Object valor = null;
        TADMap instance = new TADMapImpl();
        boolean expResult = false;
        boolean result = instance.contieneValor(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiar method, of class TADMap.
     */
    @org.junit.Test
    public void testLimpiar() {
        System.out.println("limpiar");
        TADMap instance = new TADMapImpl();
        instance.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TADMapImpl implements TADMap {

        public V getValor(K clave) {
            return null;
        }

        public void insertar(K clave, V valor) {
        }

        public void eliminar(K clave) {
        }

        public void modificarValor(K clave, V valor) {
        }

        public Iterator<K> getClaves() {
            return null;
        }

        public Iterator<V> getValores() {
            return null;
        }

        public int tamaño() {
            return 0;
        }

        public boolean esVacio() {
            return false;
        }

        public boolean contieneClave(K clave) {
            return false;
        }

        public boolean contieneValor(V valor) {
            return false;
        }

        public void limpiar() {
        }
    }
    
}
