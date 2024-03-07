package test.miconcesionario;

import java.util.ArrayList;


import junit.framework.TestCase;
import src.miconcesionario.MarcaCoche;
import src.miconcesionario.MiConcesionario;
import src.miconcesionario.Vendedor;

/**
 * Clase de prueba para el concesionario.
 *
 * @author Rubén Prieto Jurado
 */
public class ConcesionarioTest extends TestCase {
		/**
	     * Objeto de prueba para la marca de coches.
	     */
		private MarcaCoche c1;
		/**
	     * Objeto de prueba para la marca de coches.
	     */
		private MarcaCoche c2;
		/**
	     * Objeto de prueba para el vendedor.
	     */
		private Vendedor v1;
		/**
	     * Objeto de prueba para el vendedor.
	     */
		private Vendedor v2;
		/**
	     * Objeto de prueba para el concesionario.
	     */
		private MiConcesionario mc;

	//Prueba Constructor
		/**
	     * Prueba del constructor de MiConcesionario.
	     */
	public void testMiConcesionario() {
		MiConcesionario mc = new MiConcesionario("Prueba");
		
		assertEquals("Prueba", mc.nombre);
		
		assertTrue(mc.marca instanceof ArrayList);
		assertTrue(mc.vendedor instanceof ArrayList);
}
	/**
     * Configuración inicial de los objetos de prueba.
     */
	public void configuracion() {
		c1 = new MarcaCoche("Audi");
		c2 = new MarcaCoche("Mercedes Benz");
		v1 = new Vendedor();
		v2 = new Vendedor();
		v1.setNombre("Alfredo");
		v2.setNombre("Javier");
		
		mc = new MiConcesionario("Prueba");
	}
	
	/**
     * Prueba del método addMarca.
     */
	public void testAddMarca() {
		//Crear objetos de prueba
		configuracion();
		
		//Nº de marcas de la prueba inicial es 0.
		assertEquals(0, mc.getMarca().size());
		
		mc.addMarca(c1);
		mc.addMarca(c2);
		
		assertEquals(2, mc.getMarca().size());
		assertEquals(0, mc.getMarca().indexOf(c1));
		assertEquals(1, mc.getMarca().indexOf(c2));
		
		mc.removeMarca(c1);
		assertEquals(1, mc.getMarca().size());
		assertEquals(0, mc.getMarca().indexOf(c2));
		
		mc.removeMarca(c2);
		assertEquals(0, mc.getMarca().size());
	}
}