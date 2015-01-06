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
public class AlbumTest {
    
    public AlbumTest() {
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
     * Test of getGroupe method, of class Album.
     */
    @Test
    public void testGetGroupe() {
        System.out.println("getGroupe");
        Album instance = null;
        Groupe expResult = null;
        Groupe result = instance.getGroupe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Album.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Album instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStyle method, of class Album.
     */
    @Test
    public void testGetStyle() {
        System.out.println("getStyle");
        Album instance = null;
        String expResult = "";
        String result = instance.getStyle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getyear method, of class Album.
     */
    @Test
    public void testGetyear() {
        System.out.println("getyear");
        Album instance = null;
        int expResult = 0;
        int result = instance.getyear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupe method, of class Album.
     */
    @Test
    public void testSetGroupe() {
        System.out.println("setGroupe");
        Groupe newGroupe = null;
        Album instance = null;
        instance.setGroupe(newGroupe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMorceau method, of class Album.
     */
    @Test
    public void testSetMorceau() {
        System.out.println("setMorceau");
        String newName = "";
        Album instance = null;
        instance.setMorceau(newName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStyle method, of class Album.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        String newStyle = "";
        Album instance = null;
        instance.setStyle(newStyle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class Album.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int newYear = 0;
        Album instance = null;
        instance.setYear(newYear);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Album.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Album instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
