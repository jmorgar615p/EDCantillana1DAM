package Test;

import java.util.ArrayList;

import MyMarketDavid.Provedores;
import MyMarketDavid.miSupermercado;
import junit.framework.TestCase;
import MyMarketDavid.IdentifEstanterias;

public class MiSupermercadoTest extends TestCase  {

	public void testMiSupermercado() {
			miSupermercado mb =new miSupermercado ("Test");
			assertEquals("Test", mb.nombre);
			assertTrue( mb.IdentifEstanterias instanceof ArrayList<IdentifEstanterias>);
			assertTrue(mb.Provedores instanceof ArrayList<Provedores>);
		}
	}
