package Arrays_Question;

import java.util.Arrays;

public class longestConsecutive {
    public static void main(String[] args) {
    	int nums[]= {100,4,200,1,3,2};
    	Arrays.sort(nums);
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                count++;
            }else {
            	count=0;
            }
			maxCount=Math.max(maxCount, count);
        }
        System.out.println(count);
	}
}
