package barcoPesquero;

import java.util.ArrayList;

public class Puerto {

	 String nombre;
	 ArrayList <Lago> lago;
	 ArrayList <Barco> barco;

	public Puerto(String nombre) {
		this.nombre = nombre;
		
		lago = new ArrayList<Lago>();
		barco = new ArrayList<Barco>();
	
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Lago> getLago() {
		return lago;
	}

	public ArrayList<Barco> getBarco() {
		return barco;
	}

	public void nuevoLago(Lago lago1) {
		this.lago.add(lago1);
		
	}

	public void eliminarLago(Lago lago1) {
		this.lago.remove(lago1);
	}
	
	public void nuevoBarco(Barco barco1) {
		this.barco.add(barco1);
	}
	
	public void eliminarBarco(Barco barco1) {
		this.barco.remove(barco1);
	}

	public boolean comprobar(Lago lago1, Barco barco1) {
		if (lago1.getBarco() == null) {
			lago1.setBarco(barco1);
			return true;
			
		} else {
		return false;
		}
	}

	public boolean comprobar(Lago lago1) {
		if (lago1.getBarco() != null) {
			lago1.setBarco(null);
			return true;
		} else {
		return false;
		}
	}
	
}
