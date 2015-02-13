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
import tcs.Bottilogiikka.Pasterinot;

/**
 *
 * @author jukkapai
 */
public class PasterinotTest {
    private Pasterinot pastat;
    public PasterinotTest() throws FileNotFoundException {
        pastat = new Pasterinot();
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
    public void toimiikoPastanArvonta() {
        assertEquals(false, pastat.arvoPasterino().isEmpty());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
