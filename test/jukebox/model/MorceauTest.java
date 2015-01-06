/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox.model;

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
public class MorceauTest {
    
    public MorceauTest() {
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
     * Test of getTitle method, of class Morceau.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Morceau instance = null;
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrack method, of class Morceau.
     */
    @Test
    public void testGetTrack() {
        System.out.println("getTrack");
        Morceau instance = null;
        int expResult = 0;
        int result = instance.getTrack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLength method, of class Morceau.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Morceau instance = null;
        String expResult = "";
        String result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlbum method, of class Morceau.
     */
    @Test
    public void testGetAlbum() {
        System.out.println("getAlbum");
        Morceau instance = null;
        Album expResult = null;
        Album result = instance.getAlbum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Morceau.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String newTitle = "";
        Morceau instance = null;
        instance.setTitle(newTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrack method, of class Morceau.
     */
    @Test
    public void testSetTrack() {
        System.out.println("setTrack");
        int newTrack = 0;
        Morceau instance = null;
        instance.setTrack(newTrack);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLength method, of class Morceau.
     */
    @Test
    public void testSetLength() {
        System.out.println("setLength");
        String newLength = "";
        Morceau instance = null;
        instance.setLength(newLength);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlbum method, of class Morceau.
     */
    @Test
    public void testSetAlbum() {
        System.out.println("setAlbum");
        Album newAlbum = null;
        Morceau instance = null;
        instance.setAlbum(newAlbum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Morceau.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Morceau instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
