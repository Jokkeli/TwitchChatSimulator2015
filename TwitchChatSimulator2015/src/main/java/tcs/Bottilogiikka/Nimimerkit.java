/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcs.Bottilogiikka;

import java.util.Random;

/**
 * Nimimerkkitietokanta, josta botit randomisoivat joka viestille nimimerkin.
 * @author jukkapai
 * 
 * 
 */
public class Nimimerkit {
    private String[] nimimerkit;
    private Random random;
    
    /**
     * konstruktorissa luodaan oletusnimimerkit
     */
    public Nimimerkit() {
        this.nimimerkit = new String[]{"doge", "Gaben4president", "fleuri", "Jokkeli",
                                       "TursuDrillo", "TursuBadDota", "Kapxy", "GabeNewell",
                                       "CholliP", "mäpä", "n0sc0p3g0d420", "praiseHelix",
                                       "Julppu", "iorena", "Pallero_", "JButton",
                                       "KingKongor", "Xx_MurzuMiHD", "AdmiralBulldog",
                                       "Baumi", "Bruno", "Dabbas_Legacy_Key_User", "vladislav",
                                       "plsNoCopyPasterino"};
        this.random = new Random();
    }
    
    /**
     * arpoo satunnaisen nimimerkin
     * @return satunnainen nimimerkki
     */
    public String arvoNimimerkki() {
        return nimimerkit[random.nextInt(nimimerkit.length - 1)];
    }
}
