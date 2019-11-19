/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2A;

import ejerciciografo.ArcoTest;
import ejerciciografo.EjercicioGrafoTest;
import ejerciciografo.GrafoTest;
import ejerciciografo.HashMapTest;
import ejerciciografo.MapaAdyacenciaTest;
import ejerciciografo.TADMapTest;
import ejerciciografo.VerticeConMapTest;
import ejerciciografo.VerticeTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Jacobo
 */
@org.junit.runner.RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({HashMapTest.class, EjercicioGrafoTest.class, VerticeTest.class, MapaAdyacenciaTest.class, ArcoTest.class, GrafoTest.class, TADMapTest.class, VerticeConMapTest.class})
public class Ejercicio2ASuite {

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
}
