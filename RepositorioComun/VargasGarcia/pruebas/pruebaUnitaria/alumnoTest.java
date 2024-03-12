package pruebaUnitaria;

import junit.framework.TestCase;

public class alumnoTest extends TestCase {
	
/** 
 * Clase que prueba con test la clase Alumno
 * @author Lucia Vargas
 * @version 1.0 12/03/2024
 */	

	
	/**
	 * Constructores de test
	 * @param void {@link void} no espera que le demos ningun parametro 
	 */
	public void testAlumno() {
		Alumno alumno1 = new Alumno("Francisco");
		assertEquals("Francisco", alumno1.nombre);
		assertEquals("null", alumno1.apellido);
	}
	public void testGetNombre() {
		Alumno alumno2 = new Alumno("Roberto");
		Maestro maestro2 = new Maestro();
		maestro2.setNombre("Antonio");
		
		//metodo para decir que un alumno recibe clases de un profesor
		alumno2.setMaestro(maestro2);
		
		//consigue el nombre del maestor que le da clases
		Maestro testMaestro = alumno2.getMaestro();
		String  testNombre = testMaestro.getNombre();
		
		assertEquals("Antonio", testNombre);
	}
	
}
