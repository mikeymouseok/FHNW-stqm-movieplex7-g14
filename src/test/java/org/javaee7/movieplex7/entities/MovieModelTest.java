package org.javaee7.movieplex7.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

import org.javaee7.movieplex7.entities.Movie;

public class MovieModelTest {

    Movie m1;
    Movie m2;
    
	@Before
	public void setUp() {
		m1 = new Movie();
		m2 = new Movie();
	}
        


	@Test
	public void testSetName() {
                String titel = "the Movie2";
		m1.setName(titel);
		assertTrue("set and get the titel of the move", (m1.getName()
				).equals(titel));
	}

	@Test
	public void testSetAktors() {
                String aktor = "Mikel jordan";
		m1.setActors(aktor);
		assertTrue("set and get the aktors of the move", (m1.getActors()
				).equals(aktor));
//		try {
//			m.setFigureIndex(f, 0);
//			fail("IllegalArgumentException expected");
//		} catch (IllegalArgumentException e) {
//			// ok
//		} catch (Exception e) {
//			fail("IllegalArgumentException expected");
//		}
	}

//	@Test
//	public void testSetFigureIndex3() {
//            m1.setShowTimingCollection(null);
//            m1.getShowTimingCollection();
//            
//		Figure f1 = new TestFigure();
//		Figure f2 = new TestFigure();
//		m.addFigure(f1);
//		m.addFigure(f2);
//		m.setFigureIndex(f2, 0);
//		m.setFigureIndex(f2, 1);
//		try {
//			m.setFigureIndex(f2, 2);
//			fail("IndexOutOfBoundsException expected");
//		} catch (IndexOutOfBoundsException e) {
//			// ok
//		} catch (Exception e) {
//			fail("IndexOutOfBoundsException expected");
//		}
//	}

}
