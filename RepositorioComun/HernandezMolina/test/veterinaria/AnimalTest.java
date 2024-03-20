package veterinaria;

import junit.framework.TestCase;
/**
 * clase que se encarga de controlar el funcionamiento del test animal
 * @author Roberto
 * @version 1.0
 */

public class AnimalTest extends TestCase {
	
	/**
	 * Test animal
	 */
	public void testAnimal() {
		Animal b1 = new Animal("Oso Polar");
		assertEquals("Oso Polar", b1.tipo);
		assertEquals("Especie desconocida", b1.especie);
	}
	
	/**
	 * test de conseguir animal
	 */
	public void testGetAnimal() {
		Animal b2 = new Animal("Tiburon");
		Trabajador p2 = new Trabajador();
		p2.setNombre("Ana");
		
		//Metodo que asigna un animal a una persona
		b2.setTrabajador(p2);
		
		// recibe el nombre de la persona que tiene el animal
		//Trabajador testTrabajador = b2.getTrabajador();
		//String testNombre = testTrabajador.getNombre();
		
		String testNombre = b2.getTrabajador().getNombre();
		assertEquals("Ana", testNombre);
	}
	
	/**
	 * test String
	 */
	public void testToString() {
		Animal b2 = new Animal("Raza");
		Trabajador p2 = new Trabajador();
		p2.setNombre("Pastor");
		
		assertEquals("Raza de Especie desconocida; Disponible", b2.toString());
		
		b2.setTrabajador(p2);
		assertEquals("Raza de Especie desconocida; MarcadoPastor", b2.toString());
	}
	

}
