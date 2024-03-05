package org.concesionario.taller;

import java.util.ArrayList;

import junit.framework.TestCase;



public class ConcesionarioTest extends TestCase {
		private MarcaCoche c1;
		private MarcaCoche c2;
		private Vendedor v1;
		private Vendedor v2;
		private MiConcesionario mc;

	//Prueba Constructor
	public void testMiConcesionario() {
		MiConcesionario mc = new MiConcesionario("Prueba");
		
		assertEquals("Prueba", mc.nombre);
		
		assertTrue(mc.marca instanceof ArrayList);
		assertTrue(mc.vendedor instanceof ArrayList);
}
	
	public void configuracion() {
		c1 = new MarcaCoche("Audi");
		c2 = new MarcaCoche("Mercedes Benz");
		v1 = new Vendedor();
		v2 = new Vendedor();
		v1.setNombre("Alfredo");
		v2.setNombre("Javier");
		
		mc = new MiConcesionario("Prueba");
	}
	
	public void testAddMarca() {
		//Crear objetos de prueba
		configuracion();
		
		//Nº de marcas de la prueba inicial es 0.
		assertEquals(0, mc.getMarca().size());
		
		mc.addMarca(c1);
		mc.addMarca(c2);
		
		assertEquals(2, mc.getMarca().size());
		assertEquals(0, mc.getMarca().indexOf(c1));
		assertEquals(1, mc.getMarca().indexOf(c2));
		
		mc.removeMarca(c1);
		assertEquals(1, mc.getMarca().size());
		assertEquals(0, mc.getMarca().indexOf(c2));
		
		mc.removeMarca(c2);
		assertEquals(0, mc.getMarca().size());
	}
}