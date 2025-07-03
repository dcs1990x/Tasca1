package sprint1Tasca1_1_Nivell1_ex1;

public class Main {

	public static void main(StringInstrument[] args) {
		
	Instrument saxofone = new WindInstrument("Jackson BB", 6990.90);
	Instrument guitar = new StringInstrument("Gibson Les Paul", 12000);
	Instrument drums = new PercussionInstrument("Yamaha 3000", 3550.50);
	
	saxofone.play(); System.out.print("(Instance)\n");
	System.out.println(WindInstrument.play + "(Static Block)\n");
	
	guitar.play(); System.out.print("(Instance)\n");
	System.out.println(StringInstrument.play + "(Static Block)\n");
	
	drums.play(); System.out.print("(Instance)\n");
	System.out.println(PercussionInstrument.play + "(Static Block)\n");
	}
}