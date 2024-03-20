package festivalmusica;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Clase que contiene el conjunto de pruebas del proyecto.
 * @author Joaquin Bullon Gonzalez
 * @version 1.0 19/03/2024
 */
public class AllTests {

	/**
	 * Metodo que devuelve el conjunto de pruebas a ejecutar.
	 * @return Devuelve el conjunto de pruebas a ejecutar.
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(ArtistaTest.class);
		suite.addTestSuite(EntradaTest.class);
		suite.addTestSuite(FestivalTest.class);
		//$JUnit-END$
		return suite;
	}

}
