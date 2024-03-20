package veterinaria;
/**
 * clase que se encarga de controlar el funcionamiento de trabajador
 * @author Roberto
 * @version 1.0
 */

public class Trabajador {


	/**
	 * Definicion de los atributos
	 */
		private String nombre;
		private int maximoAnimales;
		
		/**
		 * Constructor Trabajador
		 */
		//Constructores
		public Trabajador() {
			nombre = "Sin identificar";
			maximoAnimales = 3;
		}
		
		/**
		 * Metodo que devuelve el nombre
		 * @return
		 */
		//Metodos
		public String getNombre() {
			return nombre;
		}
		
		/**
		 * Metodo que establece el nombre
		 * @param algunNombre
		 */
		public void setNombre(String algunNombre) {
			nombre = algunNombre;
			
		}

		/**
		 * Metodo que devuelve el maximo de animales
		 * @return
		 */
		public int getMaximoAnimales() {
			return maximoAnimales;
		}

		/**
		 * Metodo que establece el maximo animales 
		 * @param maximoAnimales
		 */
		public void setMaximoAnimales(int maximoAnimales) {
			this.maximoAnimales = maximoAnimales;
		}
		
		/**
		 * Metodo que devuelve un string
		 */
		public String toString() {
			return this.getNombre() + " (" + this.getMaximoAnimales() + " Animales)";
		}
		
		
}
