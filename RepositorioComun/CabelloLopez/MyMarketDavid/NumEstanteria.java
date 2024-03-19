package principiante;

public class NumEstanteria {


public class miSupermercado {

	String NumEstanteria;
	String Producto;
	Provedor Provedor;

	public NumEstanteria(String string) {
		this.Producto = string;
		this.Provedor ="Desconocido";
	
	}

	public String getNumEstanteria() {
		return NumEstanteria;
	}

	public void setProducto(String Producto) {
		this.Producto = Producto;
	}

	public String getProducto() {
		return Producto;
	}

	public void setProvedor(Provedor p2) {
		
		this.Provedor = p2;
	}

	public Provedor getProvedor() {
		
		return this.Provedor;
	}

			
			
		}

	}

}
