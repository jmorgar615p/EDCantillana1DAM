package festivalmusica;
/**
 * Clase que se encarga de los artistas, que son el equivalente a la clase Persona
 * @author Joaquin Bullon Gonzalez
 * @version 1.0 19/03/2024
 */

public class Artista {
	
	/**
	 * Variable de la clase Artista.
	 * nombre - Almacena el nombre del artista.
	 */
	public String nombre;
	/**
	 * Variable de la clase Artista.
	 * maximoEntradas - Almacena el numero maximo de entradas que puede vender el artista.
	 */
	public int maximoEntradas;

	/**
	 * Metodo constructor de Artista
	 * @param string {@link String} Parametro que permite darle nombre a un artista al crearla (Ejemplo: Amy Winehouse).
	 */
	public Artista(String string) {
		this.nombre = string;
		this.maximoEntradas = 1000;
	}

	/**
	 * Metodo Set para cambiar el nombre del artista
	 * @param string {@link String} Nuevo nombre del artista
	 */
	public void setNombre(String string) {
		this.nombre = string;
		
	}

	/**
	 * Metodo para obtener el nombre del artista.
	 * @return {@link String} Devuelve el nombre actual del artista.
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Metodo Set para cambiar el numero maximo de entradas.
	 * @param i {@link Integer} Nuevo maximo de entradas del artista.
	 */
	public void setMaximoEntradas(int i) {
		this.maximoEntradas = i;
		
	}

	/**
	 * Metodo para obtener el numero maximo de entradas del artista.
	 * @return {@link Integer} Devuelve el numero maximo de entradas actual del artista.
	 */
	public int getMaximoEntradas() {
		return this.maximoEntradas;
	}

}
