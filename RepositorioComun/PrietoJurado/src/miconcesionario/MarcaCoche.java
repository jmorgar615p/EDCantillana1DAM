package src.miconcesionario;

public class MarcaCoche {
	
	public String nombremarca;
	public String vendedor;
	Vendedor Vendedor;
	
	public MarcaCoche(String string) {
		this.nombremarca = string;
		this.vendedor = "Vendedor Desconocido";
	}
/*
	public String getNombremarca() {
		return nombremarca;
	}

	public void setNombremarca(String nombremarca) {
		this.nombremarca = nombremarca;
	}

	public String getVendedor() {
		return vendedor;
	}
*/
	public void setNombre(Vendedor v2) {
		this.Vendedor = v2;
		
	}

	public Vendedor getNombre() {
		return this.Vendedor;
	}

}