package tcs.Pelilogiikka;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jukkapai
 *
 * Luokka, joka ylläpitää pelin sääntöjä ja keskustelee bottilogiikan kanssa.
 */
public class Peli {

    private Pelaaja pelaaja;
    private Viestiseula seula;

    public Peli() {
        pelaaja = new Pelaaja();
        seula = new Viestiseula();
        seula.luoSpammattavat();
    }

    /**
     * Palauttaa pelaajan lähettämän viestin muodossa "nimimerkki: viesti"
     * mikäli pelaajaa ei ole bannattu.
     *
     * Jos viesti vastaa spammattavaa merkkijonoa, pelaaja saa pisteen. Jos ei,
     * niin virheen.
     *
     * @param viesti
     * @return
     */
    public String viesti(String viesti) {
        String tulostettava = viesti;
        if (pelaaja.onkoBannattu()) {
            tulostettava = "You have been permanently banned from genericStreamName";
            return tulostettava;
        }
        tulostettava = pelaaja.getNimimerkki() + ": " + viesti;
        if (seula.onkoSpammattava(viesti)) {
            pelaaja.lisaaPiste();
        } else if (!seula.onkoSpammattava(viesti)) {
            pelaaja.lisaaVirhe();
        }

        return tulostettava;
    }

    /**
     * vaihtaa spammattavaa merkkijonoa
     */
    public void vaihdaSpammattavaa() {
        seula.uusiSpammattava();
        System.out.println("Spam: " + seula.getSpammattava());
    }

    /**
     * kertoo, onko pelaaja bannattu
     *
     * @return pelaajan bannitila
     */
    public boolean onkoBannattu() {
        return pelaaja.onkoBannattu();
    }

    /**
     * bannaa pelaajan
     */
    public void bannaaPelaaja() {
        pelaaja.bannaa();
    }

    public int getPelaajanPisteet() {
        return pelaaja.getPisteet();
    }

    public int getPelaajanVirheet() {
        return pelaaja.getVirheet();
    }

    public String spammattava() {
        return seula.getSpammattava();
    }
}
