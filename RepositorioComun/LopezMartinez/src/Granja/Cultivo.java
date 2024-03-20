package Granja;

/**
 * Definición de la clase Cultivo
 * 
 * @autor Maria
 * @version 1.0 19/03/2024
 */

public class Cultivo {
    /** Tipo de cultivo (ej. Trigo, Maíz, etc.) */
    private String tipo;
    /** Área del cultivo en metros cuadrados */
    private double area;

    /** Constructor de la clase Cultivo */
    public Cultivo(String tipo, double area) {
        this.tipo = tipo;
        this.area = area;
    }

    /** Métodos getter y setter para el tipo de cultivo */
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /** Métodos getter y setter para el área del cultivo */
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
