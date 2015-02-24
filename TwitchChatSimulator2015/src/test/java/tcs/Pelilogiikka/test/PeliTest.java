package tcs.Pelilogiikka.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import tcs.Pelilogiikka.Peli;

/**
 *
 * @author jukkapai
 */
public class PeliTest {
    Peli peli;
    public PeliTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        peli = new Peli();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void vaaraViestiLisaaVirheen() {
        peli.viesti("x");
        assertEquals(1, peli.getPelaajanVirheet());
    }    
    
    @Test
    public void oikeaViestiLisaaPisteen() {
        peli.viesti("Kappa");
        assertEquals(1, peli.getPelaajanPisteet());
    }
    
    @Test
    public void vaihdaSpammattavaaToimiish() {
        peli.vaihdaSpammattavaa();
        assertEquals(false, peli.spammattava().isEmpty());
        //randomiin perustuvaa metodia hankala testata
    }
    
    @Test
    public void viestiBannattu() {
        peli.bannaaPelaaja();
        assertEquals("You have been permanently banned from genericStreamName", peli.viesti("doge"));
    }
    
    @Test
    public void viestiEiBannattu(){
        assertEquals("testipelaaja: doge", peli.viesti("doge"));
    }
    
    @Test
    public void getPelaajanPisteetToimii(){
        assertEquals(0, peli.getPelaajanPisteet());
    }
    
    @Test
    public void getPelaajanVirheetToimii(){
        assertEquals(0, peli.getPelaajanVirheet());
    }
    
    @Test
    public void pelaajanBannausToimii() {
        peli.bannaaPelaaja();
        assertEquals(true, peli.onkoBannattu());
    }
    
    @Test
    public void spammattavaToimii() {
        assertEquals("Kappa", peli.spammattava());
    }
    
    @Test
    public void nimenVaihtoToimii() {
        peli.vaihdaPelaajanNimi("Kappa");
        assertEquals("Kappa", peli.getPelaajanNimi());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
