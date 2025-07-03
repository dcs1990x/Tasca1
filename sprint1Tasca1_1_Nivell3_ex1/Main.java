package sprint1Tasca1_1_Nivell3_ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Redactor> redactors = new ArrayList<>();

	public static void main(String[] args) {
		
		int opcio;
		
		System.out.println("Benvingut/da al menú de l'app de Mundo Antideportivo.");
		
		do {
		
		System.out.println("\nQuè voldràs fer? Selecciona una opció: \n");
		System.out.print("1. Introduïr redactor\n"
					   + "2. Eliminar redactor\n"
					   + "3. Introduïr notícia a un redactor\n"
					   + "4. Eliminar notícia\n"
					   + "5. Mostrar totes les noticies per redactor\n"
					   + "6. Calcular puntuació de la notícia\n"
					   + "7. Calcular preu-notícia\n"
					   + "0. Sortir del programa\n\n"
					   + "Opció seleccionada: ");
		
		opcio = scanner.nextInt(); scanner.nextLine();
		
		switch (opcio) {
			
		case 1: introduirRedactor(); break;
		case 2: eliminarRedactor(); break;
		case 3: introduirNoticia(); break;
		case 4: eliminarNoticia(); break;
		case 5: mostrarLlistaNoticiesRedactor(); break;
		case 6: calcularPreu(); break;
		case 7: calcularPuntuacio(); break;
		case 0: System.out.println("Has sortit del programa. "); break;
		default: System.out.println("Opció invàlida. Sisplau, introdueix una opció del menú. ");
			}
		} while (opcio != 0);
	}
	
	public static Redactor buscarRedactor() {
		Scanner scannerDni = new Scanner(System.in);
		System.out.print("\nIntrodueix el DNI del redactor: ");
		String dniRedactor = scannerDni.nextLine().toLowerCase();
		
		for (var redactor : redactors) {
			if (dniRedactor.equalsIgnoreCase(redactor.getDni().toLowerCase())){
				return redactor;
			}
		}
		throw new IllegalArgumentException("El DNI introduït no coincideix amb cap de la llista. ");
	}
	
	public static void introduirRedactor() {
		Scanner scannerRedactor = new Scanner(System.in);
		System.out.print("\nIntrodueix el nom del redactor: ");
		String nomRedactor = scannerRedactor.nextLine();
		System.out.print("Introdueix el DNI del redactor: ");
		String dniRedactor = scannerRedactor.nextLine().toUpperCase();
		
		Redactor redactor = new Redactor(nomRedactor, dniRedactor);
		redactors.add(redactor);
		System.out.printf("El redactor %s amb DNI %s ha sigut afegit a la llista. \n", redactor.getNom(), redactor.getDni());
	}
	
	public static void eliminarRedactor() {
		Redactor redactor = buscarRedactor();
		redactors.remove(redactor);
		System.out.printf("El redactor %s amb DNI %s ha sigut eliminat de la llista. \n", redactor.getNom(), redactor.getDni());
	}
	
	public static void introduirNoticia() {		
		Scanner scannerNoticia = new Scanner(System.in);
		
		System.out.println("\nIntrodueix l'esport al que fa referència la notícia: ");
		System.out.print("1. Futbol"
					   + "2. Bàsquet"
					   + "3. Tenis"
					   + "4. F1"
					   + "5. Motociclisme");
		int opcio = scannerNoticia.nextInt(); scannerNoticia.nextLine();
		
		System.out.print("\nIntrodueix el titular de la notícia: ");
		String titular = scannerNoticia.nextLine();
		
		if (opcio == 1) {
			System.out.print("\nIntrodueix en nom de la competició: ");
			String competicio = scannerNoticia.nextLine();
			System.out.print("\nIntrodueix en nom del club: ");
			String club = scannerNoticia.nextLine();
			System.out.print("\nIntrodueix en nom del jugador: ");
			String jugador = scannerNoticia.nextLine();
			Noticia noticia = new NoticiaFutbol(titular, competicio, club, jugador);
			
			Redactor redactor = buscarRedactor();
			redactor.addNoticia(noticia);
		}
		else if (opcio == 2) {
			System.out.print("\nIntrodueix en nom de la competició: ");
			String competicio = scannerNoticia.nextLine();
			System.out.print("\nIntrodueix en nom del club: ");
			String club = scannerNoticia.nextLine();
			Noticia noticia = new NoticiaBasquet(titular, competicio, club);
			
			Redactor redactor = buscarRedactor();
			redactor.addNoticia(noticia);
		}
		else if (opcio == 3) {
			System.out.print("\nIntrodueix en nom de la competició: ");
			String competicio = scannerNoticia.nextLine();
			System.out.print("\nIntrodueix en nom del tenista: ");
			String tenista = scannerNoticia.nextLine();
			Noticia noticia = new NoticiaTenis(titular, competicio, tenista);
			
			Redactor redactor = buscarRedactor();
			redactor.addNoticia(noticia);
		}
		else if (opcio == 4) {
			System.out.print("\nIntrodueix en nom de l'escuderia: ");
			String escuderia = scannerNoticia.nextLine();
			Noticia noticia = new NoticiaF1(titular, escuderia);
			
			Redactor redactor = buscarRedactor();
			redactor.addNoticia(noticia);
		}
		else if (opcio == 5) {
			System.out.print("\nIntrodueix en nom de l'equip: ");
			String equip = scannerNoticia.nextLine();
			Noticia noticia = new NoticiaMotociclisme(titular, equip);
			
			Redactor redactor = buscarRedactor();
			redactor.addNoticia(noticia);
		}
		else {
			System.out.println("Opció invàlida. ");
		}
	}
	
	public static void eliminarNoticia() {
		Scanner eliminarNoticiaSc = new Scanner(System.in);
		
		System.out.println("Introdueix nom del redactor: ");
		String nomRedactor = eliminarNoticiaSc.nextLine();
		System.out.println("Introdueix el titular de la noticia: ");
		String titularNoticia = eliminarNoticiaSc.nextLine();
		
		for (var redactor : redactors) {
			if (nomRedactor.equalsIgnoreCase(redactor.getNom())) {
				for (var noticia : redactor.getLlistaNoticies()) {
					if (titularNoticia.equalsIgnoreCase(noticia.getTitular())) {
						redactor.eliminarNoticia(noticia);
						return;
					}
				} System.out.println("\nLa notícia no es troba a la llista. "); return;
			} 
		} System.out.println("\nEl redactor no es troba a la llista. "); return;
	}
	
	public static void mostrarLlistaNoticiesRedactor() {
		Redactor redactor = buscarRedactor();
		List<Noticia> llistaNoticies = redactor.getLlistaNoticies();
		
		if (llistaNoticies == null || llistaNoticies.isEmpty()) {
			throw new IllegalArgumentException("\nLa llista está buida. ");
		}
	}
}