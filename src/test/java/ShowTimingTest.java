/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.javaee7.movieplex7.entities.Movie;
import org.javaee7.movieplex7.entities.ShowTiming;
import org.javaee7.movieplex7.entities.Theater;
import org.javaee7.movieplex7.entities.Timeslot;
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
public class ShowTimingTest {
    
    public ShowTimingTest() {
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
     * Test of getId method, of class ShowTiming.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ShowTiming instance = new ShowTiming();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ShowTiming.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        ShowTiming instance = new ShowTiming();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDay method, of class ShowTiming.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        ShowTiming instance = new ShowTiming();
        int expResult = 0;
        int result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDay method, of class ShowTiming.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        int day = 0;
        ShowTiming instance = new ShowTiming();
        instance.setDay(day);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimingId method, of class ShowTiming.
     */
    @Test
    public void testGetTimingId() {
        System.out.println("getTimingId");
        ShowTiming instance = new ShowTiming();
        Timeslot expResult = null;
        Timeslot result = instance.getTimingId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimingId method, of class ShowTiming.
     */
    @Test
    public void testSetTimingId() {
        System.out.println("setTimingId");
        Timeslot timingId = null;
        ShowTiming instance = new ShowTiming();
        instance.setTimingId(timingId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTheaterId method, of class ShowTiming.
     */
    @Test
    public void testGetTheaterId() {
        System.out.println("getTheaterId");
        ShowTiming instance = new ShowTiming();
        Theater expResult = null;
        Theater result = instance.getTheaterId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTheaterId method, of class ShowTiming.
     */
    @Test
    public void testSetTheaterId() {
        System.out.println("setTheaterId");
        Theater theaterId = null;
        ShowTiming instance = new ShowTiming();
        instance.setTheaterId(theaterId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovieId method, of class ShowTiming.
     */
    @Test
    public void testGetMovieId() {
        System.out.println("getMovieId");
        ShowTiming instance = new ShowTiming();
        Movie expResult = null;
        Movie result = instance.getMovieId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMovieId method, of class ShowTiming.
     */
    @Test
    public void testSetMovieId() {
        System.out.println("setMovieId");
        Movie movieId = null;
        ShowTiming instance = new ShowTiming();
        instance.setMovieId(movieId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class ShowTiming.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        ShowTiming instance = new ShowTiming();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ShowTiming.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        ShowTiming instance = new ShowTiming();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ShowTiming.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ShowTiming instance = new ShowTiming();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
