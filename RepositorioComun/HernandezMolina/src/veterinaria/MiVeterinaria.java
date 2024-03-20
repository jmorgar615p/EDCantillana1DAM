package veterinaria;

import java.util.ArrayList;
/**
 * clase que se encarga de controlar el funcionamiento de MiVeterinaria
 * @author Roberto
 * @version 1.0
 */

public class MiVeterinaria {

	/**
	 * Definicion de los atributos
	 */
	 String nombre;
	 ArrayList<Animal> animal;
	 ArrayList<Trabajador> trabajador;

	 /**
	  * Establece el nombre
	  * @param nombre
	  */
	public MiVeterinaria(String nombre) {
		this.nombre = nombre;
		animal = new ArrayList<Animal>();
		trabajador = new  ArrayList<Trabajador>();
	}

	/**
	 * Metodo que devuelve el nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que devuelve el animal
	 * @return
	 */
	public ArrayList<Animal> getAnimal() {
		return animal;
	}

	/**
	 * Metodo que devuelve el trabajador
	 * @return
	 */
	public ArrayList<Trabajador> getTrabajador() {
		return trabajador;
	}

	/**
	 * Metodo que añade un animal
	 * @param a1
	 */
	public void anadiAnimal(Animal a1) {
		this.animal.add(a1);
	
	}

	/**
	 * Metodo que elimina un animal
	 * @param a1
	 */
	public void eliminarAnimal(Animal a1) {
		this.animal.remove(a1);
		
	}
	
	/**
	 * Metodo que añade un trabajador
	 * @param t1
	 */
	public void anadirtrabajador(Trabajador t1) {
		this.trabajador.add(t1);
	}
	
	/**
	 * Metodo que elimina un tabajador
	 * @param t1
	 */
	public void eliminarTrabajador(Trabajador t1) {
		this.trabajador.remove(t1);
	}
	
	/**
	 * Metodo que mira fuera
	 * @param a1
	 * @param t1
	 * @return
	 */
	public boolean checkOut(Animal a1, Trabajador t1) {
		int animalesOut = this.getAnimalesDeTrabajadores(t1).size();
		if ((a1.getTrabajador() == null) &&
				(animalesOut < t1.getMaximoAnimales())){
			a1.setTrabajador(t1);
			return true;
		}
		else {
			return false;
			}
	}
	
	/**
	 * Metodo que mira dentro
	 * @param a1
	 * @return
	 */
	public boolean checkIn(Animal a1) {
		if (a1.getTrabajador() != null) {
			a1.setTrabajador(null);
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Metodo que establece a cada animal con persona
	 * @param t1
	 * @return
	 */
	public ArrayList<Animal> getAnimalesDeTrabajadores(Trabajador t1) {
		ArrayList<Animal> resultado = new ArrayList<Animal>();
		for (Animal aAnimal : this.getAnimal()) {
			if ((aAnimal.getTrabajador() != null) && 
					(aAnimal.getTrabajador().getNombre()
							.equals(t1.getNombre()))) 

			{
				resultado.add(aAnimal);	
			
			}
			
		}
			return resultado;
	}

	/**
	 * Metodo que devielve los animales deisponibles
	 * @return
	 */
	public ArrayList<Animal> getAnimalesDisponibles() {
		ArrayList<Animal> resultado = new ArrayList<Animal>();
		for (Animal aAnimal : this.getAnimal()) {
			if (aAnimal.getTrabajador() == null) {
				resultado.add(aAnimal);
			}
		}
		return resultado;
	}

	/**
	 * Metodo que devuelve los animales no disponibles
	 * @return
	 */
	public ArrayList<Animal> getNoDisponibles() {
		ArrayList<Animal> resultado = new ArrayList<Animal>();
		for (Animal aAnimal : this.getAnimal()) {
			if (aAnimal.getTrabajador() != null) {
				resultado.add(aAnimal);
			}
		}
		return resultado;
	}
	
	/**
	 * Metodo que devuelve un String
	 */
	public String toString() {
		return this.getNombre() + ": " + 
	this.getAnimal().size() + " animales; " + 
	this.getTrabajador().size() + " trabajador.";
	}
	
	/**
	 * Main del codigo
	 * @param args
	 */
	public static void main(String[] args) {
		MiVeterinaria testVeterinaria = new MiVeterinaria("Test mi Veterinaria");
		Animal a1 = new Animal("Perro");
		Animal a2 = new Animal("Gato");
		a1.setEspecie("Pastor aleman");
		a2.setEspecie("Persa");
		Trabajador pepe = new Trabajador();
		Trabajador pepa = new Trabajador();
		pepa.setNombre("Pepa");
		pepe.setNombre("Pepe");
		
		testVeterinaria.anadiAnimal(a1);
		testVeterinaria.anadiAnimal(a2);
		testVeterinaria.anadirtrabajador(pepa);;
		testVeterinaria.anadirtrabajador(pepe);;
		
		
		System.out.println("Se ha registrado el animal");
		testVeterinaria.printStatus();
		
		System.out.println("Pastor aleman");
		testVeterinaria.checkOut(a1, pepa);
		testVeterinaria.printStatus();
		
		System.out.println("Gato persa");
		testVeterinaria.checkIn(a1);
		testVeterinaria.checkOut(a2, pepe);
		testVeterinaria.printStatus();
	}

	/**
	 * Pintar en pantalla el estado
	 */
	private void printStatus() {
		System.out.println("Estado de miVeterinaria" + this.toString());
		for (Animal thisAnimal : this.getAnimal()) {
			System.out.println(thisAnimal);
		}
		
		for (Trabajador t : this.getTrabajador()) {
			int contador = this.getAnimalesDeTrabajadores(t).size();
			System.out.println(t + "tiene " + contador + " animales");
		}
		System.out.println("Animales disponibles: " + this.getAnimalesDisponibles().size());
		System.out.println("--------Final del estado--------");
		
	}
		
}
