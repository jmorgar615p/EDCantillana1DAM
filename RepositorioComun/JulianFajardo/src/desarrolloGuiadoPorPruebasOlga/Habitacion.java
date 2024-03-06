package desarrolloGuiadoPorPruebasOlga;

public class Habitacion {

		private String nombreHab; 		// numero de habitacion
		private int maxPersonas; 	//maximo de personas que pueden entrar en la habitación	
				
		//constructores
		public Habitacion() {
			nombreHab = "unknown nombreHab";
			maxPersonas = 3;
		}
		
		public String obtenerHabitacion() {
			return nombreHab;
		}
		
		public void nombreHab(String cualquierHab) {
			nombreHab = cualquierHab;
		}

		public int getMaxPersonas() {
			return maxPersonas;
		}

		public void setMaxPersonas(int maxPersonas) {
			this.maxPersonas = maxPersonas;
		}
		
		public String toString() {
			return this.obtenerHabitacion() + " (" + this.getMaxPersonas() + " cliente";
		}
		
		
		
		
		
	}//fin


