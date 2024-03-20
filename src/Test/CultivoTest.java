package Test;

/** Clase que representa un cultivo
* @autor Maria
* @version 1.0 19/03/2024
*/
public class CultivoTest {
    /** Constantes para tipos de cultivo comunes*/
    public static final String TRIGO = "Trigo";
    public static final String MAIZ = "Maíz";

    private String tipo = ""; /** Tipo de cultivo*/
    private double area; /** Área del cultivo en metros cuadrados*/

    /**
     * Constructor de la clase Cultivo
     * @param tipo
     * @param area
     */
    public void Cultivo(String tipo, double area) {
        this.tipo = tipo;
        this.area = area;
    }

    /**
     * Métodos de acceso para el tipo de cultivo y el área del cultivo
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Método toString para representar el objeto como cadena de texto
     */
    @Override
    public String toString() {
        return "Cultivo [tipo=" + tipo + ", area=" + area + "]";
    }
}
