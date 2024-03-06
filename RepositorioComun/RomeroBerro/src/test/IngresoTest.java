package test;

import java.util.List;

import DesarrolloGuiado.Ingreso;
import DesarrolloGuiado.Medico;
import DesarrolloGuiado.Paciente;
import junit.framework.TestCase;

public class IngresoTest extends TestCase {

	public void testAgregarPaciente() {
		Ingreso ingreso = new Ingreso();
		Paciente paciente = new Paciente();
		ingreso.agregarPaciente(paciente);
		List<Paciente> pacientes = ingreso.GetPacientes();

		assertTrue(pacientes.contains(paciente));
	}

	public void testEliminarPaciente() {
		Ingreso ingreso = new Ingreso();
		Paciente paciente = new Paciente();
		ingreso.eliminarPaciente(paciente);
		List<Paciente> pacientes = ingreso.GetPacientes();
		assertFalse(pacientes.contains(paciente));
	}

	public void testAgregarMedico() {
		Ingreso ingreso = new Ingreso();
		Medico med = new Medico();
		ingreso.agregarMedico(med);
		List<Medico> medicos = ingreso.GetMedicos();
		assertTrue(medicos.contains(med));
	}

	public void testEliminarMedico() {
		Ingreso ingreso = new Ingreso();
		Medico med = new Medico();
		ingreso.eliminarMedico(med);
		List<Medico> medicos = ingreso.GetMedicos();
		assertFalse(medicos.contains(med));
	}

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
