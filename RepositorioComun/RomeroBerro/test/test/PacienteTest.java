package test;

import DesarrolloGuiado.Medico;
import DesarrolloGuiado.Paciente;
import junit.framework.TestCase;

/**
 * Test que se encarga de verificar los datos de un paciente de un hospital.
 * 
 * @author reyes
 * @version 1.0 09/03/2024
 */
public class PacienteTest extends TestCase {

	/**
	 * Verifica que el método setIdPaciente establezca correctamente el ID del
	 * paciente.
	 */
	public void testSetIdPaciente() {
		Paciente paciente = new Paciente();
		int idEsperado = 1234;
		paciente.setIdPaciente(idEsperado); // llamada al método a probar
		int idDado = paciente.getIdPaciente();
		assertEquals("El ID del paciente no coincide con el ID dado", idEsperado, idDado);
	}

	/**
	 * Verifica que el método setNombre establezca correctamente el nombre del
	 * paciente.
	 */
	public void testSetNombre() {
		String nombreEsperado = "Pepe"; // se establece el valor esperado
		Paciente paciente = new Paciente();
		paciente.setNombre(nombreEsperado); // llamada al método a probar
		String nombreDado = paciente.getNombre();
		assertEquals("El nombre del paciente no coincide", nombreEsperado, nombreDado);
	}

	/**
	 * Verifica que el método setEnfermedad establezca correctamente la enfermedad
	 * del paciente.
	 */
	public void testSetEnfermedad() {
		String enfermedadEsperada = "Covid"; // se establece el valor esperado
		Paciente paciente = new Paciente();
		paciente.setEnfermedad(enfermedadEsperada); // llamada al método a probar
		String enfermedadDada = paciente.getEnfermedad();
		assertEquals("La enfermedad del paciente no coincide", enfermedadEsperada, enfermedadDada);
	}

	/**
	 * Verifica que el método setMedicoAsignado establezca correctamente el médico
	 * asignado al paciente.
	 */
	public void testSetMedicoAsignado() {
		Medico medicoEsperado = new Medico();
		medicoEsperado.setNombre("Dr Perez");
		Paciente paciente = new Paciente();
		paciente.setMedicoAsignado(medicoEsperado); // llamada al método a probar
		Medico medicoObtenido = paciente.getMedicoAsignado();
		assertEquals("El médico asignado al paciente no coincide", medicoEsperado, medicoObtenido);
	}
}
