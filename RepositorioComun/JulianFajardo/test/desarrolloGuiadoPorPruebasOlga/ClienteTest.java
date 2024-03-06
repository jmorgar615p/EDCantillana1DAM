package desarrolloGuiadoPorPruebasOlga;

import junit.framework.TestCase;

public class ClienteTest extends TestCase {



	public void testCliente() {
		Cliente c1 = new Cliente("Olga");
		assertEquals("Olga", c1.nombre);
		assertEquals("Julian", c1.apellido);
	}
	
	public void obtenerHabitacion() {
		Cliente c2 = new Cliente("David");
		Habitacion h2 = new Habitacion();
		h2.nombreHab("BuenasVistas");
		
		//método para saber qué habitación ocupa esta persona
		c2.setMaxPersonas(h2);
		
		//dar el nombre de la habitación que tiene esta persona
		Habitacion habitacionTest = c2.nombreHab();
		String nombreHabTest = habitacionTest.obtenerHabitacion(); 
		
		//String testCliente = c2.nombreHab().obtenerHabitacion ();
		assertEquals("David", nombreHabTest); 
	}
	
}//fin
