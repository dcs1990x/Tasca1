package sprint1Tasca1_2_Nivell2_ex1;

public class Main {

	public static void main(String[] args) throws InvalidLengthException, InvalidCharException, InvalidBooleanException {
		
		byte inputByte = Entry.readByte("\nEnter the month you were born: ");
		System.out.println("User's answer: " + inputByte);
		
		int inputInt = Entry.readInt("\nEnter your age: ");
		System.out.println("User's answer: " + inputInt);
		
		float inputFloat = Entry.readFloat("\nEnter your height: ");
		System.out.println("User's answer: " + inputFloat);
		
		double inputDouble = Entry.readDouble("\nEnter your weight: ");
		System.out.println("User's answer: " + inputDouble);
		
		char inputChar = Entry.readChar("\nEnter your first name's first letter: ");
		System.out.println("User's answer: " + inputChar);
		
		String inputString = Entry.readString("\nEnter your first family name: ");
		System.out.println("User's answer: " + inputString);
		
		boolean inputBoolean = Entry.readBoolean("\nAre you a student? Type \"true\" or \"false\": ");
		System.out.println("User's answer: " + inputBoolean);
	}
}