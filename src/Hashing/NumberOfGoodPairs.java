package Hashing;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
	public static void main(String[] args) {
		int []nums = {1,2,3,1,1,3};
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				count+=map.get(nums[i]);
				map.put(nums[i], map.get(nums[i])+1);
			}else {
				map.put(nums[i], 1);
			}
		}
		System.out.println(count);
	}
}
