package pruebaUnitaria;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(alumnoTest.class);
		suite.addTestSuite(maestroTest.class);
		//$JUnit-END$
		return suite;
	}

}
