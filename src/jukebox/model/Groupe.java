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
public class Groupe {
    
    private     String              groupe;
    
    public Groupe(String name)
    {
        this.groupe = name;
    }
     public void setGroupe(String newGroupe)               { this.groupe = newGroupe; }
   
    public String getGroupe()      { return (this.groupe); }

}
