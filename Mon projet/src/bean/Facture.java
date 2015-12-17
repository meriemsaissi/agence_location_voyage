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
public class Facture {
    
    private String id ;
    private Date date_retour; 
    private int prix ;
    private Client client ;

    public Facture() {
    }

    public Facture(String id) {
        this.id = id;
    }

    public Facture(String id, Date date_retour, int prix, Client client) {
        this.id = id;
        this.date_retour = date_retour;
        this.prix = prix;
        this.client = client;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate_retour() {
        return date_retour;
    }

    public void setDate_retour(Date date_retour) {
        this.date_retour = date_retour;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Facture{" + "id=" + id + ", date_retour=" + date_retour + ", prix=" + prix + ", client=" + client + '}';
    }

   
    
}
