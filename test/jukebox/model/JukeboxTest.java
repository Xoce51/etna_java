/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox.model;

import java.util.List;
import jukebox.model.state.EJukeboxState;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aubingerard
 */
public class JukeboxTest {
    
    public JukeboxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validate method, of class Jukebox.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        Jukebox instance = null;
        instance.validate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlaylist method, of class Jukebox.
     */
    @Test
    public void testGetPlaylist() {
        System.out.println("getPlaylist");
        Jukebox instance = null;
        List<Morceau> expResult = null;
        List<Morceau> result = instance.getPlaylist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class Jukebox.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Jukebox instance = null;
        EJukeboxState expResult = null;
        EJukeboxState result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlaylist method, of class Jukebox.
     */
    @Test
    public void testSetPlaylist() {
        System.out.println("setPlaylist");
        List<Morceau> newMorceau = null;
        Jukebox instance = null;
        instance.setPlaylist(newMorceau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setState method, of class Jukebox.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        EJukeboxState newState = null;
        Jukebox instance = null;
        instance.setState(newState);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Jukebox.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Jukebox instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
