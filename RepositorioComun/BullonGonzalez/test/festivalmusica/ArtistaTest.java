package festivalmusica;

import junit.framework.TestCase;

/**
 * Clase que se encarga de los tests de la clase Artista.
 * @author Joaquin Bullon Gonzalez
 * @version 1.0 19/03/2024
 */
public class ArtistaTest extends TestCase {
	
	/**
	 * Metodo que prueba la creacion de un artista con nombre Amy.
	 */
	public void testArtista() {
		Artista a1 = new Artista("Amy");
		assertEquals("Amy", a1.nombre);
		assertEquals(1000, a1.maximoEntradas);
	}

	/**
	 * Metodo que prueba el metodo getNombre().
	 */
	public void testSetNombre() {
		Artista a2 = new Artista("Amy");
		a2.setNombre("Michael");
		assertEquals("Michael", a2.getNombre());
	}
	
	/**
	 * Metodo que prueba el metodo getMaximoEntradas().
	 */
	public void testSetMaximoEntradas() {
		Artista a3 = new Artista("David");
		a3.setMaximoEntradas(15000);
		assertEquals(15000, a3.getMaximoEntradas());
	}
}
