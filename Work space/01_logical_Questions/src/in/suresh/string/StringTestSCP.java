package in.suresh.string;

public class StringTestSCP {
	public static void main(String[] args) {
		String s1="test";
		String s2="test";
		String S3="t" + "test";
		
		System.out.println(s1==s2) ; //true 
		System.out.println(s2.equals(S3)) ; // false

	}
}
