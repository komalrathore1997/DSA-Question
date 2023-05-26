package Arrays_Question;

import java.util.HashMap;
import java.util.Map;

public class TopKFrecvantElement {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int count = map.get(nums[i]);
				count++;
				map.put(nums[i], count);
			} else {
				map.put(nums[i], 1);
			}
		}

		
	}
}
