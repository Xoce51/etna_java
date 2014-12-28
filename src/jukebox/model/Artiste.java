/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox.model;

/**
 *
 * @author aubingerard
 */
public class Artiste extends AbstrackPerson {
    private     int     age, id;
    private     String  nom, prenom, role;
    
    public Artiste(int id, int age, String nom, String prenom, String role)
    {
        createArtiste(id, age, nom, prenom, role);
    }
    
    private void createArtiste(int id, int age, String nom, String prenom, String role)
    {
        this.id     = id;
        this.age    = age;
        this.nom    = nom;
        this.prenom = prenom;
        this.role   = role;
    }
    
    public void setId(int newId)               { this.id = newId; }
    public void setRole(String newRole)        { this.role = newRole; }
    
    public int getId()           { return (this.id); }
    public String getRole()      { return (this.role); }

}
