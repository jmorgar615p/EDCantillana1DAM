package test;

import DesarrolloGuiado.Medico;
import DesarrolloGuiado.Paciente;
import junit.framework.TestCase;

public class MedicoTest extends TestCase {

	public void testLongitudIdMedico() {
		Medico med = new Medico();
		assertEquals(5, med.getIdMedico().length());
	}

	public void testSetNombre() {
		String nombreEsperado = "Juan Pérez"; // se establece el valor esperado
		Medico medico= new Medico();
		medico.setNombre(nombreEsperado); // llamada al método a probar
		String nombreDado = medico.getNombre();
		assertEquals("El nombre del medico no coincide", nombreEsperado, nombreDado);
	}

	public void testSetEspecialidad() {
		String especialidadEsperada = "Cardiología"; // se establece el valor esperado
		Medico medico = new Medico();
		medico.setEspecialidad(especialidadEsperada); // llamada al método a probar
		String especialidadDada = medico.getEspecialidad();
		assertEquals("La especialidad del médico no coincide", especialidadEsperada, especialidadDada);
	}

}
