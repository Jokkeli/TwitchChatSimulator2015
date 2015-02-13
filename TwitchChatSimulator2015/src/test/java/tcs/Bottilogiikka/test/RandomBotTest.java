/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcs.Bottilogiikka.test;

import java.io.FileNotFoundException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import tcs.Bottilogiikka.Nimimerkit;
import tcs.Bottilogiikka.Pasterinot;
import tcs.Bottilogiikka.RandomBot;

/**
 *
 * @author jukkapai
 */
public class RandomBotTest {
    private RandomBot doge;
    public RandomBotTest() throws FileNotFoundException {
        doge = new RandomBot(new Pasterinot(), new Nimimerkit());
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
        boolean a = !spammattu.isEmpty();
        assertEquals(a, true);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
