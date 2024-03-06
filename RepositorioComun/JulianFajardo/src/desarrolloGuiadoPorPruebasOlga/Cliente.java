package desarrolloGuiadoPorPruebasOlga;

public class Cliente {

	String nombre;
	String apellido;
	Habitacion habitacion;

	public Cliente(String string) {
		// TODO Auto-generated constructor stub
		this.nombre = string;
		this.apellido = string;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setMaxPersonas(Habitacion h2) {
		this.habitacion = h2;
		
	}

	public Habitacion nombreHab() {
		return this.habitacion;
	}

	
	
	
	
	
	
}//fin
