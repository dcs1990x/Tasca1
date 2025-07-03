package sprint1Tasca1_1_Nivell3_ex1;

import lombok.Getter;

public class NoticiaFutbol extends Noticia {
	
	@Getter private String competicio;
	@Getter private String club;
	@Getter private String jugador;
	
	public NoticiaFutbol(String titular, String competicio, String club, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
	}
	
	@Override
	public int calcularPreu() {
		final int PREUBASE = 300;
		int preuTotal = PREUBASE;
		
		if (this.competicio.equalsIgnoreCase("Champions League")) {
			preuTotal += 100;
		}
		if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
			preuTotal += 100;
		}
		if (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")) {
			preuTotal += 50;
		}
		return preuTotal;
	}

	@Override
	public int calcularPuntuacio() {
		final int PUNTUACIOBASE = 5;
		int puntuacioTotal = PUNTUACIOBASE;
		
		if (this.competicio.equalsIgnoreCase("Champions League")) {
			puntuacioTotal += 3;
		}
		else if (this.competicio.equalsIgnoreCase("Lliga")) {
			puntuacioTotal += 2;
		}
		if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
			puntuacioTotal += 1;
		}
		if (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")) {
			puntuacioTotal += 1;
		}
		return puntuacioTotal;
	}
	
	@Override
    public String toString() {
        return "\n\tFútbol {" + super.toString()
               + ", Competición: " + this.competicio + ", Club: " + this.club + ", Jugador: "
               + this.jugador + "}";
    }
}