package festivalmusica;

import java.util.ArrayList;

import junit.framework.TestCase;

public class FestivalTest extends TestCase {
	
	private Entrada e1;
	private Entrada e2;
	private Artista a1;
	private Artista a2;
	private Festival f;

	public void testFestival() {
		Festival f1 = new Festival("Benidorm");
		
		assertEquals("Benidorm", f1.nombre);
		assertTrue(f1.entradas instanceof ArrayList);
		assertTrue(f1.artistas instanceof ArrayList);
	}
	
	public void configuracionPrueba() {
		e1 = new Entrada("Simple",5);
		e2 = new Entrada("Doble", 6);
		a1 = new Artista("Frank");
		a2 = new Artista("Elton");
		
		f = new Festival("Eurovision");
	}
	
	public void testAddEntrada() {
		
		configuracionPrueba();
		
		assertEquals(0, f.getEntradas().size());
		
		f.addEntrada(e1);
		f.addEntrada(e2);
		
		assertEquals(2, f.getEntradas().size());
		assertEquals(0, f.getEntradas().indexOf(e1));
		assertEquals(1, f.getEntradas().indexOf(e2));
		
		f.removeEntrada(e1);
		assertEquals(1, f.getEntradas().size());
		assertEquals(0, f.getEntradas().indexOf(e2));
		
		f.removeEntrada(e2);
		assertEquals(0, f.getEntradas().size());
	}
	
	public void addObjetos() {
		f.addEntrada(e1);
		f.addEntrada(e2);
		f.addArtista(a1);
		f.addArtista(a2);
	}
	
	public void testAsignar() {
		
		configuracionPrueba();
		addObjetos();
		
		assertTrue("La entrada no se ha asignado correctamente", f.asignar(e1,a1));
		
		assertEquals("Frank", e1.getArtista().getNombre());
		
		assertFalse("La entrada ya fue asignada", f.asignar(e1,a2));
		
		assertTrue("Desasignación de entrada fallida", f.desasignar(e1));
		
		assertFalse("La entrada ya ha sido desasignada", f.desasignar(e1));
		
		assertFalse("La entrada no ha sido asignada", f.desasignar(e2));
	}
}
