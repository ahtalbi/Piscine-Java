public class ExerciseRunner {
	public static void main(String[] args) {
		int[] arr = ComputeArray.computeArray(new int[]{20, 65, 30, -67, 75, 11, -1, -30, 17});
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
