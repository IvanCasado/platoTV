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
 * @author Iván
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({platotv.ProdAudioIT.class, platotv.PlatoTvIT.class, platotv.TrabajadorDiseñadorIT.class, platotv.TrabajadorVideoIT.class, platotv.TrabajadorIT.class, platotv.TrabajadorSonidoIT.class, platotv.TrabajoIT.class, platotv.ProdVideoIT.class, platotv.ProduccionIT.class})
public class PlatotvITSuite {

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
