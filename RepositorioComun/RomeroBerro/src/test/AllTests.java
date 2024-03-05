package test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(IngresoTest.class);
		suite.addTestSuite(MedicoTest.class);
		suite.addTestSuite(PacienteTest.class);
		//$JUnit-END$
		return suite;
	}

}
