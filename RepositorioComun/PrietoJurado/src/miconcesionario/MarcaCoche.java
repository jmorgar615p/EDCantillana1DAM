/**
 * Representa una marca de coche en el concesionario.
 */
package src.miconcesionario;
/**
 * Clase que representa una marca de coche en el concesionario.
 *
 * @author Rubén Prieto Jurado
 */
public class MarcaCoche implements InterfazMarcaCoche {
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
	
	/**
     * Constructor de la clase MarcaCoche.
     *
     * @param nombremarca Nombre de la marca del coche.
     */
	public MarcaCoche(String string) {
		this.nombremarca = string;
		this.vendedor = "Vendedor Desconocido";
	}
/*
	public String getNombremarca() {
		return nombremarca;
	}

	public void setNombremarca(String nombremarca) {
		this.nombremarca = nombremarca;
	}

	public String getVendedor() {
		return vendedor;
	}
*/
	/**
     * Establece el objeto que representa al vendedor que vende coches de esta marca.
     *
     * @param v2 Objeto que representa al vendedor que vende coches de esta marca.
     */
	@Override
	public void setNombre(Interfaz_Vendedor v2) {
		this.Vendedor = v2;
		
	}
	
	/**
     * Devuelve el objeto que representa al vendedor que vende coches de esta marca.
     *
     * @return Objeto que representa al vendedor que vende coches de esta marca.
     */
	@Override
	public Interfaz_Vendedor getNombre() {
		return this.Vendedor;
	}

}