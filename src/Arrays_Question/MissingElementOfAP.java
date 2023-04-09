package Arrays_Question;

public class MissingElementOfAP {
	public static void main(String[] args) {
		int a[] = { 2, 4, 8, 10, 12, 14 };
		int n = a.length;
		long findMissingElementOfAP = findMissingElementOfAP(a, n);
		System.out.println(findMissingElementOfAP);
	}

	private static long findMissingElementOfAP(int[] arr, int n) {
		int f = arr[0];
		int l = arr[n - 1];
		int k=n+1;
		float d=k/2;
		long totalSum = k / 2 * (f + l);
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		return totalSum - sum;
	}
}
