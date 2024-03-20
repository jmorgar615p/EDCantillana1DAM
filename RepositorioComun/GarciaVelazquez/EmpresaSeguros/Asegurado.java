package EmpresaSeguros; /** Definicion del paquete empresaseguros**/

import java.util.ArrayList; /** Importacion de la clase ArrayList**/
import java.util.List; /** Importacion de la interfaz List**/

public class Asegurado { /** Declaracion de la clase Asegurado**/
    private String nombre; /** Declaracion de la variable privada nombre (String)**/
    private int maximoPolizas; /** Declaracion de la variable privada maximoPolizas (int)**/
    private List<Poliza> polizas; /** Declaracion de la variable privada polizas (List<Poliza>)**/

    public Asegurado() { /** Constructor sin parametros de la clase Asegurado**/
        nombre = "nombre desconocido"; /** Asignacion de un valor predeterminado al nombre**/
        maximoPolizas = 3; /** Asignacion de un valor predeterminado a maximoPolizas**/
        polizas = new ArrayList<>(); /** Inicializacion de la lista de polizas como un nuevo ArrayList**/
    }

    public String getNombre() { /** Metodo getter para obtener el nombre del asegurado**/
        return nombre;
    }

    public void setNombre(String cualquierNombre) { /** Metodo setter para establecer el nombre del asegurado**/
        nombre = cualquierNombre;
    }

    public int getMaximoPolizas() { /** Metodo getter para obtener el maximo de polizas permitidas**/
        return maximoPolizas;
    }

    public void setMaximoPolizas(int maximoPolizas) { /** Metodo setter para establecer el maximo de polizas permitidas**/
        this.maximoPolizas = maximoPolizas;
    }

    public List<Poliza> getPolizas() { /** Metodo getter para obtener la lista de polizas del asegurado**/
        return polizas;
    }

    public void anadirPoliza(Poliza poliza) { /** Metodo para anadir una poliza a la lista**/
        polizas.add(poliza);
    }

    public void eliminarPoliza(Poliza poliza) { /** Metodo para eliminar una poliza de la lista**/
        polizas.remove(poliza);
    }
}
