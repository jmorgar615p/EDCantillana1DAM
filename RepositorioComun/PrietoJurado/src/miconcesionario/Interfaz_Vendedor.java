package src.miconcesionario;

public interface Interfaz_Vendedor {

	//Métodos
	/**
	 * Obtiene el nombre del vendedor.
	 * @param interfaz_Vendedor 
	 * @return El nombre del vendedor.
	 */
	String getNombre(Interfaz_Vendedor interfaz_Vendedor);

	/**
	 * Establece el nombre del vendedor.
	 * @param v2 
	 * @param nombre El nuevo nombre del vendedor.
	 */
	void setNombre(String anyName, Interfaz_Vendedor v2);

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
	 * @param v3 
	 */
	void setCochesVendidos(int cochesVendidos, Interfaz_Vendedor v3);

	/**
	 * Devuelve una representación en cadena del vendedor.
	 *
	 * @return La representación en cadena del vendedor.
	 */
	String toString();

	String getNombre(String string);

}