package sprint1Tasca1_2_Nivell2_ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public Entry() {
		
	}
	
	//InputMismatchException:
	
	public static byte readByte(String message) {
		do {
			try {
				System.out.print(message);
				byte input = scanner.nextByte();
				return input;

			} catch (InputMismatchException ime) {
				System.out.println("Invalid data type. Please enter data of the byte type.");
			} finally {
				scanner.nextLine();
			}
		} while (true);
	}

	public static int readInt(String message) {
		do {
			try {
				System.out.print(message);
				int input = scanner.nextInt();
				return input;
			} catch (InputMismatchException ime) {
				System.out.println("Invalid data type. Please enter data of the integer type.");
			} finally {
				scanner.nextLine();
			}
		} while (true);
	}

	public static float readFloat(String message) {
		do {
			try {
				System.out.print(message);
				float input = scanner.nextFloat();
				return input;
			} catch (InputMismatchException ime) {
				System.out.println("Invalid data type. Please enter data of the float type.");
			} finally {
				scanner.nextLine();
			}
		} while (true);
	}

	public static double readDouble(String message) {
		do {
			try {
				System.out.print(message);
				double input = scanner.nextDouble();
				return input;
			} catch (InputMismatchException ime) {
				System.out.println("Invalid data type. Please enter data of the double type.");
			} finally {
				scanner.nextLine();
			}
		} while (true);	
	}
	
	//Personalized exception:

	public static char readChar(String message) {
		do {
			try {
				System.out.print(message);
				String input = scanner.next();
				char inputChar = input.toUpperCase().charAt(0);
				
				if (input.length() != 1) {
					throw new InvalidLengthException();
				}
				
				if (!Character.isLetter(inputChar)) {
					throw new InvalidCharException();
				}
				return inputChar;

			} catch (InvalidLengthException ile) {
				System.out.println("Only one character is allowed.");
			} catch (InvalidCharException ice) {
				System.out.println("Only letters are allowed.");
			} finally {
				scanner.nextLine();
			}
		} while (true);
	}

	public static String readString(String message) {
		do {
			try {
				System.out.print(message);
				String input = scanner.nextLine();
				
				if (input.length() <= 1) {
					throw new InvalidLengthException();
				}
				
				return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();

			} catch (InvalidLengthException ile) {
				System.out.println("The entered data should be at least 2 characters long.");
			} 
		} while (true);
	}

	public static boolean readBoolean(String message) {
		do {
			try {
				System.out.print(message);
				String input = scanner.nextLine();
				
				if (!input.equalsIgnoreCase("true") && !input.equalsIgnoreCase("false")) {
					throw new InvalidBooleanException();
				}
				boolean inputBoolean = Boolean.parseBoolean(input);
				return inputBoolean;

			} catch (InvalidBooleanException ibe) {
				System.out.println("The entered data should be \"true\" or \"false\".");
			} 
		} while (true);
	}
}

class InvalidLengthException extends Exception {
	public InvalidLengthException() {}
	public InvalidLengthException(String msgError) {super(msgError);}
}	
	
class InvalidBooleanException extends Exception {
	public InvalidBooleanException() {}
	public InvalidBooleanException(String msgError) {super(msgError);}
}
	
class InvalidCharException extends Exception {
	public InvalidCharException() {}
	public InvalidCharException(String msgError) {super(msgError);}
}