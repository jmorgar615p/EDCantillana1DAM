package test.miconcesionario;

import java.util.ArrayList;


import junit.framework.TestCase;
import src.miconcesionario.MarcaCoche;
import src.miconcesionario.MiConcesionario;
import src.miconcesionario.Vendedor;


/**
 * Clase que contiene los tests unitarios para la clase MiConcesionario.
 */
public class ConcesionarioTest extends TestCase {

    /**
     * Instancia de la clase MarcaCoche c1.
     */
    private MarcaCoche c1;

    /**
     * Instancia de la clase MarcaCoche c2.
     */
    private MarcaCoche c2;

    /**
     * Instancia de la clase Vendedor v1.
     */
    private Vendedor v1;

    /**
     * Instancia de la clase Vendedor v2.
     */
    private Vendedor v2;

    /**
     * Instancia de la clase MiConcesionario mc.
     */
    private MiConcesionario mc;

    /**
     * Test para verificar el comportamiento correcto del constructor de la clase
     * MiConcesionario.
     */
    public void testMiConcesionario() {
        MiConcesionario mc = new MiConcesionario("Prueba");

        assertEquals("Prueba", mc.getNombre());

        assertTrue(mc.getMarca() instanceof ArrayList);
        assertTrue(mc.getVendedor() instanceof ArrayList);
    }

    /**
     * Método para realizar la configuración inicial de los objetos a utilizar en
     * los tests.
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
    private void addObjetos() {
		mc.addMarca(c1);
		mc.addMarca(c2);
		mc.addVendedor(v1);
		mc.addVendedor(v2);
	}

    /**
     * Test para verificar el comportamiento correcto del método addMarca de la
     * clase MiConcesionario.
     */
    public void testAddMarca() {
       // Configurar objetos
        configuracion();

        // Verificar que el número de marcas de coche inicial es 0
        assertEquals(0, mc.getMarca().size());

        // Agregar dos marcas de coche
        mc.addMarca(c1);
        mc.addMarca(c2);

        // Verificar que el número de marcas de coche es 2
        assertEquals(2, mc.getMarca().size());

        // Verificar que las marcas de coche están en la posición correcta
        assertEquals(0, mc.getMarca().indexOf(c1));
        assertEquals(1, mc.getMarca().indexOf(c2));

        // Eliminar la primera marca de coche
        mc.removeMarca(c1);

        // Verificar que el número de marcas de coche es 1
        assertEquals(1, mc.getMarca().size());

        // Verificar que la primera marca de coche ya no está presente
        assertEquals(-1, mc.getMarca().indexOf(c1));

        // Verificar que la segunda marca de coche sigue presente
        assertEquals(0, mc.getMarca().indexOf(c2));

        // Eliminar la segunda marca de coche
        mc.removeMarca(c2);

        // Verificar que el número de marcas de coche es 0
        assertEquals(0, mc.getMarca().size());
    }

    /**
     * Test para verificar el comportamiento correcto del método checkOut de la
     * clase MiConcesionario.
     */
    public void testCheckOut() {
        // Configurar objetos
        configuracion();
        addObjetos();

        // Verificar que la reserva de la primera marca de coche se realiza
        // correctamente
        assertTrue("La reserva de la primera marca de coche falló",
                mc.checkOut(c1, v1));
        assertEquals("Alfredo", c1.getVendedor().getNombre());

        // Verificar que la misma marca de coche no puede ser reservada nuevamente
        assertFalse("La misma marca de coche ya se ha reservado",
                mc.checkOut(c1, v2));

        // Verificar que no se puede hacer un check-in si no se ha realizado un
        // check-out previo
        assertFalse("La reserva falló", mc.checkIn(c1));

        // Verificar que no se puede hacer un check-in si no se ha realizado un
        // check-out previo
        assertFalse("La reserva ya se ha realizado", mc.checkOut(c1, v1));

        // Verificar que la reserva de la segunda marca de coche se realiza
        // correctamente
        assertTrue("La reserva de la segunda marca de coche falló",
                mc.checkOut(c2, v1));

        // Verificar que no se puede hacer un check-in si no se ha realizado un
        // check-out previo
        assertFalse("La reserva nunca se ha realizado", mc.checkIn(c2));
    }

    /**
     * Test para verificar el comportamiento correcto del método
     * getMarcaPorPersona de la clase MiConcesionario.
     */
    public void testGetMarcaPorVendedor() {
        configuracion();
        addObjetos();

        assertEquals(0, mc.getMarcaPorPersona(v1).size());

        mc.checkOut(c1, v1);

        ArrayList<MarcaCoche> testMarca = mc.getMarcaPorPersona(v1);
        assertEquals(1, testMarca.size());
        assertEquals(0, testMarca.indexOf(c1));

        mc.checkOut(c2, v1);
        testMarca = mc.getMarcaPorPersona(v1);
        assertEquals(2, testMarca.size());
        assertEquals(1, testMarca.indexOf(c2));
        }
    /**
     * Test para verificar el comportamiento correcto del método
     * getMarcasDisponibles de la clase MiConcesionario.
     */
    public void testGetMarcasDisponibles() {
        configuracion();
        addObjetos();

        ArrayList<MarcaCoche> testMarca = mc.getMarcasDisponibles();
        assertEquals(2, testMarca.size());
        assertEquals(1, testMarca.indexOf(c2));

        mc.checkOut(c1, v1);
        testMarca = mc.getMarcasDisponibles();
        assertEquals(1, testMarca.size());
        assertEquals(0, testMarca.indexOf(c2));

        mc.checkOut(c2, v1);
        testMarca = mc.getMarcasDisponibles();
        assertEquals(0, testMarca.size());
    }

    /**
     * Test para verificar el comportamiento correcto del método
     * getMarcasNoDisponibles de la clase MiConcesionario.
     */
    public void testGetMarcasNoDisponibles() {
        configuracion();
        addObjetos();

        assertEquals(0, mc.getMarcasNoDisponibles().size());

        mc.checkOut(c1, v1);

        ArrayList<MarcaCoche> testMarca = mc.getMarcasNoDisponibles();
        assertEquals(1, testMarca.size());
        assertEquals(0, testMarca.indexOf(c1));

        mc.checkOut(c2, v2);
        testMarca = mc.getMarcasNoDisponibles();
        assertEquals(2, testMarca.size());
        assertEquals(1, testMarca.indexOf(c2));
    }
    
    public void testToString() {
    	configuracion();
    	addObjetos();
    	assertEquals("Prueba: 2 Marcas; 2 Vendedores.", mc.toString());
    }
}