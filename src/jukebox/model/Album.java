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
public class Album {
    
    private     String          style;
    private     List<Groupe>    groupe = new ArrayList<Groupe>();
    private     List<Morceau>   morceau = new ArrayList<Morceau>();
    
    public Album(Groupe groupes[], Morceau morceaux[], String style)
    {
        int i = 0;
        for (Groupe g : groupes)
        {
            this.groupe.set(i, g);
            i++;
        }
        i = 0;
        
        for (Morceau m : morceaux)
        {
            this.morceau.set(i, m);
            i++;
        }
        this.style = style;
    }
    
    private List<Groupe> getGroupe()     { return (this.groupe); }
    private List<Morceau> getMorceau()   { return (this.morceau); }
    private String getstyle()            { return (this.style); }
    
    private void setGroupe(List<Groupe> newGroupe)    { this.groupe = newGroupe; }
    private void setMorceau(List<Morceau> newMorceau) { this.morceau = newMorceau; }
    private void setStyle(String newStyle)            { this.style = newStyle; }
    
}
