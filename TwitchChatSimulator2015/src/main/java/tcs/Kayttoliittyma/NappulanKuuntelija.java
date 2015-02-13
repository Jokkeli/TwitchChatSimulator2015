/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcs.Kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import tcs.Pelilogiikka.Peli;

/**
 *
 * @author jukkapai
 *
 * Kuuntelija, joka lähettää käyttäjän viestin GUI:ssa olevaa chat-nappulaa
 * painettaessa.
 */
public class NappulanKuuntelija implements ActionListener {

    private Peli peli;
    private JTextField viesti;
    private JTextArea tekstikentta;
    private JTextArea pistekentta;

    public NappulanKuuntelija(Peli peli, JTextField viesti, JTextArea tekstikentta, JTextField pistekentta) {
        this.peli = peli;
        this.viesti = viesti;
        this.tekstikentta = tekstikentta;
    }

    /*
     * Käyttää pelin logiikkaa käyttäjän viestin tarkastamiseen, jonka jälkeen
     * lisää tarkastetun viestin käyttöliittymään sekä päivittää pelaajan pisteet
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.tekstikentta.append(peli.viesti(viesti.getText()) + "\n");
        viesti.setText("");
        pistekentta.setText("" + peli.getPelaajanPisteet());
    }

}
