package Arrays_Question;

public class DifferenceOfSum {
   public static void main(String[] args) {
	   int []nums = {1,15,6,3};
	   int eleSum=0;
       int digitSum=0;
       int n=nums.length;
       for(int i=0;i<n;i++){
           eleSum=eleSum+nums[i];
           int x=nums[i];
           
           if(x>=10){
               while(x>0){
                  int dig=x%10;
                  digitSum+=dig;
                  x=x/10;
               }
              

           }else {
        	   digitSum+=x;
           }
       }

     
       System.out.println(Math.abs(eleSum-digitSum));
}
}
