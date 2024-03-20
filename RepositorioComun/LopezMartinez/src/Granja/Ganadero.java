package Granja;

import java.util.ArrayList;
import java.util.List;

/**
 * Definición de la clase Ganadero
 * 
 * @autor Maria
 * @version 1.0 19/03/2024
 */
public class Ganadero {
    private String nombre; // Nombre del ganadero
    private List<Parcela> parcelas; // Lista de parcelas que posee el ganadero

    /** Constructor de la clase Ganadero */
    public Ganadero(String nombre) {
        this.nombre = nombre;
        this.parcelas = new ArrayList<>(); // Inicialización de la lista de parcelas
    }

    /** Método getter para el nombre del ganadero */
    public String getNombre() {
        return nombre;
    }

    /** Método setter para el nombre del ganadero */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Método getter para obtener la lista de parcelas del ganadero */
    public List<Parcela> getParcelas() {
        return parcelas;
    }

    /** Método para agregar una parcela a la lista de parcelas del ganadero */
    public void agregarParcela(Parcela parcela) {
        this.parcelas.add(parcela);
    }
}
