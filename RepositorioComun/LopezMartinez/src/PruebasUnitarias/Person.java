package PruebasUnitarias;

public class Person {
	
	//campos
	//3 clases ; alimentacion, 
	private String name; 
	private int maxinumBooks;
	
	//constructores
	public Person() {
	
	name="unknown name";
	maxinumBooks = 3;
	
}
public String getName() {
	return name;
}

public void setName(String anyName) {
	
}
public int getMaxinumBooks() {
	return maxinumBooks;
}
public void setMaxinumBooks(int maxinumBooks) {
	this.maxinumBooks = maxinumBooks;
}
}

