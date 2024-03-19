package org.restaurante;

public class Restaurante {
	 
    private String nombreRestaurante;
    private int platosVendidos;

    public Restaurante() {
        nombreRestaurante= "Nombre Desconocido";
        platosVendidos = 5; 
    }

    // Getters y setters
    
    public String getNombreRestaurante() {
    	return nombreRestaurante; 
    }
    
    public void setNombreRestaurante(String cualquierNombre) {
    	nombreRestaurante= cualquierNombre;
    }
    
    public int getPlatosVendidos() {
    	return platosVendidos;
    }
    
    public void setPlatosVendidos (int platosVendidos) {
    	this.platosVendidos=platosVendidos;
    }
    
    public String toString() {
    	return this.getNombreRestaurante() + " (" + this.getPlatosVendidos() + "coches)"; 
    	}

	public void setRelacionA(Plato elementoA) {
		// TODO Auto-generated method stub
		Plato relacionA = elementoA;
	}

	public Object getRelacionA() {
		// TODO Auto-generated method stub
		return getRelacionA();
	}

	
}
