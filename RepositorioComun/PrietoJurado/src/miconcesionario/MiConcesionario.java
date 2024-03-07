package src.miconcesionario;

import java.util.ArrayList;

/**
 * Clase que representa un concesionario de coches.
 */
public class MiConcesionario {

	/**
     * Nombre del concesionario.
     */
	public String nombre;
	/**
     * Lista de marcas de coches disponibles en el concesionario.
     */
	public ArrayList<MarcaCoche> marca;
	/**
     * Lista de vendedores que trabajan en el concesionario.
     */
	public ArrayList<Vendedor> vendedor;
	
	/**
     * Constructor de la clase MiConcesionario.
     * @param nombre Nombre del concesionario.
     */
	public MiConcesionario(String nombre) {
		this.nombre = nombre;
		marca = new ArrayList<MarcaCoche>();
		vendedor = new ArrayList<Vendedor>();
	}
/*
	public String getNombre() {
		return nombre;
	}
*/
	/**
     * Obtiene la lista de marcas de coches disponibles en el concesionario.
     * @return Lista de marcas de coches.
     */
	public ArrayList<MarcaCoche> getMarca() {
		return marca;
	}
/*
	public ArrayList<Vendedor> getVendedor() {
		return vendedor;
	}
*/
	/**
     * Añade una marca de coches al concesionario.
     * @param c1 Marca de coches a añadir.
     */
	public void addMarca(MarcaCoche c1) {
		this.marca.add(c1);
		
	}

	/**
     * Elimina una marca de coches del concesionario.
     * @param c1 Marca de coches a eliminar.
     */
	public void removeMarca(MarcaCoche c1) {
		this.marca.remove(c1);
		
	}

}
