/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcs.Kayttoliittyma;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import tcs.Pelilogiikka.Peli;

/**
 *
 * @author jukkapai
 * 
 * Kuuntelija, joka lähettää käyttäjän viestin Enter-näppäintä painettaessa
 */
public class NappaimistonKuuntelija implements KeyListener{
    private Peli peli;
    private JTextField viesti;
    private JTextArea tekstikentta;
    private JTextField pistekentta;
    private JFrame frame;
    
    public NappaimistonKuuntelija(Peli peli, JTextField viesti, JTextArea tekstikentta, JTextField pistekentta, JFrame frame) {
        this.peli = peli;
        this.viesti = viesti;
        this.tekstikentta = tekstikentta;
        this.pistekentta = pistekentta;
        this.frame = frame;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    /*
    * Käyttää pelin logiikkaa käyttäjän viestin tarkastamiseen, jonka jälkeen
    * lisää tarkastetun viestin käyttöliittymään sekä päivittää pelaajan pisteet
    */
    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_ENTER) {
            if(viesti.getText().equals("reboot")) {
                Aloitusruutu ruutu = new Aloitusruutu();
                SwingUtilities.invokeLater(ruutu);
                frame.setVisible(false);
               
            }
            tekstikentta.append(peli.viesti(viesti.getText()) + "\n");
            viesti.setText("");
            pistekentta.setText("" + peli.getPelaajanPisteet());
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
}
