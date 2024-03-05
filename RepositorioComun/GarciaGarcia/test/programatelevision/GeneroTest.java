package programatelevision;

import junit.framework.TestCase;

public class GeneroTest extends TestCase {
	
	public void testGenero() {
		Genero g1 = new Genero("Tertulia", 3);
		assertEquals("Tertulia", g1.nombre);
		assertEquals(3, g1.maximoTemas);
	}
	
	public void testSetNombre() {
		Genero g2 = new Genero("Drama",3);
		g2.setNombre("Cocina");
		assertEquals("Cocina", g2.getNombre());
	}
	
	public void testSetMaximoTemas() {
		Genero g3 = new Genero("Drama",3);
		g3.setMaximoTemas("Cocina");
		assertEquals("Cocina", g3.getMaximoTemas());
	}
}
