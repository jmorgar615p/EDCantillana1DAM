package pruebaUnitaria;

import java.util.ArrayList;

import junit.framework.TestCase;

public class miInstitutoTest extends TestCase {

	//constructor test
	
	public void testMiInstituto() {
		MiInstituto instituto1 = new MiInstituto("Prueba");
		
		assertEquals("Prueba", instituto1.nombre);
		
		assertTrue(instituto1.alumno instanceof ArrayList);
		assertTrue(instituto1.maestro instanceof ArrayList);
	}
}
