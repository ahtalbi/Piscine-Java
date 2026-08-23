public class CleanExtract {
	public static String extract(String s) {
		String[] arr = s.split("\\|");
		int i = 0;
		for (String str : arr) {
			int fi = str.indexOf('.');
			int li = str.lastIndexOf('.');

			if (fi < 0 && li < 0) {i++; continue;};
			if (fi == li) {
				fi += 1;
				arr[i] = str.substring(fi);
			} else if (fi < li) {
				fi += 1;
				arr[i] = str.substring(fi, li);
			}
			i++;
		}
		arr = java.util.Arrays.stream(arr).filter(str -> !str.isBlank()).toArray(String[]::new);
		String res = String.join(" ", arr);
		res = res.replaceAll("\\s+", "\s");
		res = res.trim();
		return res;
	}
}
