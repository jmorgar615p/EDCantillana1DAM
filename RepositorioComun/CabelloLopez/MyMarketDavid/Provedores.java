package MyMarketDavid;
/**Declaracion de clases**/
public class Provedores {
	private String nombre; 
	private int maximoProductos; 
/**Declaracion de propiedades de Provedores**/
	public Provedores() {
		nombre="nombre desconocido";
		maximoProductos = 10;
	}
/**Setter y Getter de Nombre**/
	public void setNombre(String cualquierNombre) {
		nombre = cualquierNombre;
		
	}
	public String getNombre() {
		return nombre;
		
	}
	/**Setter y Getter de "MaximoProductos**/
	public void setMaximoProductos(int maximoProductos) {
		this.maximoProductos = maximoProductos;
	}
	
	public int getMaximoProductos() {
		return maximoProductos;
		
	}
	
	public String toString() {
		return this.getNombre()+ " ("+this.getMaximoProductos()+" Estanteria)";		
	}


}
