package EmpresaSeguros; /** Definicion del paquete empresaseguros**/

import java.util.ArrayList; /** Importacion de la clase ArrayList**/
import java.util.List; /** Importacion de la interfaz List**/

public class Oficina { /** Declaracion de la clase Oficina**/
    private String nombre; /** Declaracion de la variable privada nombre (String)**/
    private List<Asegurado> asegurados; /** Declaracion de la variable privada asegurados (List<Asegurado>)**/

    public Oficina(String nombre) { /** Constructor de la clase Oficina que recibe un parametro nombre (String)**/
        this.nombre = nombre; /** Asignacion del nombre recibido al campo nombre de la oficina**/
        this.asegurados = new ArrayList<>(); /** Inicializacion de la lista de asegurados como un nuevo ArrayList**/
    }

    public String getNombre() { /** Metodo getter para obtener el nombre de la oficina**/
        return nombre;
    }

    public void setNombre(String nombre) { /** Metodo setter para establecer el nombre de la oficina**/
        this.nombre = nombre;
    }

    public List<Asegurado> getAsegurados() { /** Metodo getter para obtener la lista de asegurados**/
        return asegurados;
    }

    public void anadirAsegurado(Asegurado asegurado) { /** Metodo para anadir un asegurado a la lista**/
        asegurados.add(asegurado);
    }

    public void eliminarAsegurado(Asegurado asegurado) { /** Metodo para eliminar un asegurado de la lista**/
        asegurados.remove(asegurado);
    }
}
