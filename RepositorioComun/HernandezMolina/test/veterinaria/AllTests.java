package veterinaria;

import junit.framework.Test;
/**
 * clase que se encarga de controlar el funcionamiento de todos los test
 * @author Roberto
 * @version 1.0
 */
import junit.framework.TestSuite;

public class AllTests {

	/**
	 * test que comprueba el funcionamiento de los demas test
	 * @return
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(AnimalTest.class);
		suite.addTestSuite(TrabajadorTest.class);
		suite.addTestSuite(MiVeterinariaTest.class);
		//$JUnit-END$
		return suite;
	}

}
