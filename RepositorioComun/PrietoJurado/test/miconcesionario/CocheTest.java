package test.miconcesionario;

import junit.framework.TestCase;
import src.miconcesionario.InterfazMarcaCoche;
import src.miconcesionario.Interfaz_Vendedor;
import src.miconcesionario.MarcaCoche;
import src.miconcesionario.Vendedor;

/**
 * Clase de prueba para el modelo Coche.
 *
 * @author Rubén Prieto Jurado
 */
public class CocheTest extends TestCase {
	/**
     * Prueba la creación de un coche con marca y vendedor.
     */
	public void testCoche() {
		MarcaCoche c1 = new MarcaCoche("Audi");
		assertEquals("Audi",c1.nombremarca);
		assertEquals("Vendedor Desconocido", c1.vendedor);
	}
	
	/**
     * Prueba el método getNombre() para obtener el nombre del vendedor de una marca.
     */
	public void testGetVendedor() {
		InterfazMarcaCoche c2 = new MarcaCoche("Audi");
		Interfaz_Vendedor v2 = new Vendedor();
		v2.setNombre("Javier");
		
		//Metodo para decir que esta marca la vende un vendedor concreto
		c2.setNombre(v2);
		
		//Conseguir el nombre de la persona que vende esa marca
		//Vendedor testVendedor = c2.getNombre();
		//String testName = testVendedor.getNombre();
		String testName = c2.getNombre().getNombre();
		assertEquals("Javier", testName);
	}
}
