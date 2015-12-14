/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author User
 */
public class Position {
    private Voiture voiture ;
    private String etat ;
    private Agence agence ;

    public Position() {
    }

    public Position(Voiture voiture, String etat, Agence agence) {
        this.voiture = voiture;
        this.etat = etat;
        this.agence = agence;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    @Override
    public String toString() {
        return "Position{" + "voiture=" + voiture + ", etat=" + etat + ", agence=" + agence + '}';
    }
    
    
    
}
