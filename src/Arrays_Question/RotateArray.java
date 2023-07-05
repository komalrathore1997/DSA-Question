package Arrays_Question;

public class RotateArray {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		int n=nums.length;
	     rotateArray(nums,k,n);
		
	}

	private static void rotateArray(int[] nums, int k, int n) {
		int last=nums[n-1];
		for(int i=n-1;i>0;i--) {
			nums[i]=nums[i-1];
		}
		nums[0]=last;
		rotateArray(nums,k-1,n);
		
	}
}
