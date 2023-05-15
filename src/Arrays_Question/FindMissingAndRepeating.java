package Arrays_Question;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
		int arr[]= {1,3,3};
		int[] findMissingAndRepeating = findMissingAndRepeating(arr,arr.length);
		for(int x:findMissingAndRepeating) {
			System.out.println(x);
		}
	}

	private static int[] findMissingAndRepeating(int[] arr, int length) {
		int duplicate = 0;
		int sum=0;
		 for(int i=0;i<length;i++) {
			 for(int j=0;j<length;j++) {
				 if(arr[i]==arr[j]) {
					 duplicate=arr[i];
				 }
			 }
		 }
		 for(int i=0;i<length;i++) {
			 sum=sum+arr[i];
		 }
		 int n=length,totalSum=0;
		 if(n%2==0) {
			 
			  totalSum=n/2*(n+1);
		 }else {
			  totalSum=n*(n+1)/2;

		 }
		 int k=sum-duplicate;
		int missing=totalSum-k;
		int b[]={missing,duplicate};
		return b;
	
	}
}
