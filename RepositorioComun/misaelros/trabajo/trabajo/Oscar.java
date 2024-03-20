package trabajo;

public class Oscar {

	/**
	 * Inicializamos las variables que utilizaremos en el código.
	 */
	String nombre;

	/**
	 * Declaramos el objeto Oscar, al cual a la hora de crearse, necesita que
	 * se pase como argumento el nombre del actor que a ganado el oscar.
	 * 
	 * @param nombre
	 */
	public Oscar(String nombre) {
		this.nombre = nombre;
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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
