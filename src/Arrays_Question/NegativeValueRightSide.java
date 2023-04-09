package Arrays_Question;

public class NegativeValueRightSide {
	public static void main(String[] args) {
		int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
		int[] check = check(arr, arr.length);
		for(int x:check) {
			System.out.println(x);
		}
	}

	private static int[] check(int[] arr, int n) {
		int[] temp = new int[n];
		int j=0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				temp[j++] = arr[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				temp[j++] = arr[i];
			}
		}
		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
		return arr;
	}
}
