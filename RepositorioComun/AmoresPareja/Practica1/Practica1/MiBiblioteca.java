package principiante;

import java.util.ArrayList;

public class MiBiblioteca {

	public String nombre;
	public ArrayList<Libro> libros;
	public ArrayList<String> personas;

	public MiBiblioteca(String name) {
		this.nombre =name;
		libros = new ArrayList<Libro>();
		personas = new ArrayList<String>();
		
		
	}

}
