package Arrays_Question;

public class MinSubArrayLen {
    public static void main(String[] args) {
    	int []nums = {2,3,1,2,4,3};
    	int target=7;
    		
    	int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int count=0;
            for(int j=i;j<nums.length;j++){
               
            	sum+=nums[j];
                count++;
                if(sum>=target){
                    break;
                }
            }
            min=Math.min(min,count);
        }
        System.out.println(min);
	}
}
