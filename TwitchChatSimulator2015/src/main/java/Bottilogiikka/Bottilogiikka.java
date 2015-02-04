/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bottilogiikka;

import Pelilogiikka.Peli;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JTextArea;
import javax.swing.Timer;

/**
 *
 * @author jukkapai
 */
public class Bottilogiikka extends Timer implements ActionListener{
    private JTextArea viestikentta;
    private Peli peli;
    private ArrayList<SpammerBot> botit;
    private Random random;
    
    public Bottilogiikka(JTextArea viestikentta, Peli peli) {
        super(50, null);
        this.addActionListener(this);
        this.viestikentta = viestikentta;
        this.peli = peli;
        this.botit = new ArrayList<SpammerBot>();
        this.random = new Random();
    }
    
    public void luoBotit() {
        Nimimerkit nimet = new Nimimerkit();
        botit.add(new MalliBot(nimet));
    }
    
    public void SpammaaYksi(SpammerBot botti) {
        viestikentta.append(botti.spammaa(peli.spammattava()) + "\n");
    }
    
    public void SpammaaKaikki() {
        for(SpammerBot botti : botit) {
            if(random.nextInt(10) == 1) {
                SpammaaYksi(botti);
            }
        }
    }
    
    public void kaynnista(){
        this.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(random.nextInt(200) == 1) {
            peli.vaihdaSpammattavaa();
        }
        if(peli.onkoBannattu()) {
            viestikentta.append("You have been permanently banned from GenericStreamName \n");
            this.stop();
        }
        SpammaaKaikki();
    }
}
