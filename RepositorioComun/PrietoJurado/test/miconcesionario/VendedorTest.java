package test.miconcesionario;

import junit.framework.TestCase;
import src.miconcesionario.Interfaz_Vendedor;
import src.miconcesionario.Vendedor;

/**
* Clase de prueba para el objeto Vendedor.
* @author Rubén Prieto Jurado
*/
public class VendedorTest extends TestCase {
	/**
	  * Prueba básica del comportamiento de la clase Vendedor.
	  */
	public void testVendedor() {
		Interfaz_Vendedor v1 = new Vendedor();
		assertEquals("Nombre Desconocido", v1.getNombre());
		assertEquals(3, v1.getCochesVendidos());
	}

	/**
	  * Prueba del método setNombre de la clase Vendedor.
	  */
	public void testSetNombre() {
		Interfaz_Vendedor v2 = new Vendedor();
		v2.setNombre("Fred");
		assertEquals("Fred", v2.getNombre());
	}

	/**
	  * Prueba del método setCochesVendidos de la clase Vendedor.
	  */
	public void testSetCochesVendidos() {
		Interfaz_Vendedor v3 = new Vendedor();
		v3.setCochesVendidos(10);
		assertEquals(10, v3.getCochesVendidos());
	}

	/**
	  * Prueba del método toString de la clase Vendedor.
	  */
	public void testToString() {
		Interfaz_Vendedor v4 = new Vendedor();
		v4.setNombre("Alfredo Gonzalez");
		v4.setCochesVendidos(8);
		String testString = "Alfredo Gonzalez (8 coches)";
		assertEquals(testString, v4.toString());
	}
}
