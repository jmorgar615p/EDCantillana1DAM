package barcoPesquero;

public class Barco {

	private String nombre;			// Nombre del barco
	private int anyosAntiguedad;  //Años de antiguedad del barco
	
	public Barco () {
	
		nombre = "Desconocido";
		anyosAntiguedad = 1;
		
	}
	
	
	

	public String getNombre() {
		
		return nombre;
	}
	
	

	public void setNombre(String cualquierNombre) {
	
		nombre = cualquierNombre;
	}




	public int getAnyosAntiguedad() {
		return anyosAntiguedad;
	}




	public void setAnyosAntiguedad(int anyosAntiguedad) {
		this.anyosAntiguedad = anyosAntiguedad;
	} 
	
	public String toString() {
		return this.getNombre() + " (" + this.getAnyosAntiguedad() + " años de antiguedad)";
	}
		
		
}
