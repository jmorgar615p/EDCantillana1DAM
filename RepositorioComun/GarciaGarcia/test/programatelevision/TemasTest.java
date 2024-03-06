package programatelevision;

import junit.framework.TestCase;

public class TemasTest extends TestCase {
	public void testTemas() {
		Temas g1 = new Temas("GG","Pepe");
		assertEquals("GG", g1.nombre);
		assertEquals("Pepe", g1.autor);
	}
	
	public void testSetNombre() {
		Temas g2 = new Temas("Drama","Manue");
		g2.setNombre("Cocina");
		assertEquals("Cocina", g2.getNombre());
	}
	
	public void testSetAuthor() {
		Temas g3 = new Temas("Drama","Marcelo");
		g3.setAuthor("Cocina");
		assertEquals("Cocina", g3.getAuthor());
	}
	
	public void testSetGenero() {
		Temas g4 = new Temas("Accion","Marika");
		Genero t1 = new Genero("Comedia",5);
		g4.setGenero(t1);
		assertEquals(t1, g4.genero);
	}
}
