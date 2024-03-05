package festivalmusica;

import java.util.ArrayList;

public class Festival {

	public String nombre;
	public ArrayList<Entrada> entradas;
	public ArrayList<Artista> artistas;

	public Festival(String string) {
		
		this.nombre = string;
		entradas = new ArrayList<Entrada>();
		artistas = new ArrayList<Artista>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}
	
	public ArrayList<Artista> getArtistas() {
		return artistas;
	}

	

	public void addEntrada(Entrada e1) {
		this.entradas.add(e1);		
	}

	public void removeEntrada(Entrada e1) {
		this.entradas.remove(e1);		
	}

	public void addArtista(Artista a1) {
		this.artistas.add(a1);
	}
	
	public void removeArtista(Artista a1) {
		this.artistas.remove(a1);
	}

	public boolean asignar(Entrada e1, Artista a1) {
		if((e1.getArtista() == null)) {
			e1.setArtista(a1);
			return true;
		}
		else
			return false;
	}

	public boolean desasignar(Entrada e1) {
		if(e1.getArtista() != null) {
			e1.setArtista(null);
			return true;
		}
		else
			return false;
	}

}
