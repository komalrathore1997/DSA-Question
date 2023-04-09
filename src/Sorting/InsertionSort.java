package Sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int a[] = { 12, 11, 13, 5, 6 };
		int l = a.length;
		int[] insertionsort = insertionsort(a, l);
		for (int x : insertionsort) {
			System.out.println(x);
		}
	}

	private static int[] insertionsort(int[] a, int l) {
		for (int i = 0; i < l; i++) {
			for (int j = 1; j < l ; j++) {
				if (a[j] < a[j - 1]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

}
