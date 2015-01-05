/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox.model;

import java.util.ArrayList;
import java.util.List;
import jukebox.model.state.EJukeboxState;
import jukebox.model.state.IStateChangeable;
import jukebox.model.validation.ValidationException;

/**
 *
 * @author aubingerard
 */
public class Jukebox implements IStateChangeable
{
    
    private     List<Morceau>   playlist = new ArrayList<Morceau>();
    private     EJukeboxState 	state;
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
    
    public void validate() throws ValidationException
    {
        if  (playlist == null)
            throw new ValidationException("No song in playlist !!");
    }
    
    public List<Morceau> getPlaylist()     { return (this.playlist); }
    public int getVolume()                 { return (this.volume); }
    public EJukeboxState getState()        { return (this.state); }
    
    
    public void setPlaylist(List<Morceau> newMorceau) { this.playlist = newMorceau; }
    public void setVolume(int newVolume)              { this.volume = newVolume; }
    public void setState(EJukeboxState newState)      { this.state = newState; }
}
