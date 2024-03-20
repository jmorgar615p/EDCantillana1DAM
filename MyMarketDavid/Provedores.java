package MyMarketDavid;
/**Declaracion de clases**/
public class Provedores implements InterfazProvedores {
	private String nombre; 
	private int maximoProductos; 
/**Declaracion de propiedades de Provedores**/
	public Provedores() {
		nombre="nombre desconocido";
		maximoProductos = 10;
	}
/**Setter y Getter de Nombre**/
	@Override
	public void setNombre(String cualquierNombre) {
		nombre = cualquierNombre;
		
	}
	@Override
	public String getNombre() {
		return nombre;
		
	}
	/**Setter y Getter de "MaximoProductos**/
	@Override
	public void setMaximoProductos(int maximoProductos) {
		this.maximoProductos = maximoProductos;
	}
	
	@Override
	public int getMaximoProductos() {
		return maximoProductos;
		
	}
	
	@Override
	public String toString() {
		return this.getNombre()+ " ("+this.getMaximoProductos()+" Estanteria)";		
	}


}
