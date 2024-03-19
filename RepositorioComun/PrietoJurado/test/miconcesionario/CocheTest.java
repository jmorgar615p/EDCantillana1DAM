package test.miconcesionario;

import junit.framework.TestCase;
import src.miconcesionario.MarcaCoche;
import src.miconcesionario.Vendedor;

/**
 * Clase que contiene los tests unitarios para la clase MarcaCoche.
 */
public class CocheTest extends TestCase {

    /**
     * Test para verificar el comportamiento correcto del constructor de la clase
     * MarcaCoche.
     */
    public void testCoche() {
        MarcaCoche c1 = new MarcaCoche("Audi");
        assertEquals("Audi", c1.getNombreMarca());
        Vendedor vendedor = c1.getVendedor();
        String vendedorName = (vendedor != null) ? vendedor.getNombre() : "Vendedor Desconocido";
        assertEquals("Vendedor Desconocido", vendedorName);
    }

    /**
     * Test para verificar el comportamiento correcto del método getVendedor de la
     * clase MarcaCoche.
     */
    public void testGetVendedor() {
        MarcaCoche c2 = new MarcaCoche("Audi");
        Vendedor v2 = new Vendedor();
        v2.setNombre("Javier");

        // Método para decir que esta marca la vende un vendedor concreto
        c2.setVendedor(v2);

        // Conseguir el nombre de la persona que vende esa marca
        String testName = c2.getVendedor().getNombre();
        assertEquals("Javier", testName);
    }

    /**
     * Test para verificar el comportamiento correcto del método toString de la
     * clase MarcaCoche.
     */
    public void testToString() {
        MarcaCoche c2 = new MarcaCoche("Audi");
        Vendedor v2 = new Vendedor();
        v2.setNombre("Alfredo");

        assertEquals("Audi por Vendedor Desconocido; Disponible", c2.toString());
        c2.setVendedor(v2);
        assertEquals("Audi por Vendedor Desconocido; Reservado por Alfredo", c2.toString());
    }
}
