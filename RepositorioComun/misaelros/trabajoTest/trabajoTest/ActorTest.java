package trabajoTest;

import junit.framework.TestCase;
import trabajo.Actor;

public class ActorTest extends TestCase {

	/**
	 * Creamos el test actor, en el que comprobamos que el constructor "Actor"
	 * crea correctamente el actor.
	 */
	public void testActor() {
		Actor a1 = new Actor();
		assertEquals("nombre desconocido", a1.getNombre());
		assertEquals(1, a1.getPeliculasParticipadas());
	}

	/**
	 * Creamos test para los getter y los setter, en el que comprobamos que 
	 * funcionan correctamente
	 */
	public void testSetNombre() {
		Actor a2 = new Actor();
		assertEquals("nombre desconocido", a2.getNombre());
	}
	
	public void testGetNombre() {
		Actor a3 = new Actor();
		a3.setNombre("Jhonny Deep");
		assertEquals("Jhonny Deep", a3.getNombre());
	}

	public void testSetPeliculasParticipadas() {
		Actor a4 = new Actor();
		a4.setPeliculasParticipadas(10);
		assertEquals(10, a4.getPeliculasParticipadas());
	}

}
