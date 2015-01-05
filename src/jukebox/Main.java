/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox;

import jukebox.model.Artiste;
import jukebox.model.Groupe;
import jukebox.model.Membre;

/**
 *
 * @author aubingerard
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        runJukebox();
    }
    
    public static void runJukebox()
    {
     Groupe ntm = new Groupe("NTM");
     Artiste joeyStar = new Membre (0, 44, "Star", "Joey", "Singer", ntm);
     Artiste koolShen = new Membre (1, 42, "Shen", "Kool", "Singer", ntm);
     System.out.println(ntm.toString());
     
     
    }
    
}
