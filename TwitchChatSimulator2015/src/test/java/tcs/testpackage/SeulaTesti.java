package tcs.testpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import tcs.twitchchatsimulator2015.Seula;
import java.util.ArrayList;
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
public class SeulaTesti {
    Seula seula;
    
    public SeulaTesti() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        seula = new Seula();
        seula.luoSpammattavat();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void toimiikoTestausNull() {
       assertEquals(false, seula.onkoSpammattava(null));
    }
    
    @Test
    public void toimiikoTeustausTyhja() {
        assertEquals(false, seula.onkoSpammattava(""));
    }
    
    @Test
    public void onkoTestausCaseSensitive() {
        assertEquals(false, seula.onkoSpammattava("kappa"));
    }
    
    @Test
    public void toimiikoTestausOikealla() {
        assertEquals(true, seula.onkoSpammattava("Kappa"));
    }
    
    @Test
    public void toimiikoTestausVaaralla() {
        assertEquals(false, seula.onkoSpammattava("Kippa"));
    }
    
    @Test
    public void uusiSpammattavaToimii() {
        Seula seula2 = new Seula();
        ArrayList<String> testiSpammit = new ArrayList<>();
        testiSpammit.add("doge");
        seula2.setSpammattavat(testiSpammit);
        seula2.uusiSpammattava();
        
        assertEquals("doge", seula2.getSpammattava());
    }
    

           

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}