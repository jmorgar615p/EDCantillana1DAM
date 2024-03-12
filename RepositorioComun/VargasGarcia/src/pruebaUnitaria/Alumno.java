package pruebaUnitaria;

public class Alumno {
/** 
 * Clase que construye un alumno con su nombre y apellido y el maestro que le da clase a ese alumno
 * @author Lucia Vargas
 * @version 1.0 12/03/2024
 */
	
	/**
	 * Estos son las declaraciones de las variables
	 */
	String nombre;
	String apellido;
	Maestro maestro;

	/**
	 * esto es un constructor que construye un alumno con su nombre y apellido
	 * @param string {@link String} espera que le demos un parámetro de tipo cadena de texto 
	 */
	public Alumno(String string) {
		this.nombre = string;
		this.apellido = "null";
	}
	
	/**
	 * Esto sería la declaración de Getter y Setter para el nombre, apellido y 
	 * maestro que les da clase
	 * @return los Getters devuelven el atributo pedido y los Setters establecen un nuevo dato
	 */
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

	public void setMaestro(Maestro b1) {
		this.maestro = b1;
	}

	public Maestro getMaestro() {
		return this.maestro;
	}

}
