/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox.model.state;

import jukebox.model.validation.ValidationException;

/**
 *
 * @author aubingerard
 */
public class JukeboxStateMachine
{
    public static void changeStep(IStateChangeable statedReference) throws ValidationException
    {
        statedReference.validate();
        //System.out.println(statedReference.getState());
        statedReference.setState(statedReference.getState().getNextStepState());
    }
}
