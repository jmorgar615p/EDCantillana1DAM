package pruebaUnitaria;

import junit.framework.TestCase;

public class maestroTest extends TestCase {
/** 
 * Clase que prueba con test la clase Maestro
 * @author Lucia Vargas
 * @version 1.0 12/03/2024
 */

	
	/**
	 * Constructores de test
	 * @param void {@link void} no espera que le demos ningun parametro 
	 */
	public void testMaestro() {
		Maestro maestro1 = new Maestro();
		assertEquals("null", maestro1.getNombre());
		assertEquals(30, maestro1.getMaximoAlumnos());
	}

	public void testSetNombre() {
		Maestro maestro2 = new Maestro();
		maestro2.setNombre("Antonio");
		assertEquals("Antonio", maestro2.getNombre());
	}

	public void testSetMaximoAlumnos() {
		Maestro maestro3 = new Maestro();
		maestro3.setMaximoAlumnos(30);
		assertEquals(30, maestro3.getMaximoAlumnos());
	}
	
	public void testToString() {
		Maestro maestro4 = new Maestro();
		maestro4.setNombre("Felipe Perez");
		maestro4.setMaximoAlumnos(20);
		String testString = "Felipe Perez (20 alumnos)";
		assertEquals(testString, maestro4.toString());
	}

}
