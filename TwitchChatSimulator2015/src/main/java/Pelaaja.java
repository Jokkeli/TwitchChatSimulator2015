/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jukkapai
 */
public class Pelaaja {
    private String nimimerkki;
    private int pisteet;
    private boolean bannattu;
    
    public Pelaaja(){
        nimimerkki = "testipelaaja";
        pisteet = 0;
        bannattu = false;
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
    
    public void bannaa() {
        bannattu = true;
    }
    
    public void unBannaa() {
        bannattu = false;
    }
    
    public void lisaaPiste() {
        pisteet++;
    }
    
    public void lisaaPisteita(int saadutPisteet){
        if(saadutPisteet > 0) {
            pisteet=+saadutPisteet;
        }
    }
    
    public void vaihdaNimimerkkia(String uusiNimi) {
        nimimerkki = uusiNimi;
    }
    
    public String toString() {
        return nimimerkki + ", " + pisteet;
    }
}
