package escaperoom;

public class Sesion {

	String title;
	String origen;
	Cliente cliente;

	public Sesion(String string) {
		this.title = string;
		this.origen = "Origen desconocido";
	}
/*
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getTitle() {
		return title;
	}
*/
	public void setCliente(Cliente cl2) {
		this.cliente = cl2;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

}
