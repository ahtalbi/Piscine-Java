public class StringContains {
	public static boolean isStringContainedIn(String str, String s) {
		if (str == null && s == null) return true;
		if (str == null || s == null) return false;
		return s.contains(str);
	}
}
