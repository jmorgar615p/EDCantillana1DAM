package DesarrolloGuiado;

import java.util.Random;

/**
 * Clase que se encarga de los medicos de un hospital.
 * 
 * @author reyes
 * @version 1.0 09/03/2024
 */
public class Medico {
	private String idMedico;
	private String nombre;
	private String especialidad;

	/**
	 * Metodo constructor del medico.
	 */
	public Medico() {
		idMedico = generarCadenaAleatoria();
		nombre = "";
		especialidad = "";
	}

	/**
	 * Metodo para devolver el id del medico.
	 * 
	 * @return id del medico.
	 */
	public String getIdMedico() {
		return idMedico;
	}

	/**
	 * Metodo para devolver el nombre del medico.
	 * 
	 * @return nombre del medico.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para establecer el nombre del medico.
	 * 
	 * @param nombre Nombre del medico.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para devolver la especialidad del medico.
	 * 
	 * @return especialidad del medico.
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * Metodo para establecer la especialidad del medico.
	 * 
	 * @param especialidad Especialidad del medico.
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	/**
	 * Genera una cadena aleatoria de longitud 5 cuyos caracteres permitidos son
	 * letras mayusculas y miniculas y numeros.
	 * 
	 * @return la cadena generada.
	 */
	private String generarCadenaAleatoria() {
		int longitud = 5;
		StringBuilder cadenaAleatoria = new StringBuilder();

		// Caracteres permitidos en la cadena
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		Random random = new Random();

		for (int i = 0; i < longitud; i++) {
			int indice = random.nextInt(caracteres.length());
			char caracterAleatorio = caracteres.charAt(indice);
			cadenaAleatoria.append(caracterAleatorio);
		}

		return cadenaAleatoria.toString();

	}
}