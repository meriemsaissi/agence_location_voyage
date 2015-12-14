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
public class Agence {
    private String id;
    private String ville ;

    public Agence(String id) {
        this.id = id;
    }

    public Agence() {
    }

    public Agence(String id, String ville) {
        this.id = id;
        this.ville = ville;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Agence{" + "id=" + id + ", ville=" + ville + '}';
    }
    
   
}
