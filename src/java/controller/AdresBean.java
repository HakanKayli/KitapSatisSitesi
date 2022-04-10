/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.AdresDAO;
import entity.Adres;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author hakan2
 */

@Named
@SessionScoped
public class AdresBean implements Serializable{
    
    private AdresDAO dao;
    private Adres entity;
    
    
    
    public String create(){
        this.getDao().createAdres(entity);
        return "index";
        
    }
    
    public List<Adres> getlist(){
        return this.getDao().getAdresList();
          
    }
    public String updateForm(Adres c){
        this.entity = c;
        return "update"; //xhtml update diye bir sayfa olacak 
    }
    
    public String update(){
        this.getDao().updateAdres(entity);
        return "index"; //xhtml index sayfası olacak
        
    }
    
    public void delete(Adres c){
        this.getDao().deleteAdres(c);
        
    }
    

    public AdresBean() {
    }

    public AdresDAO getDao() {
        if (this.dao == null)
            this.dao = new AdresDAO();
        return dao;
    }

    public void setDao(AdresDAO dao) {
        this.dao = dao;
    }

    public Adres getEntity() {
        if (this.entity == null)
            this.entity = new Adres();
        return entity;
    }

    public void setEntity(Adres entity) {
        this.entity = entity;
    }
    
    
    
    
    
    
}
