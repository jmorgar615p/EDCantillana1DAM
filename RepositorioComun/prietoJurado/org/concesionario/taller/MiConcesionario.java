package org.concesionario.taller;

import java.util.ArrayList;

public class MiConcesionario {

	String nombre;
	ArrayList<MarcaCoche> marca;
	ArrayList<Vendedor> vendedor;
	
	public MiConcesionario(String nombre) {
		this.nombre = nombre;
		marca = new ArrayList<MarcaCoche>();
		vendedor = new ArrayList<Vendedor>();
	}
/*
	public String getNombre() {
		return nombre;
	}
*/
	public ArrayList<MarcaCoche> getMarca() {
		return marca;
	}
/*
	public ArrayList<Vendedor> getVendedor() {
		return vendedor;
	}
*/
	public void addMarca(MarcaCoche c1) {
		this.marca.add(c1);
		
	}

	public void removeMarca(MarcaCoche c1) {
		this.marca.remove(c1);
		
	}

}
