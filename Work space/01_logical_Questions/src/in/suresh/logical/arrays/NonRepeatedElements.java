package in.suresh.logical.arrays;

public class NonRepeatedElements {
	public static void main(String[] args) {
		//int[] arr = { 3, 9, 6, 1, 5, 1, 6, 2, 7, 9 };
		
		String str="hello java";
		char[] arr = str.replaceAll(" ", "").toCharArray();

		for (int i = 0; i <= arr.length - 1; i++) {
			int count = 0;
			for (int j = 0; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(arr[i] + " ");
				return;
			}
		}
	}

}
