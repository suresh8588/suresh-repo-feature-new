package in.suresh.logical.basic;

public class ReverseRightTraingle {
	public static void main(String[] args) {

		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j <= rows - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
