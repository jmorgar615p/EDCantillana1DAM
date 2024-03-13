package src.miconcesionario;

/**
 * Clase que representa a un vendedor de un concesionario.
 *
 * @author Rubén Prieto Jurado
 */
public class Vendedor extends Superclass_Vendedor implements Interfaz_Vendedor {
	//Constructores
	/**
     * Constructor por defecto.
     *
     * Crea un vendedor con nombre "Nombre Desconocido" y 3 coches vendidos.
     */
	public Vendedor() {
		super();
		nombre = "Nombre Desconocido";
		cochesVendidos = 3;
	}

	public void setCochesVendidos(int cochesVendidos) {
		// TODO Auto-generated method stub
		
	}

	public void setCochesVendidos(int cochesVendidos, Interfaz_Vendedor v3) {
		// TODO Auto-generated method stub
		
	}

	public void setNombre(String anyName, Interfaz_Vendedor v2) {
		// TODO Auto-generated method stub
		
	}
	public String getNombre(Interfaz_Vendedor interfaz_Vendedor) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getNombre(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	}
