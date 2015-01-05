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
    STATE_REPLAY("Play", null),
    STATE_NEXT("Pause", STATE_REPLAY),
    STATE_PREV("Pause", STATE_NEXT),
    STATE_PAUSE("Pause", STATE_PREV),
    STATE_PLAY("Play", STATE_PAUSE);
    
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
