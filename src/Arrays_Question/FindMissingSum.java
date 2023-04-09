package Arrays_Question;

public class FindMissingSum {
	public static void main(String[] args) {
		int A[] = {5, 6, 3, 4, 2, 7};
		int n = 7;
		int findMissingSum = findMissingSum(A, n);
		System.out.println(findMissingSum);
	}

	private static int findMissingSum(int[] A, int N) {
		int sum = 0;
		for (int i = 0; i < N - 1; i++) {
			sum = sum + A[i];
		}

		int Total = N  * (N + 1)/2;
		return Total - sum;

	}
}
