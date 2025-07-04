package sprint1Tasca1_1_Nivell1_ex1;

public class WindInstrument extends Instrument {

	public WindInstrument (String name, double price) {
		super(name, price);
	}

	static {
		System.out.println("Wind class loaded through static block. \n");
	}

	@Override
	public String play() {
		return "A wind instrument is playing. ";
	}

	public static String play = "A wind instrument is playing. ";
}