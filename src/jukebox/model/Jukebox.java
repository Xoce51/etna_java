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
    
    public Jukebox(List<Morceau> morceaux)
    {
       createJukebox(morceaux);
    }
        
     public void createJukebox(List<Morceau> morceaux)
     {
        this.state = EJukeboxState.STATE_PAUSE;
        this.playlist = morceaux;
    }

    public void validate() throws ValidationException
    {
        if  (playlist == null)
            throw new ValidationException("No song in playlist !!");
    }
    
    public List<Morceau> getPlaylist()     { return (this.playlist); }
    public EJukeboxState getState()        { return (this.state); }
    
    
    public void setPlaylist(List<Morceau> newMorceau) { this.playlist = newMorceau; }
    public void setState(EJukeboxState newState)      { this.state = newState; }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Order: \r\n\tState = "  + this.state.toString());
        sb.append("\r\n");
        for (Morceau p : playlist)
            sb.append("\r\n\t" + p.toString());
        return sb.toString();
       
    }
}
