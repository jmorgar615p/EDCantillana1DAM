package principiante;

public class ProvedoresTest extends TestCase {

	public void testProvedores() {
		Provedores p1 = new Provedores();
		assertEquals("nombre desconocido", p1.getNombre());
		assertEquals(3, p1.getMaximoEstanteria());
	}

	public void testSetNombre() {
		Provedores p2 = new Provedores();
		p2.setNombre("Pedro");
		assertEquals("Pedro", p2.getNombre());
	}

	public void testSetMaximoEstanteria() {
		Provedores p3 = new Provedores();
		p3.setMaximoEstanteria(10);
		assertEquals(10, p3.getMaximoEstanteria());
	}
	public void testToString() {
		Provedores p4 = new Provedores();
		p4.setNombre("Pedro Picapiedra");
		p4.setMaximoEstanteria(7);
		String testString = "Pedro Picapiedra (7 Estanterias)";
		assertEquals(testString, p4.toString());
	}

}
