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
public class AbstrackPerson implements Person
{
    protected   int     age;
    protected   String  nom;
    protected   String  prenom;
    
    public void setAge(int newAge)             { this.age = newAge; }
    public void setNom(String newNom)          { this.nom = newNom; }
    public void setPrenom(String newPrenom)    { this.prenom = newPrenom; }
    
    public int getAge()          { return (this.age); }
    public String getNom()       { return (this.nom); }
    public String getPrenom()    { return (this.prenom); }
}
