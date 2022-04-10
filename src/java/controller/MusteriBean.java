/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.MusteriDAO;
import entity.Musteri;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author hakan2
 */

@Named(value="musteriBean")
@SessionScoped
public class MusteriBean implements Serializable {
    
    private MusteriDAO dao;
    private Musteri entity;
    private List<Musteri> list;
    
    public String create(){
        this.getDao().createMusteri(entity);
        return "index";
        
    }

    public List<Musteri> getList() {
        this.list = this.getDao().getMusteriList();
        return list;
    }

    public void setList(List<Musteri> list) {
        this.list = list;
    }
  
          
    
    public String updateForm(Musteri c){
        this.entity = c;
        return "update"; //xhtml update diye bir sayfa olacak 
    }
    
    public String update(){
        this.getDao().updateMusteri(entity);
        return "index"; //xhtml index sayfası olacak
        
    }
    
    public void delete(Musteri c){
        this.getDao().deleteMusteri(c);
        
    }
    

    public MusteriBean() {
    }

    public MusteriDAO getDao() {
        if (this.dao == null)
            this.dao = new MusteriDAO();
        return dao;
    }

    public void setDao(MusteriDAO dao) {
        this.dao = dao;
    }

    public Musteri getEntity() {
        if (this.entity == null)
            this.entity = new Musteri();
        return entity;
    }

    public void setEntity(Musteri entity) {
        this.entity = entity;
    }
    
    
    
    
}
