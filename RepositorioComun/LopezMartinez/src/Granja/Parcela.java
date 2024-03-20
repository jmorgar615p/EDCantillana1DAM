package Granja;

/**
 * Definición de la clase Parcela
 * 
 * @autor Maria
 * @version 1.0 19/03/2024
 */
public class Parcela {
    private int numero; // Número de la parcela
    private Cultivo cultivo; // Cultivo asociado a la parcela

    /** Constructor de la clase Parcela */
    public Parcela(int numero, Cultivo cultivo) {
        this.numero = numero;
        this.cultivo = cultivo;
    }

    /** Método getter para el número de parcela */
    public int getNumero() {
        return numero;
    }

    /** Método setter para el número de parcela */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Método getter para el cultivo asociado a la parcela
     * 
     * @return
     */
    public Cultivo getCultivo() {
        return cultivo;
    }

    /**
     * Método setter para el cultivo asociado a la parcela
     * 
     * @param cultivo
     */
    public void setCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }

    /**
     * Método para calcular el área de la parcela
     * 
     * @return El área de la parcela en metros cuadrados
     */
    public double calcularAreaParcela() {
        return cultivo.getArea(); // Se obtiene el área del cultivo asociado a la parcela
    }
}
