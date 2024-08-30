package in.suresh.logical.basic;

public class Pyramid {
	public static void main(String[] args) {

		int rows = 5;
		for (int i = 1; i <= rows; i++) {

			for (int k = rows - i; k >= 1; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
