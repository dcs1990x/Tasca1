package sprint1Tasca1_1_Nivell3_ex1;

import lombok.Getter;

public class NoticiaF1 extends Noticia {
	
	@Getter private String escuderia;
	
	public NoticiaF1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
	}
	
	@Override
	public int calcularPreu() {
		final int PREUBASE = 100;
		int preuTotal = PREUBASE;
		
		if (this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")) {
			preuTotal += 50;
		}
		return preuTotal;
	}

	@Override
	public int calcularPuntuacio() {
		final int PUNTUACIOBASE = 4;
		int puntuacioTotal = PUNTUACIOBASE;
		
		if (this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")) {
			puntuacioTotal += 2;
		}
		return puntuacioTotal;
	}
	
	@Override
    public String toString() {
        return "\n\tFórmula 1 {" + super.toString() + ", Escudería: " + this.escuderia + "}";
    }
}
