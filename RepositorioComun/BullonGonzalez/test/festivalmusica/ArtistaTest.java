package festivalmusica;

import junit.framework.TestCase;

public class ArtistaTest extends TestCase {
	
	public void testArtista() {
		Artista a1 = new Artista("Amy");
		assertEquals("Amy", a1.nombre);
		assertEquals(1000, a1.maximoEntradas);
	}

	public void testSetNombre() {
		Artista a2 = new Artista("Amy");
		a2.setNombre("Michael");
		assertEquals("Michael", a2.getNombre());
	}
	
	public void testSetMaximoEntradas() {
		Artista a3 = new Artista("David");
		a3.setMaximoEntradas(15000);
		assertEquals(15000, a3.getMaximoEntradas());
	}
}
