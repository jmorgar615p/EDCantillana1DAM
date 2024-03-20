package trabajoTest;

import junit.framework.TestCase;
import trabajo.Pelicula;
import trabajo.Actor;

public class PeliculaTest extends TestCase {
	
	/**
	 * Creamos el test que comprueba que el constructor "pelicula" funciona
	 * correctamente y crea el objeto sin problemas
	 */
	public void testPelicula() {
		Pelicula Pelicula1 = new Pelicula("Spider-Man");
		assertEquals("Spider-Man", Pelicula1.getTitulo());
		assertEquals("director desconocido", Pelicula1.getDirector());
	}
	
	/**
	 * Creamos test para los getter y los setter, en el que comprobamos que 
	 * funcionan correctamente
	 */
	public void testGetDirector() {
		Pelicula pelicula2 = new Pelicula ("Titanic");
		assertEquals("director desconocido", pelicula2.getDirector());
	}

	public void testSetDirector() {
		Pelicula pelicula3 = new Pelicula("Ratatuille");
		pelicula3.setDirector("Disney");
		assertEquals("Disney",pelicula3.getDirector());
	}

	public void testGetTitulo() {
		Pelicula pelicula4 = new Pelicula("Star-Wars");
		assertEquals("Star-Wars", pelicula4.getTitulo());
	}

	public void testSetActor() {
		Pelicula pelicula5 = new Pelicula("Los Simpsons");
		Actor p1 = new Actor ();
		p1.setNombre("Homer Simpsons");
		pelicula5.setActor(p1);
		assertEquals(p1, pelicula5.getActor());
	}

	public void testGetActor() {
		Pelicula pelicula5 = new Pelicula("Spider-man");
		assertEquals(null, pelicula5.getActor());
	}

}