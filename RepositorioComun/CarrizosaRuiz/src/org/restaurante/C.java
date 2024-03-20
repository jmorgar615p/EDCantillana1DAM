package src.org.restaurante;

import java.util.ArrayList;
import java.util.List;


public class C {
    private List<Plato> listaA;
    private List<Restaurante> listaB;
    
    
  /**
   * Constructor de la clase, inicializa las listas.
   */
    public C() {
        this.listaA = new ArrayList<>();
        this.listaB = new ArrayList<>();
    }

  /**
   *  Método para añadir un elemento de tipo Plato a listaA.
   * @param elementoA
   */
    public void anyadirElementoA(Plato elementoA) {
        listaA.add(elementoA);
    }

 /**
  *  Método para eliminar un elemento de tipo Plato de listaA.
  * @param elementoA
  */
    public void eliminarElementoA(Plato elementoA) {
        listaA.remove(elementoA);
    }

 /**
  * Método para añadir un elemento de tipo Restaurante a listaB.
  * @param elementoB
  */
    public void anyadirElementoB(Restaurante elementoB) {
        listaB.add(elementoB);
    }

 /**
  *  Método para eliminar un elemento de tipo Restaurante de listaB.
  * @param elementoB
  */
    public void eliminarElementoB(Restaurante elementoB) {
        listaB.remove(elementoB);
    }

 /**
  *  Método para establecer una relación entre un elemento de listaA y un elemento de listaB.
  * @param elementoA
  * @param elementoB
  */
    public void establecerRelacionAB(Plato elementoA, Restaurante elementoB) {
        elementoB.setRelacionA(elementoA);
    }

 /**
  *  Método para obtener los elementos de listaA que están relacionados con un elemento de listaB.
  * @param elementoB
  * @return
  */
    public List<Plato> obtenerElementosRelacionadosB(Restaurante elementoB) {
        List<Plato> elementosRelacionados = new ArrayList<>();
        for (Plato elementoA : listaA) {
            if (elementoA.equals(elementoB.getRelacionA())) {
                elementosRelacionados.add(elementoA);
            }
        }
        return elementosRelacionados;
    }
    
 /**
  *  Método para obtener los elementos de listaA que no están relacionados con un elemento de listaB.
  * @param elementoB
  * @return
  */
    public List<Plato> obtenerElementosNoRelacionadosB(Restaurante elementoB) {
        List<Plato> elementosNoRelacionados = new ArrayList<>();
        for (Plato elementoA : listaA) {
            if (!elementoA.equals(elementoB.getRelacionA())) {
                elementosNoRelacionados.add(elementoA);
            }
        }
        return elementosNoRelacionados;
    }

    // Otros métodos y getters/setters según sea necesario
}