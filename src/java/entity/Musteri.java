/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author hakan2
 */
public class Musteri {
    
    private long musteri_id;
    private String ad;
    private String soyad;
    private String email;
    private String sifre;

    
    
    
    
    public Musteri() {
    }
    
    public Musteri(long musteri_id) {
        this.musteri_id = musteri_id;
    }

    public Musteri(String ad, String soyad, String email, String sifre) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.sifre = sifre;
    }

    
    public Musteri(long musteri_id, String ad, String soyad, String email, String sifre) {
        this.musteri_id = musteri_id;
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.sifre = sifre;
    }

    public long getMusteri_id() {
        return musteri_id;
    }

    public void setMusteri_id(long musteri_id) {
        this.musteri_id = musteri_id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    
    
}
