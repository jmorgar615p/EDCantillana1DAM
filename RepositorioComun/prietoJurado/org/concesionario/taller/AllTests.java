package org.concesionario.taller;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(CocheTest.class);
		suite.addTestSuite(VendedorTest.class);
		//$JUnit-END$
		return suite;
	}

}
