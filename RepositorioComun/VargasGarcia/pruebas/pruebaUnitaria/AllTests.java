package pruebaUnitaria;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
/** 
 * Clase que prueba todos los test
 * @author Lucia Vargas
 * @version 1.0 12/03/2024
 */

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(alumnoTest.class);
		suite.addTestSuite(maestroTest.class);
		suite.addTestSuite(miInstitutoTest.class);
		//$JUnit-END$
		return suite;
	}

}
