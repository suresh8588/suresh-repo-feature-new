package in.suresh.logical.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayReverseOrder {

	public static void main(String[] args) {
		int[] array = { 15, 8, 9, 2, 11, 4 };
		// Approach-1

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");

		}
		// Approach-2
		System.out.println("\nApproach-2");
					int[] array2 = IntStream.rangeClosed(0, array.length - 1).map(s -> array[array.length - s - 1]).toArray();
					System.out.println(Arrays.toString(array2));
	}
}
