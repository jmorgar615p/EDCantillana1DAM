package escaperoom;

import java.util.ArrayList;

public class MyEscapeRoom {

	String nombre;
	ArrayList<Sesion> sesion;
	ArrayList<Cliente> cliente;

	public MyEscapeRoom(String nombre) {
		this.nombre = nombre;	
		sesion = new ArrayList<Sesion>();
		cliente = new ArrayList<Cliente>();
	}
}
