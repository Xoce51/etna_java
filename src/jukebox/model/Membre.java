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
public class Membre extends Artiste {
    private     Groupe      groupe;
    
    public Membre(int id, int age, String nom, String prenom, String role, Groupe groupe)
    {
        super(id, age, nom, prenom, role);
        this.groupe = groupe;
    }
}
