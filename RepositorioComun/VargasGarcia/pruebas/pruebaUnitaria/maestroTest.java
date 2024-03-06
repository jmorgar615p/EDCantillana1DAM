package pruebaUnitaria;

import junit.framework.TestCase;

public class maestroTest extends TestCase {

	public void testMaestro() {
		maestro maestro1 = new maestro();
		assertEquals("null", maestro1.getNombre());
		assertEquals(30, maestro1.getMaximoAlumnos());
	}

	public void testSetNombre() {
		maestro maestro2 = new maestro();
		maestro2.setNombre("Antonio");
		assertEquals("Antonio", maestro2.getNombre());
	}

	public void testSetMaximoAlumnos() {
		maestro maestro3 = new maestro();
		maestro3.setMaximoAlumnos(30);
		assertEquals(30, maestro3.getMaximoAlumnos());
	}
	
	public void testToString() {
		maestro maestro4 = new maestro();
		maestro4.setNombre("Felipe Perez");
		maestro4.setMaximoAlumnos(20);
		String testString = "Felipe Perez (20 alumnos)";
		assertEquals(testString, maestro4.toString());
	}

}
