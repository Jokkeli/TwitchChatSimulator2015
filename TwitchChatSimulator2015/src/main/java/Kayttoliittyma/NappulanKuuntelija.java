/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import tcs.twitchchatsimulator2015.Peli;

/**
 *
 * @author jukkapai
 */
public class NappulanKuuntelija implements ActionListener{
    private Peli peli;
    private JTextField viesti;
    private JTextArea tekstikentta;
    private JTextArea pistekentta;
    
    public NappulanKuuntelija(Peli peli, JTextField viesti, JTextArea tekstikentta, JTextField pistekentta) {
        this.peli = peli;
        this.viesti = viesti;
        this.tekstikentta = tekstikentta;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.tekstikentta.append(peli.viesti(viesti.getText()) + "\n");
        viesti.setText("");
        pistekentta.setText("" + peli.getPelaajanPisteet());
    }
    
}
