package in.suresh.logical.arrays;

import java.util.Arrays;

public class MinMaxElementsInArray {
	public static void main(String[] args) {
		int arr[] = { 15, 8, 9, 2, 11, 4 };
		// Approach-1
		int minValue = arr[0];
		int maxValue = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		System.out.println("Max Value in Array :" + maxValue);
		System.out.println("Min Value in Array :" + minValue);

		// Approach-2
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("Max Value in Array :" + max);
		System.out.println("Min Value in Array :" + min);
	}

}
