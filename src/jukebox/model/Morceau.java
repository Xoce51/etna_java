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
    
    private     int         track;
    private     String      title;
    private     String      length;
    private     Album       album;
    
    public Morceau(int track, String title, String length, Album album)
    {
        this.track = track;
        this.title = title;
        this.length = length;
        this.album = album;
    }
    
    public String getTitle()    { return (this.title); }
    public int getTrack()       { return (this.track); }
    public String getLength()   { return (this.length); }
    public Album getAlbum()     { return (this.album); }
    
    public void setTitle(String newTitle)   {this.title = newTitle; }
    public void setTrack(int newTrack)      {this.track = newTrack; }
    public void setLength(String newLength) {this.length = newLength; }
    public void setAlbum(Album newAlbum)    {this.album = newAlbum; }
    
    public String toString()
    {
        return "Morceau: " + track + " - " + title + " (" + length + ") / " + album + "\n";
    }
}
