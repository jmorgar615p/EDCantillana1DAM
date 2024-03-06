package veterinaria;

public class Veterinario {
	
	private String nombre;
	private int animalesMaximos;
	
	
	public Veterinario() {
		nombre = "Nombre desconocido";
		animalesMaximos = 3;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String algunNombre) {
		nombre = algunNombre;
	}
	
	public int getMaximoAnimales() {
		return animalesMaximos;		
	}
	
	public void setMaximoAnimales(int animalesMaximos) {
		this.animalesMaximos = animalesMaximos;
	}
	
	public String toString() {
		return this.getNombre() + "(" + this.getMaximoAnimales() + "animales)";
	}


}
