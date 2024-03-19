package principiante;

public class miSupermercado {
	public String nombre;
	public ArrayList<Estanteria> Estanteria;
	public ArrayList<Provedores> Provedores;

	public miSupermercado(String name) {
		this.nombre =name;
		Estanteria = new ArrayList<Estanteria>();
		Provedores = new ArrayList<Provedores>();

}
