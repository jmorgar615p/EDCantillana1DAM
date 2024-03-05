package DesarrolloGuiado;

import java.util.Random;

public class Medico {
	private String idMedico;
	private String nombre;
	private String especialidad;
	
	public Medico() {
		idMedico = generarCadenaAleatoria();
		nombre = "";
		especialidad = "";
	}
	  public String getIdMedico() {
	        return idMedico;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getEspecialidad() {
	        return especialidad;
	    }

	    public void setEspecialidad(String especialidad) {
	        this.especialidad = especialidad;
	    }
	    private String generarCadenaAleatoria() {
	        int longitud = 5;
	        StringBuilder cadenaAleatoria = new StringBuilder();

	        // Caracteres permitidos en la cadena
	        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	        Random random = new Random();

	        for (int i = 0; i < longitud; i++) {
	            int indice = random.nextInt(caracteres.length());
	            char caracterAleatorio = caracteres.charAt(indice);
	            cadenaAleatoria.append(caracterAleatorio);
	        }

	        return cadenaAleatoria.toString();
	    
}
}