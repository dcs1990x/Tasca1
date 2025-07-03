package sprint1Tasca1_1_Nivell1_ex2;

public class Main {

	public static void main(String[] args) {
		
		Cotxe cotxe = new Cotxe("Civic", 200); //Marca no es pot afegir al constructor perquè és una constant de Classe
		
		Cotxe.frenar();
		
		System.out.println(Cotxe.getMARCA()); //L'atribut constant estàtic només es pot accedir des de la Classe
		System.out.println(Cotxe.getModel()); //L'atribut estàtic només es pot accedir des de la Classe
		System.out.println(cotxe.getPOTENCIA()); //L'atribut constant d'instància s'accedeix des de l'instància
		cotxe.accelerar();
	}
}