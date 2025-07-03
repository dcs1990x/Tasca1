package sprint1Tasca1_1_Nivell3_ex1;

import lombok.Getter;

public abstract class Noticia {
	
	@Getter private String titular;
	@Getter private String text;
	@Getter private int puntuacio;
	@Getter private int preu;
	
	public Noticia(String titular) {
		this.titular = titular;
		this.text = "";
	}
	
	public abstract int calcularPreu();
	
	public abstract int calcularPuntuacio();
	
	@Override
    public String toString() {
        return "Titular: " + this.titular + ", Texto: " + this.text
               + ", Puntación: " + this.calcularPuntuacio() + ", Precio: " + this.calcularPreu() + "€";
	}
}