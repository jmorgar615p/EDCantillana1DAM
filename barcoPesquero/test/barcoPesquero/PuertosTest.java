package barcoPesquero;

import java.util.ArrayList;

import junit.framework.TestCase;

public class PuertosTest extends TestCase {
	
	
	private Lago lago1;
	private Lago lago2;
	private Barco barco1;
	private Barco barco2;
	private Puerto puerto1;

	public void testPuertos() {
		
		Puerto puerto1 = new Puerto("Puerto Prueba");
		
		assertEquals ("Puerto Prueba" , puerto1.nombre);
		
		assertTrue(puerto1.lago instanceof ArrayList);
		assertTrue (puerto1.barco instanceof ArrayList);
	}
	
	public void setup() {
	
		lago1 = new Lago("Lago Victoria");
		lago2 = new Lago("Lago Gabo");
		
		
		
		barco1 = new Barco();
		barco2 = new Barco();
		barco1.setNombre("Perla Negra");
		barco1.setNombre("Holandes Errante");
		
		puerto1 = new Puerto("Puerto Test");
		
		
		
		}
	public void testAddLago() {
		
		setup();
		
		assertEquals(0, puerto1.getLago().size());
		
		puerto1.nuevoLago(lago1);
		puerto1.nuevoLago(lago2);
		
		assertEquals(2, puerto1.getLago().size());
		assertEquals(0, puerto1.getLago().indexOf(lago1));
		assertEquals(1, puerto1.getLago().indexOf(lago2));
		
		puerto1.eliminarLago(lago1);
		assertEquals(1, puerto1.getLago().size());
		assertEquals(0, puerto1.getLago().indexOf(lago2));
		
		puerto1.eliminarLago(lago2);
		assertEquals(0, puerto1.getLago().size());
		
	}	
		public void testComprobacion () {
	
			setup();
			
			puerto1.nuevoLago(lago1);
			puerto1.nuevoLago(lago2);
		
			puerto1.nuevoBarco(barco1);
			puerto1.nuevoBarco(barco2);
			
			assertTrue("Los lagos y barcos no fueron agregados correctamente al puerto", 
					puerto1.comprobar(lago1, barco1));
			
			
			
			assertEquals("Perla Negra", lago1.getBarco().getNombre());
			
			assertFalse("El lago ya tiene un barco asignado",
					puerto1.comprobar(lago1, barco2));
			
			assertTrue("La asignación del barco al lago falló",
					puerto1.comprobar(lago1));
			
			assertFalse("El barco ya está registrado en el lago",
					puerto1.comprobar(lago1));
			
			assertFalse("El barco nunca fue registrado en el lago",
					puerto1.comprobar(lago2));
			
		}
					
		
	}



	

