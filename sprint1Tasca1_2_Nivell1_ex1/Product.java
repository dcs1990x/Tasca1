package sprint1Tasca1_2_Nivell1_ex1;

import lombok.Getter;

public class Product {
	
	@Getter private String name;
	@Getter private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	 @Override
	    public String toString() {
	        return "Product name: " + getName() + ", " + "Price: " + getPrice() + System.lineSeparator();
	    }
}