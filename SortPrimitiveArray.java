//Sort primitive array in Java

import java.util.Arrays;

public class SortPrimitiveArray {

	public static void main(String[] args) {
		int[] array = {55, 41, 101, 3, 5, 7, 9, 11, 33};
		
		Arrays.sort(array);
		
		System.out.println("Sorted array: " + Arrays.toString(array));
		

	}

}
