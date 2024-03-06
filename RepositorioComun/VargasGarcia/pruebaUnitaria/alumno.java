package pruebaUnitaria;

public class alumno {

	
	String nombre;
	String apellido;
	maestro maestro;

	public alumno(String string) {
		this.nombre = string;
		this.apellido = "null";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setMaestro(maestro maestro2) {
		this.maestro = maestro2;
	}

	public maestro getMaestro() {
		return this.maestro;
	}

}
