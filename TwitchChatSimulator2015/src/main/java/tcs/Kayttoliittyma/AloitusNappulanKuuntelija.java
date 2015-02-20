/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcs.Kayttoliittyma;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * Aloitusruudussa olevan "start" nappulan kuuntelija
 * @author jukkapai
 */
public class AloitusNappulanKuuntelija implements ActionListener{
    private JTextField teksti;
    private JFrame ruutu;
    
    public AloitusNappulanKuuntelija(JTextField teksti, JFrame frame) {
        this.teksti = teksti;
        this.ruutu = frame;
    }
    /**
     * luo uuden ikkunan jossa on itse peli, sulkee aloitusruudun
     * @param ae nappulan painallus 
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        Kayttoliittyma liittyma = new Kayttoliittyma(teksti.getText());
        SwingUtilities.invokeLater(liittyma);
        ruutu.setVisible(false);
    }
    
}
