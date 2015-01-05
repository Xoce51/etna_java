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
    
    private     int         tracks;
    private     String      titles;
    private     String      lengths;
    private     Album       albums;
    
    public Morceau(int track, String title, String length, Album album)
    {
        this.tracks = track;
        this.titles = title;
        this.lengths = length;
        this.albums = album;
    }
    
    public String getTitle()   { return (this.titles); }
    public int getTrack()   { return (this.tracks); }
    public String getLength()   { return (this.lengths); }
    public Album getAlbum()   { return (this.albums); }
    
    public void setTitle(String newTitle) {this.titles = newTitle; }
    public void setTrack(int newTrack) {this.tracks = newTrack; }
    public void setLength(String newLength) {this.lengths = newLength; }
    public void setAlbum(Album newAlbum) {this.albums = newAlbum; }
}
