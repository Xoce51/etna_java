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
public class AbstrackPerson implements IPerson
{
    protected   int     age;
    protected   String  nom;
    protected   String  prenom;
    
    @Override
    public void setAge(int newAge)             { this.age = newAge; }

    /**
     *
     * @param newNom
     */
    @Override
    public void setNom(String newNom)          { this.nom = newNom; }
    @Override
    public void setPrenom(String newPrenom)    { this.prenom = newPrenom; }
    
    @Override
    public int getAge()          { return (this.age); }
    @Override
    public String getNom()       { return (this.nom); }
    @Override
    public String getPrenom()    { return (this.prenom); }
}
