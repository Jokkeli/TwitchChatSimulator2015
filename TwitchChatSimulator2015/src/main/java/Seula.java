
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
 */
public class Seula {
    private ArrayList<String> spammattavat;
    private Random random;
    private String spammattava;
    
    public Seula() {
        this.spammattavat = new ArrayList<String>();
        this.random = new Random();
        this.spammattava = "Kappa";
    }
    
    public void luoSpammattavat() {
        String[] oletusSpammattavat = {"Kappa", "Keepo", "BibleThump", "FailFish", "Kippa", "Kreygasm", "PogChamp"};
        spammattavat = new ArrayList<String>(Arrays.asList(oletusSpammattavat));
    }
    
    public void uusiSpammattava() {
        int a = random.nextInt(spammattavat.size() - 1);
        spammattava = spammattavat.get(a);
    }
    
    public String getSpammattava() {
        return this.spammattava;
    }
    
    public boolean onkoSpammattava(String viesti) {
        if (viesti.equals(spammattava)) {
            return true;
        } else {
            return false;
        }
    }
}
