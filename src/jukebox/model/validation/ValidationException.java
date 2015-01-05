/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox.model.validation;

/**
 *
 * @author aubingerard
 */
public class ValidationException extends RuntimeException
{
    public ValidationException(String msg)
	{
            super(msg);
	}
}
