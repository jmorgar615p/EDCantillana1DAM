package principiante;

public class EstanteriaTest extends TestCase {
	public void Estanteria() {
		Estanteria b1 =new Estanteria ("Ubicacion estanteria");
		assertEquals("Ubicacion estanteria", b1.Estanteria);
		assertEquals("Desconocido", b1.miSupermercado);
	}
	public void testGetPersona() {
		Libro b2 =new Estanteria ("Num Estanteria");
		Provedores p2= new Provedores();
		p2.setEstanteria("Num");
		
		b2.setProvedores(p2);
		String testProvedores=b2.getProvedores().getProvedores();
		assertEquals("Num 2", EstanteriaTest);
}
