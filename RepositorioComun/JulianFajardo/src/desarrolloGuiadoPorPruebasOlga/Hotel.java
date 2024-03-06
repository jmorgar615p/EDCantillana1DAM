package desarrolloGuiadoPorPruebasOlga;

import java.util.ArrayList;

public class Hotel {

String nombreHotel;
ArrayList<Cliente> cliente;
ArrayList<Habitacion> habitacion;


public Hotel(String nombreHotel) {
	this.nombreHotel = nombreHotel;
	cliente = new ArrayList<Cliente>();
	habitacion = new ArrayList<Habitacion>();	
}


	
	public String getNombreHotel() {
		return nombreHotel;
	}



	public ArrayList<Cliente> getCliente() {
		return cliente;
	}



	public ArrayList<Habitacion> getHabitacion() {
		return habitacion;
	}



	public void addCliente(Cliente c1) {
		this.cliente.add(c1);
		
	}


	public void borrarCliente(Cliente c1) {
		this.cliente.remove(c1);
		
	}	
	
	public void addHabitacion(Habitacion h1) {
		this.habitacion.add(h1);
	}
	
	public void borrarHabitacion(Habitacion h1) {
		this.habitacion.remove(h1);
		
	}
	
	
}//fin

