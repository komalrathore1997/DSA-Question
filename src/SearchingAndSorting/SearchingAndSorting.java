package SearchingAndSorting;

public class SearchingAndSorting {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };
		int l = arr.length;
		int countZero = countZero(arr,l);
		System.out.println(countZero);

	}

	private static int countZero(int[] arr, int l) {
		  int count=0;
	        for(int i=l-1;i>=0;i--){
	            if(arr[i]==0){
	                count=count+1;
	            }else{
	                break;
	            }
	        }
	        
	        return count;
	}
}
