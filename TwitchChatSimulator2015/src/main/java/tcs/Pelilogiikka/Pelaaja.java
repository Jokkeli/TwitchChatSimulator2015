package tcs.Pelilogiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jukkapai
 *
 * Luokka, joka kapseloi pelaajaan liittyvät ominaisuudet.
 */
public class Pelaaja {

    private String nimimerkki;
    private int pisteet;
    private int virheet;
    private boolean bannattu;

    public Pelaaja() {
        nimimerkki = "testipelaaja";
        pisteet = 0;
        bannattu = false;
    }

    /**
     * lisää virheen pelaajalle, mikäli virheitä on yli kolme, bannaa pelaajan.
     */
    public void lisaaVirhe() {
        virheet++;
        if (virheet >= 3) {
            this.bannattu = true;
        }
    }

    public boolean onkoBannattu() {
        return this.bannattu;
    }

    public String getNimimerkki() {
        return this.nimimerkki;
    }

    public int getPisteet() {
        return this.pisteet;
    }

    public int getVirheet() {
        return this.virheet;
    }

    public void bannaa() {
        bannattu = true;
    }

    public void unBannaa() {
        bannattu = false;
    }

    /**
     * lisää pelaajalle pisteen
     */
    public void lisaaPiste() {
        pisteet++;
    }
    /**
     * lisää pelaajalle annetun määrän pisteitä
     * @param saadutPisteet annettu määrä pisteitä
     */
    public void lisaaPisteita(int saadutPisteet) {
        if (saadutPisteet > 0) {
            pisteet = +saadutPisteet;
        }
    }

    public void vaihdaNimimerkkia(String uusiNimi) {
        nimimerkki = uusiNimi;
    }

    public String toString() {
        return nimimerkki + ", " + pisteet;
    }
}
