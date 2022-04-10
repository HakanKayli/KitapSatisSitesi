/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Musteri;
import util.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hakan2
 */
public class MusteriDAO {

    private Connection db;

    public void createMusteri(Musteri c) {
        try {
            Statement st = this.getDb().createStatement();

            String query = "insert into musteri(ad, soyad, email, sifre) values ('" + c.getAd() + "','" + c.getSoyad()+ "','" + c.getEmail()+ "','" + c.getSifre()+ "')";
            int r = st.executeUpdate(query); // update yapıldığı zaman geri dönüş değeri oluyor

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void updateMusteri(Musteri c) {
        try {
            Statement st = this.getDb().createStatement();

            String query = "update musteri set ad = ('" + c.getAd() + "'), soyad = ('" + c.getSoyad()+ "'), email = ('" + c.getEmail()+ "'), sifre = ('" + c.getSifre()+ "') where musteri_id = ('" + c.getMusteri_id() + "')";
            int r = st.executeUpdate(query); // update yapıldığı zaman geri dönüş değeri oluyor

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void deleteMusteri(Musteri c) {
        try {
            Statement st = this.getDb().createStatement();

            String query = "delete from musteri where musteri_id = ('" + c.getMusteri_id() + "')";
            int r = st.executeUpdate(query); // update yapıldığı zaman geri dönüş değeri oluyor

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public List<Musteri> getMusteriList() {
        List<Musteri> musteriList = new ArrayList<>();
        try {
            Statement st = this.getDb().createStatement();

            String query2 = "select * from kategori";
            ResultSet rs = st.executeQuery(query2);
            while (rs.next()) {
                musteriList.add(new Musteri(rs.getLong("musteri_id"), rs.getString("ad"), rs.getString("soyad"), rs.getString("email"), rs.getString("sifre")));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return musteriList;

    }

    public Connection getDb() {
        if (this.db == null) {
            DBConnection dbc = new DBConnection();
            this.db = dbc.connet();
        }
        return db;
    }

    public void setDb(Connection db) {
        this.db = db;
    }

}
