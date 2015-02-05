/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcs.Bottilogiikka.test;

import tcs.Bottilogiikka.Nimimerkit;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jukkapai
 */
public class NimimerkitTest {
    private Nimimerkit nimimerkit;
    
    public NimimerkitTest() {
        nimimerkit = new Nimimerkit();
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
    
    @Test
    public void toimiikoArvoNimimerkki() {
        String nimimerkki = nimimerkit.arvoNimimerkki();
        boolean tulikoNimimerkkia = !nimimerkki.isEmpty();
        assertEquals(true, tulikoNimimerkkia);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
