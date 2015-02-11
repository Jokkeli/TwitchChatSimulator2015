/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcs.Bottilogiikka;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jukkapai
 */
public class Pasterinot {
    private Scanner lukija;
    private ArrayList<String> pastaLista;
    private File pasterinot;
    private Random random;
    
    public Pasterinot() throws FileNotFoundException {
        pasterinot = new File("pasterino.txt");
        lukija = new Scanner(pasterinot);
        random = new Random();
        pastaLista = luoPastaLista();
        
    }
    
    public ArrayList<String> luoPastaLista() {
        ArrayList<String> pastat = new ArrayList<String>();
        while(lukija.hasNextLine()) {
            pastat.add(lukija.nextLine());
        }
        return pastat;
    }
    
    
    public String arvoPasterino() {
        return(pastaLista.get(random.nextInt(pastaLista.size()-1)));
    }
}
