// How to check if a list of integers contains only odd numbers?

import java.util.ArrayList;
import java.util.List;

public class OnlyOddNumbers {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(4);
		list.add(5);
		
		System.out.println("The list contains only odd numbers: " + oddNumbers(list));
		
	}
	
	public static boolean oddNumbers(List<Integer> list) {
		for (int i : list) {
			if (i % 2 == 0)
				return false;
		}
		
		return true;
	}

}
