/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Adres;
import entity.Musteri;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author hakan2
 */
public class AdresDAO {

    private Connection db;

    public void createAdres(Adres c) {
        try {
            Statement st = this.getDb().createStatement();

            String query = "insert into adres(sehir, ilce, adres, telefon) values ('" + c.getSehir() + "','" + c.getIlce() + "','" + c.getAdres() + "','" + c.getTelefon() + "')";
            int r = st.executeUpdate(query); // update yapıldığı zaman geri dönüş değeri oluyor

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void updateAdres(Adres c) {
        try {
            Statement st = this.getDb().createStatement();

            String query = "update adres set sehir = ('" + c.getSehir() + "'), ilce = ('" + c.getIlce() + "'), adres = ('" + c.getAdres() + "'), telefon = ('" + c.getTelefon() + "') where iletisim_id = ('" + c.getIletisim_id() + "')";
            int r = st.executeUpdate(query); // update yapıldığı zaman geri dönüş değeri oluyor

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void deleteAdres(Adres c) {
        try {
            Statement st = this.getDb().createStatement();

            String query = "delete from adres where iletisim_id = ('" + c.getIletisim_id() + "')";
            int r = st.executeUpdate(query); // update yapıldığı zaman geri dönüş değeri oluyor

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public List<Adres> getAdresList() {
        List<Adres> adresList = new ArrayList<>();
        try {
            Statement st = this.getDb().createStatement();

            String query2 = "select * from adres";
            ResultSet rs = st.executeQuery(query2);
            while (rs.next()) {
                adresList.add(new Adres(rs.getLong("iletisim_id"), (Musteri) rs.getObject("musteri_id"), rs.getString("sehir"), rs.getString("ilce"), rs.getString("adres"), rs.getString("telefon")));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return adresList;

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
