package sprint1Tasca1_3_Nivell1_ex1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("ArrayList of the months with August added through a ListIterator:\n");
		
		ArrayList<Month> monthsList = new ArrayList<Month>();
		
		Month january = new Month("January");
		Month february = new Month("February");
		Month march = new Month("March");
		Month april = new Month("April");
		Month may = new Month("May");
		Month june = new Month("June");
		Month july = new Month("July");
		Month september = new Month("September");
		Month october = new Month("October");
		Month november = new Month("November");
		Month december = new Month("December");
		
		monthsList.add(january);
		monthsList.add(february);
		monthsList.add(march);
		monthsList.add(april);
		monthsList.add(may);
		monthsList.add(june);
		monthsList.add(july);
		monthsList.add(september);
		monthsList.add(october);
		monthsList.add(november);
		monthsList.add(december);
		
		ListIterator<Month> addToListIterator = monthsList.listIterator();
		
		while (addToListIterator.hasNext()) {
			Month month = addToListIterator.next();
			if (month.getName().equalsIgnoreCase("July")) {
				addToListIterator.add(new Month("August"));
			}
		}
		
		for (var month : monthsList) {
			System.out.println(month.getName());
		}
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Hash Set without duplicated january entry:\n");
		
		LinkedHashSet<Month> hashSet = new LinkedHashSet<Month>(monthsList);
		
		hashSet.addFirst(new Month("January"));
		
		for (var month : hashSet) {
			System.out.println(month.getName());
		}
	}
}