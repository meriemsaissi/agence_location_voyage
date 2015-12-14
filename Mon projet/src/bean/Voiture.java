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
public class Voiture {
    
    private String id;
    private String marque ;
    private String type;
    private Date date_achat;
    private Number kilometrage ;
    private Agence agence ;

    public Voiture() {
    }

    public Voiture(String id) {
        this.id = id;
    }

    public Voiture(String id, String marque, String type, Date date_achat, Number kilometrage, Agence agence) {
        this.id = id;
        this.marque = marque;
        this.type = type;
        this.date_achat = date_achat;
        this.kilometrage = kilometrage;
        this.agence = agence;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate_achat() {
        return date_achat;
    }

    public void setDate_achat(Date date_achat) {
        this.date_achat = date_achat;
    }

    public Number getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(Number kilometrage) {
        this.kilometrage = kilometrage;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    @Override
    public String toString() {
        return "Voiture{" + "id=" + id + ", marque=" + marque + ", type=" + type + ", date_achat=" + date_achat + ", kilometrage=" + kilometrage + ", agence=" + agence + '}';
    }
    
    
    
}
