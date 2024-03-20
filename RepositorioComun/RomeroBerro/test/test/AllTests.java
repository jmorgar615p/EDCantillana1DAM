package test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Clase que representa un conjunto de pruebas unitarias para todas las clases
 * relacionadas con el sistema de ingreso.
 */
public class AllTests extends TestCase {

	/**
	 * Método estático que construye y devuelve un conjunto de pruebas unitarias.
	 * 
	 * @return Un conjunto de pruebas unitarias que abarcan las clases IngresoTest,
	 *         MedicoTest y PacienteTest.
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		// $JUnit-BEGIN$
		suite.addTestSuite(IngresoTest.class);
		suite.addTestSuite(MedicoTest.class);
		suite.addTestSuite(PacienteTest.class);
		// $JUnit-END$
		return suite;
	}

}
