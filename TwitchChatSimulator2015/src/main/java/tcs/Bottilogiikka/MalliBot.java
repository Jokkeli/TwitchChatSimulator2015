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
 * 
 * Botti, jonka spammausta pelaajan tulee mukailla; spammaa pelin antamaa merkkijonoa.
 */
public class MalliBot implements SpammerBot{
    private Nimimerkit nimimerkit;
    private Random random;
    
    public MalliBot(Nimimerkit nimimerkit) {
        this.nimimerkit = nimimerkit;
        this.random = new Random();
    }

    /**
     * Generoi viestin joka koostuu satunnaisesta nimimerkistä sekä spammattavasta merkkijonosta
     * @param spammattava pelin antama merkkijono
     * @return palauttaa generoidun viestin
     */
    @Override
    public String spammaa(String spammattava) {
        return nimimerkit.arvoNimimerkki() + ": " + spammattava;
     }
    
    
}
