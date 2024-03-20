package festivalmusica;

import junit.framework.TestCase;

/**
 * Clase que se encarga de los tests de la clase Entrada.
 * @author Joaquin Bullon Gonzalez
 * @version 1.0 19/03/2024
 */
public class EntradaTest extends TestCase {

	/**
	 * Metodo que prueba la creacion de una entrada de tipo Simple y cantidad 2.
	 */
	public void testEntrada() {
		int cantidad = 2;
		Entrada e1 = new Entrada("Simple",cantidad);
		assertEquals("Simple", e1.tipo);
		assertEquals(2, e1.cantidad);
	}
	
	/**
	 * Metodo que prueba el metodo SetArtista().
	 */
	public void testSetArtista() {
		Entrada e2 = new Entrada("Doble",1);
		Artista a1 = new Artista("John");
		
		e2.setArtista(a1);
		
		String temporal = e2.artista.getNombre();
		
		assertEquals("John", temporal);
	}
}
