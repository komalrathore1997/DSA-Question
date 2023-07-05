package Recursion;

public class CountSubSeqwithSum {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1 };
		int n = 3;
		int sum = 2;
		int printS = printS(0, 0, sum, arr, n);
		System.out.println(printS);

	}

	private static int printS(int ind, int s, int sum, int[] arr, int n) {
		if (ind == n) {
			if (s == sum) {
				return 1;
			} else
				return 0;
		    
	    }

	s+=arr[ind];
 
	int l = printS(ind + 1, s, sum, arr, n);
	s-=arr[ind];
	int r = printS(ind + 1, s, sum, arr, n);return l+r;

}}
