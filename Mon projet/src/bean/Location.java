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
    
    private Date date_retour ;
    private Date date_depart ;
    private Date date_retard;
    private int kilométrage ;
    private Voiture voiture ;
    private Reservation reservation ;

    public Location() {
    }

    public Location(Date date_retour, Date date_depart, Date date_retard, int kilométrage, Voiture voiture, Reservation reservation) {
        this.date_retour = date_retour;
        this.date_depart = date_depart;
        this.date_retard = date_retard;
        this.kilométrage = kilométrage;
        this.voiture = voiture;
        this.reservation = reservation;
    }

    public Date getDate_retour() {
        return date_retour;
    }

    public void setDate_retour(Date date_retour) {
        this.date_retour = date_retour;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public Date getDate_retard() {
        return date_retard;
    }

    public void setDate_retard(Date date_retard) {
        this.date_retard = date_retard;
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

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Location{" + "date_retour=" + date_retour + ", date_depart=" + date_depart + ", date_retard=" + date_retard + ", kilom\u00e9trage=" + kilométrage + ", voiture=" + voiture + ", reservation=" + reservation + '}';
    }
    
    
    
    
}
