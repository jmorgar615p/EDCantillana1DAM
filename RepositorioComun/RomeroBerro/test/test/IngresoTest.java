package test;

import java.util.List;

import DesarrolloGuiado.Ingreso;
import DesarrolloGuiado.Medico;
import DesarrolloGuiado.Paciente;
import junit.framework.TestCase;

/**
 * Test que se encarga de verificar los ingresos de un hospital.
 * 
 * @author reyes
 * @version 1.0 09/03/2024
 */
public class IngresoTest extends TestCase {

	/**
	 * Verifica que el método agregarPaciente añada correctamente un paciente a la
	 * lista de pacientes.
	 */
	public void testAgregarPaciente() {
		Ingreso ingreso = new Ingreso();
		Paciente paciente = new Paciente();
		ingreso.agregarPaciente(paciente);
		List<Paciente> pacientes = ingreso.GetPacientes();

		assertTrue(pacientes.contains(paciente));
	}

	/**
	 * Verifica que el método eliminarPaciente elimine correctamente un paciente de
	 * la lista de pacientes.
	 */
	public void testEliminarPaciente() {
		Ingreso ingreso = new Ingreso();
		Paciente paciente = new Paciente();
		ingreso.eliminarPaciente(paciente);
		List<Paciente> pacientes = ingreso.GetPacientes();
		assertFalse(pacientes.contains(paciente));
	}

	/**
	 * Verifica que el método agregarMedico añada correctamente un médico a la lista
	 * de médicos.
	 */
	public void testAgregarMedico() {
		Ingreso ingreso = new Ingreso();
		Medico med = new Medico();
		ingreso.agregarMedico(med);
		List<Medico> medicos = ingreso.GetMedicos();
		assertTrue(medicos.contains(med));
	}

	/**
	 * Verifica la funcionalidad del método eliminarMedico en la clase Ingreso.
	 */
	public void testEliminarMedico() {
		Ingreso ingreso = new Ingreso();
		Medico med = new Medico();
		ingreso.eliminarMedico(med);
		List<Medico> medicos = ingreso.GetMedicos();
		assertFalse(medicos.contains(med));
	}

	/**
	 * Verifica la funcionalidad del método obtenerPacientesRelacionadosConMedico en
	 * la clase Ingreso.
	 */
	public void testObtenerPacientesRelacionadosConMedico() {
		Ingreso ingreso = new Ingreso();
		Paciente paciente = new Paciente();
		Medico med = new Medico();
		Paciente paciente1 = new Paciente();
		ingreso.agregarPaciente(paciente);
		ingreso.agregarPaciente(paciente1);
		ingreso.agregarMedico(med);
		paciente.setMedicoAsignado(med);
		paciente1.setMedicoAsignado(med);
		List<Paciente> relacionados = ingreso.obtenerPacientesRelacionadosConMedico(med);
		assertTrue(relacionados.contains(paciente));
		assertTrue(relacionados.contains(paciente1));
	}

}
