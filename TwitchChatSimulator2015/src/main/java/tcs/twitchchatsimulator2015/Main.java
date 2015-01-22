package tcs.twitchchatsimulator2015;


import java.util.Random;
import java.util.Scanner;

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
        Peli peli = new Peli();
        Scanner lukija = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Spam or type stop to stop");
        peli.vaihdaSpammattavaa();
        
        
        while(true) {
            String viesti = lukija.nextLine();
            if(viesti.equals("stop")) {
                break;
            }
            System.out.println(peli.viesti(viesti));
            
            int vaihdetaanko = random.nextInt(100);
            if (vaihdetaanko < 5 && vaihdetaanko > 0) {
                peli.vaihdaSpammattavaa();
            }
        }
        peli.lopetaPeli();
    }
    
}
