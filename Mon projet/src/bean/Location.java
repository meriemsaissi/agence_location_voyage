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
public class Location {
    
    private Date date_debut ;
    private Date date_fin ;
    private int kilométrage ;
    private Voiture voiture ;
    private Client client ;

    public Location() {
    }

    public Location(Date date_debut, Date date_fin, int kilométrage, Voiture voiture, Client client) {
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.kilométrage = kilométrage;
        this.voiture = voiture;
        this.client = client;
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

    public int getKilométrage() {
        return kilométrage;
    }

    public void setKilométrage(int kilométrage) {
        this.kilométrage = kilométrage;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Location{" + "date_debut=" + date_debut + ", date_fin=" + date_fin + ", kilom\u00e9trage=" + kilométrage + ", voiture=" + voiture + ", client=" + client + '}';
    }
    

   }
