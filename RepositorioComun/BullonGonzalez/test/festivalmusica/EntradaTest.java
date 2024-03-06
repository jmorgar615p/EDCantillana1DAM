package festivalmusica;

import junit.framework.TestCase;

public class EntradaTest extends TestCase {

	public void testEntrada() {
		int cantidad = 2;
		Entrada e1 = new Entrada("Simple",cantidad);
		assertEquals("Simple", e1.tipo);
		assertEquals(2, e1.cantidad);
	}
	
	public void testSetArtista() {
		Entrada e2 = new Entrada("Doble",1);
		Artista a1 = new Artista("John");
		
		e2.setArtista(a1);
		
		String temporal = e2.artista.getNombre();
		
		assertEquals("John", temporal);
	}
}
