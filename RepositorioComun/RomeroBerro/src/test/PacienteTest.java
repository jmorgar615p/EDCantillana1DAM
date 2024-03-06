package test;

import DesarrolloGuiado.Medico;
import DesarrolloGuiado.Paciente;
import junit.framework.TestCase;

public class PacienteTest extends TestCase {

	public void testSetIdPaciente() {
		Paciente paciente = new Paciente();
		int idEsperado = 1234;
		paciente.setIdPaciente(idEsperado); // llamada al método a probar
		int idDado = paciente.getIdPaciente();
		assertEquals("El ID del paciente no coincide con el ID dado", idEsperado, idDado);
	}

	public void testSetNombre() {
		String nombreEsperado = "Pepe"; // se establece el valor esperado
		Paciente paciente = new Paciente();
		paciente.setNombre(nombreEsperado); // llamada al método a probar
		String nombreDado = paciente.getNombre();
		assertEquals("El nombre del paciente no coincide", nombreEsperado, nombreDado);
	}

	public void testSetEnfermedad() {
		String enfermedadEsperada = "Covid"; // se establece el valor esperado
		Paciente paciente = new Paciente();
		paciente.setEnfermedad(enfermedadEsperada); // llamada al método a probar
		String enfermedadDada = paciente.getEnfermedad();
		assertEquals("La enfermedad del paciente no coincide", enfermedadEsperada, enfermedadDada);
	}

	public void testSetMedicoAsignado() {
        Medico medicoEsperado = new Medico();
     medicoEsperado.setNombre("Dr Perez");
        Paciente paciente = new Paciente();
        paciente.setMedicoAsignado(medicoEsperado); // llamada al método a probar
        Medico medicoObtenido = paciente.getMedicoAsignado();
        assertEquals("El médico asignado al paciente no coincide", medicoEsperado, medicoObtenido);
    }
	}


