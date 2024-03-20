package programatelevision;

import junit.framework.TestCase;

public class ProgrmasTVTest extends TestCase {
	public void testTemas() {
		ProgrmasTVT g1 = new ProgrmasTVT("GG","Tertulia");
		assertEquals("GG", g1.tema);
		assertEquals("Tertulia", g1.genero);
	}
	
	public void testSetTema() {
		ProgrmasTVT g2 = new ProgrmasTVT("Tertulia", null);
		g2.setTema("Tertulia");
		assertEquals("Tertulia", g2.getTema());
	}
	
	public void testSetGenero() {
		ProgrmasTVT g3 = new ProgrmasTVT("Tertulia", null);
		g3.setGenero("Tertulia");
		assertEquals("Tertulia", g3.getGenero());
	}
	
}
