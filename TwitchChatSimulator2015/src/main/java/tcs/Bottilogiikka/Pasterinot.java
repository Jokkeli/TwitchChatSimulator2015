/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcs.Bottilogiikka;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Copypastoja sisältävää tekstitiedostoa lukeva luokka, josta RandomBotit
 * saavat spammattavan merkkijononsa.
 * @author jukkapai
 */
public class Pasterinot {
    private Scanner lukija;
    private ArrayList<String> pastaLista;
    private InputStream pasterinot;
    private Random random;
    
    public Pasterinot() throws FileNotFoundException {
        pasterinot = this.getClass().getResourceAsStream("/pasterino.txt");
        
        lukija = new Scanner(pasterinot, "utf-8");
        random = new Random();
        pastaLista = luoPastaLista();
        
    }
    /**
     * muuttaa tekstitiedoston ArrayList -muotoon arvonnan helpottamiseksi
     * @return palauttaa arraylistin pastoja
     */
    public ArrayList<String> luoPastaLista() {
        ArrayList<String> pastat = new ArrayList<String>();
        while(lukija.hasNextLine()) {
            pastat.add(lukija.nextLine());
        }
        return pastat;
    }
    
    /**
     * arpoo edellisessä metodissa luodusta listasta satunnaisen pasterinon
     * @return 
     */
    public String arvoPasterino() {
        return(pastaLista.get(random.nextInt(pastaLista.size()-1)));
    }
}
