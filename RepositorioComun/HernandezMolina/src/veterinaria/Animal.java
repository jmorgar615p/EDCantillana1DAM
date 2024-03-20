package veterinaria;

/**
 * clase que se encarga de controlar el funcionamiento de animal
 * @author Roberto
 * @version 1.0
 */

public class Animal {
	
	/**
	 * Definicion de los atributos
	 */

	 String tipo;
	 String especie;
	 Trabajador trabajador;
	 
	 /**
	  * Tipo y especie de animal
	  * @param string
	  */

	public Animal(String string) {
		this.tipo = string;
		this.especie = "Especie desconocida";
		
	}

	/**
	 * devuelve la especie
	 * @return
	 */
	public String getEspecie() {
		return especie;
	}

	/**
	 * establecer especie
	 * @param especie
	 */
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	/**
	 * devuelve el tipo de animal
	 * @return
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * establece el trabajador
	 * @param p2
	 */
	public void setTrabajador(Trabajador p2) {
		this.trabajador = p2;
		
	}

	/**
	 * devuelve el trabajador
	 * @param p2
	 */
	public Trabajador getTrabajador() {
		return this.trabajador;
	}
	
	/**
	 * Devuelve un string
	 */
	public String toString() {
		String disponible;
		if (this.getTrabajador() == null) {
			disponible = "Disponible";
		}
		else {
			disponible = "Marcado" + this.getTrabajador().getNombre();
;		}
		return this.getTipo() + " de " + this.getEspecie() + "; " + disponible;
	}

}
