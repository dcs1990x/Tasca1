package sprint1Tasca1_3_Nivell1_ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {

		List<Integer> numList1 = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			numList1.add(i);
		}

		List<Integer> numList2 = new ArrayList<Integer>();

		ListIterator<Integer> listIterator = numList1.listIterator(numList1.size());

		while (listIterator.hasPrevious()) {
			numList2.add(listIterator.previous());
		}

		for (var num : numList2) {
			System.out.println(num);
		}

	}
}