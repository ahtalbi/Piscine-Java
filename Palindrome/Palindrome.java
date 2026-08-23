public class Palindrome {
	public static boolean isPalindrome(String s) {
		if (s == null) return false;
		StringBuffer sb = new StringBuffer(s);
		return s.toLowerCase().equals(sb.reverse().toString().toLowerCase());
	}
}
