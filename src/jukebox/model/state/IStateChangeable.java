/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox.model.state;

import jukebox.model.validation.IValidable;

/**
 *
 * @author aubingerard
 */
public interface IStateChangeable extends IValidable
{
    public EJukeboxState getState();
    
    public void setState(EJukeboxState orderState);
}
