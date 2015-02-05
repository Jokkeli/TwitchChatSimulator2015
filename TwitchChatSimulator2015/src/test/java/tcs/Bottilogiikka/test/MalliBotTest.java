/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcs.Bottilogiikka.test;

import tcs.Bottilogiikka.MalliBot;
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
public class MalliBotTest {
    private MalliBot doge;
    
    public MalliBotTest() {
        doge = new MalliBot(new Nimimerkit());
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
    public void spammaakoSpammattavaa() {
        String spammattu = doge.spammaa("wow");
        boolean a = spammattu.contains("wow");
        assertEquals(a, true);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
