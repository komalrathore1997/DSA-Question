package Sorting;

public class BubbleSort {
	public static void main(String[] args) {
       int[] arr={8,7,3,1,2};
       sort(arr);
	}

	private static void sort(int[] arr) {
		int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
	}

}
