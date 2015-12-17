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
    private String modele;
    private int kilometrage ;
    private String etat;
    private int prix_location;
    private Reservation reservation ;

    public Voiture() {
    }

    public Voiture(String id) {
        this.id = id;
    }

    public Voiture(String id, String marque, String type, Date date_achat, String modele, int kilometrage, String etat, int prix_location, Reservation reservation) {
        this.id = id;
        this.marque = marque;
        this.type = type;
        this.date_achat = date_achat;
        this.modele = modele;
        this.kilometrage = kilometrage;
        this.etat = etat;
        this.prix_location = prix_location;
        this.reservation = reservation;
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

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getPrix_location() {
        return prix_location;
    }

    public void setPrix_location(int prix_location) {
        this.prix_location = prix_location;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Voiture{" + "id=" + id + ", marque=" + marque + ", type=" + type + ", date_achat=" + date_achat + ", modele=" + modele + ", kilometrage=" + kilometrage + ", etat=" + etat + ", prix_location=" + prix_location + ", reservation=" + reservation + '}';
    }

    
    
    
}
