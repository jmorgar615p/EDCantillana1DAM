package DesarrolloGuiado;

import java.util.ArrayList;
import java.util.List;



public class Ingreso {

		private List<Paciente> listaPacientes;
	    private List<Medico> listaMedicos;

	    public Ingreso() {
	        this.listaPacientes = new ArrayList<>();
	        this.listaMedicos = new ArrayList<>();
	    }
	    
	    public List<Paciente> GetPacientes() {
	    	return listaPacientes;
	    }
	    
	    public List<Medico> GetMedicos() {
	    	return listaMedicos;
	    }
	    // Método para añadir pacientes 
	    public void agregarPaciente(Paciente paciente) {
	        this.listaPacientes.add(paciente);
	    }
	    
	    // Método para eliminar pacientes
	    public void eliminarPaciente(Paciente paciente) {
	        this.listaPacientes.remove(paciente);
	    }
	    
	    //Método para añadir médicos
	    public void agregarMedico(Medico medico) {
	        this.listaMedicos.add(medico);
	    }
	    
	    //Método para eliminar médicos
	    public void eliminarMedico(Medico medico) {
	        this.listaMedicos.remove(medico);
	    }
	    // Método para obtener la lista de los pacientes relacionados con un médico
	    public List<Paciente> obtenerPacientesRelacionadosConMedico(Medico medico) {
	        List<Paciente> relacionados = new ArrayList<>();
	        for (Paciente paciente : listaPacientes) {
	            if (paciente.getMedicoAsignado() == medico) {
	                relacionados.add(paciente);
	            }
	        }
	        return relacionados;
	    }
	    
	    // Método para obtener la lista de los pacientes no relacionados con un médico
	    public List<Paciente> obtenerPacientesNoRelacionadosConMedico(Medico medico) {
	        List<Paciente> noRelacionados = new ArrayList<>(listaPacientes);
	        noRelacionados.removeAll(obtenerPacientesRelacionadosConMedico(medico));
	        return noRelacionados;
	    }


}
