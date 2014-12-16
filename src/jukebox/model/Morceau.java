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
public class Morceau extends Album {
    
    private     String      length;
    
    public Morceau(Groupe groupes[], Morceau morceaux[], String style, String length)
    {
        super(groupes, morceaux, style);
        this.length = length;
    }
    
    public String getLenght()   { return (this.length); }
    
    public void setLength(String newLength) {this.length = newLength; }
}
