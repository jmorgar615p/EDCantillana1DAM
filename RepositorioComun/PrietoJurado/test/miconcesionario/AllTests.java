package test.miconcesionario;

import junit.framework.Test;
import junit.framework.TestSuite;

/*
* Clase que contiene el conjunto de pruebas para la aplicación de taller de concesionario.
* 
* @author Rubén Prieto Jurado
*/
public class AllTests {

	/**
	  * Método que devuelve el conjunto de pruebas a ejecutar.
	  * 
	  * @return devuelve el conjunto de pruebas a ejecutar
	  */
	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(CocheTest.class);
		suite.addTestSuite(VendedorTest.class);
		//$JUnit-END$
		return suite;
	}

}
