package pruebaUnitaria;

import java.util.ArrayList;

public class MiInstituto {

	String nombre;
	ArrayList<alumno> alumno;
	ArrayList<maestro> maestro;

	public MiInstituto(String nombre) {
		this.nombre = nombre;
		alumno = new ArrayList<alumno>();
		maestro = new ArrayList<maestro>();
	}

}
