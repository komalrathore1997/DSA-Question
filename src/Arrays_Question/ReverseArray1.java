package Arrays_Question;

public class ReverseArray1 {
    public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int l=0;
		int r=arr.length-1;
		reverseArray(arr,l,r);
		for(int i=0;i<=r;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void reverseArray(int[] arr, int l, int r) {
		if(l>=r) return ;
		swap(arr,l,r);
		reverseArray(arr,l+1,r-1);
		
	}

	private static void swap(int[] arr, int l, int r) {
		int temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
	} 
}
