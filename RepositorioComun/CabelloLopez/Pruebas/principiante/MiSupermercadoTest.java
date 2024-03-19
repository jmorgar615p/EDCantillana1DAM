package principiante;

public class MiSupermercadoTest extends TestCase  {

	import java.util.ArrayList;

	import junit.framework.TestCase;

		public void testMiSupermercado() {
			MiSupermercado mb =new MiSupermercado ("Test");
			assertEquals("Test", mb.nombre);
			assertTrue(mb.Estanteria instanceof ArrayList<Estanteria>);
			assertTrue(mb.Provedores instanceof ArrayList<Provedores>);
		}
	}
