/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bottilogiikka;

import java.util.Random;

/**
 *
 * @author jukkapai
 */
public class MalliBot implements SpammerBot{
    private Nimimerkit nimimerkit;
    private Random random;
    
    public MalliBot(Nimimerkit nimimerkit) {
        this.nimimerkit = nimimerkit;
        this.random = new Random();
    }

    @Override
    public String spammaa(String spammattava) {
        return nimimerkit.arvoNimimerkki() + ": " + spammattava;
     }
    
    
}
