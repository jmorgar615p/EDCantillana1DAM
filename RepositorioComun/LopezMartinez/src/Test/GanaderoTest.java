package Test;

import java.util.ArrayList;
import java.util.List;

import Granja.Parcela;

/**Clase que representa un ganadero con sus parcelas
* @autor Maria
* @version 1.0 19/03/2024
*/
public class GanaderoTest {
 private String nombre; /** Nombre del ganadero*/
 private List<Parcela> parcelas; /** Lista de parcelas que posee el ganadero*/

 /**
  * Constructor de la clase Ganadero
  * @param nombre
  */
 public void Ganadero(String nombre) {
     this.nombre = nombre;
     this.parcelas = new ArrayList<>();
 }

 /**
  * Métodos de acceso para el nombre del ganadero y la lista de parcelas
  * @return
  */
 public String getNombre() {
     return nombre;
 }

 public void setNombre(String nombre) {
     this.nombre = nombre;
 }

 public List<Parcela> getParcelas() {
     return parcelas;
 }

 /** Método para agregar una parcela al ganadero
  * @return
  */
 public void agregarParcela(Parcela parcela) {
     this.parcelas.add(parcela);
 }

 /**
  * Método toString para representar el objeto como cadena de texto
  */
 @Override
 public String toString() {
     return "Ganadero [nombre=" + nombre + ", parcelas=" + parcelas + "]";
 }
}
