package barcoPesquero;

import junit.framework.TestCase;

public class BarcoTest extends TestCase {

	public void testBarco() {
		Barco barco1 = new Barco ();
		assertEquals("Desconocido", barco1.getNombre());
		assertEquals(1, barco1.getAnyosAntiguedad());
	}

	public void testSetNombre() {
		Barco barco2 = new Barco();
		barco2.setNombre("Perla Negra");
		assertEquals("Perla Negra", barco2.getNombre());
	}

	public void testSetAnyosAntiguedad() {
		Barco barco3 = new Barco();
		barco3.setAnyosAntiguedad(5000);
		assertEquals(5000, barco3.getAnyosAntiguedad());
	}
	

	public void testToString () {
		Barco barco4 = new Barco();
		barco4.setNombre("Holandes Errante");
		barco4.setAnyosAntiguedad(7000);
		String testString = "Holandes Errante (7000 años de antiguedad)";
		assertEquals(testString, barco4.toString());
	}
}
