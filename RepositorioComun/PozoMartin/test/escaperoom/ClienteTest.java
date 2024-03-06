package escaperoom;

import junit.framework.TestCase;

public class ClienteTest extends TestCase {

	public void testCliente() {
		Cliente cl1 = new Cliente();
		assertEquals("nombre desconocido", cl1.getNombre());
		assertEquals(3, cl1.getMaximoReservas());
	}

	public void testSetNombre() {
		Cliente cl2 = new Cliente();
		cl2.setNombre("Laura");
		assertEquals("Laura", cl2.getNombre());	
	}

	public void testSetMaximoReservas() {
		Cliente cl3 = new Cliente();
		cl3.setMaximoReservas(3);
		assertEquals(3, cl3.getMaximoReservas());	
	}
	
	public void testToString() {
		Cliente cl4 = new Cliente ();
		cl4.setNombre("Laura Garcia");
		cl4.setMaximoReservas(3);
		String testString = "Laura Garcia (3 Reservas)";
		assertEquals(testString, cl4.toString());
	}
}
