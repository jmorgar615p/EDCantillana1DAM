package EmpresaSeguros;

/** Definici�n de la clase Poliza**/
public class Poliza {
    /** Atributos de la clase Poliza**/
    private String tipo; /** Tipo de poliza**/
    private double monto; /** Monto asegurado**/
    private Asegurado asegurado; /** Informacion sobre el asegurado**/

    /** Constructor de la clase Poliza**/
    public Poliza(String tipo, double monto, Asegurado asegurado) {
        this.tipo = tipo; /** Asigna el tipo de poliza recibido como parametro**/
        this.monto = monto; /** Asigna el monto recibido como parametro**/
        this.asegurado = asegurado; /** Asigna el asegurado recibido como parametro**/
    }

    /** Metodo getter para obtener el tipo de poliza**/
    public String getTipo() {
        return tipo; /** Devuelve el tipo de poliza**/
    }

    /** Metodo setter para establecer el tipo de poliza**/
    public void setTipo(String tipo) {
        this.tipo = tipo; /** Establece el tipo de poliza**/
    }

    /** Metodo getter para obtener el monto asegurado**/
    public double getMonto() {
        return monto; /** Devuelve el monto asegurado**/
    }

    /** Metodo setter para establecer el monto asegurado**/
    public void setMonto(double monto) {
        this.monto = monto; /** Establece el monto asegurado**/
    }

    /** Metodo getter para obtener la informacion del asegurado**/
    public Asegurado getAsegurado() {
        return asegurado; /** Devuelve la informacion del asegurado**/
    }

    /** Metodo setter para establecer la informacion del asegurado**/
    public void setAsegurado(Asegurado asegurado) {
        this.asegurado = asegurado; /** Establece la informacion del asegurado**/
    }
}
