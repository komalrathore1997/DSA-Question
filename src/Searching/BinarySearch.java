package Searching;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 8, 10, 12, 14 };
		int k = 14;
		int result = binarySearch(a, k);
		System.out.println(result);
	}

	private static int binarySearch(int[] a, int k) {
		int low = 0;
		int high = a.length ;
        while(low<=high) {
        	int mid = (low + high) / 2;
        	if(a[mid]==k) {
        		return mid;
        	}
        	if(k>a[mid]) {
        		low=mid+1;
        	}else if(k<a[mid]) {
        		high=mid-1;
        	}
        }
		return -1;
	}
}
