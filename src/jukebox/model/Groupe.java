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
    
    private     List<Artiste>       artistes = new ArrayList<Artiste>();
    
    public Groupe(Artiste artistes[])
    {
        int i = 0;
        for (Artiste a : artistes)
        {
            this.artistes.set(i, a);
            i++;
        }
    }
}
