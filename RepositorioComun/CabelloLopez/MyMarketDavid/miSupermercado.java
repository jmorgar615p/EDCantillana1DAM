package MyMarketDavid;

import java.util.ArrayList;
/**
 * Declaracion de clases**/
public class miSupermercado {
	/**Creacion de arrays NumEstanteria y Provedores**/
	public String nombre;
	public ArrayList<IdentifEstanterias> IdentifEstanterias;
	public ArrayList<Provedores> Provedores;
/**Creacion de nuevos arrays list NumEstanteria y Provedores**/
	public miSupermercado(String name) {
		this.nombre =name;
		IdentifEstanterias = new ArrayList<IdentifEstanterias>();
		Provedores = new ArrayList<Provedores>();

}
}
