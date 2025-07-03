package sprint1Tasca1_1_Nivell1_ex1;

import lombok.Getter;

public abstract class Instrument {
	
	@Getter private String name;
	@Getter private double price;
	
	public Instrument(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	static {
        System.out.println("Instrument class loaded through static block. \n");
    }
	
	public abstract String play();
}	