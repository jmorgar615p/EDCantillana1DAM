package escaperoom;

public class Cliente {

		//fields
		private String nombre; //nombre de la persona
		private int maximoReservas; //máximo de reservas que puede hacer una persona
		
		
		//Constructor
		
		public Cliente() {
			nombre = "nombre desconocido";
			maximoReservas = 3;
		}
		
		//Métodos

		public String getNombre() {
			return nombre;
		}
		

		public void setNombre(String cualquierNombre) {
			nombre = cualquierNombre;
		}

		public int getMaximoReservas() {
			return maximoReservas;
		}

		public void setMaximoReservas(int maximoReservas) {
			this.maximoReservas = maximoReservas;
		}	
		
		public String toString() {
			return this.getNombre() + " (" + this.getMaximoReservas() +
			" Reservas)";
		}
}
