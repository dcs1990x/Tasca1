package sprint1Tasca1_1_Nivell1_ex1;

public class StringInstrument extends Instrument {

	public StringInstrument (String name, double price) {
		super(name, price);
	}

	static {
		System.out.println("String class loaded through static block. \n");
	}

	@Override
	public String play() {
		return "A string instrument is playing. ";
	}

	public static String play = "A string instrument is playing. ";
}