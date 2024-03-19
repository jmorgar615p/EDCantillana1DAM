package src.miconcesionario;

/**
 * Clase que representa a un vendedor en un concesionario de coches.
 */
public class Vendedor {

    /**
     * Nombre del vendedor.
     */
    private String nombre;

    /**
     * Número de coches vendidos por el vendedor.
     */
    private int cochesVendidos;

    /**
     * Constructor de la clase Vendedor sin parámetros. Establece el nombre en
     * "Nombre Desconocido" y el número de coches vendidos en 3.
     */
    public Vendedor() {
        nombre = "Nombre Desconocido";
        cochesVendidos = 3;
    }

    /**
     * Obtiene el nombre del vendedor.
     *
     * @return Nombre del vendedor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del vendedor.
     *
     * @param anyName Nombre del vendedor.
     */
    public void setNombre(String anyName) {
        nombre = anyName;
    }

    /**
     * Obtiene el número de coches vendidos por el vendedor.
     *
     * @return Número de coches vendidos.
     */
    public int getCochesVendidos() {
        return cochesVendidos;
    }

    /**
     * Establece el número de coches vendidos por el vendedor.
     *
     * @param cochesVendidos Número de coches vendidos.
     */
    public void setCochesVendidos(int cochesVendidos) {
        this.cochesVendidos = cochesVendidos;
    }

    /**
     * Devuelve una representación en forma de cadena del vendedor.
     *
     * @return Cadena con la representación del vendedor.
     */
    @Override
    public String toString() {
    	return this.getNombre() + " (" + this.getCochesVendidos() + " coches)";
    }

	}
