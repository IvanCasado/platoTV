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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Clase
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({platotv.ProdVideoTest.class, platotv.ProdAudioTest.class, platotv.TrabajoTest.class, platotv.TrabajadorVideoTest.class, platotv.TrabajadorDiseñadorTest.class, platotv.PlatoTvTest.class, platotv.TrabajaTest.class, platotv.TrabajadorTest.class, platotv.TrabajadorSonidoTest.class, platotv.ModificaTest.class, platotv.ProduccionTest.class, platotv.PlatoTest.class})
public class PlatotvSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
