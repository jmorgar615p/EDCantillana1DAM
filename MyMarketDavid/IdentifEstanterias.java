package MyMarketDavid;

public class IdentifEstanterias implements Prueba {
	/**Declaracion de la clase**/
	
/**Declaracion de las clases**/
	String NumEstanteria;
	String Producto;
	String Provedor;
/**Declaracion de contenido de NumEstanteria**/
	public  IdentifEstanterias(int i) {
		this.Producto = "Caja";
		this.Provedor ="Desconocido";
	
	}
	
	
/**Setters y Getters de NumEstanteria**/
	
	@Override
	public void setNumEstanteria(String numEstanteria) {
		NumEstanteria = numEstanteria;
	}
	
	@Override
	public String getNumEstanteria() {
		return NumEstanteria;
	}
	/**Setters y Getters de Producto**/
	
	@Override
	public void setProducto(String Producto) {
		this.Producto = Producto;
	}

	@Override
	public String getProducto() {
		return Producto;
	}
	/**Setters y Getters de Provedor**/


	@Override
	public void setProvedor(String provedor) {
		Provedor = provedor;
	}
	@Override
	public String getProvedor() {
		return Provedor;
	}


	

			
			
		}

	


