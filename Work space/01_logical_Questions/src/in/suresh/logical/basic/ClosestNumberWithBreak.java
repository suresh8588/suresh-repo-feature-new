package in.suresh.logical.basic;

public class ClosestNumberWithBreak {
	public static void main(String[] args) {
		Integer[] arr = { 3, 9, 50, 97, 15, 65, 7, 99 };

		int minValue = Integer.MAX_VALUE;
		int firstNum = arr[0];
		int secNum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				int diffNum = Math.abs(arr[i] - arr[j]);

				if (diffNum < minValue) {
					minValue = diffNum;
					firstNum = arr[i];
					secNum = arr[j];

					if (diffNum == 0) {
						break;
					}
				}
			}
		}

		System.out.println(firstNum + " " + secNum);
	}
}
