package barcoPesquero;

public class Lago {

	public String nombre;
	public String pezPrincipal;
	Barco barco;
	

	public Lago(String string) {
		
		
		this.nombre = string;
		this.pezPrincipal = "Especie Desconocida";
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPezPrincipal() {
		return pezPrincipal;
	}

	public void setBarco(Barco barco2) {
		this.barco = barco2;
		
	}
	
	public Barco getBarco() {
		
		return this.barco;	
		}

	
	
}
