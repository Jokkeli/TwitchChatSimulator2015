/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcs.Kayttoliittyma;

import tcs.Bottilogiikka.Bottilogiikka;
import tcs.Pelilogiikka.Peli;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author jukkapai
 * 
 * Käyttöliittymä, jossa luodaan pelin GUIssa näkyvät elementit jne.
 */
public class Kayttoliittyma implements Runnable{
    
    private JFrame frame;
    private Peli peli;
    private Bottilogiikka bottilogiikka;
    private String nimimerkki;
    
    public Kayttoliittyma(String a) {
        this.nimimerkki = a;
    }

    @Override
    public void run() {
        frame = new JFrame("Twitch Chat Simulator 2015");
        frame.setPreferredSize(new Dimension(400,600));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        peli = new Peli();
        if(!nimimerkki.isEmpty()) {
            peli.vaihdaPelaajanNimi(nimimerkki);
        }
        
        luoKomponentit(frame.getContentPane(), frame);
        frame.pack();
        frame.setVisible(true);
        
        try {
            bottilogiikka.luoBotit();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kayttoliittyma.class.getName()).log(Level.SEVERE, null, ex);
        }
        bottilogiikka.kaynnista();

    }
    
    private void luoKomponentit(Container container, JFrame frame){
        JTextArea viestiruutu = luoViestiRuutu(container);
        
        JTextField pistekentta = luoPistePaneeli(container);
        
                
        LuoLahetysPaneeli(viestiruutu, pistekentta, container, frame);
    }

    private void LuoLahetysPaneeli(JTextArea viestiruutu, JTextField pistekentta, Container container, JFrame frame) throws HeadlessException {
        JPanel alapaneeli = new JPanel(new FlowLayout());
        
        JTextField lahetysruutu = new JTextField(20);
        lahetysruutu.setEnabled(true);
        lahetysruutu.setEditable(true);
        lahetysruutu.setFont(new Font("Helvetica", Font.PLAIN, 16));
        
        Button laheta = new Button("Chat");
        laheta.addActionListener(new NappulanKuuntelija(peli, lahetysruutu, viestiruutu, pistekentta, frame));
        
        alapaneeli.add(lahetysruutu);
        alapaneeli.add(laheta);
        lahetysruutu.addKeyListener(new NappaimistonKuuntelija(peli, lahetysruutu, viestiruutu, pistekentta, frame));
        
        this.bottilogiikka = new Bottilogiikka(viestiruutu, peli);
        container.add(alapaneeli, BorderLayout.PAGE_END);
    }

    private JTextField luoPistePaneeli(Container container) {
        JPanel ylapaneeli = new JPanel(new FlowLayout());
        JLabel pisteet = new JLabel("Pisteet: ");
        pisteet.setFont(new Font("Helvetica", Font.PLAIN, 16));
        ylapaneeli.add(pisteet);
        JTextField pistekentta = new JTextField(10);
        pistekentta.setEditable(false);
        pistekentta.setFont(new Font("Helvetica", Font.PLAIN, 16));
        ylapaneeli.add(pistekentta);
        container.add(ylapaneeli, BorderLayout.PAGE_START);
        return pistekentta;
    }

    private JTextArea luoViestiRuutu(Container container) {
        JTextArea viestiruutu = new JTextArea();
        viestiruutu.setEditable(false);
        viestiruutu.setEnabled(true);
        viestiruutu.setFont(new Font("Helvetica", Font.PLAIN, 16));
        viestiruutu.setLineWrap(true);
        viestiruutu.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(viestiruutu);
        container.add(scroll, BorderLayout.CENTER);
        return viestiruutu;
    }
    
    
    
}
