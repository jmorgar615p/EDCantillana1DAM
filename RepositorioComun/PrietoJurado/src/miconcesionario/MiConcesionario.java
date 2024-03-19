package src.miconcesionario;

import java.util.ArrayList;

/**
 * Clase que representa un concesionario de coches.
 */
public class MiConcesionario {

    /**
     * Nombre del concesionario.
     */
    String nombre;

    /**
     * Lista de marcas de coches en el concesionario.
     */
    ArrayList<MarcaCoche> marca;

    /**
     * Lista de vendedores en el concesionario.
     */
    ArrayList<Vendedor> vendedor;

    /**
     * Constructor de la clase MiConcesionario.
     *
     * @param nombre Nombre del concesionario.
     */
    public MiConcesionario(String nombre) {
        this.nombre = nombre;
        marca = new ArrayList<MarcaCoche>();
        vendedor = new ArrayList<Vendedor>();
    }

    /**
     * Obtiene el nombre del concesionario.
     *
     * @return Nombre del concesionario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la lista de marcas de coches en el concesionario.
     *
     * @return Lista de marcas de coches.
     */
    public ArrayList<MarcaCoche> getMarca() {
        return marca;
    }

    /**
     * Obtiene la lista de vendedores en el concesionario.
     *
     * @return Lista de vendedores.
     */
    public ArrayList<Vendedor> getVendedor() {
        return vendedor;
    }

    /**
     * Agrega una marca de coche al concesionario.
     *
     * @param c1 Marca de coche a agregar.
     */
    public void addMarca(MarcaCoche c1) {
        this.marca.add(c1);
    }

    /**
     * Elimina una marca de coche del concesionario.
     *
     * @param c1 Marca decoche a eliminar.
     */
    public void removeMarca(MarcaCoche c1) {
        this.marca.remove(c1);
    }

    /**
     * Agrega un vendedor al concesionario.
     *
     * @param v1 Vendedor a agregar.
     */
    public void addVendedor(Vendedor v1) {
        this.vendedor.add(v1);
    }

    /**
     * Elimina un vendedor del concesionario.
     *
     * @param v1 Vendedor a eliminar.
     */
    public void removeVendedor(Vendedor v1) {
        this.vendedor.remove(v1);
    }

    /**
     * Realiza el checkout de una marca de coche a un vendedor.
     *
     * @param c1 Marca de coche a reservar.
     * @param v1 Vendedor al que se le asigna la marca de coche.
     * @return Verdadero si la reserva se realizó correctamente, falso en caso
     *         contrario.
     */
    public boolean checkOut(MarcaCoche c1, Vendedor v1) {
        // Verificar si la marca de coche ya está reservada
        if (c1.getVendedor() != null) {
            return false; // La marca ya está reservada
        }

        // Verificar si el vendedor ha alcanzado su límite de coches vendidos
        if (this.getMarcaPorPersona(v1).size() >= v1.getCochesVendidos()) {
            return false; // El vendedor ha alcanzado su límite
        }

        // Reservar la marca de coche para el vendedor
        c1.setVendedor(v1);
        return true;
    }

    /**
     * Realiza el checkin de una marca de coche.
     *
     * @param c1 Marca de coche a devolver.
     * @return Verdadero si la devolución se realizó correctamente, falso en
     *         caso contrario.
     */
    public boolean checkIn(MarcaCoche c1) {
        if (c1.getVendedor() == null) {
            c1.setVendedor(c1);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Obtiene la lista de marcas de coches asignadas a un vendedor.
     *
     * @param v1 Vendedor al que se le quieren obtener las marcas de coches
     *            asignadas.
     * @return Lista de marcas de coches asignadas al vendedor.
     */
    public ArrayList<MarcaCoche> getMarcaPorPersona(Vendedor v1) {
        ArrayList<MarcaCoche> result = new ArrayList<MarcaCoche>();
        for (MarcaCoche aMarca : this.getMarca()) {
            if ((aMarca.getVendedor() != null)
                    && (aMarca.getVendedor().getNombre().equals(v1.getNombre()))) {
                result.add(aMarca);
            }
        }
        return result;
    }

    /**
     * Obtiene la lista de marcas de coches disponibles en el concesionario.
     *
     * @return Lista de marcas de coches disponibles.
     */
    public ArrayList<MarcaCoche> getMarcasDisponibles() {
        ArrayList<MarcaCoche> result = new ArrayList<MarcaCoche>();
        for (MarcaCoche aMarca : this.getMarca()) {
            if (aMarca.getVendedor() == null) {
                result.add(aMarca);
            }
        }
        return result;
    }

    /**
     * Obtiene la lista de marcas de coches no disponibles en el concesionario.
     *
     * @return Lista de marcas de coches no disponibles.*/
    public ArrayList<MarcaCoche> getMarcasNoDisponibles() {
        ArrayList<MarcaCoche> result = new ArrayList<MarcaCoche>();
        for (MarcaCoche aMarca : this.getMarca()) {
            if (aMarca.getVendedor() != null) {
                result.add(aMarca);
            }
        }
        return result;
    }

    /**
     * Devuelve una representación en forma de cadena del concesionario.
     *
     * @return Cadena con la representación del concesionario.
     */
    public String toString() {
        return this.getNombre() + ": " + this.getMarca().size() + " Marcas; "
                + this.getVendedor().size() + " Vendedores.";
    }

    /**
     * Método principal de la clase MiConcesionario.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Crear un concesionario
        MiConcesionario testConcesionario = new MiConcesionario("Porsche");
        MarcaCoche c1 = new MarcaCoche("Porsche1");
        MarcaCoche c2 = new MarcaCoche("Porsche2");
        c1.setVendedor("Vendedor1");
        c2.setVendedor("Vendedor2");
        Vendedor jose = new Vendedor();
        Vendedor juan = new Vendedor();
        jose.setNombre("Jose");
        juan.setNombre("Juan");

        testConcesionario.addMarca(c1);
        testConcesionario.addMarca(c2);
        testConcesionario.addVendedor(jose);
        testConcesionario.addVendedor(juan);

        System.out.println("Se ha creado el concesionario");
        testConcesionario.printStatus();
		
		System.out.println("Se ha reservado Porsche1 a Jose");
		testConcesionario.checkOut(c1, jose);
		testConcesionario.printStatus();
		
		System.out.println("Haz algunas cosas más");
		testConcesionario.checkIn(c1);
		testConcesionario.checkOut(c2, juan);
		testConcesionario.printStatus();
    }
    /**
     * Método que imprime el estado de la clase MiConcesionario.
     *
     */
    private void printStatus() {
		System.out.println("Estado reportado por MiConcesionario \n" + this.toString());
		for (MarcaCoche thisMarca : this.getMarca()) {
			System.out.println(thisMarca);
		}
		for (Vendedor v : this.getVendedor()) {
			int count = this.getMarcaPorPersona(v).size();
		System.out.println(v + " (tiene " + count + " de esos coches)");
		}
		System.out.println("Marcas disponibles: " + this.getMarcasDisponibles().size());
		System.out.println("---FINAL DEL REPORTE DE ESTADO---");
	}
}