/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author hakan2
 */
public class Adres {
    
    private long iletisim_id;
    private Musteri musteri_id;
    private String sehir;
    private String ilce;
    private String adres;
    private String telefon;

    public Adres() {
    }
    
    

    public Adres(String sehir, String ilce, String adres, String telefon) {
        this.sehir = sehir;
        this.ilce = ilce;
        this.adres = adres;
        this.telefon = telefon;
    }

    
    public Adres(long iletisim_id, String sehir, String ilce, String adres, String telefon) {
        this.iletisim_id = iletisim_id;
        this.sehir = sehir;
        this.ilce = ilce;
        this.adres = adres;
        this.telefon = telefon;
    }

    public Adres(long iletisim_id, Musteri musteri_id, String sehir, String ilce, String adres, String telefon) {
        this.iletisim_id = iletisim_id;
        this.musteri_id = musteri_id;
        this.sehir = sehir;
        this.ilce = ilce;
        this.adres = adres;
        this.telefon = telefon;
    }
    

    public long getIletisim_id() {
        return iletisim_id;
    }

    public void setIletisim_id(long iletisim_id) {
        this.iletisim_id = iletisim_id;
    }

    public Musteri getMusteri_id() {
        return musteri_id;
    }

    public void setMusteri_id(Musteri musteri_id) {
        this.musteri_id = musteri_id;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    
    
}
