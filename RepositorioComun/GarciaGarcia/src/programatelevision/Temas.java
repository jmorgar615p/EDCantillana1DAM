package programatelevision;

public class Temas implements InterfazAutores {
	/*
	 *atributos
	 * */
	public String nombre;
	public String autor;
	Genero genero;
/**
 * Creación de un objeto tipo tema
 * */
	public Temas(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * establecer valores
	 * */
	public void setNombre(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthor(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
		
	}

	public Object getGenero() {
		return this.genero;
	}
	
	

}
