
/**
 * Define el paquete al que pertenece la clase.
 */
package org.restaurante;

/**
 * Declaración de la clase pública llamada Plato.
 */
public class Plato {
	
	/**
	 * Declaración de dos variables de instancia públicas.
	 */
	public String nombrePlato;
	public String vendedor;
	
	/**
	 *  Método que inicializa el nombre del plato y establece el vendedor como "Vendedor desconocido".
	 * @param string
	 */
	public void PlatoNombre (String string) {
		this.nombrePlato=string;
		this.vendedor ="Vendedor desconocido";
	}
	
	/**
	 *  Método para obtener el nombre del plato.
	 * @return
	 */
	public String getNombrePlato () {
		return nombrePlato;
	}
	
	/**
	 *  Método para establecer el nombre del plato.
	 * @param nombrePlato
	 */
	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}
	
	/**
	 *  Método para obtener el vendedor.
	 * @return
	 */
	public String getVendedor() {
		return vendedor;
	}
}
