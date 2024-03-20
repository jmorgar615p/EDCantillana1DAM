package veterinaria;

import junit.framework.TestCase;

/**
 * clase que se encarga de controlar el funcionamiento del test MiVeterinaria
 * @author Roberto
 * @version 1.0
 */

public class TrabajadorTest extends TestCase {

	/**
	 * test Trabajador
	 */
	public void testTrabajador() {
		Trabajador p1 = new Trabajador();
		assertEquals("Sin identificar", p1.getNombre());
		assertEquals(3, p1.getMaximoAnimales());
	}

	/**
	 * test Establecer nombre
	 */
	public void testSetNombre() {
		Trabajador p2 = new Trabajador();
		p2.setNombre("Manolo");
		assertEquals("Manolo", p2.getNombre());
		}

	/**
	 * test de establecer maximo de animales
	 */
	public void testSetMaximoAnimales() {
		Trabajador p3 = new Trabajador();
		p3.setMaximoAnimales(10);
		assertEquals(10, p3.getMaximoAnimales());
	}
	
	/**
	 * Test toString
	 */
	public void testToString() {
		Trabajador p4 = new Trabajador();
		p4.setNombre("Manolo Lama");
		p4.setMaximoAnimales(7);
		String testString = "Manolo Lama (7 Animales)";
		assertEquals(testString, p4.toString());
	}

}
