package festivalmusica;

import java.util.ArrayList;

/**
 * Clase que se encarga de los festivales, que son el equivalente a la clase Libreria
 * @author Joaquin Bullon Gonzalez
 * @version 1.0 19/03/2024
 */
public class Festival {

	/**
	 * Variable de la clase Festival.
	 * nombre - Almacena el nombre del festival.
	 */
	public String nombre;
	/**
	 * Variable de la clase Festival.
	 * entradas - Almacena un Array con las entradas del festival.
	 */
	public ArrayList<Entrada> entradas;
	/**
	 * Variable de la clase Festival.
	 * artistas - Almacena un Array con los artistas del festival.
	 */
	public ArrayList<Artista> artistas;

	/**
	 * Metodo constructor de Festival
	 * @param string {@link String} Parametro que permite darle nombre a un festival al crearlo (Ejemplo: PuroLatino). 
	 */
	public Festival(String string) {
		
		this.nombre = string;
		entradas = new ArrayList<Entrada>();
		artistas = new ArrayList<Artista>();
	}

	/**
	 * Metodo para obtener el nombre del festival.
	 * @return {@link String} Devuelve el nombre actual del festival.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo Set para cambiar el nombre del festival.
	 * @param nombre {@link String} Nuevo nombre del festival.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para obtener el array de entradas del festival.
	 * @return {@link ArrayList} Devuelve el array entradas del festival.
	 */
	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}
	
	/**
	 * Metodo para obtener el array de artistas del festival.
	 * @return {@link ArrayList} Devuelve el array artistas del festival.
	 */
	public ArrayList<Artista> getArtistas() {
		return artistas;
	}

	

	/**
	 * Metodo que añade una entrada al array de entradas del festival.
	 * @param e1 Nueva entrada que sera añadida al array de entradas del festival.
	 */
	public void addEntrada(Entrada e1) {
		this.entradas.add(e1);		
	}

	/**
	 * Metodo que elimina una entrada del array de entradas del festival.
	 * @param e1 entrada a eliminar del array de entradas del festival.
	 */
	public void removeEntrada(InterfazArtista e1) {
		this.entradas.remove(e1);		
	}

	/**
	 * Metodo que añade un artista al array de artistas del festival.
	 * @param a1 Nuevo artista que sera añadido al array de artistas del festival.
	 */
	public void addArtista(Artista a1) {
		this.artistas.add(a1);
	}
	
	/**
	 * Metodo que elimina un artista del array de artistas del festival.
	 * @param a1 artista a eliminar del array de artistas del festival.
	 */
	public void removeArtista(Artista a1) {
		this.artistas.remove(a1);
	}

	/**
	 * Metodo que asigna un artista a una entrada siempre que la entrada no tenga un artista asociado.
	 * @param e1 entrada usada en el metodo
	 * @param a1 artista usado ene l metodo.
	 * @return {@link boolean} Si la asignacion tiene exito devuelve true, en caso contrario devuelve false.
	 */
	public boolean asignar(InterfazArtista e1, Artista a1) {
		if((e1.getArtista() == null)) {
			e1.setArtista(a1);
			return true;
		}
		else
			return false;
	}

	/**
	 * Metodo para quitar el artista asociado a una entrada.
	 * @param e1 entrada usada en el metodo.
	 * @return Si la desasignacion tiene exito devuelve true, en caso contrario devuelve false.
	 */
	public boolean desasignar(InterfazArtista e1) {
		if(e1.getArtista() != null) {
			e1.setArtista(null);
			return true;
		}
		else
			return false;
	}

}
