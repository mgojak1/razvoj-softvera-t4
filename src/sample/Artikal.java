package sample;

import java.util.ArrayList;

public class Artikal {

    private String sifra;
    private String naziv;
    private double cijena;

    public void setSifra(String sifra) {
        if(sifra.isEmpty()) throw new IllegalArgumentException("Neispravna sifra");
        this.sifra = sifra;
    }

    public void setNaziv(String naziv) {
        if(sifra.isEmpty()) throw new IllegalArgumentException("Neispravna sifra");
        this.naziv = naziv;
    }

    public void setCijena(double cijena) {
        if(cijena <= 0) throw new IllegalArgumentException("Neispravna cijena");
        this.cijena = cijena;
    }

    public String getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public Artikal(String recenica) {
        String[] elementi = recenica.split(",");
        this.sifra = elementi[0];
        this.naziv = elementi[1];
        this.cijena = Double.parseDouble(elementi[2]);
    }

    public Artikal(String sifra, String naziv, double cijena) {
        if(cijena <= 0) throw new IllegalArgumentException("Neispravna cijena");
        if(sifra.isEmpty()) throw new IllegalArgumentException("Neispravna sifra");
        if(naziv.isEmpty()) throw new IllegalArgumentException("Neispravan naziv");
        this.sifra = sifra;
        this.naziv = naziv;
        this.cijena = cijena;
    }

    public boolean equals(Artikal a){
        if(!(this.sifra.equals(a.sifra))) return false;
        if(!(this.naziv.equals(a.naziv))) return false;
        if(this.cijena != a.cijena) return false;
        return true;
    }


    public static ArrayList<Artikal> izbaciDuplikate(ArrayList<Artikal> artikli){
        for (int i = 0; i < artikli.size(); i++){
            for (int j = i+1; j < artikli.size();j++){
                if(artikli.get(i).equals(artikli.get(j))){
                    artikli.remove(i);
                }
            }
        }
        return artikli;
    }
}
