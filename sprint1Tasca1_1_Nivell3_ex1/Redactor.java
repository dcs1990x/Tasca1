package sprint1Tasca1_1_Nivell3_ex1;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Redactor {
	
	@Getter private String nom;
	@Getter private final String dni;
	@Getter private static double sou;
	@Getter private ArrayList<Noticia> noticies;
	
	public Redactor(String nom, String dni) {
		this.nom = nom;
		this.dni = dni;
		this.noticies = new ArrayList<Noticia>();
	}
	
	public void setSou(double sou) {
		Redactor.sou = sou;
	}
	
	public void addNoticia(Noticia noticia) {
		noticies.add(noticia);
	}
	
	public void eliminarNoticia(Noticia noticia) {
		noticies.remove(noticia);
	}
	
	public List<Noticia> getLlistaNoticies() {
		return List.copyOf(this.noticies);
	}
	
	 @Override
	    public String toString() {
	        return "Redactor {" + "name: " + this.nom + ", dni: " + this.dni + ", salary: " + Redactor.getSou()
	               + ", Noticias asignadas: " + this.noticies + "}\n";
	 }
}
