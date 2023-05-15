package Arrays_Question;

public class RearrangeArrayAltermetivly {
	public static void main(String[] args) {
		long arr[] = { 1969, 2677, 3142, 4631, 4764, 5748 ,6476 ,6487 };
		rearrange(arr, arr.length);
//		for (long x : rearrange) {
//			System.out.println(x);
//		}
	}
//  time complexity O(n) spaceComplexity O(1)
	private static void rearrange(long[] arr, int n) {
		int index1=0;
		int index2=n-1;
		 
//		long max_ele=arr[n-1];
//		long min_ele=arr[0];
	        for(int i=0;i<n;i++){
	            if(i%2==0){
	                arr[index1]=arr[n-1];
	                index1+=1;
	                i++;
	               
	            }else{
	                arr[index2]=arr[i];
	                index2-=1;
	                n--;
	            }
	           
	           
	        }
	}
}
