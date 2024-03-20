package escaperoom;

import junit.framework.TestCase;

public class SesionTest extends TestCase {

		public void testSesion() {
			Sesion s1  = new Sesion("Escapa como puedas");
			assertEquals("Escapa como puedas", s1.title);
			assertEquals("Origen desconocido", s1.origen);
		}
		
		public void testGetCliente() {
			Sesion s2  = new Sesion("Sin salida");
			Cliente cl2 = new Cliente();
			cl2.setNombre("Jose");
			
			//method to say sesion is loaned to this cliente
			s2.setCliente(cl2);
			
			//get the name of the cliente who has the sesion
//			Cliente testCliente = s2.getCliente();
//			String testName = testCliente.getNombre();
			
			
			String testNombre = s2.getCliente().getNombre();
			assertEquals("Jose", testNombre);
			
			
			}
		}
