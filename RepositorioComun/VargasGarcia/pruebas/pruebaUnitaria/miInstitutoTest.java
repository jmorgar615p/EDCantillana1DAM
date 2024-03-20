package pruebaUnitaria;

import java.util.ArrayList;

import junit.framework.TestCase;

public class miInstitutoTest extends TestCase {
/** 
 * Clase que prueba con test la clase MiInstituto 
 * @author Lucia Vargas
 * @version 1.0 12/03/2024
 */
	
	/**
	 * Atributos privados
	 */
	
	private Alumno a1;
	private Alumno a2;
	private Maestro m1;
	private Maestro m2;
	private MiInstituto mI;

	/**
	 * Constructores de test
	 * @param void {@link void} no espera que le demos ningun parametro 
	 */
	
	public void testMiInstituto() {
		MiInstituto instituto1 = new MiInstituto("Prueba");
		
		assertEquals("Prueba", instituto1.nombre);
		
		assertTrue(instituto1.alumno instanceof ArrayList);
		assertTrue(instituto1.maestro instanceof ArrayList);
	}

	public void setup() {
		//Creamos los objetos
		a1 = new Alumno("Alumno1");
		a2 = new Alumno("Alumno2");
		m1 = new Maestro();
		m2 = new Maestro();
		m1.setNombre("Antonio");
		m2.setNombre("Carlos");
		
		mI = new MiInstituto("test");
	}
	
	public void testAnadirAlumno() {
		//Creamos los objetos del test
		setup();
		
		//el tamaño inicial de la prueba es 0
		assertEquals(0, mI.getAlumno().size());
		
		mI.anadirAlumno(a1);
		mI.anadirAlumno(a2);
		
		assertEquals(2, mI.getAlumno().size());
		assertEquals(0, mI.getAlumno().indexOf(a1));
		assertEquals(1, mI.getAlumno().indexOf(a2));
		
		mI.eliminaAlumno(a1);
		assertEquals(1, mI.getAlumno().size());
		assertEquals(0, mI.getAlumno().indexOf(a2));
		
		mI.eliminaAlumno(a2);
		assertEquals(0, mI.getAlumno().size());
	}
		
		public void testExpulsado() {
			//objetos
			setup();
			
			anadirItems();
			
			assertTrue("El alumno no se expulsó correctamente",
			mI.expulsado(a1,m1));
			
			assertEquals("Antonio", a1.getMaestro().getNombre());	
			
			assertFalse("El alumno se expulsó correctamente",
			mI.expulsado(a1,m2));
			
			assertTrue("Error en la matriculación del alumno", mI.matriculado(a1));
			
			assertFalse("El alumno ya estaba matriculado", mI.matriculado(a1));
			
			assertFalse("El alumno nunca fue matriculado", mI.matriculado(a2));
	
			//prueba adicional para alumnos máximos
			setup();
			m1.setMaximoAlumnos(1);
			
			anadirItems();
		
			assertTrue("El primer alumno no se expulsó", mI.expulsado(a2,m1));
			assertFalse("El segundo alumno no debería ser expulsado", mI.expulsado(a1, m1));
		}

		private void anadirItems() {
			mI.anadirAlumno(a1);
			mI.anadirAlumno(a2);
			mI.anadirMaestro(m1);
			mI.anadirMaestro(m2);
		}

	
		public void testGetAlumnosPorMaestro() {
			setup();
			anadirItems();
			assertEquals(0, mI.getAlumnosPorMaestro(m1).size());
			
			mI.expulsado(a1, m1);
			
			ArrayList<Alumno> testAlumno = mI.getAlumnosPorMaestro(m1);
			assertEquals(1, testAlumno.size());
			assertEquals(0, testAlumno.indexOf(a1));
			
			mI.expulsado(a2, m1);
			
			testAlumno = mI.getAlumnosPorMaestro(m1);
			assertEquals(2, testAlumno.size());
			assertEquals(1, testAlumno.indexOf(a2));
			
			
			
		}
	
}

