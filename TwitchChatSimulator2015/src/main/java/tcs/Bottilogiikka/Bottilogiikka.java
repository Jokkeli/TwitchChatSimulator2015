/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcs.Bottilogiikka;

import tcs.Pelilogiikka.Peli;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JTextArea;
import javax.swing.Timer;

/**
 *
 * @author jukkapai
 *
 * Luokka toimii pelin ajastimena, kopioiden bottien spammauksia
 * käyttöliittymään sekä vaihtaen spammattavaaa merkkijonoa satunnaisin
 * väliajoin.
 *
 */
public class Bottilogiikka extends Timer implements ActionListener {

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

    /**
     * luo SpammerBotit
     */
    public void luoBotit() {
        Nimimerkit nimet = new Nimimerkit();
        botit.add(new MalliBot(nimet));
    }

    public ArrayList<SpammerBot> getBotit() {
        return this.botit;
    }

    /**
     * Kutsuu annetun botin spammaa -metodia ja kopioi saadun viestin
     * käyttöliittymään
     *
     * @param botti SpammaaKaikki -metodin parametrina antama botti
     *
     */
    public void SpammaaYksi(SpammerBot botti) {
        viestikentta.append(botti.spammaa(peli.spammattava()) + "\n");
    }

    /**
     * Kutsuu SpammaaYksi -metodia kaikilla luokan tuntemilla spammerBoteilla satunnaisella todennäköisyydellä
     * 
     *
     */
    public void SpammaaKaikki() {
        for (SpammerBot botti : botit) {
            if (random.nextInt(10) == 1) {
                SpammaaYksi(botti);
            }
        }
    }

    public void kaynnista() {
        this.start();
    }

    /**
     * ajan kuluessa spammaa botit ja satunnaisesti vaihtaa spammattavaa merkkijonoa.
     * @param ae ajan kuluminen
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (random.nextInt(200) == 1) {
            peli.vaihdaSpammattavaa();
        }
        if (peli.onkoBannattu()) {
            viestikentta.append("You have been permanently banned from GenericStreamName \n");
            this.stop();
        }
        SpammaaKaikki();
    }
}
