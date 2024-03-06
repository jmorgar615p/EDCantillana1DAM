package desarrolloGuiadoPorPruebasOlga;

import java.util.ArrayList;

import junit.framework.TestCase;

public class HotelTest extends TestCase {

	private Cliente c1;
	private Cliente c2;
	private Hotel ho1;


	//test constructor
	public void testHotel() {
		Hotel ho1 = new Hotel("Test");
		
		assertEquals("Test", ho1.nombreHotel);
		
		assertTrue(ho1.cliente instanceof ArrayList<Cliente>);
		assertTrue(ho1.habitacion instanceof ArrayList<Habitacion>); 

	}

	
	public void setup() {
		c1 = new Cliente ("Cliente1");
		c2 = new Cliente ("Cliente2");
		
		Habitacion h1 = new Habitacion();
		Habitacion h2 = new Habitacion();
		h1.nombreHab("BuenasVistas");
		h2.nombreHab("Suite Familiar");
		
		ho1 = new Hotel("Test");
	}
	
	public void testAnadirCliente() {
		//creacion objetos test
		setup();
		
		//test tamaño inicial clientes es 0
		assertEquals(0, ho1.getCliente().size());
		ho1.addCliente(c1);
		ho1.addCliente(c2);
		
		assertEquals(2, ho1.getCliente().size());
		assertEquals(0, ho1.getCliente().indexOf(c1));
		assertEquals(1, ho1.getCliente().indexOf(c2));
		
		ho1.borrarCliente(c1);
		assertEquals(1, ho1.getCliente().size());
		assertEquals(0, ho1.getCliente().indexOf(c2));
		
		ho1.borrarCliente(c2);
		assertEquals(0, ho1.getCliente().size());
		
	}
	
	
	
	
	
}//fin
