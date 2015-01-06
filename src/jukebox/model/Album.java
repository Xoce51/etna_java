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
public class Album {
    
    private     String          style;
    private     String          name;
    private     int             year;
    private     Groupe          groupe;
    
    public Album(Groupe groupe, String name, String style, int year)
    {
        createAlbum(groupe, name, style, year);
    }
    
    public void createAlbum(Groupe groupe, String name, String style, int year)
    {
        this.groupe     = groupe;
        this.name       = name;
        this.style      = style;
        this.year       = year;
    }
    
    public Groupe getGroupe()           { return (this.groupe); }
    public String getName()             { return (this.name); }
    public String getStyle()            { return (this.style); }
    public int getyear()                { return (this.year); }
    
    public void setGroupe(Groupe newGroupe)          { this.groupe = newGroupe; }
    public void setMorceau(String newName)           { this.name = newName; }
    public void setStyle(String newStyle)            { this.style = newStyle; }
    public void setYear(int newYear)                 { this.year = newYear; }
    
    public String toString()
    {
        return "Album " + name + " de l'année " + year + " par le groupe" + groupe + "(" + style + ")";
    }
    
}
