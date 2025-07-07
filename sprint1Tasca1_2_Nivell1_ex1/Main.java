package sprint1Tasca1_2_Nivell1_ex1;

public class Main {

	public static void main(String[] args) {
		
		Sale myCart = new Sale(0);
		
		try {
			myCart.addProduct(new Product("Watermelon", 5.2));
			myCart.addProduct(new Product("Strawberries", 3.1));
			System.out.println(myCart.getCart());
			myCart.calculateTotal();
			myCart.getCart().get(2);
		}
		catch(EmptySaleException ese){
			System.out.println(ese.getMessage());
			System.out.println("Before closing the sale products need to be added first.");
			ese.printStackTrace();
		}
		catch(IndexOutOfBoundsException ioobe) {
			System.out.println(ioobe.getMessage());
			System.out.println("The index is out of bounds.");
			ioobe.printStackTrace();
		}
	}
}