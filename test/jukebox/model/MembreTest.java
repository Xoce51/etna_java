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
public class MembreTest {
    
    public MembreTest() {
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
     * Test of setGroupe method, of class Membre.
     */
    @Test
    public void testSetGroupe() {
        System.out.println("setGroupe");
        Groupe newGroupe = null;
        Membre instance = null;
        instance.setGroupe(newGroupe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupe method, of class Membre.
     */
    @Test
    public void testGetGroupe() {
        System.out.println("getGroupe");
        Membre instance = null;
        Groupe expResult = null;
        Groupe result = instance.getGroupe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Membre.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Membre instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
