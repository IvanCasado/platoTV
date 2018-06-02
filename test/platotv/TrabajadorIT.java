/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platotv;

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iván
 */
public class TrabajadorIT {
    
    public TrabajadorIT() {
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
     * Test of getFechaIngreso method, of class Trabajador.
     */
    @Test
    public void testGetFechaIngreso() {
        System.out.println("getFechaIngreso");
        Trabajador instance = new Trabajador();
        String expResult = "";
        String result = instance.getFechaIngreso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaIngreso method, of class Trabajador.
     */
    @Test
    public void testSetFechaIngreso() {
        System.out.println("setFechaIngreso");
        Calendar fechaIngreso = null;
        Trabajador instance = new Trabajador();
        instance.setFechaIngreso(fechaIngreso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNIF method, of class Trabajador.
     */
    @Test
    public void testGetNIF() {
        System.out.println("getNIF");
        Trabajador instance = new Trabajador();
        String expResult = "";
        String result = instance.getNIF();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNIF method, of class Trabajador.
     */
    @Test
    public void testSetNIF() {
        System.out.println("setNIF");
        String NIF = "";
        Trabajador instance = new Trabajador();
        instance.setNIF(NIF);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Trabajador.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Trabajador instance = new Trabajador();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Trabajador.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Trabajador instance = new Trabajador();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Trabajador.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Trabajador instance = new Trabajador();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidos method, of class Trabajador.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        Trabajador instance = new Trabajador();
        instance.setApellidos(apellidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenero method, of class Trabajador.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Trabajador instance = new Trabajador();
        char expResult = ' ';
        char result = instance.getGenero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGenero method, of class Trabajador.
     */
    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        char genero = ' ';
        Trabajador instance = new Trabajador();
        instance.setGenero(genero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSenior method, of class Trabajador.
     */
    @Test
    public void testIsSenior() {
        System.out.println("isSenior");
        Trabajador instance = new Trabajador();
        boolean expResult = false;
        boolean result = instance.isSenior();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenior method, of class Trabajador.
     */
    @Test
    public void testSetSenior() {
        System.out.println("setSenior");
        boolean senior = false;
        Trabajador instance = new Trabajador();
        instance.setSenior(senior);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Trabajador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Trabajador instance = new Trabajador();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
