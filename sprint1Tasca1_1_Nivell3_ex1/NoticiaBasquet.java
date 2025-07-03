package sprint1Tasca1_1_Nivell3_ex1;

import lombok.Getter;

public class NoticiaBasquet extends Noticia {
	
	@Getter private String competicio;
	@Getter private String club;
	
	public NoticiaBasquet(String titular, String competicio, String club) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
	}
	
	@Override
	public int calcularPreu() {
		final int PREUBASE = 250;
		int preuTotal = PREUBASE;
		
		if (this.competicio.equalsIgnoreCase("Eurolliga")) {
			preuTotal += 75;
		}
		if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
			preuTotal += 75;
		}
		return preuTotal;
	}

	@Override
	public int calcularPuntuacio() {
		final int PUNTUACIOBASE = 4;
		int puntuacioTotal = PUNTUACIOBASE;
		
		if (this.competicio.equalsIgnoreCase("Eurolliga")) {
			puntuacioTotal += 3;
		}
		else if (this.competicio.equalsIgnoreCase("ACB")){
			puntuacioTotal += 2;
		}
		if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
			puntuacioTotal += 1;
		}
		return puntuacioTotal;
	}
	
	@Override
    public String toString() {

        return "\n\tBásquet {" + super.toString()
               + ", Competición: " + this.competicio + ", Club: " + this.club + "}";
    }
}
