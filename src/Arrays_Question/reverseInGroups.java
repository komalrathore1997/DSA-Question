package Arrays_Question;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseInGroups {
    public static void main(String[] args) {
    	 ArrayList<Integer> arr=new ArrayList();
    	 arr.add(1);
    	 arr.add(2);
    	 arr.add(3);
    	 arr.add(4);
    	 arr.add(5);
    	 int k=3;
    	 int j=0;
         ArrayList<Integer> result=new ArrayList<>();
         for(int i=k-1;i>=0;i--){
             result.add(arr.get(i));
         }
         
         for(int i=arr.size()-1;i>=k-1;i--){
             result.add(arr.get(i));
         }
         
         System.out.println(result);
	}
}
