package src.miconcesionario;

public interface Interfaz_Vendedor {

	//Métodos
	/**
	 * Obtiene el nombre del vendedor.
	 *
	 * @return El nombre del vendedor.
	 */
	String getNombre();

	/**
	 * Establece el nombre del vendedor.
	 *
	 * @param nombre El nuevo nombre del vendedor.
	 */
	void setNombre(String anyName);

	/**
	 * Obtiene el número de coches vendidos por el vendedor.
	 *
	 * @return El número de coches vendidos por el vendedor.
	 */
	int getCochesVendidos();

	/**
	 * Establece el número de coches vendidos por el vendedor.
	 *
	 * @param cochesVendidos El nuevo número de coches vendidos por el vendedor.
	 */
	void setCochesVendidos(int cochesVendidos);

	/**
	 * Devuelve una representación en cadena del vendedor.
	 *
	 * @return La representación en cadena del vendedor.
	 */
	String toString();

}