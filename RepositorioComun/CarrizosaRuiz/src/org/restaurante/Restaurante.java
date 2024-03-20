/**
 * Define el paquete al que pertenece la clase.
 */
package src.org.restaurante;

import src.org.restaurante.Plato;

public class Restaurante {
	 
	/**
	 * Aquí se declaran dos variables miembro privadas: nombreRestaurante, que almacenará el nombre del restaurante, y platosVendidos, que almacenará la cantidad de platos vendidos.
	 */
    private String nombreRestaurante;
    private int platosVendidos;

    /**
     * Constructor de la clase restaurante
     */
    public Restaurante() {
        nombreRestaurante= "Nombre Desconocido";
        platosVendidos = 5; 
    }

    // Getters y setters
    
    /**
     * devuelve el valor actual del nombre del restaurante.
     * @return
     */
    
    public String getNombreRestaurante() {
    	return nombreRestaurante; 
    }
    
    /**
     * permite establecer el nombre del restaurante
     * @param cualquierNombre
     */
    public void setNombreRestaurante(String cualquierNombre) {
    	nombreRestaurante= cualquierNombre;
    }
    /**
     * devuelve el valor actual de la cantidad de platos vendidos.
     * @return
     */
    public int getPlatosVendidos() {
    	return platosVendidos;
    }
    /**
     * permite establecer la cantidad de platos vendidos
     * @param platosVendidos
     */
    public void setPlatosVendidos (int platosVendidos) {
    	this.platosVendidos=platosVendidos;
    }
    
    /**
     * Retorna una representación en forma de cadena del objeto Restaurante, incluyendo el nombre del restaurante y la cantidad de platos vendidos.
     */
    public String toString() {
    	return this.getNombreRestaurante() + " (" + this.getPlatosVendidos() + "coches)"; 
    	}

    /**
     * Debería establecer una relación con un objeto de tipo Plato
     * @param elementoA
     */
	public void setRelacionA(Plato elementoA) {
		Plato relacionA = elementoA;
	}
	/**
	 * Debería retornar la relación establecida por setRelacionA()
	 * @return
	 */
	public Object getRelacionA() {
		return getRelacionA();
	}

	
}
