package festivalmusica;

public class Entrada {

	
	public String tipo;
	public int cantidad;
	public Artista artista;
	
	public Entrada(String string, int cantidad) {
		this.tipo = string;
		this.cantidad = cantidad;
	}

	

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Artista getArtista() {
		return this.artista;
	}
	
	public void setArtista(Artista a1) {
		this.artista = a1;
		
	}

}
