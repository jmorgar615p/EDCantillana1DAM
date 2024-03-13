package src.miconcesionario;

import java.util.ArrayList;

public interface InterfazConcesionario {

	/*
		public String getNombre() {
			return nombre;
		}
	*/
	/**
	 * Obtiene la lista de marcas de coches disponibles en el concesionario.
	 * @return Lista de marcas de coches.
	 */
	ArrayList<MarcaCoche> getMarca();

	/*
		public ArrayList<Vendedor> getVendedor() {
			return vendedor;
		}
	*/
	/**
	 * Añade una marca de coches al concesionario.
	 * @param c1 Marca de coches a añadir.
	 */
	void addMarca(MarcaCoche c1);

	/**
	 * Elimina una marca de coches del concesionario.
	 * @param c1 Marca de coches a eliminar.
	 */
	void removeMarca(InterfazMarcaCoche c1);

}