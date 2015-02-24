/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcs.Kayttoliittyma;

import java.awt.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
/**
 * Aloitusruudun käyttöliittymä, jossa valitaan nimimerkki
 * @author jukkapai
 */
public class Aloitusruutu implements Runnable{
    private JFrame frame;
    
    public Aloitusruutu() {
    }

    @Override
    public void run() {
        frame = new JFrame("Twitch Chat Simulator 2015");
        frame.setPreferredSize(new Dimension(425,600));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        luoKomponentit(frame.getContentPane(), frame);
        frame.pack();
        frame.setVisible(true);
        
    }
    
    private void luoKomponentit(Container container, JFrame frame) {
        JPanel keskipaneeli = new JPanel(new FlowLayout());
        JLabel teksti = new JLabel(String.format("<html><div WIDTH=%d>%s</div><div style=\"text.align: center;\"><html>", 400, "Welcome to Twitch Chat Simulator 2015"));
        teksti.setFont(new Font("Helvetica", Font.ITALIC, 32));

        JLabel teksti2 = new JLabel(String.format("<html><div WIDTH=%d>%s</div><div style=\"text.align: center;\"><html>", 400, "Spam with the flow or send restart to start over"));
        teksti2.setFont(new Font("Helvetica", Font.ITALIC, 26));
        keskipaneeli.add(teksti);
        keskipaneeli.add(teksti2);
        container.add(keskipaneeli, BorderLayout.CENTER);
        
        JPanel alapaneeli = new JPanel(new FlowLayout());
        JLabel alateksti = new JLabel("Choose your nickname: ");
        alateksti.setFont(new Font("Helvetica", Font.PLAIN, 16));
        alapaneeli.add(alateksti);
        
        JTextField nimikentta = new JTextField(10);
        nimikentta.setEnabled(true);
        nimikentta.setEditable(true);
        nimikentta.setFont(new Font("Helvetica", Font.PLAIN, 16));
        nimikentta.addKeyListener(new AloitusNappaimistonKuuntelija(nimikentta, frame));
        alapaneeli.add(nimikentta);
        
        JButton start = new JButton("Start");
        start.addActionListener(new AloitusNappulanKuuntelija(nimikentta, frame));
        alapaneeli.add(start);
        alapaneeli.setPreferredSize(new Dimension(400, 70));
        
        container.add(alapaneeli, BorderLayout.PAGE_END);
    }
}
