import java.util.Arrays;

public class SortArgs {
	public static void sort(String[] args) {
		String res = "";
		Arrays.sort(args);
		for (int i = 0; i < args.length; i++) {
			res += args[i];
			if (i != args.length-1) {
				res += " ";
			}
		}
		System.out.println(res);
	}
}
