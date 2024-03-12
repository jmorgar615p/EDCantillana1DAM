package pruebaUnitaria;

import java.util.ArrayList;

public class MiInstituto {
/** 
 * Clase que crea y elimina alumnos y maestros, asocia que maestro da clase a cada 
 * alumno y expulsa y matricula alumnos
 * @author Lucia Vargas
 * @version 1.0 12/03/2024
 */
	
	String nombre;
	ArrayList<Alumno> alumno;
	ArrayList<Maestro> maestro;

	/**
	 * Esto es un constructor que construye un instituto con un alumno y un maestro
	 * @param string {@link String} espera que le demos un parametro de tipo cadena de texto 
	 */
	public MiInstituto(String nombre) {
		this.nombre = nombre;
		alumno = new ArrayList<Alumno>();
		maestro = new ArrayList<Maestro>();
	}

	/**
	 * Esto seria la declaracion de Getter y Setter para el nombre del alumno y 
	 * nombre del maestro que les da clase
	 * @return los Getters devuelven el atributo pedido y los Setters establecen un nuevo dato
	 */
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Alumno> getAlumno() {
		return alumno;
	}

	public ArrayList<Maestro> getMaestro() {
		return maestro;
	}
	
	/**
	 * Aqui creamos los métodos
	 */
	public void anadirAlumno(Alumno a1) {
		this.alumno.add(a1);	
	}

	public void eliminaAlumno(Alumno a1) {
		this.alumno.remove(a1);	
	}
	
	public void anadirMaestro(Maestro m1) {
		this.maestro.add(m1);
	}
	
	public void eliminaMaestro(Maestro m1) {
		this.maestro.remove(m1);
	}

	public boolean expulsado(Alumno a1, Maestro m1) {
		int alumnoExpulsado = this.getAlumnosPorMaestro(m1).size();
		if ((a1.getMaestro() == null) && (alumnoExpulsado < m1.getMaximoAlumnos())) {
			a1.setMaestro(m1);
			return true;
		}else {
			return false;
		}
	}

	public boolean matriculado(Alumno a1) {
		if(a1.getMaestro() != null) {
			a1.setMaestro(null);
			return true;
		}else {
			return false;
		}
	}

	public ArrayList<Alumno> getAlumnosPorMaestro(Maestro m1) {
		ArrayList<Alumno> result = new ArrayList<Alumno>();
		for (Alumno aAlumno : this.getAlumno()) {
			if((aAlumno.getMaestro() != null) && 
				(aAlumno.getMaestro().getNombre().equals(m1.getNombre()))) 
			{
				result.add(aAlumno);	
			}
		}
		return result;	
	}
	

}
