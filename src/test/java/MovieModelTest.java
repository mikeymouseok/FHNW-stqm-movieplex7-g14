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

	}



}
