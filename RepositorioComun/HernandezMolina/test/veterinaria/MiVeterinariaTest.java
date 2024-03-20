package veterinaria;

import java.util.ArrayList;

import junit.framework.TestCase;
/**
 * clase que se encarga de controlar el funcionamiento del test MiVeterinaria
 * @author Roberto
 * @version 1.0
 */

public class MiVeterinariaTest extends TestCase implements anadirAnimal {
	
	/**
	 * Definicion de los atributos
	 */
	private Animal a1;
	private Animal a2;
	private Trabajador t1;
	private Trabajador t2;
	private MiVeterinaria v1;

	/**
	 * test miveterinaria
	 */
	//Constructor
	public void testMiVeterinaria() {
		MiVeterinaria c1 = new MiVeterinaria("Veterinaria");
		
		assertEquals("Veterinaria", c1.nombre);
		
		assertTrue(c1.animal instanceof ArrayList);
		assertTrue(c1.trabajador instanceof ArrayList);
		
	}
	
	/**
	 * configuracion de los animales
	 */
	public void confi() {
		a1 = new Animal("Perro");
		a2 = new Animal("Gato");
		
		t1 = new Trabajador();
		t2 = new Trabajador();
		t1.setNombre("Pepe");
		t2.setNombre("Pepa");
		
		v1 = new MiVeterinaria("Veterinaria");
	}
	
	/**
	 * test para añadir animal
	 */
	@Override
	public void testAnadirAnimal() {
		//Creamos el objeto
		confi();
		
		//Test inicializado a 0
		assertEquals(0, v1.getAnimal().size());
		
		v1.anadiAnimal(a1);
		v1.anadiAnimal(a2);
		
		assertEquals(2, v1.getAnimal().size());
		assertEquals(0, v1.getAnimal().indexOf(a1));
		assertEquals(1, v1.getAnimal().indexOf(a2));
		
		v1.eliminarAnimal(a1);
		assertEquals(1, v1.getAnimal().size());
		assertEquals(0, v1.getAnimal().indexOf(a2));
		
		v1.eliminarAnimal(a2);
		assertEquals(0, v1.getAnimal().size());
		
		}

	/**
	 * test de checkOut
	 */
		public void testCheckOut() {
			//Visualizar objetos
			confi();
			
			anadirItems();
			
			assertTrue("El animal no se añadio correctamente", v1.checkOut(a1,t1));
			
			assertEquals("Pepe", a1.getTrabajador().getNombre());
			
			assertFalse("Animal ya añadido", v1.checkOut(a1,t2));
			
			assertTrue("Fallo al añadir el animal", v1.checkIn(a1));
			
			assertFalse("El animal ya ha sido añadido en", v1.checkIn(a1));
			
			assertFalse("Animal nunca añadido", v1.checkIn(a2));
			
			//test adicionales
			confi();
			t1.setMaximoAnimales(1);
			anadirItems();
			
			assertTrue("Primer animal no visto", v1.checkOut(a2, t1));
			assertFalse("Segundo animal no visto", v1.checkOut(a1, t1));
		}

		/**
		 * test para anadirItems
		 */
		private void anadirItems() {
			v1.anadiAnimal(a1);
			v1.anadiAnimal(a2);
			v1.anadirtrabajador(t1);
			v1.anadirtrabajador(t2);
		}
		
		/**
		 * test para añadir animales con personas
		 */
		public void testGetAnimalesDeTrabajadores() {
			confi();
			anadirItems();
			assertEquals(0, v1.getAnimalesDeTrabajadores(t1).size());
			
			v1.checkOut(a1, t1);
			
			ArrayList<Animal> testAnimales = v1.getAnimalesDeTrabajadores(t1);
			assertEquals(1, testAnimales.size());
			assertEquals(0, testAnimales.indexOf(a1));
			
			v1.checkOut(a2, t1);
			testAnimales = v1.getAnimalesDeTrabajadores(t1);
			assertEquals(2, testAnimales.size());
			assertEquals(1, testAnimales.indexOf(a2));
			
		}
		
		/**
		 * test para establecer animales disponibles
		 */
		public void testGetAnimalesDisponibles() {
			confi();
			anadirItems();
			ArrayList<Animal> testAnimales = v1.getAnimalesDisponibles();
			assertEquals(2, testAnimales.size());
			assertEquals(1, testAnimales.indexOf(a2));
			
			v1.checkOut(a1, t1);
			testAnimales = v1.getAnimalesDisponibles();
			assertEquals(1, testAnimales.size());
			assertEquals(0, testAnimales.indexOf(a2));
			
			v1.checkOut(a2, t1);
			testAnimales = v1.getAnimalesDisponibles();
			assertEquals(0, testAnimales.size());
		}
		
		/**
		 * test para establecer los animales no disponibles
		 */
		public void testGetNoDisponibles() {
			confi();
			anadirItems();
			assertEquals(0, v1.getNoDisponibles().size());
			
			v1.checkOut(a1, t1);

			ArrayList<Animal> testAnimales = v1.getNoDisponibles();
			assertEquals(1, testAnimales.size());
			assertEquals(0, testAnimales.indexOf(a1));
			
			v1.checkOut(a2, t1);
			testAnimales = v1.getNoDisponibles();
			assertEquals(2, testAnimales.size());
			assertEquals(1, testAnimales.indexOf(a2));
		}
		
		/**
		 * test toString
		 */
		public void testToString() {
			confi();
			anadirItems();
			assertEquals("Veterinaria: 2 animales; 2 trabajador.", v1.toString());
		}
		



}
