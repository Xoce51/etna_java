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
public class Morceau {
    
    private     String      title;
    
    public Morceau(Groupe groupes, String title, int id)
    {
        this.title = title;
    }
    
    public String getTitle()   { return (this.title); }
    
    public void setTitle(String newTitle) {this.title = newTitle; }
}
