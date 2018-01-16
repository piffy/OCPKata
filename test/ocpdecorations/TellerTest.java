/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocpdecorations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author piffy
 */
public class TellerTest {
    
    public TellerTest() {
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

    @Test
    public void testNumbers() {
        Teller t= new ConcreteTeller();
        assertEquals("1",t.say(1));
        assertEquals("2",t.say(2));
    }
    
   @Test
    public void testThrees() {
        Teller t= new ConcreteTeller();
        t= new Three(t);
        assertEquals("Fizz",t.say(3));
        assertEquals("Fizz",t.say(6));
    }
    
    @Test
    public void testFives() {
        Teller t= new ConcreteTeller();
        t= new Five(t);
        assertEquals("Buzz",t.say(5));
        assertEquals("Buzz",t.say(10));
    }

}
