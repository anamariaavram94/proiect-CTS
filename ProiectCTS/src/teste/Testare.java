package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import design_patterns.Film;
import design_patterns.Loc;

public class Testare {

	@Test
	public void testCalculNotaFilm() {
		Film F1 = new Film();
		assertEquals(10, F1.calculNota(10, 10, 10), 0.1);
		assertEquals(7.5, F1.calculNota(6.33, 9, 7.25), 0.1);
	}
	
	@Test
	public void testDisponibilitateLoc() {
		Loc L1 = new Loc();
		int locuri[] = new int[30];
		assertTrue(L1.disponibilitateLoc(8, locuri));
		assertFalse(L1.disponibilitateLoc(8, locuri));
	}
	
	@Test
	public void testDisponibilitateLocNegativ() {
		Loc L2 = new Loc();
		int locuri[] = new int[30];
		try {
			boolean rez = L2.disponibilitateLoc(-3, locuri);
			fail("Eroare!");
		} catch(Exception e) {
		}
	}
	
	@Test
	public void testDisponibilitateLocZero() {
		Loc L3 = new Loc();
		int locuri[] = new int[30];
		try {
			boolean rez = L3.disponibilitateLoc(0, locuri);
			fail("Eroare!");
		} catch(Exception e) {
		}
	}
	
	@Test
	public void testDisponibilitateLocPesteCapacitate() {
		Loc L4 = new Loc();
		int locuri[] = new int[30];
		try {
			boolean rez = L4.disponibilitateLoc(40, locuri);
			fail("Eroare!");
		} catch(Exception e) {
		}
	}

	
}
