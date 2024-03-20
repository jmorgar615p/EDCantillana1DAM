package trabajo;

public class Actor {
	
	/**
	 * En esta parte del código, inicializamos las variables que utilizaremos en 
	 * nuestro código, como el nombre del actor y el número de peliculas en las
	 * que participa.
	 */
	String nombre; 
	int peliculasParticipadas; 

	/**
	 * Creamos el constructor para el objeto "Actor", que añadira un nombre 
	 * predefinido y un número de peliculas participadas por defecto (1).
	 */
	public Actor() {
		nombre="nombre desconocido";
		peliculasParticipadas = 1;
	}
	
	/**
	 * Los getter y los setter que nos devuelven los valores sus valores
	 * respectivamente y nos permiten modificar su valor.
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre = Nombre;
		
	}

	public Object getPeliculasParticipadas() {
		return peliculasParticipadas;	
	}

	public void setPeliculasParticipadas(int peliculasParticipadas) {
		this.peliculasParticipadas = peliculasParticipadas;
	}
}