package festivalmusica;

/**
 * Clase que se encarga de las entradas, que son el equivalente a la clase Libro
 * @author Joaquin Bullon Gonzalez
 * @version 1.0 19/03/2024
 */
public class Entrada implements InterfazArtista {

	/**
	 * Variable de la clase Entrada.
	 * tipo - Almacena el tipo de entrada.
	 */
	public String tipo;
	/**
	 * Variable de la clase Entrada.
	 * cantidad - Almacena la cantidad de entradas.
	 */
	public int cantidad;
	/**
	 * Variable de la clase Entrada.
	 * artista - Almacena un objeto de tipo Artista.
	 */
	public Artista artista;
	
	/**
	 * Metodo constructor de la clase Entrada.
	 * @param string {@link String} Parametro que permite darle tipo a una Entrada al crearlo (Ejemplo: Doble).
	 * @param cantidad {@link Integer} Parametro que permite darle cantidad a una Entrada al crearlo (Ejemplo: 200).
	 */
	public Entrada(String string, int cantidad) {
		this.tipo = string;
		this.cantidad = cantidad;
	}

	/**
	 * Metodo para obtener el tipo de la entrada.
	 * @return {@link String} Devuelve el tipo actual de la entrada.
	 */
	public String getTipo() {
		return this.tipo;
	}

	/**
	 * Metodo Set para cambiar el nombre del artista.
	 * @param tipo {@link String} Nuevo tipo de la entrada.
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Metodo para obtener la cantidad de la entrada.
	 * @return {@link Integer} Devuelve la cantidad actual de la entrada.
	 */
	public int getCantidad() {
		return this.cantidad;
	}

	/**
	 * Metodo Set para cambiar la cantidad de la entrada.
	 * @param cantidad {@link Integer} Nueva cantidad de la entrada.
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Metodo para obtener el artista asociado a la entrada.
	 * @return Devuelve el artista actual de la entrada.
	 */
	@Override
	public Artista getArtista() {
		return this.artista;
	}
	
	/**
	 * Metodo Set para cambiar el artista de la entrada.
	 * @param nuevoArtista - Nuevo artista de la entrada.
	 */
	@Override
	public void setArtista(Artista nuevoArtista) {
		this.artista = nuevoArtista;
		
	}

}
