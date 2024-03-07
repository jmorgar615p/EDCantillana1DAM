package src.miconcesionario;

public class Vendedor {
	//Campos
	private String nombre;
	private int cochesVendidos;

	//Constructores
	public Vendedor() {
		nombre = "Nombre Desconocido";
		cochesVendidos = 3;
	}
	
	//Métodos
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String anyName) {
		nombre = anyName;
	}

	public int getCochesVendidos() {
		return cochesVendidos;
	}

	public void setCochesVendidos(int cochesVendidos) {
		this.cochesVendidos = cochesVendidos;
	}
	
	public String toString() {
		return this.getNombre() + " (" + this.getCochesVendidos() + " coches)";
	}

	}
