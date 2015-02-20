package tcs.twitchchatsimulator2015;


import java.util.Random;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import tcs.Kayttoliittyma.Aloitusruutu;
import tcs.Kayttoliittyma.Kayttoliittyma;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukkapai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Kayttoliittyma liittyma = new Kayttoliittyma();
        //SwingUtilities.invokeLater(liittyma);
        
        Aloitusruutu ruutu = new Aloitusruutu();
        SwingUtilities.invokeLater(ruutu);
    }
    
}
