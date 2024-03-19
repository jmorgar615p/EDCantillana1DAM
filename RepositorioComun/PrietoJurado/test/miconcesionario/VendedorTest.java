package test.miconcesionario;

import junit.framework.TestCase;
import src.miconcesionario.Vendedor;

/**
 * Clase de prueba para la clase Vendedor.
 */
public class VendedorTest extends TestCase {

    /**
     * Prueba el constructor por defecto de la clase Vendedor.
     */
    public void testVendedor() {
        Vendedor v1 = new Vendedor();
        assertEquals("Nombre Desconocido", v1.getNombre());
        assertEquals(3, v1.getCochesVendidos());
    }

    /**
     * Prueba el método setNombre de la clase Vendedor.
     */
    public void testSetNombre() {
        Vendedor v2 = new Vendedor();
        v2.setNombre("Fred");
        assertEquals("Fred", v2.getNombre());
    }

    /**
     * Prueba el método setCochesVendidos de la clase Vendedor.
     */
    public void testSetCochesVendidos() {
        Vendedor v3 = new Vendedor();
        v3.setCochesVendidos(10);
        assertEquals(10, v3.getCochesVendidos());
    }

    /**
     * Prueba el método toString de la clase Vendedor.
     */
    public void testToString() {
        Vendedor v4 = new Vendedor();
        v4.setNombre("Alfredo Gonzalez");
        v4.setCochesVendidos(8);
        String testString = "Alfredo Gonzalez (8 coches)";
        assertEquals(testString, v4.toString());
    }
}
