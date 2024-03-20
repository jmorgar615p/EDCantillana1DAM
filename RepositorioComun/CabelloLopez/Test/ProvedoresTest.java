package Test;

import MyMarketDavid.InterfazProvedores;
import MyMarketDavid.Provedores;
import junit.framework.TestCase;

public class ProvedoresTest extends TestCase {

	public void testProvedores() {
		InterfazProvedores p1 = new Provedores();
		assertEquals("nombre desconocido", p1.getNombre());
		assertEquals(3, p1.getMaximoProductos());
	}

	public void testSetNombre() {
		InterfazProvedores p2 = new Provedores();
		p2.setNombre("Pedro");
		assertEquals("Pedro", p2.getNombre());
	}

	public void testSetMaximoEstanteria() {
		InterfazProvedores p3 = new Provedores();
		
		p3.setMaximoNumEstanteria(10);
		assertEquals(10, p3.getMaximoNumEstanteria());
	}
	public void testToString() {
		InterfazProvedores p4 = new Provedores();
		p4.setNombre("Pedro Picapiedra");
		p4.setMaximoNumEstanteria(7);
		String testString = "Pedro Picapiedra (7 Estanterias)";
		assertEquals(testString, p4.toString());
	}

}
