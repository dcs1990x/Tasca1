package sprint1Tasca1_1_Nivell3_ex1;

import lombok.Getter;

public class NoticiaMotociclisme extends Noticia {
	
	@Getter private String equip;
	
	public NoticiaMotociclisme(String titular, String equip) {
		super(titular);
		this.equip = equip;
	}
	
	@Override
	public int calcularPreu() {
		final int PREUBASE = 100;
		int preuTotal = PREUBASE;
		
		if (this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) {
			preuTotal += 50;
		}
		return preuTotal;
	}

	@Override
	public int calcularPuntuacio() {
		final int PUNTUACIOBASE = 3;
		int puntuacioTotal = PUNTUACIOBASE;
		
		if (this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) {
			puntuacioTotal += 3;
		}
		return puntuacioTotal;
	}
	
	 @Override
	    public String toString() {
	        return "\n\tMotociclismo {" + super.toString() + ", Equipo: " + this.equip + "}";
	 }
}
