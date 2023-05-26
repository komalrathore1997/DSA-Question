package Arrays_Question;

import java.util.Arrays;

public class MergeTwoArrayInSortedOrder {
    public static void main(String[] args) {
    	int []nums1 = {1,3};
    	int []nums2 = {2};
    	 
         int i=0;
         int j=0;
         int k=0;
        
         int nums3[]= {1,2,3,4};
//         {1,2,3}
         int mid;
         int x=nums3.length;
         double ans;
         double my=0;
         if(x%2==0) {
        	 mid=(x)/2;
        	 ans=(nums3[mid-1]+nums3[mid]);
        	  my=(float)ans/2;
         }else {
        	 mid=(x)/2;
        	 ans=nums3[mid];
         }
        System.out.println(my);
//         return ans;
         
	}
}
