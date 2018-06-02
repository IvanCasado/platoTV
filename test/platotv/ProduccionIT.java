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
public class ProduccionIT {
    
    public ProduccionIT() {
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
     * Test of getNumeroSerie method, of class Produccion.
     */
    @Test
    public void testGetNumeroSerie() {
        System.out.println("getNumeroSerie");
        Produccion instance = null;
        int expResult = 0;
        int result = instance.getNumeroSerie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroSerie method, of class Produccion.
     */
    @Test
    public void testSetNumeroSerie() {
        System.out.println("setNumeroSerie");
        int numeroSerie = 0;
        Produccion instance = null;
        instance.setNumeroSerie(numeroSerie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaComienzo method, of class Produccion.
     */
    @Test
    public void testGetFechaComienzo() {
        System.out.println("getFechaComienzo");
        Produccion instance = null;
        Calendar expResult = null;
        Calendar result = instance.getFechaComienzo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaComienzo method, of class Produccion.
     */
    @Test
    public void testSetFechaComienzo() {
        System.out.println("setFechaComienzo");
        Calendar fechaComienzo = null;
        Produccion instance = null;
        instance.setFechaComienzo(fechaComienzo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFinalizacion method, of class Produccion.
     */
    @Test
    public void testGetFechaFinalizacion() {
        System.out.println("getFechaFinalizacion");
        Produccion instance = null;
        Calendar expResult = null;
        Calendar result = instance.getFechaFinalizacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaFinalizacion method, of class Produccion.
     */
    @Test
    public void testSetFechaFinalizacion() {
        System.out.println("setFechaFinalizacion");
        Calendar fechaFinalizacion = null;
        Produccion instance = null;
        instance.setFechaFinalizacion(fechaFinalizacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdTrabajo method, of class Produccion.
     */
    @Test
    public void testGetIdTrabajo() {
        System.out.println("getIdTrabajo");
        Produccion instance = null;
        int expResult = 0;
        int result = instance.getIdTrabajo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdTrabajo method, of class Produccion.
     */
    @Test
    public void testSetIdTrabajo() {
        System.out.println("setIdTrabajo");
        int idTrabajo = 0;
        Produccion instance = null;
        instance.setIdTrabajo(idTrabajo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupervisor1 method, of class Produccion.
     */
    @Test
    public void testGetSupervisor1() {
        System.out.println("getSupervisor1");
        Produccion instance = null;
        int expResult = 0;
        int result = instance.getSupervisor1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupervisor1 method, of class Produccion.
     */
    @Test
    public void testSetSupervisor1() {
        System.out.println("setSupervisor1");
        int supervisor1 = 0;
        Produccion instance = null;
        instance.setSupervisor1(supervisor1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupervisor2 method, of class Produccion.
     */
    @Test
    public void testGetSupervisor2() {
        System.out.println("getSupervisor2");
        Produccion instance = null;
        int expResult = 0;
        int result = instance.getSupervisor2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupervisor2 method, of class Produccion.
     */
    @Test
    public void testSetSupervisor2() {
        System.out.println("setSupervisor2");
        int supervisor2 = 0;
        Produccion instance = null;
        instance.setSupervisor2(supervisor2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Produccion.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Produccion instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Produccion.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Produccion instance = null;
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trabaja method, of class Produccion.
     */
    @Test
    public void testTrabaja() {
        System.out.println("trabaja");
        Produccion instance = null;
        instance.trabaja();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarProduccion method, of class Produccion.
     */
    @Test
    public void testModificarProduccion() {
        System.out.println("modificarProduccion");
        Produccion instance = null;
        instance.modificarProduccion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Produccion.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Produccion instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
