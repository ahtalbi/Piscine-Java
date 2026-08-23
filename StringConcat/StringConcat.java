public class StringConcat {
	public static String concat(String a, String b) {
		if (a == null) {
			return b;
		}
		if (b == null) {
			return a;
		}
		return a + b;
	}
}
