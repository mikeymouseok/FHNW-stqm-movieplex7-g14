/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javaee7.movieplex7.entities;

import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hoster
 */
public class TheaterTest {
    
    public TheaterTest() {
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
     * Test of getId method, of class Theater.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Theater instance = new Theater();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Theater.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Theater instance = new Theater();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class Theater.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Theater instance = new Theater();
        int expResult = 0;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class Theater.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 0;
        Theater instance = new Theater();
        instance.setCapacity(capacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShowTimingCollection method, of class Theater.
     */
    @Test
    public void testGetShowTimingCollection() {
        System.out.println("getShowTimingCollection");
        Theater instance = new Theater();
        Collection<ShowTiming> expResult = null;
        Collection<ShowTiming> result = instance.getShowTimingCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShowTimingCollection method, of class Theater.
     */
    @Test
    public void testSetShowTimingCollection() {
        System.out.println("setShowTimingCollection");
        Collection<ShowTiming> showTimingCollection = null;
        Theater instance = new Theater();
        instance.setShowTimingCollection(showTimingCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Theater.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Theater instance = new Theater();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Theater.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Theater instance = new Theater();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Theater.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Theater instance = new Theater();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
