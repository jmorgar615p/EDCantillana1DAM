package org.concesionario.taller;

import junit.framework.TestCase;

public class CocheTest extends TestCase {
	public void testCoche() {
		MarcaCoche c1 = new MarcaCoche("Audi");
		assertEquals("Audi",c1.nombremarca);
		assertEquals("Vendedor Desconocido", c1.vendedor);
	}
	
	public void testGetVendedor() {
		MarcaCoche c2 = new MarcaCoche("Audi");
		Vendedor v2 = new Vendedor();
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
