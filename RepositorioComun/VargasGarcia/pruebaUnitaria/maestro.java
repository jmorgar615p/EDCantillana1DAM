package pruebaUnitaria;

public class maestro {

		//campos
			private String nombre; //nombre del maestro
			private int maximoAlumnos; // maximo de alumnos de un maestro
			
		//constructores
			public maestro() {
				nombre="null";
				maximoAlumnos = 30;
			}
			
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


