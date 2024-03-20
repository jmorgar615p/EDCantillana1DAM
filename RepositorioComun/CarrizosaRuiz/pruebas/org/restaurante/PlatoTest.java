package pruebas.org.restaurante;

import junit.framework.TestCase;
import src.org.restaurante.Plato;

public class PlatoTest extends TestCase {

	public void testPlato() {
			Plato v1 = new Plato();
			assertEquals("Nombre desconocido", v1.getNombrePlato());
			assertEquals(3, v1.getVendedor());
		}
	
	public void testSetPlatoNombre() {
		Plato v2 = new Plato();
		v2.setNombrePlato("Puchero");
		assertEquals("Puchero", v2.getNombrePlato());
	}		
	
	public void testSetPlatosMaximos() {
		Plato v3 = new Plato();
		v3.setMaximosPlatos (10);
		assertEquals (10, v3.getMaximosPlatos());
	}
	
	public void testToString () {
		Plato v4 = new Plato ();
		v4.setNombrePlato("Plato de puchero");
		v4.setMaximosPlatos(7);
		String testString = "7 plato de puchero";
		assertEquals (testString, v4.toString());
	}
}
