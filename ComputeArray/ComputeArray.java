public class ComputeArray {
	public static int[] computeArray(int[] arr) {
		if (arr == null) return null;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				arr[i] = arr[i] * 5;
			} else if ((arr[i] % 3) - 1 == 0) {
				arr[i] += 7;
			}
		}
		return arr;
	}
}
