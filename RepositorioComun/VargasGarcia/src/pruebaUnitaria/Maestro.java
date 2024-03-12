package pruebaUnitaria;

public class Maestro {
/** 
 * Clase que 
 * @author Lucia Vargas
 * @version 1.0 12/03/2024
 */
		/**
		 * Declaracion de las variables
		 */
		//campos
			private String nombre; //nombre del maestro
			private int maximoAlumnos; // maximo de alumnos de un maestro
			
		/**
		 * Constructor que construye un Maestro iniciando el nombre a null y estableciendo un 
		 * numero maximo de alumnos
		 * @param void {@link void} espera que le demos un parámetro de tipo cadena de texto 
		 */
		//constructores
			public Maestro() {
				nombre = "null";
				maximoAlumnos = 30;
			}
			
		/**
		 * Declaracion de Getter y Setter para el nombre y maximo de alumnos por maestro
		 * @return los Getters devuelven el atributo pedido y los Setters establecen un nuevo dato
		 */
		//métodos	
			public String getNombre() {
				return nombre;
				
			}
			public void setNombre(String cualquierNombre) {
				nombre = cualquierNombre;
				
			}
			public int getMaximoAlumnos() {
				return maximoAlumnos;
				
			}
			public void setMaximoAlumnos(int maximoAlumnos) {
				this.maximoAlumnos = maximoAlumnos;
			}
			public String toString() {
				return this.getNombre() + " (" + this.getMaximoAlumnos() + " alumnos)";		
			}


	

	}


