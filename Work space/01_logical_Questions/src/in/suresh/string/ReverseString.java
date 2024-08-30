package in.suresh.string;

public class ReverseString {
	public static void main(String[] args) {
		String str = "welcome";

		// Approach - 1
		String revString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revString = revString + str.charAt(i);
		}
		System.out.println("Approach - 1  Reverse String is : " + revString);

		// Approach - 2

		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println("Approach - 2  Reverse String is : " + sb.toString());
	
		// Approach - 3
		char[] charArray = str.toCharArray();
		String revserseString="";
		for(int i=charArray.length-1; i>=0; i--) {
			revserseString=revserseString+charArray[i];
		}
		System.out.println("Approach - 3  Reverse String is : " + revserseString);
	}
}
