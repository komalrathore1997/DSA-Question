package Arrays_Question;

public class CyclicallyRotateArray {
	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5 };
		int[] rotate = rotate(A, A.length);
		for(int x:rotate) {
			
			System.out.println(x);
		}
	}

	private static int[] rotate(int[] a, int length) {
		int x = a[a.length-1];
	       for (int i = a.length-1; i > 0; i--)
	          a[i] = a[i-1];
	       a[0] = x;
		return a;

	}
}
