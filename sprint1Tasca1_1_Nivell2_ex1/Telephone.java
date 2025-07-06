package sprint1Tasca1_1_Nivell2_ex1;

import lombok.Getter;

public class Telephone {

	@Getter private String brand;
	@Getter private String model;

	public Telephone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public void call(String phoneNumber) {
		System.out.println("Calling the number " + phoneNumber + "... ");
	}

}