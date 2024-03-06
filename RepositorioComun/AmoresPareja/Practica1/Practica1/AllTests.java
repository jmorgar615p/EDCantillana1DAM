package practica1;

import junit.framework.Test;
import junit.framework.TestSuite;
import principiante.LibroTest;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(LibroTest.class);
		//$JUnit-END$
		return suite;
	}

}
