/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aubingerard
 */
public class Jukebox {
    
    private     List<Morceau>   playlist = new ArrayList<Morceau>();
    private     int             volume = 50;
    
    public Jukebox(Morceau morceaux[])
    {
        int i = 0;
        for (Morceau m : morceaux)
        {
            this.playlist.set(i, m);
            i++;
        }
    }
    
    public void next()
    {
        
    }
    
    public void prev()
    {
        
    }
    
    
    public List<Morceau> getPlaylist()     { return (this.playlist); }
    public int getVolume()                 { return (this.volume); }
    
    public void setPlaylist(List<Morceau> newMorceau) { this.playlist = newMorceau; }
    public void setVolume(int newVolume)              { this.volume = newVolume; }
}
