package PrefixSum;


/*Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2*/
public class subarraySum {
	
	public static void main(String[] args) {
		
		int []nums= {1,2,3};
		int k=3;
		int prefix[]=new int[nums.length];
        int count=0;
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

        for(int j=0;j<nums.length;j++){
            if(prefix[j]==k || nums[j]==k){
                count++;
            }
        }
        System.out.println(count);
	}

}
