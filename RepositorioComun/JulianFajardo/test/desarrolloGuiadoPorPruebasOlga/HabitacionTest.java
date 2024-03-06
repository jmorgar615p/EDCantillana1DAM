package desarrolloGuiadoPorPruebasOlga;

import junit.framework.TestCase;

public class HabitacionTest extends TestCase {

	public void testHabitacion() {
		Habitacion h1 = new Habitacion();
		assertEquals("unknown nombreHab", h1.obtenerHabitacion());
		assertEquals(3, h1.getMaxPersonas());
	}

	public void testDarHabitacion() {
		Habitacion h2 = new Habitacion();
		h2.nombreHab("BuenasVistas");
		assertEquals("BuenasVistas", h2.obtenerHabitacion());
	}

	public void testSetMaxPersonas() {
		Habitacion h3 = new Habitacion();
		h3.setMaxPersonas(10);
		assertEquals(10, h3.getMaxPersonas());
	}
	
	
	

}
