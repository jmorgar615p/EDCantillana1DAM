package trabajo;

public class Pelicula {
	
	/**
	 * Inicializamos las variables
	 */
	String director;
	String titulo;
	Actor actor;

	/**
	 * Creamos el constructor que creará los objetos "Pelicula"
	 * 
	 * @param string
	 */
	public Pelicula(String string) {
		this.director = "director desconocido";
		this.titulo = string;
	}

	/**
	 * Los getter y los setter que nos devuelven los valores sus valores
	 * respectivamente y nos permiten modificar su valor.
	 * 
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDirector() {
		return director;
	}

	public Actor getActor() {
		return this.actor;
	}

	public void setActor(Actor p1) {
		this.actor = p1;
		
	}


}