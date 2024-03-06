package DesarrolloGuiado;


public class Paciente {
	 private int idPaciente;
	    private String nombre;
	    private String enfermedad;
	    private Medico medicoAsignado;
	    
	    public Paciente() {
	        idPaciente = 0;
	        nombre = "";
	        enfermedad = "";
	        medicoAsignado = new Medico();
	    }
	    public int getIdPaciente() {
	        return idPaciente;
	    }

	    public void setIdPaciente(int idPaciente) {
	        this.idPaciente = idPaciente;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getEnfermedad() {
	        return enfermedad;
	    }

	    public void setEnfermedad(String enfermedad) {
	        this.enfermedad = enfermedad;
	    }

	    public Medico getMedicoAsignado() {
	        return medicoAsignado;
	    }

	    public void setMedicoAsignado(Medico medicoAsignado) {
	        this.medicoAsignado = medicoAsignado;
	    }
	}


