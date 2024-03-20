package trabajoTest;

import junit.framework.TestCase;
import trabajo.Oscar;

public class OscarTest extends TestCase {

	/**
	 * Creamos el test para el constructor "Oscar" y comprobar que funciona
	 * correctamente y crea el objeto.
	 */
	public void testOscar() {
		Oscar o1 = new Oscar ("Pablo Motos");
		assertEquals("Pablo Motos", o1.getNombre());
		
		}
	
	/**
	 * Creamos test para los getter y los setter, en el que comprobamos que 
	 * funcionan correctamente
	 */
	public void testSetNombre() {
		Oscar o2 = new Oscar("Carlos");
		assertEquals("Carlos", o2.getNombre());
	}
	
	public void testGetNombre() {
		Oscar o3 = new Oscar("Mike");
		o3.setNombre("Jhonny Deep");
		assertEquals("Jhonny Deep", o3.getNombre());
	}
	
}
