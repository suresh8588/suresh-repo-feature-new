package in.suresh.logical.arrays;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int[] array = { 15, 8, 9, 2, 11, 4 };

		//Approach-1

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
