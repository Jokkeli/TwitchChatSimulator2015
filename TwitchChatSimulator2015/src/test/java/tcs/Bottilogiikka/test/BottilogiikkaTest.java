/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcs.Bottilogiikka.test;

import tcs.Bottilogiikka.Bottilogiikka;
import tcs.Bottilogiikka.SpammerBot;
import tcs.Pelilogiikka.Peli;
import java.util.ArrayList;
import javax.swing.JTextArea;
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
public class BottilogiikkaTest {
    private Bottilogiikka botL;
    private JTextArea testiArea;
    public BottilogiikkaTest() {
        testiArea = new JTextArea();
        botL = new Bottilogiikka(testiArea, new Peli());
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
    public void toimiikoBottienLuonti() {
        botL.luoBotit();
        ArrayList<SpammerBot> botit = botL.getBotit();
        assertEquals(false, botit.isEmpty());
    }
    
    @Test
    public void toimiikoSpammaus() {
        botL.luoBotit();
        for(SpammerBot botti : botL.getBotit()) {
                botL.SpammaaYksi(botti);
        }
        String teksti = testiArea.getText();
        assertEquals(false, teksti.isEmpty());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
