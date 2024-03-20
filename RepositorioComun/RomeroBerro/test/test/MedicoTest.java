package test;

import DesarrolloGuiado.Medico;
import DesarrolloGuiado.Paciente;
import junit.framework.TestCase;

/**
 * Test que se encarga de verificar los datos de un medico de un hospital.
 * 
 * @author reyes
 * @version 1.0 09/03/2024
 */
public class MedicoTest extends TestCase {

	/**
	 * Verifica que la longitud del ID de un médico sea la esperada.
	 */
	public void testLongitudIdMedico() {
		Medico med = new Medico();
		assertEquals(5, med.getIdMedico().length());
	}

	/**
	 * Verifica que el método setNombre establezca correctamente el nombre del
	 * médico.
	 */
	public void testSetNombre() {
		String nombreEsperado = "Juan Pérez"; // se establece el valor esperado
		Medico medico = new Medico();
		medico.setNombre(nombreEsperado); // llamada al método a probar
		String nombreDado = medico.getNombre();
		assertEquals("El nombre del medico no coincide", nombreEsperado, nombreDado);
	}

	/**
	 * Verifica que el método setEspecialidad establezca correctamente la
	 * especialidad del médico.
	 */
	public void testSetEspecialidad() {
		String especialidadEsperada = "Cardiología"; // se establece el valor esperado
		Medico medico = new Medico();
		medico.setEspecialidad(especialidadEsperada); // llamada al método a probar
		String especialidadDada = medico.getEspecialidad();
		assertEquals("La especialidad del médico no coincide", especialidadEsperada, especialidadDada);
	}

}
