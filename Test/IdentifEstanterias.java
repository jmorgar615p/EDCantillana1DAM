package Test;


import MyMarketDavid.NumEstanteria;
import MyMarketDavid.Provedores;
import junit.framework.TestCase;

	public class IdentifEstanterias extends TestCase {
		public void Estanteria() {
			NumEstanteria b1 =new NumEstanteria (1);
			assertEquals("Ubicacion estanteria", b1.NumEstanteria);
			assertEquals("Desconocido", b1.miSupermercado);
		}
		public void testGetPersona() {
		 NumEstanteria b2 = new NumEstanteria ();
			Provedores p2= new Provedores();
			.setEstanteria("Num");
			
			((Object) b2).setProvedores(p2);
			String testProvedores=b2.getProvedores().getProvedores();
			assertEquals("Num 2", NumEstanteriaTest);
	}
	}



