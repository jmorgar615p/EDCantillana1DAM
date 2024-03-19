package org.restaurante;

import junit.framework.TestCase;

public class PlatoTest extends TestCase {

	public void testPlato() {
			Plato v1 = new Plato();
			assertEquals("Nombre desconocido", v1.getNombrePlato());
			assertEquals(2, v1.getVendedor());
		}
	
	public void testSetPlatoNombre() {
		Plato v2 = new Plato();
		v2.setNombrePlato("Puchero");
		assertEquals("Puchero", v2.getNombrePlato());
	}						
}
