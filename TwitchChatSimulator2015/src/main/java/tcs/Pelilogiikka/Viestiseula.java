package tcs.Pelilogiikka;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukkapai
 * 
 * Luokka, joka sisältää erilaiset spammausvaihtoehdot ja tarkistaa, onko pelaajan
 * lähettämä viesti validia spammausta.
 */
public class Viestiseula {
    private ArrayList<String> spammattavat;
    private Random random;
    private String spammattava;
    
    public Viestiseula() {
        this.spammattavat = new ArrayList<String>();
        this.random = new Random();
        this.spammattava = "Kappa";
    }
    
    public void luoSpammattavat() {
        String[] oletusSpammattavat = {"Kappa", "BibleThump", "FailFish", "Kreygasm", "PogChamp", "dududu", "ヽ༼ຈل͜ຈ༽ﾉ RIOT ヽ༼ຈل͜ຈ༽ﾉ",
                                       "Kippa"};
        spammattavat = new ArrayList<String>(Arrays.asList(oletusSpammattavat));
    }
    
    public void uusiSpammattava() {
        int a = random.nextInt(spammattavat.size());
        spammattava = spammattavat.get(a);
    }
    
    public String getSpammattava() {
        return this.spammattava;
    }
    
    public ArrayList<String> getSpammattavat() {
        return spammattavat;
    }
    
    public void setSpammattavat(ArrayList<String> lista){
        spammattavat = lista;
    }
    
    /**
     * tarkistaa, onko annettu merkkijono tämänhetkinen spammattava
     * @param viesti Pelin antama merkkijono
     * @return totuusarvo, onko viesti spammattava
     */
    public boolean onkoSpammattava(String viesti) {
        if (viesti == null) {
            return false;
        }
        
        return viesti.equals(spammattava);
    }
}
