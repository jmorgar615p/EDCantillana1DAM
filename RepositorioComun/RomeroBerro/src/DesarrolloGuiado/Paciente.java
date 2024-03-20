package DesarrolloGuiado;

/**
 * Clase que se encarga de los pacientes de un hospital.
 * 
 * @author reyes
 * @version 1.0 09/03/2024
 */
public class Paciente {
	private int idPaciente;
	private String nombre;
	private String enfermedad;
	private Medico medicoAsignado;

	/**
	 * Metodo constructor del paciente.
	 */
	public Paciente() {
		idPaciente = 0;
		nombre = "";
		enfermedad = "";
		medicoAsignado = new Medico();
	}

	/**
	 * Metodo para devolver el id del paciente.
	 * 
	 * @return id del paciente.
	 */
	public int getIdPaciente() {
		return idPaciente;
	}

	/**
	 * Metodo para establecer el id del paciente.
	 * 
	 * @param idPaciente numero identificativo del paciente.
	 */
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	/**
	 * Metodo para devolver el nombre del paciente.
	 * 
	 * @return nombre del paciente.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para establecer el nombre del paciente.
	 * 
	 * @param nombre Nombre del paciente.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para devolver la enfermedad del paciente.
	 * 
	 * @return enfermedad del paciente.
	 */
	public String getEnfermedad() {
		return enfermedad;
	}

	/**
	 * Metodo para establecer la enfermedad del paciente.
	 * 
	 * @param enfermedad Enfermedad del paciente.
	 */
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	/**
	 * Metodo para devolver el medico asignado al paciente.
	 * 
	 * @return medico del paciente.
	 */
	public Medico getMedicoAsignado() {
		return medicoAsignado;
	}

	/**
	 * Metodo para establecer un medico al paciente.
	 * 
	 * @param medicoAsignado Medico que se le asigna al paciente.
	 */
	public void setMedicoAsignado(Medico medicoAsignado) {
		this.medicoAsignado = medicoAsignado;
	}
}
