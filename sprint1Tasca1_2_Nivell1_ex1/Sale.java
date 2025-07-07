package sprint1Tasca1_2_Nivell1_ex1;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class Sale {
	
	private ArrayList<Product> cart;
	@Getter private double price;
	
	public Sale(double price) {
		this.cart = new ArrayList<Product>();
		this.price = 0;
	}
	
	public void addProduct(Product product) {
		this.cart.add(product);
	}
	
	public List<Product> getCart(){
		return List.copyOf(this.cart);
	}
	
	public void calculateTotal() throws EmptySaleException {
		
		if (this.cart.isEmpty()){
			throw new EmptySaleException("The cart is empty.");
		}
		
		for (var product : this.cart) {
			this.price += product.getPrice();
		}
		System.out.println("The total amount is " + getPrice() + " €.");
	}
	
	 @Override
	    public String toString() {
	        return "My Cart: " + System.lineSeparator() +
	        		getPrice();
	 }
}

class EmptySaleException extends Exception {
	
	EmptySaleException() {}
	EmptySaleException(String msgError) {super(msgError);}
}