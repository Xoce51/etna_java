/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jukebox.model.Album;
import jukebox.model.Artiste;
import jukebox.model.Groupe;
import jukebox.model.Jukebox;
import jukebox.model.Membre;
import jukebox.model.Morceau;

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
     System.out.println(joeyStar.toString());
     Artiste koolShen = new Membre (1, 42, "Shen", "Kool", "Singer", ntm);
     System.out.println(koolShen.toString());
     
     Album leClash    = new Album (ntm, "Le Clash", "Rap", 2008);
     System.out.println(leClash.toString());
     
     List<Morceau> playlist = new ArrayList<Morceau>();
     playlist.add(new Morceau (1, "Intro - NTM / Le Clash (IV My People Mix) ", "01:51", leClash));
     playlist.add(new Morceau (2, "Back dans les bacs (IV My People Remix)", "03:27", leClash));
     playlist.add(new Morceau (3, "Seine Saint-Denis style (IV My People Remix)", "03:20", leClash));
     
     Jukebox jk = new Jukebox(playlist);
     System.out.println(jk.toString());
       
    }
    
}
