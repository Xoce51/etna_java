/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox.model.state;

/**
 *
 * @author aubingerard
 */
public enum EJukeboxState
{
    // State declaration
    STATE_PREV("Prev", null),
    STATE_PLAY("Pause", STATE_PREV),
    STATE_PAUSE("Play",  STATE_PLAY);
    
    private EJukeboxState     nextStateStatus;
    private String            state;
    
    private EJukeboxState(String state, EJukeboxState nextStepState)
    {
        this.state              = state;
        this.nextStateStatus    = nextStepState;
    }
    
    public String getState()                  { return(this.state); }
    public EJukeboxState getNextStepState()   { return (this.nextStateStatus); }
}
