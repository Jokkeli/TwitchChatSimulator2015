/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcs.Bottilogiikka;

import java.util.Random;

/**
 *
 * @author jukkapai
 */
public class RandomBot implements SpammerBot{
    private Random random;
    private Pasterinot pasterinot;
    private Nimimerkit nimimerkit;
    
    public RandomBot (Pasterinot pasterinot, Nimimerkit nimimerkit) {
        this.random = new Random();
        this.pasterinot = pasterinot;
        this.nimimerkit = nimimerkit;
    }

    @Override
    public String spammaa(String spammattava) {
        if(random.nextInt(4) == 1) {
            return nimimerkit.arvoNimimerkki() + ": " + pasterinot.arvoPasterino();
        } else {
            return nimimerkit.arvoNimimerkki() + ": " + spammattava;
        }
    }
    
}
