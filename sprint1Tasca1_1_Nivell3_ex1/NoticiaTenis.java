package sprint1Tasca1_1_Nivell3_ex1;

import lombok.Getter;

public class NoticiaTenis extends Noticia {
	
	@Getter private String competicio;
	@Getter private String tenista;
	
	public NoticiaTenis(String titular, String competicio, String tenista) {
		super(titular);
		this.competicio = competicio;
		this.tenista = tenista;
	}
	
	@Override
	public int calcularPreu() {
		final int PREUBASE = 150;
		int preuTotal = PREUBASE;
		
		if (this.tenista.equalsIgnoreCase("Federer") || this.tenista.equalsIgnoreCase("Nadal") || this.tenista.equalsIgnoreCase("Djokovic")) {
			preuTotal += 50;
		}
		return preuTotal;
	}

	@Override
	public int calcularPuntuacio() {
		final int PUNTUACIOBASE = 4;
		int puntuacioTotal = PUNTUACIOBASE;
		
		if (this.tenista.equalsIgnoreCase("Federer") || this.tenista.equalsIgnoreCase("Nadal") || this.tenista.equalsIgnoreCase("Djokovic")) {
			puntuacioTotal += 3;
		}
		return puntuacioTotal;
	}
	
	@Override
    public String toString() {
        return "\n\tTenis {" + super.toString()
               + ", Competición: " + this.competicio + ", Tenista: " + this.tenista;
    }
}