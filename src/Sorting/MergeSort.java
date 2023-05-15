package Sorting;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = { 12,11,13,5,6,7 };
		System.out.println("Given Array");
        printArray(arr);
        
        MergeSort o=new MergeSort();
        o.divide(arr, 0,arr.length-1);
        System.out.println();
        System.out.println("Given Array");
        printArray(arr);
		
	}

	private static void printArray(int[] arr) {
		int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
		
	}

	private static void divide(int[] arr, int si, int ei) {
//		mid also we can find using (si+ei)/2 because space complexity will not come 
//		we will use si+(ei-si)/2
		if(si<ei) {
         int mid=si+(ei-si)/2;
         divide(arr,si,mid);
         divide(arr,mid+1,ei); 
         conqure(arr,si,mid,ei);
		} 
          
	}

	private static void conqure(int[] arr, int si, int mid, int ei) {
		int idx1=mid-si+1;;
		int idx2=ei-mid;
		
		int L[]=new int[idx1];
		int R[]=new int[idx2];
		
		for(int i=0;i<idx1;++i) {
			L[i]=arr[si+i];
			
		}
		for(int j=0;j<idx2;++j) {
			L[j]=arr[mid+1+j];
			
		}
		
		int i=0,j=0;
		int k=si;
		
		while(i<idx1 && j<idx2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<idx1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<idx2) {
			arr[k]=R[j];
			j++;
			k++;

		}
	
	}
}
