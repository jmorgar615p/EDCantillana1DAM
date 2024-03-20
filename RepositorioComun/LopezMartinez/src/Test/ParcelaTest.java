package Test;

import Granja.Cultivo;

/**Clase que representa las parcelas
* @autor Maria
* @version 1.0 19/03/2024
*/

public class ParcelaTest {

/**
 * Clase que representa una parcela de cultivo
 */
public class Parcela {
 private int numero; // Número de la parcela
 private Cultivo cultivo; // Cultivo asociado a la parcela

 /**
  * Constructor de la clase Parcela
  * @param numero
  * @param cultivo
  */
 public Parcela(int numero, Cultivo cultivo) {
     this.numero = numero;
     this.cultivo = cultivo;
 }

 /**
  * Métodos de acceso para el número de parcela
  * @return
  */
 public int getNumero() {
     return numero;
 }

 public void setNumero(int numero) {
     this.numero = numero;
 }

 /**
  * Métodos de acceso para el cultivo asociado a la parcela
  * @return
  */
 public Cultivo getCultivo() {
     return cultivo;
 }

 public void setCultivo(Cultivo cultivo) {
     this.cultivo = cultivo;
 }

 /**
  * Método toString para representar el objeto como cadena de texto
  */
 @Override
 public String toString() {
     return "Parcela [numero=" + numero + ", cultivo=" + cultivo + "]";
 }
}
}

