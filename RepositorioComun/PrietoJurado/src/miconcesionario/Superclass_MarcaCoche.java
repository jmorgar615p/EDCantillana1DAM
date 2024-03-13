package src.miconcesionario;

public class Superclass_MarcaCoche {

	/**
	 * Nombre de la marca del coche.
	 */
	public String nombremarca;
	/**
	 * Nombre del vendedor que vende coches de esta marca.
	 */
	public String vendedor;
	/**
	 * Objeto que representa al vendedor que vende coches de esta marca.
	 */
	Interfaz_Vendedor Vendedor;

	public Superclass_MarcaCoche() {
		super();
	}

	/**
	 * Establece el objeto que representa al vendedor que vende coches de esta marca.
	 *
	 * @param v2 Objeto que representa al vendedor que vende coches de esta marca.
	 */
	public void setNombre(Interfaz_Vendedor v2, MarcaCoche marcaCoche) {
		this.Vendedor = v2;
		
	}

	/**
	 * Devuelve el objeto que representa al vendedor que vende coches de esta marca.
	 *
	 * @return Objeto que representa al vendedor que vende coches de esta marca.
	 */
	public Interfaz_Vendedor getNombre(MarcaCoche marcaCoche) {
		return this.Vendedor;
	}

}