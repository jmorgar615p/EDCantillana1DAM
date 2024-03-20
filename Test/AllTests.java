package Test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		
		suite.addTestSuite(NumEstanteriaTest.class);
		suite.addTestSuite(ProvedoresTest.class);
		
		return suite;
	}

}
