package src.miconcesionario;

/**
 * Clase que representa a un vendedor de un concesionario.
 *
 * @author Juan Pablo González
 */
public class Vendedor {
	//Campos
	private String nombre;
	private int cochesVendidos;

	//Constructores
	/**
     * Constructor por defecto.
     *
     * Crea un vendedor con nombre "Nombre Desconocido" y 3 coches vendidos.
     */
	public Vendedor() {
		nombre = "Nombre Desconocido";
		cochesVendidos = 3;
	}
	
	//Métodos
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
	public void setCochesVendidos(int cochesVendidos) {
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
