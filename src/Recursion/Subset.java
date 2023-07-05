package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {

	static List<List<Integer>> res;
	public static void main(String[] args) {
		int []nums= {3,2,1};
		List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> subset=new ArrayList<>();
        pwh(nums,0,subset,ans);
        System.out.println(ans);
	}


	public static void pwh(int []nums,int i,ArrayList<Integer> subset,List<List<Integer>> ans){
        if(i>=nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        pwh(nums,i+1,subset,ans);
        subset.remove(subset.size()-1);
        pwh(nums,i+1,subset,ans);
    }
}
