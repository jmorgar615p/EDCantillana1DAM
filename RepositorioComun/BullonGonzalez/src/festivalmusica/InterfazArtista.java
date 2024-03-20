package festivalmusica;

/**
 * Interfaz generada por refactorizacion desde la clase Entrada.
 */
public interface InterfazArtista {

	/**
	 * Metodo para obtener el artista asociado a la entrada.
	 * @return Devuelve el artista actual de la entrada.
	 */
	Artista getArtista();

	/**
	 * Metodo Set para cambiar el artista de la entrada.
	 * @param nuevoArtista - Nuevo artista de la entrada.
	 */
	void setArtista(Artista nuevoArtista);

}