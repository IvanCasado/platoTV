/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platotv;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Clase
 */
public class TrabajoTest {
    
    public TrabajoTest() {
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
     * Test of getIdTrabajo method, of class Trabajo.
     */
    @Test
    public void testGetIdTrabajo() {
        System.out.println("getIdTrabajo");
        Trabajo instance = new Trabajo();
        int expResult = 0;
        int result = instance.getIdTrabajo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdTrabajo method, of class Trabajo.
     */
    @Test
    public void testSetIdTrabajo() {
        System.out.println("setIdTrabajo");
        int idTrabajo = 0;
        Trabajo instance = new Trabajo();
        instance.setIdTrabajo(idTrabajo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupervisor1 method, of class Trabajo.
     */
    @Test
    public void testGetSupervisor1() {
        System.out.println("getSupervisor1");
        Trabajo instance = new Trabajo();
        int expResult = 0;
        int result = instance.getSupervisor1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupervisor1 method, of class Trabajo.
     */
    @Test
    public void testSetSupervisor1() {
        System.out.println("setSupervisor1");
        int supervisor1 = 0;
        Trabajo instance = new Trabajo();
        instance.setSupervisor1(supervisor1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupervisor2 method, of class Trabajo.
     */
    @Test
    public void testGetSupervisor2() {
        System.out.println("getSupervisor2");
        Trabajo instance = new Trabajo();
        int expResult = 0;
        int result = instance.getSupervisor2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupervisor2 method, of class Trabajo.
     */
    @Test
    public void testSetSupervisor2() {
        System.out.println("setSupervisor2");
        int supervisor2 = 0;
        Trabajo instance = new Trabajo();
        instance.setSupervisor2(supervisor2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Trabajo.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Trabajo instance = new Trabajo();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Trabajo.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Trabajo instance = new Trabajo();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Trabajo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Trabajo instance = new Trabajo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
