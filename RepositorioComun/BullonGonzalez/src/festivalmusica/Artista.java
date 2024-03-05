package festivalmusica;

public class Artista {

	public String nombre;
	public int maximoEntradas;

	public Artista(String string) {
		this.nombre = string;
		this.maximoEntradas = 1000;
	}

	public void setNombre(String string) {
		this.nombre = string;
		
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setMaximoEntradas(int i) {
		this.maximoEntradas = i;
		
	}

	public int getMaximoEntradas() {
		return this.maximoEntradas;
	}

}
