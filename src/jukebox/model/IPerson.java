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
public interface IPerson {
    void setAge(int newAge);
    void setNom(String newNom);
    void setPrenom(String newPrenom);
            
    int getAge();
    String getNom();
    String getPrenom();
}
