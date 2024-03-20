package DesarrolloGuiado;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que se encarga de los ingresos de un hospital.
 * 
 * @author reyes
 * @version 1.0 09/03/2024
 */
public class Ingreso {

	/**
	 * Almacena a todos los medicos y todos los pacientes en una lista.
	 */
	private List<Paciente> listaPacientes;
	private List<Medico> listaMedicos;

	/**
	 * Metodo constructor de las listas.
	 */
	public Ingreso() {
		this.listaPacientes = new ArrayList<>();
		this.listaMedicos = new ArrayList<>();
	}

	/**
	 * Obtiene una lista de pacientes.
	 * 
	 * @return Lista de todos los pacientes.
	 */
	public List<Paciente> GetPacientes() {
		return listaPacientes;
	}

	/**
	 * Obtiene una lista de medicos.
	 * 
	 * @return Lista de todos los medicos.
	 */
	public List<Medico> GetMedicos() {
		return listaMedicos;
	}

	/**
	 * Añade un paciente a la lista.
	 * 
	 * @param paciente Paciente a añadir.
	 */
	public void agregarPaciente(Paciente paciente) {
		this.listaPacientes.add(paciente);
	}

	/**
	 * Elimina un paciente de la lista.
	 * 
	 * @param paciente Paciente a eliminar.
	 */
	public void eliminarPaciente(Paciente paciente) {
		this.listaPacientes.remove(paciente);
	}

	/**
	 * Añade un medico a la lista.
	 * 
	 * @param medico Medico a añadir.
	 */
	public void agregarMedico(Medico medico) {
		this.listaMedicos.add(medico);
	}

	/**
	 * Elimina un medico de la lista.
	 * 
	 * @param medico Medico a eliminar.
	 */
	public void eliminarMedico(Medico medico) {
		this.listaMedicos.remove(medico);
	}

	/**
	 * Obtiene una lista con todos los pacientes que tiene un medico dado.
	 * 
	 * @param medico Medico a consultar.
	 * @return Pacientes asociados al medico recibido.
	 */
	public List<Paciente> obtenerPacientesRelacionadosConMedico(Medico medico) {
		List<Paciente> relacionados = new ArrayList<>();
		for (Paciente paciente : listaPacientes) {
			if (paciente.getMedicoAsignado() == medico) {
				relacionados.add(paciente);
			}
		}
		return relacionados;
	}

	/**
	 * Obtiene una lista con todos los pacientes que no tienen relacion con un
	 * medico.
	 * 
	 * @param medico Medico a consultar.
	 * @return Pacientes no asociados a un medico recibido.
	 */
	public List<Paciente> obtenerPacientesNoRelacionadosConMedico(Medico medico) {
		List<Paciente> noRelacionados = new ArrayList<>(listaPacientes);
		noRelacionados.removeAll(obtenerPacientesRelacionadosConMedico(medico));
		return noRelacionados;
	}

}
