package src.miconcesionario;

public interface InterfazMarcaCoche {

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
	void setNombre(Interfaz_Vendedor v2);

	/**
	 * Devuelve el objeto que representa al vendedor que vende coches de esta marca.
	 *
	 * @return Objeto que representa al vendedor que vende coches de esta marca.
	 */
	Interfaz_Vendedor getNombre();

}