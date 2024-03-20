package festivalmusica;

import java.util.ArrayList;

import junit.framework.TestCase;

/**
 * Clase que se encarga de los tests de la clase Festival.
 * @author Joaquin Bullon Gonzalez
 * @version 1.0 19/03/2024
 */
public class FestivalTest extends TestCase {
	
	/**
	 * Variable de la clase FestivalTest
	 * e1 - almacena una entrada.
	 */
	private Entrada e1;
	/**
	 * Variable de la clase FestivalTest
	 * e2 - almacena una entrada.
	 */
	private Entrada e2;
	/**
	 * Variable de la clase FestivalTest
	 * a1 - almacena un artista.
	 */
	private Artista a1;
	/**
	 * Variable de la clase FestivalTest
	 * a2 - almacena un artista.
	 */
	private Artista a2;
	/**
	 * Variable de la clase FestivalTest
	 * f - almacena un festival.
	 */
	private Festival f;

	/**
	 * Metodo que prueba la creacion de un festival con nombre Benidorm.
	 */
	public void testFestival() {
		Festival f1 = new Festival("Benidorm");
		
		assertEquals("Benidorm", f1.nombre);
		assertTrue(f1.entradas instanceof ArrayList);
		assertTrue(f1.artistas instanceof ArrayList);
	}
	
	/**
	 * Metodo que le proporciona valores a las variables de la clase.
	 */
	public void configuracionPrueba() {
		e1 = new Entrada("Simple",5);
		e2 = new Entrada("Doble", 6);
		a1 = new Artista("Frank");
		a2 = new Artista("Elton");
		
		f = new Festival("Eurovision");
	}
	
	/**
	 * Metodo que prueba el metodo addEntrada().
	 */
	public void testAddEntrada() {
		
		configuracionPrueba();
		
		assertEquals(0, f.getEntradas().size());
		
		f.addEntrada(e1);
		f.addEntrada(e2);
		
		assertEquals(2, f.getEntradas().size());
		assertEquals(0, f.getEntradas().indexOf(e1));
		assertEquals(1, f.getEntradas().indexOf(e2));
		
		f.removeEntrada(e1);
		assertEquals(1, f.getEntradas().size());
		assertEquals(0, f.getEntradas().indexOf(e2));
		
		f.removeEntrada(e2);
		assertEquals(0, f.getEntradas().size());
	}
	
	/**
	 * Metodo que añade las entradas y artistas a sus correspondientes arrays dentro del festival f.
	 */
	public void addObjetos() {
		f.addEntrada(e1);
		f.addEntrada(e2);
		f.addArtista(a1);
		f.addArtista(a2);
	}
	
	/**
	 * Metodo que prueba los metodos asignar() y desasignar().
	 */
	public void testAsignar() {
		
		configuracionPrueba();
		addObjetos();
		
		assertTrue("La entrada no se ha asignado correctamente", f.asignar(e1,a1));
		
		assertEquals("Frank", e1.getArtista().getNombre());
		
		assertFalse("La entrada ya fue asignada", f.asignar(e1,a2));
		
		assertTrue("Desasignación de entrada fallida", f.desasignar(e1));
		
		assertFalse("La entrada ya ha sido desasignada", f.desasignar(e1));
		
		assertFalse("La entrada no ha sido asignada", f.desasignar(e2));
	}
}
