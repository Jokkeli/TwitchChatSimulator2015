/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcs.Kayttoliittyma;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * Kuuntelee aloitusruudussa enter-näppäintä, ja aloittaa tätä painettaessa pelin
 * käyttäjän valitsemalla nimimerkillä
 * @author jukkapai
 */
public class AloitusNappaimistonKuuntelija implements KeyListener {
    private JFrame frame;
    private JTextField teksti;
    
    public AloitusNappaimistonKuuntelija(JTextField teksti, JFrame frame) {
        this.frame = frame;
        this.teksti = teksti;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                Kayttoliittyma liittyma = new Kayttoliittyma(teksti.getText());
                SwingUtilities.invokeLater(liittyma);
                frame.setVisible(false);

            }
        }

        @Override
        public void keyReleased
        (KeyEvent ke
        
            ) {
        }

    }
