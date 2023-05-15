package Arrays_Question;

/*Given an array and an integer K, find the maximum for each and every contiguous subarray of size K.

Examples : 

Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3 
Output: 3 3 4 5 5 5 6
Explanation: Maximum of 1, 2, 3 is 3
                       Maximum of 2, 3, 1 is 3
                       Maximum of 3, 1, 4 is 4
                       Maximum of 1, 4, 5 is 5
                       Maximum of 4, 5, 2 is 5 
                       Maximum of 5, 2, 3 is 5
                       Maximum of 2, 3, 6 is 6

Input: arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, K = 4 
Output: 10 10 10 15 15 90 90          
Explanation: Maximum of first 4 elements is 10, similarly for next 4 
                       elements (i.e from index 1 to 4) is 10, So the sequence 
                       generated is 10 10 10 15 15 90 90*/

public class MaxiOfSubArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		int n = arr.length;
		int k = 3;
		BruteForceApporch(arr, n, k);
	}

	private static void BruteForceApporch(int[] arr, int n, int k) {
		/*
		 * took two array inner and outer outher loop run 1-n and inner loop run j=1 - k
		 */
		for (int i = 0; i < n - k; i++) {
			int max = arr[i];
			for (int j = 1; j < k; j++) {
				if (arr[i + j] > max) {
					max = arr[j];
				}
			}
			System.out.print(max + " ");
		}
	}
}
