package test.miconcesionario;

import junit.framework.Test;

import junit.framework.TestSuite;

/**
 * Clase que contiene los tests unitarios para las clases Coche, Vendedor y
 * Concesionario.
 */
public class AllTests {

    /**
     * Método que devuelve un conjunto de tests unitarios.
     *
     * @return Conjunto de tests unitarios.
     */
    public static Test suite() {
        TestSuite suite = new TestSuite(AllTests.class.getName());

        // Agregar los tests unitarios para la clase Coche
        suite.addTestSuite(CocheTest.class);

        // Agregar los tests unitarios para la clase Vendedor
        suite.addTestSuite(VendedorTest.class);

        // Agregar los tests unitarios para la clase Concesionario
        suite.addTestSuite(ConcesionarioTest.class);

        return suite;
    }
}
