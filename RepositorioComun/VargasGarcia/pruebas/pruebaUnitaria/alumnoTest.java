package pruebaUnitaria;

import junit.framework.TestCase;

public class alumnoTest extends TestCase {

	public void testAlumno() {
		alumno alumno1 = new alumno("Francisco");
		assertEquals("Francisco", alumno1.nombre);
		assertEquals("null", alumno1.apellido);
	}
	public void testGetNombre() {
		alumno alumno2 = new alumno("Roberto");
		maestro maestro2 = new maestro();
		maestro2.setNombre("Antonio");
		
		//metodo para decir que un alumno recibe clases de un profesor
		alumno2.setMaestro(maestro2);
		
		//consigue el nombre del maestor que le da clases
		maestro testMaestro = alumno2.getMaestro();
		String  testNombre = testMaestro.getNombre();
		
		assertEquals("Antonio", testNombre);
	}
	
}
