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
public class Artiste {
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
    
    private void setId(int newId)               { this.id = newId; }
    private void setAge(int newAge)             { this.age = newAge; }
    private void setNom(String newNom)          { this.nom = newNom; }
    private void setPrenom(String newPrenom)    { this.prenom = newPrenom; }
    private void setRole(String newRole)        { this.role = newRole; }
    
    private int getId()           { return (this.id); }
    private int getAge()          { return (this.age); }
    private String getNom()       { return (this.nom); }
    private String getPrenom()    { return (this.prenom); }
    private String getRole()      { return (this.role); }

}
