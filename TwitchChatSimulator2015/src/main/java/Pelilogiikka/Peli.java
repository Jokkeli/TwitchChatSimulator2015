package Pelilogiikka;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukkapai
 */
public class Peli {
    private Pelaaja pelaaja;
    private Viestiseula seula;
    
    public Peli() {
        pelaaja = new Pelaaja();
        seula = new Viestiseula();
        seula.luoSpammattavat();
    }
    
    public String viesti(String viesti) {
        String tulostettava = viesti;
        if(pelaaja.onkoBannattu()) {
            tulostettava = "You have been permanently banned from genericStreamName";
            return tulostettava;
        }
        tulostettava = pelaaja.getNimimerkki() + ": " + viesti;
        if(seula.onkoSpammattava(viesti)) {
            pelaaja.lisaaPiste();
        } else if (!seula.onkoSpammattava(viesti)) {
            pelaaja.lisaaVirhe();
        }
        
        return tulostettava;
    }
    
    
    public void vaihdaSpammattavaa() {
        seula.uusiSpammattava();
        System.out.println("Spam: " + seula.getSpammattava());
    }
    
    public void lopetaPeli() {
        System.out.println("Stream has gone offline.");
        System.out.println(pelaaja.toString());
    }
    
    public boolean onkoBannattu() {
        return pelaaja.onkoBannattu();
    }
    
    public void bannaaPelaaja() {
        pelaaja.bannaa();
    }
    
    public int getPelaajanPisteet(){
        return pelaaja.getPisteet();
    }
    
    public int getPelaajanVirheet(){
        return pelaaja.getVirheet();
    }
    
    public String spammattava() {
        return seula.getSpammattava();
    }
}