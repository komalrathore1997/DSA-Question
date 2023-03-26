package Arrays_Question;

public class Reverse_Array {
	static void reverseArray(int arr[],int start,int end){
		while(start<end) {
			int temp;
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
    public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int n=arr.length;
		printArray(arr,n);
		reverseArray(arr,0,n-1);
		System.out.println("\nReverse Array is");
		printArray(arr,n);
	}
}
