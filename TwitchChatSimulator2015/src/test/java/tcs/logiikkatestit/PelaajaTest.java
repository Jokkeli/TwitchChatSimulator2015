package tcs.logiikkatestit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Pelilogiikka.Pelaaja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jukkapai
 */
public class PelaajaTest {
    Pelaaja pelaaja;
    public PelaajaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pelaaja = new Pelaaja();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void nimimerkinVaihtoOnnistuu() {
        String uusinimi = "doge";
        pelaaja.vaihdaNimimerkkia(uusinimi);
        assertEquals("doge", pelaaja.getNimimerkki());
    }
    
    @Test
    public void pisteidenLisaysNolla() {
        pelaaja.lisaaPisteita(0);
        assertEquals(0, pelaaja.getPisteet());
    }
    
    @Test
    public void pisteydenLisays() {
        pelaaja.lisaaPisteita(200);
        assertEquals(200, pelaaja.getPisteet());
    }
    
    @Test
    public void pisteidenLisaysNegatiivinen() {
        pelaaja.lisaaPisteita(-1);
        assertEquals(0, pelaaja.getPisteet());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
