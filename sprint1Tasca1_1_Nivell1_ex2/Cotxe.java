package sprint1Tasca1_1_Nivell1_ex2;

import lombok.Getter;

public class Cotxe {
	
	@Getter private static final String MARCA = "Honda"; //constant estàtica (a nivell de classe)
	@Getter private static String model; //variable estàtica (a nivell de classe)
	@Getter private final int POTENCIA; //constant d'instància
	
	public Cotxe(String model, int potencia) {
		//this.MARCA = "Honda";
		Cotxe.model = model;
		this.POTENCIA = potencia;
	}

	public static void frenar() {
		System.out.println("El vehicle està frenant. ");
	}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant. ");
	}
}