package src.miconcesionario;

public class Superclass_Vendedor {

	protected String nombre;
	protected int cochesVendidos;

	public Superclass_Vendedor() {
		super();
	}

	/**
	 * Obtiene el nombre del vendedor.
	 *
	 * @return El nombre del vendedor.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del vendedor.
	 *
	 * @param nombre El nuevo nombre del vendedor.
	 */
	public void setNombre(String anyName) {
		nombre = anyName;
	}

	/**
	 * Obtiene el número de coches vendidos por el vendedor.
	 *
	 * @return El número de coches vendidos por el vendedor.
	 */
	public int getCochesVendidos() {
		return cochesVendidos;
	}

	/**
	 * Establece el número de coches vendidos por el vendedor.
	 *
	 * @param cochesVendidos El nuevo número de coches vendidos por el vendedor.
	 */
	public void setCochesVendidos(int cochesVendidos, Vendedor vendedor) {
		this.cochesVendidos = cochesVendidos;
	}

	/**
	 * Devuelve una representación en cadena del vendedor.
	 *
	 * @return La representación en cadena del vendedor.
	 */
	public String toString() {
		return this.getNombre() + " (" + this.getCochesVendidos() + " coches)";
	}

}