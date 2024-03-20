package pruebas.org.restaurante;

import junit.framework.TestCase;
import src.org.restaurante.Restaurante;

public class RestauranteTest extends TestCase {
	
	public void testRestaurante() {
		Restaurante v1= new Restaurante();
		assertEquals("Nombre Desconocido", v1.getNombreRestaurante());
		assertEquals(5, v1.getPlatosVendidos());
	}
	
	public void testSetNombreRestaurante() {
		Restaurante v2 = new Restaurante();
		v2.setNombreRestaurante("Alberto");
		assertEquals("Alberto", v2.getNombreRestaurante());
	}
	
	public void testSetPlatosVendidos() {
		Restaurante v3 = new Restaurante();
		v3.setPlatosVendidos(10);
		assertEquals(10, v3.getPlatosVendidos());
	}
	
	public void testToString () {
		Restaurante v4 = new Restaurante();
		v4.setNombreRestaurante("Alberto Chicote");
		v4.setPlatosVendidos(8);
		String testString = "Alberto Chicote (8 platos)";
		assertEquals(testString, v4.toString());
	}
	
}
