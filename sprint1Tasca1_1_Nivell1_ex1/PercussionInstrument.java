package sprint1Tasca1_1_Nivell1_ex1;

public class PercussionInstrument extends Instrument {

	public PercussionInstrument (String name, double price) {
		super(name, price);
	}

	static {
		System.out.println("Percussion class loaded through static block. \n");
	}

	@Override
	public String play() {
		return "A percussion instrument is playing. ";
	}

	public static String play = "A percussion instrument is playing. ";
}