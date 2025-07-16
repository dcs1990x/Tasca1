package sprint1Tasca1_3_Nivell1_ex3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> countriesMap = new HashMap<>();		
		
		try (BufferedReader reader = new BufferedReader(new FileReader("src//sprint1Tasca1_3_Nivell1_ex3/resources/countries.txt"))) {
			String line;
			while ((line = reader.readLine()) != null){			
				int spaceIndex = line.indexOf(' ');
				if (spaceIndex != -1) {
					String country = line.substring(0, spaceIndex).trim();
					String capital = line.substring(spaceIndex + 1).trim();
					countriesMap.put(country, capital);
				}
			}
		} catch(IOException e) {
			System.out.println("An error reading the file has ocurred.");
		}
		
		List<String> countriesList = new ArrayList<>(countriesMap.keySet());
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while (name.isEmpty() || name == null || name.matches(".*\\d.*") || name.length() < 2) {
				try{
					System.out.print("What's your name? ");
					name = scanner.nextLine();
					
					if (name.isEmpty() || name == null || name.matches(".*\\d.*")) {
				        throw new InvalidInputException();
				    }
					if (name.length() < 2) {
						throw new InvalidLengthException();
					}
					
				} catch(InvalidInputException iie) {
					System.out.println("Leaving the name blank and using numbers or symbols is not allowed, please write your name using only letters.\n");
				} catch(InvalidLengthException ile) {
					System.out.println("Please type your full name.\n");
				}
		}
		
		System.out.printf("Hello, %s. ", name);
		
		Random random = new Random();
		int index = random.nextInt(countriesList.size());
		String answer = countriesList.get(index);	
		
		String guess = "";
		int points = 0;
		int tries = 0;
		
		while (tries < 10) {
			ArrayList<String> countriesAppeared = new ArrayList<String>();
			System.out.printf("Guess the capital of %s: ", answer);
			guess = scanner.nextLine();
			
			if (countriesMap.get(answer).equalsIgnoreCase(guess)) {
				System.out.printf("Correct! Well done! It is %s! \n", guess.substring(0,1).toUpperCase() + guess.substring(1).toLowerCase());
				points++;
				
				countriesAppeared.add(answer);
				countriesList.remove(answer);
				answer = countriesList.get(random.nextInt(countriesList.size()));
			}
			
			else {
				System.out.println("Incorrect! Try again.");
			}
			
			tries++;
			System.out.printf("Score: %d points. ", points);
			System.out.printf("Number of tries: %d.\n\n", tries);
		}
		System.out.println("The game has finished.\n");
		System.out.printf("Total score: %d points. ", points);
		
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/sprint1Tasca1_3_Nivell1_ex3/resources/ranking.txt", true))) {
		    writer.write("Player name: " + name);
		    writer.newLine();
		    writer.write("Score: " + points + " points");
		    writer.newLine();
		    writer.newLine();
		    
		    System.out.println("Score saved in file ranking.txt");
		} catch (IOException e) {
		    System.out.println("An error saving the results occured.");
		}
	}
}
	
	class InvalidLengthException extends Exception{
		public InvalidLengthException() {}
		public InvalidLengthException(String msgError) {super(msgError);}
	}
	
	class InvalidInputException extends Exception{
		public InvalidInputException() {}
		public InvalidInputException(String msgError) {super(msgError);}
	}
