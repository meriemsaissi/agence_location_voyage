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
public class Reservation {
    private String id;
    private Date date_reserv;
    private Date date_loc ;
    private Date date_retour ;
    private Client client ;

    public Reservation() {
    }

    public Reservation(String id) {
        this.id = id;
    }

    public Reservation(String id, Date date_reserv, Date date_loc, Date date_retour, Client client) {
        this.id = id;
        this.date_reserv = date_reserv;
        this.date_loc = date_loc;
        this.date_retour = date_retour;
        this.client = client;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate_reserv() {
        return date_reserv;
    }

    public void setDate_reserv(Date date_reserv) {
        this.date_reserv = date_reserv;
    }

    public Date getDate_loc() {
        return date_loc;
    }

    public void setDate_loc(Date date_loc) {
        this.date_loc = date_loc;
    }

    public Date getDate_retour() {
        return date_retour;
    }

    public void setDate_retour(Date date_retour) {
        this.date_retour = date_retour;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", date_reserv=" + date_reserv + ", date_loc=" + date_loc + ", date_retour=" + date_retour + ", client=" + client + '}';
    }
    
    
    
    
}
