/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox.model.state;

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
public class JukeboxStateMachineTest {
    
    public JukeboxStateMachineTest() {
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
     * Test of changeStep method, of class JukeboxStateMachine.
     */
    @Test
    public void testChangeStep_IStateChangeable() {
        System.out.println("changeStep");
        IStateChangeable statedReference = null;
        JukeboxStateMachine.changeStep(statedReference);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeStep method, of class JukeboxStateMachine.
     */
    @Test
    public void testChangeStep_IStateChangeable_EJukeboxState() {
        System.out.println("changeStep");
        IStateChangeable statedReference = null;
        EJukeboxState newState = null;
        JukeboxStateMachine.changeStep(statedReference, newState);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
