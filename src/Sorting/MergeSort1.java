package Sorting;

public class MergeSort1 {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 6, 7, 3, 4 };
		int l = 0;
		int r = arr.length;
		divide(arr, l, r);
	}

	private static void divide(int[] arr, int l, int r) {
		if (l > r) {
			int mid = l + (r - l) / 2;
			divide(arr, l, mid);
			divide(arr, mid + 1, r);
			conquire(arr, l, mid, r);
		}
	}

	private static void conquire(int[] arr, int l, int mid, int r) {
        
	}
}
