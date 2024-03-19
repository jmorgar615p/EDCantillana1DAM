package src.miconcesionario;

/**
 * Clase que representa una marca de coche.
 */
public class MarcaCoche {

    /**
     * Nombre de la marca del coche.
     */
    private String nombremarca;

    /**
     * Nombre del vendedor del coche.
     */
    private String vendedor;

    /**
     * Objeto que representa al vendedor del coche.
     */
    private Vendedor Vendedor;

    /**
     * Constructor de la clase MarcaCoche.
     * @param nombremarca Nombre de la marca del coche.
     */
    public MarcaCoche(String nombremarca) {
        this.nombremarca = nombremarca;
        this.vendedor = "Vendedor Desconocido";
    }

    /**
     * Método que devuelve el nombre del vendedor del coche.
     * @return Nombre del vendedor del coche.
     */
    public String getvendedor() {
        return vendedor;
    }

    /**
     * Método que establece el nombre del vendedor del coche.
     * @param Vendedor Nombre del vendedor del coche.
     */
    public void setVendedor(String Vendedor) {
        this.vendedor = Vendedor;
    }

    /**
     * Método que devuelve el nombre de la marca del coche.
     * @return Nombre de la marca del coche.
     */
    public String getNombreMarca() {
        return nombremarca;
    }

    /**
     * Método que establece el vendedor del coche.
     * @param v2 Objeto que representa al vendedor del coche.
     */
    public void setVendedor(Vendedor v2) {
        this.Vendedor = v2;
    }

    /**
     * Método que devuelve el objetvendedor del coche.
     * @return Objeto que representa al vendedor del coche.
     */
    public Vendedor getVendedor() {
        return this.Vendedor;
    }

    /**
     * Método que devuelve una representación en forma de cadena de la marca de coche.
     * @return Cadena que representa la marca de coche.
     */
    public String toString() {
        String disponible;
        if (this.getVendedor() == null) {
            disponible = "Disponible";
        } else {
            disponible = "Reservado por " + this.getVendedor().getNombre();
        }
        return this.nombremarca + " por " + this.getvendedor() + "; " + disponible;
    }

    /**
     * Método que establece el vendedor de la marca de coche.
     * @param c1 Objeto que representa la marca de coche.
     */
    public void setVendedor(MarcaCoche c1) {
        // TODO Auto-generated method stub
    }
}

