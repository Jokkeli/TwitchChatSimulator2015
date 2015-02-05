/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcs.Kayttoliittyma;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
    
    public NappaimistonKuuntelija(Peli peli, JTextField viesti, JTextArea tekstikentta, JTextField pistekentta) {
        this.peli = peli;
        this.viesti = viesti;
        this.tekstikentta = tekstikentta;
        this.pistekentta = pistekentta;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_ENTER) {
            tekstikentta.append(peli.viesti(viesti.getText()) + "\n");
            viesti.setText("");
            pistekentta.setText("" + peli.getPelaajanPisteet());
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
}
