package sprint1Tasca1_1_Nivell2_ex1;

import lombok.Getter;

public class Telefon {
	
	@Getter private String marca;
	@Getter private String model;
	
	public Telefon(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}
	
	public void trucar(String numTelefon) {
		System.out.println("Trucant al número de telèfon " + numTelefon + "... ");
	}
	
}