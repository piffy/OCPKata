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
public class RegolaConcretaTest {
    
    public RegolaConcretaTest() {
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
        t= new RegolaConcreta(t,3,"Fizz");
        assertEquals("1",t.say(1));
        assertEquals("2",t.say(2));
        assertEquals("Fizz",t.say(3));
        assertEquals("Fizz",t.say(6));
    }
    
    @Test
    public void testFives() {
        Teller t= new ConcreteTeller();
        t= new RegolaConcreta(t,5,"Buzz");
        assertEquals("1",t.say(1));
        assertEquals("2",t.say(2));
        assertEquals("Buzz",t.say(5));
        assertEquals("Buzz",t.say(10));
    }
    
     @Test
    public void testBoth1() {
        Teller t= new ConcreteTeller();
        t= new RegolaConcreta(t,3,"Fizz");
        t= new RegolaConcreta(t,5,"Buzz");
        t= new RegolaConcreta(t,15,"FizzBuzz");
        assertEquals("1",t.say(1));
        assertEquals("2",t.say(2));
        assertEquals("Fizz",t.say(3));
        assertEquals("Buzz",t.say(5));
        assertEquals("Fizz",t.say(6));
        assertEquals("Buzz",t.say(10));
        assertEquals("FizzBuzz",t.say(15));
        assertEquals("FizzBuzz",t.say(60));
        
    }
    
    

}
