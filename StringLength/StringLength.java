public class StringLength {
	public static int getStringLength(String s) {
		try {
			return s.length();
		} catch (NullPointerException e) {
			return 0;
		}
	}
}
