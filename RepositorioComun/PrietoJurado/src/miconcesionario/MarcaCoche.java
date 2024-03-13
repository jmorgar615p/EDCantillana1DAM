/**
 * Representa una marca de coche en el concesionario.
 */
package src.miconcesionario;
/**
 * Clase que representa una marca de coche en el concesionario.
 *
 * @author Rubén Prieto Jurado
 */
public class MarcaCoche extends Superclass_MarcaCoche implements InterfazMarcaCoche {
	/**
     * Constructor de la clase MarcaCoche.
     *
     * @param nombremarca Nombre de la marca del coche.
     */
	public MarcaCoche(String string) {
		super();
		this.nombremarca = string;
		this.vendedor = "Vendedor Desconocido";
	}

	public void setNombre(Interfaz_Vendedor v2) {
		// TODO Auto-generated method stub
		
	}

	public Interfaz_Vendedor getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNombre(Interfaz_Vendedor v2, InterfazMarcaCoche c2) {
		// TODO Auto-generated method stub
		
	}

}