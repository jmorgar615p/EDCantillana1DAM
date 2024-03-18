package barcoPesquero;

import junit.framework.TestCase;

public class LagoTest extends TestCase {
	
	public void testLago () {
		Lago lago1 = new Lago("Lago Victoria");
		
		assertEquals("Lago Victoria", lago1.nombre);
		assertEquals("Especie Desconocida", lago1.pezPrincipal);
		
		
	}

    public void testGetBarco() {
        Lago lago2 = new Lago("Lago Gabo");
        Barco barco2 = new Barco();
        barco2.setNombre("Galera");

      
        lago2.setBarco(barco2);

       
       
        
        String testNombreBarco = lago2.getBarco().getNombre();

        assertEquals("Galera", testNombreBarco);
    }
}
