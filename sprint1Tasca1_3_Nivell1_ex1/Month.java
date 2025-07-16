package sprint1Tasca1_3_Nivell1_ex1;

import lombok.Getter;

public class Month {
	
	@Getter private String name;
	
	public Month(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Month)) return false;
	    Month month = (Month) o;
	    return this.name.equalsIgnoreCase(month.name);
	}
	
	@Override
	public int hashCode() {
		return name.toLowerCase().hashCode();
	}
}