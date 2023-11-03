package Arrays_Question;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		int nums[] = {-1,0,1,2,-1,-4};
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						ans.add(list);
					}
				}
			}
			
		}

		System.out.println( ans);
	}
}
