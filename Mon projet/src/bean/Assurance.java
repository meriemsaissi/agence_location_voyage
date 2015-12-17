/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author User
 */
public class Assurance {
     private String id ;
     private int tarif;
     private Date date_debut ;
     private Date date_fin ;

    public Assurance(String id) {
        this.id = id;
    }

    public Assurance() {
    }

    public Assurance(String id, int tarif, Date date_debut, Date date_fin) {
        this.id = id;
        this.tarif = tarif;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    @Override
    public String toString() {
        return "Assurance{" + "id=" + id + ", tarif=" + tarif + ", date_debut=" + date_debut + ", date_fin=" + date_fin + '}';
    }

    
     
     
    
}
