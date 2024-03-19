package principiante;

public class Provedores {
	private String nombre; //nombre de la persona
	private int maximoProductos; // maximo de libros de una persona

	public Provedores() {
		nombre="nombre desconocido";
		maximoProductos = 10;
	}

	public String getNombre() {
		return nombre;
		
	}
	public void setNombre(String cualquierNombre) {
		nombre = cualquierNombre;
		
	}
	public int getMaximoProductos() {
		return maximoProductos;
		
	}
	public void setMaximoProductos(int maximoProductos) {
		this.maximoProductos = maximoProductos;
	}
	public String toString() {
		return this.getNombre()+ " ("+this.getMaximoProductos()+" Estanteria)";		
	}


}
